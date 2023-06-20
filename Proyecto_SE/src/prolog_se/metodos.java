package prolog_se;


import java.util.Hashtable;
import java.util.Vector;
import javax.swing.JOptionPane;
import org.jpl7.Query;

/**
 *
 * @author eduar
 */
public class metodos {

    String pregunta, archivo;
    int tip;
    Vector vect;
    Query q;

    public metodos(String pre, int tipoForm) {
        pregunta = pre;
        tip = tipoForm;
        archivo = "consult('peces.pl')";
        q = new Query(archivo);
        if (q.hasSolution()) {
            busqueda();
        }
    }

    public void busqueda() {
        vect = new Vector();
        q = new Query(pregunta);

        Hashtable[] ss4 = (Hashtable[]) q.allSolutions();
        if (tip == 1) {
            for (int i = 0; i < ss4.length; i++) {
                vect.addElement(ss4[i].get("X") + "," + ss4[i].get("Y"));
            }
        }
        if (tip == 2 || tip == 3) {
            for (int i = 0; i < ss4.length; i++) {
                vect.addElement(ss4[i].get("X"));
            }
        }

        if (!vect.isEmpty()) {
            mostrarSolucion();
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro nada");
        }

    }
    
    public void mostrarSolucion(){
        for (int i = 0; i < vect.size(); i++) {
            Pantalla.TxtA.append(String.valueOf(vect.elementAt(i)));
            Pantalla.TxtA.append("\n");
        }
    }
}
