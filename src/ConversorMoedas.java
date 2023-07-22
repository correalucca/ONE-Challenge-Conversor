import javax.swing.*;
import java.text.DecimalFormat;

public class ConversorMoedas {
    private final static double euro = 5.40;
    private final static double dolar = 4.81;
    private final static double pesoChileno = 0.0059;
    private final static double pesoArgentino = 0.018;
    private final static double librasEsterlinas = 6.27;

    private static double converterParaMoedasEstrangeiras(double valorEmReais, double taxaDeCambio) {
        return valorEmReais / taxaDeCambio;
    }

    private static double converterParaReais(double valorEmMoedasEstrangeiras, double taxaDeCambio) {
        return valorEmMoedasEstrangeiras * taxaDeCambio;
    }

    public static void executarConversao() {
        String input = JOptionPane.showInputDialog(null,
                "Insira um valor númerico:", "Entrada",JOptionPane.PLAIN_MESSAGE);

        try {
            double valor = Double.parseDouble(input);
            if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Digite um valor correto (somente números maiores que zero).");
                return;
            }

            String[] opcoes = {
                    "Reais a Dólar",
                    "Reais a Euro",
                    "Reais a Peso Chileno",
                    "Reais a Libras Esterlinas",
                    "Reais a Peso Argentino",
                    "Dólar a Reais",
                    "Euro a Reais",
                    "Peso Chileno a Reais",
                    "Peso Argentino a Reais",
                    "Libras Esterlinas a Reais",
            };

            String escolha = (String) JOptionPane.showInputDialog(null,
                    "Escolha uma opção:", "Opções",
                    JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            double resultadoConversao = 0.0;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            switch (escolha) {
                case "Reais a Dólar":
                    resultadoConversao = converterParaMoedasEstrangeiras(valor, dolar);
                    JOptionPane.showMessageDialog(null, "O valor da converção é de US$" + decimalFormat.format(resultadoConversao));
                    break;
                case "Reais a Euro":
                    resultadoConversao = converterParaMoedasEstrangeiras(valor, euro);
                    JOptionPane.showMessageDialog(null, "O valor da converção é de €" + decimalFormat.format(resultadoConversao));
                    break;
                case "Reais a Libras Esterlinas":
                    resultadoConversao = converterParaMoedasEstrangeiras(valor, librasEsterlinas);
                    JOptionPane.showMessageDialog(null, "O valor da converção é de £" + decimalFormat.format(resultadoConversao));
                    break;
                case "Reais a Peso Argentino":
                    resultadoConversao = converterParaMoedasEstrangeiras(valor, pesoArgentino);
                    JOptionPane.showMessageDialog(null, "O valor da converção é de ARS$" + decimalFormat.format(resultadoConversao));
                    break;
                case "Reais a Peso Chileno":
                    resultadoConversao = converterParaMoedasEstrangeiras(valor, pesoChileno);
                    JOptionPane.showMessageDialog(null, "O valor da converção é de CLP$" + decimalFormat.format(resultadoConversao));
                    break;
                case "Dólar a Reais":
                    resultadoConversao = converterParaReais(valor, dolar);
                    JOptionPane.showMessageDialog(null, "O valor da converção é de R$" + decimalFormat.format(resultadoConversao));
                    break;
                case "Euro a Reais":
                    resultadoConversao = converterParaReais(valor, euro);
                    JOptionPane.showMessageDialog(null, "O valor da converção é de R$" + decimalFormat.format(resultadoConversao));
                    break;
                case "Libras Esterlinas a Reais":
                    resultadoConversao = converterParaReais(valor, librasEsterlinas);
                    JOptionPane.showMessageDialog(null, "O valor da converção é de R$" + decimalFormat.format(resultadoConversao));
                    break;
                case "Peso Argentino a Reais":
                    resultadoConversao = converterParaReais(valor, pesoArgentino);
                    JOptionPane.showMessageDialog(null, "O valor da converção é de R$" + decimalFormat.format(resultadoConversao));
                    break;
                case "Peso Chileno a Reais":
                    resultadoConversao = converterParaReais(valor, pesoChileno);
                    JOptionPane.showMessageDialog(null, "O valor da converção é de R$" + decimalFormat.format(resultadoConversao));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                    break;
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Por favor, digite um valor numérico válido.");
        }
    }
}