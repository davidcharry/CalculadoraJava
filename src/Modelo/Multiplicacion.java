/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mono-
 */
public class Multiplicacion extends Operacion {

    double multiplicacion;

    public Multiplicacion(double n1, double n2) {
        super(n1, n2, '*');
        this.multiplicacion = n1 * n2;
        this.setRespuesta(this.multiplicacion);
    }
}
