package br.com.ifce.estrutura.recursao;

public class HelloRecursao {
    public static void main(String[] args) {
        decremento(4);
        //System.out.println(fatorial(3));
    }

    public static void incrementoDecremento(int numero) {
        if (numero > 0) {
            System.out.println(numero);
            incrementoDecremento(numero - 1);
        }
        System.out.println(numero);
    }

    public static void incremento(int numero) {
        if (numero > 0) {
            incremento(numero - 1);
            System.out.println(numero);
        } else {
            System.out.println(numero);
        }
    }

    public static void decremento(int numero) {
        if (numero > 0) {
            System.out.println(numero);
            decremento(numero - 1);
        } else {
            System.out.println(numero);
        }
    }

    public static int fatorial(int numero) {
        if (numero > 1) {
            return numero * fatorial(--numero);
        }
        return numero;
    }
}
