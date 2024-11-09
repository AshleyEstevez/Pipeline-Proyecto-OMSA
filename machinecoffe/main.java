/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ashley.agenda.machinecoffe;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaCafe maquina = new MaquinaCafe();

        System.out.println("¡Bienvenido a la Máquina de Café!");

        
        if (!maquina.verificarDisponibilidad()) {
            System.out.println("La máquina no está lista para usar.");
            return;
        }

        
        System.out.println("Seleccione el tamaño del vaso: pequeño, mediano, grande");
        String tamañoVaso = scanner.nextLine();
        String vasoSeleccionado = maquina.seleccionarVaso(tamañoVaso);
        System.out.println("Has seleccionado: " + vasoSeleccionado);

        
        System.out.println("¿Cuántas cucharadas de azúcar deseas?");
        int cucharadasAzucar = scanner.nextInt();
        scanner.nextLine(); 
        String azucarSeleccionada = maquina.seleccionarAzucar(cucharadasAzucar);
        System.out.println("Has seleccionado: " + azucarSeleccionada);

        // Simulación de la preparación del café
        System.out.println("Preparando tu café...");

        // Verificar de nuevo los recursos después de la selección
        if (!maquina.verificarDisponibilidad()) {
            System.out.println("No hay suficientes recursos para completar tu pedido.");
        } else {
            System.out.println("Tu café está listo. ¡Disfruta!");
        }
    
    }
}
