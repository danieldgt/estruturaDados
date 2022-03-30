package br.com.ifce.estrutura.recursao;

public class HelloRecursao {
    public static void main(String[] args) {
        //isMultiplo(6,3);
        //System.out.println(isMultiplo(122, 2));
        //System.out.println(isPrimoRecursivo(21, 2));
        //System.out.println(somatorioRecursivo(6));
        System.out.println(totalDigitosRecursivo(52323));
        //System.out.println(mdcRecursivo(100, 24));
        //numerosPrimosDoIntervalo(10, 20);
    }

    public static int numerosPrimosDoIntervalo(int numero1, int numero2) {
        if (numero1 == numero2) {
            return 1;
        } else {
            if (isPrimo(numero1) && numero1 > 3) {
                System.out.println(numero1);
            }
            return numerosPrimosDoIntervalo(numero1 + 1, numero2);
        }
    }

    public static boolean isPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (isMultiplo(numero, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMultiplo(int numero1, int numero2) {
        return numero1 % numero2 == 0;
    }


    public static int mdcRecursivo(int numero1, int numero2) {
        if (numero2 != 0) {
            return mdcRecursivo(numero2, numero1 % numero2);
        } else {
            return numero1;
        }
    }

    public static int totalDigitosRecursivo(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return 1 + totalDigitosRecursivo(numero / 10);
        }
    }

    public static int somatorioRecursivo(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero + somatorioRecursivo(numero - 1);
        }
    }

    public static int isPrimoRecursivo(int numero, int controle) {
        if (numero == controle) {
            return 1;
        } else if (isMultiplo(numero, controle)) {
            return 0;
        } else {
            return isPrimoRecursivo(numero, controle + 1);
        }
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
