/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Operacion;
import Modelo.Division;
import Modelo.Multiplicacion;
import Modelo.Resta;
import Modelo.Suma;
import Vista.Vista;

/**
 *
 * @author mono-
 */
public class Calculadora {

    Vista view = new Vista();
    Operacion operacion = new Operacion();

    public Calculadora(Vista view, Operacion operacion) {
        this.view = view;
        this.operacion = operacion;
    }

    public void iniciarCalculadora() {
    
        view.menuLogo();
        double n1 = view.mostrarPriNum();
        operacion.setNum1(n1);
        double n2 = view.mostrarSegNum();
        operacion.setNum2(n1);
        Suma sum = new Suma(n1, n2);
        sum.mostraRresultado();
        Resta res = new Resta(n1, n2);
        res.mostraRresultado();
        Multiplicacion mul = new Multiplicacion(n1, n2);
        mul.mostraRresultado();
        Division div = new Division(n1, n2);
        div.mostraRresultado();

    }

}
