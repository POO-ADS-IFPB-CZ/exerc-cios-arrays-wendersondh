package exercicio3.src;

public class Notas {
    public static void main(String[] args){
        float notas[] = {5, 3, 8, 9, 7, 9, 10, 6, 4, 8};

        float soma = 0;
        for (float i: notas) {
            soma+=i;

        }
        float media = soma / notas.length;
        System.out.println("Média das notas = "+media);

        int abaixo = 0;
        int acima = 0;
        for (float i: notas){
            if(i < media) abaixo++;
            if(i > media) acima ++;
        }

        System.out.println("acima da média = " + acima);
        System.out.println("abaixo da média = " + abaixo);

    }
}
