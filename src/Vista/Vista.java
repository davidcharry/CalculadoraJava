
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author mono-
 */
public class Vista {

    public void menuLogo() {
        JOptionPane.showMessageDialog(null, "PROYECTO CALCULDORA" + "\n USANDO HERENCIA Y MVC");
    }

    public double mostrarPriNum() {
        return Double.parseDouble(JOptionPane.showInputDialog("Digite el primer número"));
    }

    public double mostrarSegNum() {
        return Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo número"));
    }

    public void terminar() {
    }
}
