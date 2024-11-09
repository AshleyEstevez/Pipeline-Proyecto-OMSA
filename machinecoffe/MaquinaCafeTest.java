package com.ashley.agenda.machinecoffe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author PC
 */
public class MaquinaCafeTest {
    
    @Test
    public void testSeleccionarVasoPequeno() {
        MaquinaCafe maquina = new MaquinaCafe();
        String vaso = maquina.seleccionarVaso("pequeno");
        assertEquals("3 Oz de café", vaso);
    }

    @Test
    public void testSeleccionarVasoMediano() {
        MaquinaCafe maquina = new MaquinaCafe();
        String vaso = maquina.seleccionarVaso("mediano");
        assertEquals("5 Oz de café", vaso);
    }

    @Test
    public void testSeleccionarVasoGrande() {
        MaquinaCafe maquina = new MaquinaCafe();
        String vaso = maquina.seleccionarVaso("grande");
        assertEquals("7 Oz de café", vaso);
    }

    @Test
    public void testSeleccionarAzucar() {
        MaquinaCafe maquina = new MaquinaCafe();
        String azucar = maquina.seleccionarAzucar(2);  // Ejemplo: 2 cucharadas
        assertEquals("2 cucharadas de azúcar", azucar);
    }

    @Test
    public void testVerificarDisponibilidad() {
        MaquinaCafe maquina = new MaquinaCafe();
        maquina.agregarVasos(10);  // Añadir 10 vasos
        maquina.agregarAzucar(20);  // Añadir 20 cucharadas de azúcar
        maquina.agregarCafe(15);  // Añadir 15 oz de café

        assertTrue(maquina.verificarDisponibilidad());  // Debe ser true si todo está disponible
    }
    
}
