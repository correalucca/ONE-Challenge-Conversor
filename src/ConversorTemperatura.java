import javax.swing.*;

public class ConversorTemperatura {
    private static double resultado = 0.0;

    public static void executarConversao() {
        String input = JOptionPane.showInputDialog(null,
                "Insira um valor númerico:", "Entrada", JOptionPane.PLAIN_MESSAGE);
        try {
            double temperatura = Double.parseDouble(input);
            if(temperatura <= 0) {
                JOptionPane.showMessageDialog(null, "Por favor, digite valores números maiores que zero!");
                return;
            }

            Object[] opcoes = {
                    "Fahrenheit para Celsius",
                    "Fahrenheit para Kelvin",
                    "Celsius para Fahrenheit",
                    "Celsius para Kelvin",
                    "Kelvin para Celsius",
                    "Kelvin para Fahrenheit"
            };

            Object escolha = JOptionPane.showInputDialog(null,
                    "Escolha uma opção:", "Opções",
                    JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            if(escolha == "Fahrenheit para Celsius") {
                resultado = (temperatura - 32) * 5/9;
                JOptionPane.showMessageDialog(null, "A temperatura em Celsius é de " + String.format("%.2f°C", resultado));
            }else if(escolha == "Fahrenheit para Kelvin") {
                resultado = (temperatura - 32) * 5/9 + 273.15;
                JOptionPane.showMessageDialog(null, "A temperatura em Kelvin é de " + String.format("%.2f°K", resultado));
            }else if(escolha == "Celsius para Fahrenheit") {
                resultado = (temperatura * 9/5) + 32;
                JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é de " + String.format("%.2f°F", resultado));
            }else if(escolha == "Celsius para Kelvin") {
                resultado = temperatura + 273.15;
                JOptionPane.showMessageDialog(null, "A temperatura em Kelvin é de " + String.format("%.2f°K", resultado));
            }else if(escolha == "Kelvin para Fahrenheit") {
                resultado = (temperatura - 273.15) * 9/5 + 32;
                JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é de " + String.format("%.2f°F", resultado));
            }else if(escolha == "Kelvin para Celsius") {
                resultado = temperatura - 273.15;
                JOptionPane.showMessageDialog(null, "A temperatura em Celsius é de " + String.format("%.2f°C", resultado));
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Por favor, digite um valor numérico válido.");
        }
    }
}

