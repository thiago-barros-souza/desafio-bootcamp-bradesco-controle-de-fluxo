package org.desafio;

import org.desafio.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = input.nextInt();

		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = input.nextInt();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}

		input.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois)
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

		for (int i = 1; i <= parametroDois - parametroUm; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}