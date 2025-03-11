package Exercicios.RepeticaocomPara;

import javax.swing.*;

public class EX68 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX68 - Faça um programa que leia idade, sexo e peso de 8 pessoas, usando a estrutura 'para'. No final, mostre na tela:" +
                "\n• Quantas mulheres foram cadastradas" +
                "\n• Quantos homens pesam mais de 100Kg" +
                "\n• A média de peso entre as mulheres" +
                "\n• O maior peso entre os homens.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar as variáveis necessárias.");
        int totalMulheres = 0;
        int homensAcima100Kg = 0;
        double somaPesoMulheres = 0;
        double maiorPesoHomem = 0;
        int totalMulheresPesadas = 0;

        JOptionPane.showMessageDialog(null, "2º Passo - Utilizar a estrutura 'para' para cadastrar 8 pessoas.");
        for (int i = 1; i <= 8; i++) {
            JOptionPane.showMessageDialog(null, "Cadastro da pessoa " + i);

            JOptionPane.showMessageDialog(null, "3º Passo - Solicitar idade.");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));

            JOptionPane.showMessageDialog(null, "4º Passo - Solicitar e validar o sexo.");
            char sexo = JOptionPane.showInputDialog("Digite o sexo (M para masculino, F para feminino):").toUpperCase().charAt(0);

            while (sexo != 'M' && sexo != 'F') {
                sexo = JOptionPane.showInputDialog("Entrada inválida! Digite 'M' para masculino ou 'F' para feminino:").toUpperCase().charAt(0);
            }

            JOptionPane.showMessageDialog(null, "5º Passo - Solicitar o peso.");
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa (kg):"));

            JOptionPane.showMessageDialog(null, "6º Passo - Estrutura de decisão para verificar o sexo e atualizar as variáveis.");
            if (sexo == 'F') {
                JOptionPane.showMessageDialog(null, "6.1 Passo - Se pessoa é mulher incrementa o total de mulheres, acumula o peso das mulheres e incrementa o total de mulheres pesadas");
                totalMulheres++;
                somaPesoMulheres += peso;
                totalMulheresPesadas++;
            } else {

                if (peso > 100) {
                    JOptionPane.showMessageDialog(null, "6º Passo - Verifica se o homem pesa mais de 100kg, e incrementa o contador de homens com mais de 100Kg");
                    homensAcima100Kg++;
                }

                if (peso > maiorPesoHomem) {
                    JOptionPane.showMessageDialog(null, "6º Passo - Verifica se peso do homem é o maior registrado até agora.");
                    maiorPesoHomem = peso;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "7º Passo - Calcular a média de peso entre as mulheres.");
        double mediaPesoMulheres = totalMulheresPesadas > 0 ? somaPesoMulheres / totalMulheresPesadas : 0;

        JOptionPane.showMessageDialog(null, "8º Passo - Exibir os resultados.");
        JOptionPane.showMessageDialog(null, "Resultados:" +
                "\nTotal de mulheres cadastradas: " + totalMulheres +
                "\nHomens que pesam mais de 100Kg: " + homensAcima100Kg +
                "\nMédia de peso entre as mulheres: " + String.format("%.2f", mediaPesoMulheres) + "Kg" +
                "\nMaior peso entre os homens: " + (maiorPesoHomem > 0 ? maiorPesoHomem + "Kg" : "Nenhum homem cadastrado"));
    }
}
