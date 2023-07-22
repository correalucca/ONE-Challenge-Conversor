import javax.swing.*;

public class MenuPrincipal {
    public static void main(String[] args) {
        String[] opcoes = {"Conversor de moedas", "Conversor de Temperatura"};

        while(true) {
            String escolha = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opção:",
                    "Opções",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            if(escolha == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Você fechou a caixa de diálogo sem escolher uma opção.",
                        "ERRO",
                        JOptionPane.ERROR_MESSAGE
                );
            }else {
                if(escolha.equals("Conversor de moedas")) {
                    ConversorMoedas conversorMoedas = new ConversorMoedas();
                    conversorMoedas.executarConversao();
                }else if(escolha.equals("Conversor de Temperatura")) {
                    ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
                    conversorTemperatura.executarConversao();
                }
            }

            int continuar = JOptionPane.showConfirmDialog(null,"Deseja continuar?");

            if(continuar != JOptionPane.YES_OPTION) {
                if(continuar == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Programa finalizado.");
                }else if(continuar == JOptionPane.CANCEL_OPTION || continuar == JOptionPane.CLOSED_OPTION) {
                    JOptionPane.showMessageDialog(null, "Programa concluído.");
                }
                break;
            }
        }
    }
}
