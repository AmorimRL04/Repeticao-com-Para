package Exercicios.RepeticaocomPara;

import javax.swing.*;

public class EX67 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX67 - Faça um programa usando a estrutura 'para' que leia um número inteiro positivo e mostre na tela uma contagem de 0 até o valor digitado." +
                "\nExemplo:" +
                "\nDigite um valor: 9" +
                "\nContagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar um número inteiro positivo ao usuário.");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo:"));

        JOptionPane.showMessageDialog(null, "2º Passo - Validar se o número digitado é inteiro e positivo.");
        JOptionPane.showMessageDialog(null, "2º Passo - A estrutura 'while' verifica se o número é negativo.");
        while (numero < 0) {
            JOptionPane.showMessageDialog(null, "2º Passo - Se o número for negativo, solicita ao usuário novamente.");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Número inválido! Digite um número inteiro positivo:"));
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Criar a estrutura 'para' para realizar a contagem.");
        String contagem = "Contagem: ";

        JOptionPane.showMessageDialog(null, "3º Passo - A estrutura 'for' inicia com i = 0, e vai até o valor digitado.");
        JOptionPane.showMessageDialog(null, "3º Passo - A cada iteração, o valor de 'i' é adicionado à string 'contagem'.");
        for (int i = 0; i <= numero; i++) {
            contagem += i + ", ";
        }

        contagem += "FIM!"; JOptionPane.showMessageDialog(null, "3º Passo - Adicionar no fim da contagem a mensagem \"FIM!\" ");

        JOptionPane.showMessageDialog(null, "4º Passo - Exibir a contagem na tela.");
        JOptionPane.showMessageDialog(null, contagem);
    }
}
