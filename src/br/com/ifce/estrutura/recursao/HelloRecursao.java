package br.com.ifce.estrutura.recursao;

public class HelloRecursao {
    public static void main(String[] args) {
        decremento(10);
    }

    public static int incrementoDecremento(int numero){
        if(numero > 0){
            System.out.println(numero);
            incrementoDecremento(numero -1);
        }
        System.out.println(numero);
        return 0;
    }
    public static int incremento(int numero){
        if(numero == 0){
            System.out.println(numero);
        }
        if(numero > 0){
            incremento(numero -1);
            System.out.println(numero);
        }
        return 0;
    }

    public static int decremento(int numero){
        if(numero == 0){
            System.out.println(numero);
        }
        if(numero > 0){
            System.out.println(numero);
            decremento(numero -1);
        }
        return 0;
    }
}
