/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoc;

import javax.swing.JFrame;
import hoc.IDE; // Asegúrate de importar tu clase IDE correctamente

/**
 *
 * @author chori
 */
public class HOC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una instancia del formulario IDE
        IDE ide = new IDE();
        
         // Configurar el formulario desde la clase principal
        ide.setVisible(true); // Mostrar la ventana
        ide.setLocationRelativeTo(null); // Centrarla en pantalla (opcional)
    }
}
