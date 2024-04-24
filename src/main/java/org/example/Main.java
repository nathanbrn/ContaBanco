package org.example;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Capturando o número da conta
    System.out.println("Por favor, digite o número da conta:");
    int numero = scan.nextInt();

    // Capturando a agência
    System.out.println("Por favor, digite a agência:");
    String agencia = scan.next();

    // Capturando o nome do cliente
    System.out.println("Por favor, digite o nome do cliente:");
    String nomeCliente = scan.next();

    // Capturando o saldo
    System.out.println("Por favor, digite o saldo da conta:");
    double saldo = scan.nextDouble();

    String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

    System.out.println(mensagem);
  }
}