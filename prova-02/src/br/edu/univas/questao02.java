package br.edu.univas;
import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String jogo;
        int saldoGols = 0;
        int pontuacao = 0;

        System.out.println("Informe os resultados dos 3 jogos da seleção brasileira:");

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                jogo = "Brasil X Sérvia";
            } else if (i == 1) {
                jogo = "Brasil X Suíça";
            } else {
                jogo = "Camarões X Brasil";
            }

            System.out.println("\nJogo " + (i + 1) + ": " + jogo);
            System.out.print("Número de gols do Brasil: ");
            int golsBrasil = scan.nextInt();
            System.out.print("Número de gols do adversário: ");
            int golsAdversario = scan.nextInt();

            int resultado = golsBrasil - golsAdversario;

            if (resultado > 0) {
                pontuacao += 3;
            } else if (resultado == 0) {
                pontuacao++;
            }

            saldoGols += resultado;
        }

        System.out.println("\nPontuação final do Brasil: " + pontuacao);
        System.out.println("Saldo de gols final do Brasil: " + saldoGols);
    }
}
