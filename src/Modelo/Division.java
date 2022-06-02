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
public class Division extends Operacion {

    double division;

    public Division(double n1, double n2) {
        super(n1, n2, '/');
        this.division = n1 / n2;
        this.setRespuesta(this.division);
    }
}
