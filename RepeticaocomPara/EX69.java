package Exercicios.RepeticaocomPara;

import javax.swing.*;

public class EX69 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX69 - Desafio - Desenvolva um programa que leia o primeiro termo e a" +
                "\nrazão de uma PA (Progressão Aritmética), mostrando na tela os 10" +
                "\nprimeiros elementos da PA e a soma entre todos os valores da sequência.");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar o primeiro termo e a razão da PA.");
        int primeiroTermo = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro termo da PA:"));
        int razao = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão da PA:"));

        JOptionPane.showMessageDialog(null, "2º Passo - Utilizar a estrutura 'para' para calcular os 10 primeiros termos e a soma dos valores.");
        int soma = 0;
        String termosPA = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Laço 'for' para calcular os 10 primeiros termos da PA.");
        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, "2º Passo - Calcular o termo atual da PA (termoAtual = primeiroTermo + i * razao).");
            int termoAtual = primeiroTermo + i * razao;

            JOptionPane.showMessageDialog(null, "2º Passo - Concatenar o termo atual à string termosPA.");
            termosPA += termoAtual + " ";

            JOptionPane.showMessageDialog(null, "2º Passo - Acumular o termo atual à soma.");
            soma += termoAtual;
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir os 10 primeiros termos e a soma dos valores.");
        JOptionPane.showMessageDialog(null, "Os 10 primeiros termos da PA são: " + termosPA);
        JOptionPane.showMessageDialog(null, "A soma dos 10 primeiros termos é: " + soma);
    }
}
