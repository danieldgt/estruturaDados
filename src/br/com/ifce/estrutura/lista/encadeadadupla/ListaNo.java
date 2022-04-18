package br.com.ifce.estrutura.lista.encadeadadupla;

public class ListaNo {
	DuploNo primeiro;
	DuploNo ultimo;

	public void add(DuploNo duploNo) {
		if (primeiro.getDescricao() == null) {
			atualizaPontas(duploNo);
		} else {
			ultimo.getAnterior().setAnterior(duploNo);
		}
	}

	public void atualizaPontas(DuploNo duploNo) {
		primeiro = duploNo;
		ultimo = duploNo;
	}

	public ListaNo(DuploNo primeiro, DuploNo ultimo) {
		super();
		this.primeiro = primeiro;
		this.ultimo = ultimo;
	}

	public int contarProximo(DuploNo duplo) {
		if (duplo.getProximo() != null) {
			return 1 + contarProximo(duplo.getProximo());
		} else {
			return 0;
		}
	}

	public int contarAnterior(DuploNo duplo) {
		if (duplo.getAnterior() != null) {
			return 1 + contarAnterior(duplo.getAnterior());
		} else {
			return 0;
		}
	}

	public void varrerListaDupla(DuploNo duplo) {
		if (duplo.getProximo() != null) {
			System.out.println(duplo);
			varrerListaDupla(duplo.getProximo());
		} else {
			System.out.println(duplo);
		}
	}

	public int count() {
		if (primeiro.getDescricao() == null) {
			return 0;
		}
		return 1 + contarProximo(primeiro);
	}

	public DuploNo last(DuploNo duploNo) {
		if (duploNo.getDescricao() == null) {
			return duploNo;
		} else {
			return last(duploNo.getProximo());
		}
	}
}