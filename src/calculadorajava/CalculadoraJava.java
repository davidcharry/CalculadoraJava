/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

import Controlador.Calculadora;
import Modelo.Operacion;
import Vista.Vista;

/**
 *
 * @author mono-
 */
public class CalculadoraJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista view = new Vista();
        Operacion op = new Operacion();
        Calculadora calc = new Calculadora(view, op);
        calc.iniciarCalculadora();
    }
}
