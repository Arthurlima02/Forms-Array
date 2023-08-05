package br.senai.sp.form;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class forms {
    public static void main (String[] args) {



        /** Importe da class Scannner */

        Scanner scanner = new Scanner(System.in);
        String [] nome = new String [2];
        int [] idade = new int [2];
        float [] peso = new float [2];
        float [] altura = new float [2];
        long [] rg = new long[2];
        float [] cpf = new float [2];
        String [] profissao = new String [2];
        String [] curso = new String [2];



        System.out.println("______Forms1_______\n");
        System.out.print("Digite seu nome: ");
        nome[0] =  scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade[0] = scanner.nextInt();

        System.out.print("Digite seu peso: ");
        peso[0] = scanner.nextFloat();

        System.out.print("Digite sua altura: ");
        altura[0] = scanner.nextFloat();

        System.out.print("digite seu rg: ");
        rg[0] = scanner.nextLong();


        System.out.print("digite seu cpf:");
        cpf[0] = scanner.nextLong();


        scanner.nextLine();

        System.out.print("Qual sua profissão: ");
        profissao[0] = scanner.nextLine();

        System.out.print("Qual seu curso: ");
        curso[0] = scanner.nextLine();


        /** Forms 2 */
        System.out.println("\n_________Forms 2________\n");

        System.out.print("Digite seu nome: ");
        nome[1] =  scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade[1] = scanner.nextInt();

        System.out.print("Digite seu peso: ");
        peso[1] = scanner.nextFloat();

        System.out.print("Digite sua altura: ");
        altura[1] = scanner.nextFloat();

        System.out.print("digite seu rg: ");
        rg[1] = scanner.nextLong();


        System.out.print("digite seu cpf:");
        cpf[1] = scanner.nextLong();

        scanner.nextLine();

        System.out.print("Qual sua profissão: ");
        profissao[1] = scanner.nextLine();

        System.out.print("Qual seu curso: ");
        curso[1] = scanner.nextLine();

        System.out.println("\n____________________________");
        System.out.println("________Formulario__________\n");
        System.out.println("Seu nome é " + nome[0]);
        System.out.println("Você tem " + idade[0] + " anos");
        System.out.println("Você pesa " + peso[0] + "kg");
        System.out.println("Sua altura é " + altura[0] + "cm");
        System.out.println("Seu rg é " + rg[0]);
        System.out.println("Seu cpf é " + cpf[0]);
        System.out.println("Sua profissão é " + profissao[0]);
        System.out.println("Seu curso é " + curso[0]);
        System.out.println("\n\n____________________________");
        System.out.println("________Formulario2__________\n");
        System.out.println("Seu nome é " + nome[1]);
        System.out.println("Você tem " + idade[1] + " anos");
        System.out.println("Você pesa " + peso[1] + "kg");
        System.out.println("Sua altura é " + altura[1] + "cm");
        System.out.println("Seu rg é " + rg[1]);
        System.out.println("Seu cpf é " + cpf[1]);
        System.out.println("Sua profissão é " + profissao[1]);
        System.out.println("Seu curso é " + curso[1]);
        System.out.println("\n______________________________");
        System.out.println("______________________________");

    }
}
