package br.com.ifce.estrutura.recursao;

public class HelloRecursao {
    public static void main(String[] args) {
        //incrementoDecremento(10);
        System.out.println(fatorial(3));
    }

    public static int incrementoDecremento(int numero) {
        if (numero > 0) {
            System.out.println(numero);
            incrementoDecremento(numero - 1);
        }
        System.out.println(numero);
        return 0;
    }

    public static int incremento(int numero) {
        if (numero == 0) {
            System.out.println(numero);
        }
        if (numero > 0) {
            incremento(numero - 1);
            System.out.println(numero);
        }
        return 0;
    }

    public static int decremento(int numero) {
        if (numero == 0) {
            System.out.println(numero);
        }
        if (numero > 0) {
            System.out.println(numero);
            decremento(numero - 1);
        }
        return 0;
    }

    public static int fatorial(int numero) {
        if (numero > 1) {
            return numero * fatorial(--numero);
        }
        return numero;
    }
}
