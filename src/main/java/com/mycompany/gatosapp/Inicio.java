package com.mycompany.gatosapp;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) throws IOException {
        int opcionMenu = -1;
        String[] botones = {"1.ver gatos","2.ver favoritos", "2.salir"};

        do {
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatitos java", "Menu principal",
                    JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
            for (int i = 0; i < botones.length; i++) {
                if (opcion.equals(botones[i])) {
                    opcionMenu = i;
                }
            }

            switch (opcionMenu) {
                case 0:
                    GatosService.verGatos();
                    break;
                case 1:
                    Gatos gatos = new Gatos();
                    GatosService.verFavorito(gatos.getApiKey());
                default:
                    break;
            }
        } while (opcionMenu != 1);
    }
}
