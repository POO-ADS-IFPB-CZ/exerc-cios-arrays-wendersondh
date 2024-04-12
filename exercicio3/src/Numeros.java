package exercicio3.src;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        float numero,soma = 0, quantidade = 0;
        do{
            System.out.println("Informe um número ");
            numero = scaner.nextFloat();
            if(numero >= 0){
                quantidade++;
                soma += numero;
            }

        }while (numero > 0);

        float media = soma / quantidade;

        System.out.println("A média dos números é: "+media);
        System.out.println("A quantidade de números digitados é: "+quantidade);
    }
}
