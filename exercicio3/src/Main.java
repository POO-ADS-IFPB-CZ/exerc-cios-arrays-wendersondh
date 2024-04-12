package exercicio3.src;

public class Main {
    public static void main(String[] args) {

        System.out.println("os trinta primeiros elementos da série de Fibonacci.");

        int anterior = 0;
        int atual = 1;
        int prox = atual + anterior;
        for (int i = 1; i <= 30; i++) {

            System.out.println(i + " = " +atual);
            anterior = atual;
            atual = prox;
            prox = atual + anterior;

        }
    }
}