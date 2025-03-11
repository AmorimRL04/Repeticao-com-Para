package Exercicios.RepeticaocomPara;

import javax.swing.*;

public class EX66 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX66 - Escreva um programa que leia um número qualquer e mostre a tabuada desse número, usando a estrutura 'para'." +
                "\nExemplo:" +
                "\nDigite um valor: 5" +
                "\n5 x 1 = 5" +
                "\n5 x 2 = 10" +
                "\n5 x 3 = 15" +
                "\n..." +
                "\n5 x 10 = 50");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar um número ao usuário.");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ver a tabuada:"));

        JOptionPane.showMessageDialog(null, "2º Passo - Criar a estrutura 'para' para calcular a tabuada.");
        String tabuada = "Tabuada do " + numero + ":\n";

        JOptionPane.showMessageDialog(null, "2º Passo - A estrutura 'for' começa com a inicialização de i = 1.");
        JOptionPane.showMessageDialog(null, "2º Passo - O laço vai até i = 10, incrementando i a cada iteração.");
        JOptionPane.showMessageDialog(null, "2º Passo - Em cada iteração, calcula-se o produto de 'numero' e 'i' e concatena-se na string 'tabuada'.");

        for (int i = 1; i <= 10; i++) {
            tabuada += numero + " x " + i + " = " + (numero * i) + "\n";
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir a tabuada na tela.");
        JOptionPane.showMessageDialog(null, tabuada);
    }
}
