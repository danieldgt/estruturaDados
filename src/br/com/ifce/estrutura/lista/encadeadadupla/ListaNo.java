package br.com.ifce.estrutura.lista.encadeadadupla;

import static java.lang.String.format;

public class ListaNo {
	DuploNo primeiro;
	DuploNo ultimo;
	private int count = 0;

	public void append(DuploNo duploNo) {
		if (primeiro == null) {
			primeiro = duploNo;
		} else if (ultimo == null) {
			ultimo = duploNo;
			primeiro.setProximo(ultimo);
			ultimo.setAnterior(primeiro);
		} else {
			ultimo.setProximo(duploNo);
			duploNo.setAnterior(ultimo);
			ultimo = duploNo;
		}
		count++;
	}

	public void addFist(DuploNo duploNo) {
		primeiro.setAnterior(duploNo);
		duploNo.setProximo(primeiro);
		primeiro = duploNo;
		count++;
	}

	public ListaNo(DuploNo primeiro, DuploNo ultimo) {
		super();
		this.primeiro = primeiro;
		this.ultimo = ultimo;
	}

	public void varrerListaDupla(DuploNo duplo) {
		if (duplo.getProximo() != null) {
			System.out.println(duplo);
			varrerListaDupla(duplo.getProximo());
		} else {
			System.out.println(duplo);
		}
	}

	private int varrerListPraContar(DuploNo duploNo) {
		if (duploNo.getProximo() == null) {
			return 1;
		} else {
			return 1 + varrerListPraContar(duploNo.getProximo());
		}
	}

	public int countManual() {
		if (primeiro == null) {
			return 0;
		} else if (ultimo == null) {
			return 1;
		}
		return varrerListPraContar(primeiro);
	}

	public DuploNo varrerListaBuscarDuploNoPorDescricao(DuploNo duploNo, String busca) {
		if (duploNo == null) {
			return null;
		}
		if (duploNo.getDescricao().toUpperCase().equals(busca.toUpperCase())) {
			return duploNo;
		}
		return varrerListaBuscarDuploNoPorDescricao(duploNo.getProximo(), busca);
	}

	public boolean containsName(String descricao) {
		if (varrerListaBuscarDuploNoPorDescricao(primeiro, descricao) == null) {
			return false;
		}
		return true;
	}

	public int encontrarPosicaoDescricao(String descricao) throws Exception {
		return buscarPosicaoDuploNoPorDescricao(primeiro, descricao);
	}

	public int buscarPosicaoDuploNoPorDescricao(DuploNo duploNo, String busca) throws Exception {
		if (duploNo == null) {
			throw new Exception("nao encontrado!");
		}
		if (duploNo.getDescricao().toUpperCase().equals(busca.toUpperCase())) {
			return 1;
		}
		
		return 1 + buscarPosicaoDuploNoPorDescricao(duploNo.getProximo(), busca);
	}

	public String listToString() {
		int controle = 0;
		return getStrings(primeiro, controle);
	}

	public String getStrings(DuploNo duploNo, int controle) {
		if (duploNo == null) {
			return "";
		}

		return format("Posicao: %d; Descricao: %s; %s", controle, duploNo.getDescricao(), "\n")
				.concat(getStrings(duploNo.getProximo(), controle + 1));
	}

	public void addPosition(DuploNo noNovo, int posicao) {
		if (posicao == 0) {
			addFist(noNovo);
		} else if (posicao + 1 == count) {
			append(noNovo);
		} else {
			DuploNo noCorrente = encontrarNoPorPosicao(posicao);
			noNovo.setAnterior(noCorrente.getAnterior());
			noNovo.setProximo(noCorrente);
			noCorrente.getAnterior().setProximo(noNovo);
			noCorrente.setAnterior(noNovo);
			count++;
		}
	}

	public DuploNo encontrarNoPorPosicao(int posicao) {
		return encontrarPosicao(this.primeiro, posicao);
	}

	public DuploNo encontrarPosicao(DuploNo duploNo, int posicao) {
		if (posicao == 0 && duploNo != null) {
			return duploNo;
		} else if (duploNo == null) {
			throw new IndexOutOfBoundsException("posicao não existe!");
		}

		return encontrarPosicao(duploNo.getProximo(), posicao - 1);
	}

	public int getCount() {
		return count;
	}
}