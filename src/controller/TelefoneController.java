package controller;
import Kreis.fila.*;

public class TelefoneController {

	FilaStrings f= new FilaStrings();

	public void insereLigacao(FilaStrings f, String numeroTelefone) {
        f.enfileirar(numeroTelefone);
    }

    public void consultaLigacoes(FilaStrings f) {
        if (f.vazia()) {
            System.out.println("Não há chamadas perdidas.");
            return;
        }

        while (!f.vazia()) {
            System.out.println("Ligação perdida de: " + f.desenfileirar());
        }
    }
}
