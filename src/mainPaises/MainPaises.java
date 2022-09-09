/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPaises;

import entidad.Pais;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import servicio.ServicioPais;

/**
 *
 * @author camir
 */
public class MainPaises {

    public static void main(String[] args) {
        
        ServicioPais s = new ServicioPais();
        s.crearListaP();
        s.eliminarPais();
    }
    
}
