package br.edu.univas;
import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] eleitores = new int[1500];
        int votosX = 0, votosY = 0, votosZ = 0, votosB = 0, votosN = 0;

        for (int i = 0; i < eleitores.length; i ++) {
            System.out.println("Opções de voto:");
            System.out.println("111 - Candidato X");
            System.out.println("222 - Candidato Y");
            System.out.println("333 - Candidato Z");
            System.out.println("0 - Branco\n");
            String voto = scan.next();
            System.out.println();

            switch (voto) {
                case "111": votosX++;
                    break;
                case "222": votosY++;
                    break;
                case "333": votosZ++;
                    break;
                case "0": votosB++;
                    break;
                default: votosN++;
            }
        }

        System.out.println("\nQuantidade de votos:");
        System.out.println("Candidato X: " + votosX);
        System.out.println("Candidato Y: " + votosY);
        System.out.println("Candidato Z: " + votosZ);
        System.out.println("Branco: " + votosB);
        System.out.println("Nulo: " + votosN);
    }
}
