package br.com.ifce.estrutura.lista.encadeada;

public class TesteListEncadeada {

    public static void main(String[] args) {
        Encadeado encadeado5 = new Encadeado("5 fila", null);
        Encadeado encadeado4 = new Encadeado("4 fila", encadeado5);
        Encadeado encadeado3 = new Encadeado("3 fila", encadeado4);
        Encadeado encadeado2 = new Encadeado("2 fila", encadeado3);
        Encadeado encadeado1 = new Encadeado("1 fila", encadeado2);

        varrerListaEncadeada(encadeado1);
    }

    static void varrerListaEncadeada(Encadeado encadeado) {
        if (encadeado.getProximo() != null) {
            System.out.println(encadeado + " proximo -> " + encadeado.getProximo());
            varrerListaEncadeada(encadeado.getProximo());
        } else {
            System.out.println(encadeado + " proximo -> NULL");
        }
    }
}


class Encadeado {
    private String descricao;
    private Encadeado proximo;

    public Encadeado(String descricao, Encadeado proximo) {
        this.descricao = descricao;
        this.proximo = proximo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Encadeado getProximo() {
        return proximo;
    }

    @Override
    public String toString() {
        return "Encadeado{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}