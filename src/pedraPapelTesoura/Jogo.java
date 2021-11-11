package pedraPapelTesoura;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		int jogador, computador;
		Scanner sc = new Scanner(System.in);
		System.out.println("____PEDRA PAPEL TESOURA____");
		System.out.println("");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.print("Digite a opção desejada: ");

		jogador = sc.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.println("Você escolheu Pedra");
			break;
		case 2:
			System.out.println("Você escolheu Papel");
			break;
		case 3:
			System.out.println("Você escolheu Tesoura");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}

		computador = (int) (Math.random() * 3 + 1);
		sc.close();
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
		}
		System.out.println(" ");
		if (jogador == computador) {
			System.out.println("Empate");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("Você ganho!!! ");

			} else {
				System.out.println("O computador ganhou!!!");
			}
		}

	}
}

