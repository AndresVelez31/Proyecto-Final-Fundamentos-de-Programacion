package GUI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Main.Jugadores;

public class Archivo {
    public static void guardarJugadores(ArrayList<Jugadores> jugadores) throws IOException {

        try {
            File directorio = new File(".");
            File archivo = new File(directorio, "Jugadores.txt");
    
            FileWriter escritorAlArchivo = new FileWriter(archivo);
            
            BufferedWriter escritorAlBuffer = new BufferedWriter(escritorAlArchivo);
            
            escritorAlBuffer.write("--- LISTADO DE JUGADORES ---\n");
            for (Jugadores jugador: jugadores) {
                escritorAlBuffer.write("Id: " + jugador.getId() + " || Nombre del Jugador: " + jugador.getNombre() + " || Nivel: " + jugador.getNivel() + " || Juego Favorito: " + jugador.getJuegoFavorito() + " || Puntaje: " + jugador.getScore() + "\n");
            }
            escritorAlBuffer.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Hubo un Error al guardar a los Jugadores", "Guardar Jugadores", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}  

