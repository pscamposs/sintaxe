package me.patrick.dev;

import java.util.Scanner;

public class ContaTerminal {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agencia: ");
        String agencia = in.nextLine();
        System.out.println("Digite o número da conta: ");
        int numero = in.nextInt();
        in.nextLine();
        System.out.println("Digite seu nome: ");
        String nomeCliente = in.nextLine();
        double saldo = 210.05;

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$"+saldo+" já esta disponivel para saque");
    }

}
