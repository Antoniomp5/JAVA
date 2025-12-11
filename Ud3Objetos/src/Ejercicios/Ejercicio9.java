/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author 05_1DAW_Alum
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean llueve, tareasFinalizadas, irBiblioteca;

        System.out.print("¿Está lloviendo? (true/false): ");
        llueve = sc.nextBoolean();

        System.out.print("¿Has finalizado tus tareas? (true/false): ");
        tareasFinalizadas = sc.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        irBiblioteca = sc.nextBoolean();

        // Condición: no llueve y tareas finalizadas, o ir a la biblioteca
        boolean permiso = !llueve && tareasFinalizadas || irBiblioteca;

        System.out.println("¿Puedes salir a la calle?: " + permiso);
    }

}
    

