/*
 El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package servicio;

import entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author camir
 */
public class ServicioPais {

    Set<Pais> paises = new TreeSet();
    Scanner leer = new Scanner(System.in);

    public Pais crearPais() {
        System.out.println("Introdusca el nombre del pais");
        String nombre = leer.next();

        return new Pais(nombre);
    }

    public void crearListaP() {
        int op = 0;
        do {
            paises.add(crearPais());
            System.out.println("1-Agregar pais 2-Salir");
            op = leer.nextInt();
        } while (op == 1);
        mostrarLista();
    }

    public void mostrarLista() {
         System.out.println("Los paises que se encuentran en la lista son:");
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }

//    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.
    public void eliminarPais() {
        System.out.println("Introdusca el pais que desee eliminar");
        String pais = leer.next();
        boolean entra = false;
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(pais)) {
                it.remove();
                entra = true;
            }
        }
        if (entra) {
            mostrarLista();
        } else {
            System.out.println("El pais no se encuentra en la lista");
            mostrarLista();
        }

    }
}
