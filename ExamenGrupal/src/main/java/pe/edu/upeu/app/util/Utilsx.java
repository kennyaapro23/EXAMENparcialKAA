/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.util;

import java.net.URL;

/**
 *
 * @author Usuario
 */
public class Utilsx {

    public URL getFile(String ruta) {
        return this.getClass().getResource("/" + ruta);
    }

}


