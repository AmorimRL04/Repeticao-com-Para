package Exercicios.RepeticaocomPara;

import javax.swing.*;

public class EX64 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX64 - Desenvolva um programa usando a estrutura 'para' que mostre na tela a seguinte contagem:" +
                "\n0 5 10 15 20 25 30 35 40 Acabou!");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar a variável para a contagem.");
        String contagem = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Criar a estrutura 'para' para exibir a contagem.");
           for (int i = 0; i <= 40; i += 5) {
               JOptionPane.showMessageDialog(null, "2º Passo - Incrementar 5 ao valor atual de 'i' na variável 'contagem'.");
            contagem += i + " ";

        }

        JOptionPane.showMessageDialog(null, "3º Passo - Adicionar a palavra 'Acabou!' ao final da contagem.");
        contagem += "Acabou!";

        JOptionPane.showMessageDialog(null, "4º Passo - Exibir a contagem na tela.");
        JOptionPane.showMessageDialog(null, contagem);
    }
}
