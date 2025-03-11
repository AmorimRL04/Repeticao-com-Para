package Exercicios.RepeticaocomPara;

import javax.swing.*;

public class EX65 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX65 - Desenvolva um programa usando a estrutura 'para' que mostre na tela a seguinte contagem:" +
                "\n100 90 80 70 60 50 40 30 20 10 0 Acabou!");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar a variável para a contagem.");
        String contagem = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Criar a estrutura 'para' para exibir a contagem.");
        for (int i = 100; i >= 0; i -= 10) {
            JOptionPane.showMessageDialog(null, "2º Passo - Decrementar 10 ao valor atual de 'i' na variável 'contagem'.");
            contagem += i + " ";
        }
        contagem += "Acabou!";

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir a contagem na tela.");
        JOptionPane.showMessageDialog(null, contagem);
    }
}
