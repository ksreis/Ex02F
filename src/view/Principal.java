package view;
import javax.swing.JOptionPane;

import Kreis.fila.*;
import controller.TelefoneController;

public class Principal {

	public static void main(String[] args) {
        FilaStrings chamadasPerdidas = new FilaStrings();
        TelefoneController telefoneController = new TelefoneController();
        int opcao = 0;

        while (opcao != 2) {
            String[] opcoes = {"Fazer ligação", "Consultar chamadas perdidas", "Sair"};
            opcao = JOptionPane.showOptionDialog(null, "Selecione uma opção:", "Identificador de chamadas",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0:
                    String numeroTelefone = JOptionPane.showInputDialog("Digite o número do telefone:");
                    telefoneController.insereLigacao(chamadasPerdidas, numeroTelefone);
                    break;

                case 1:
                    telefoneController.consultaLigacoes(chamadasPerdidas);
                    break;

                case 2:
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }
}