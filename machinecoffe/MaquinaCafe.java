/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ashley.agenda.machinecoffe;

/**
 *
 * @author PC
 */
public class MaquinaCafe {
    private int vasos;
    private int cafe;
    private int azucar;

    public MaquinaCafe() {
        this.vasos = 0;
        this.cafe = 0;
        this.azucar = 0;
    }

    public String seleccionarVaso(String tamaño) {
        switch(tamaño) {
            case "pequeno": return "3 Oz de café";
            case "mediano": return "5 Oz de café";
            case "grande": return "7 Oz de café";
            default: return "Tamaño no válido";
        }
    }

    public String seleccionarAzucar(int cucharadas) {
        return cucharadas + " cucharadas de azúcar";
    }

    public boolean verificarDisponibilidad() {
        return (vasos > 0 && cafe > 0 && azucar > 0);
    }

    public void agregarVasos(int cantidad) {
        this.vasos += cantidad;
    }

    public void agregarAzucar(int cantidad) {
        this.azucar += cantidad;
    }

    public void agregarCafe(int cantidad) {
        this.cafe += cantidad;
    }
}

