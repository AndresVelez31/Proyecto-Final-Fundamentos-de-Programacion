package Main;
import java.io.IOException;

import GUI.Pantalla;

public class Main {
    public static void main(String[] args) throws IOException {
        Pantalla panta = new Pantalla();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
        panta.requestFocusInWindow();
    }
    
}
