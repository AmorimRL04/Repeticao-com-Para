package Exercicios.RepeticaocomPara;

import javax.swing.*;

public class EX70 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX70 - [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência de Fibonacci:" +
                "\n1 1 2 3 5 8 13 21...");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar as variáveis necessárias.");
        int n1 = 1, n2 = 1;
        String fibonacci = "1 1 ";
        int termos = 10;

        JOptionPane.showMessageDialog(null, "2º Passo - Calcular os 10 primeiros elementos da sequência de Fibonacci.");
        JOptionPane.showMessageDialog(null, "A sequência de Fibonacci é construída somando os dois números anteriores para gerar o próximo.");
        JOptionPane.showMessageDialog(null, "Utilizando a estrutura 'para' (laço 'for'), vamos calcular os próximos termos.");

        for (int i = 3; i <= termos; i++) {
            JOptionPane.showMessageDialog(null, "2º Passo - Calcular o próximo termo da sequência (proximoTermo = n1 + n2).");
            int proximoTermo = n1 + n2;

            JOptionPane.showMessageDialog(null, "2º Passo - Adicionar o próximo termo à string 'fibonacci'.");
            fibonacci += proximoTermo + " ";

            JOptionPane.showMessageDialog(null, "2º Passo - Atualizar os valores de n1 e n2 para os próximos cálculos.");
            n1 = n2;
            n2 = proximoTermo;
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir os 10 primeiros elementos da sequência de Fibonacci.");
        JOptionPane.showMessageDialog(null, "Os 10 primeiros termos da sequência de Fibonacci são: " + fibonacci);
    }
}
