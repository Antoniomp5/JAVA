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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        String mayorOmenor;
        
        System.out.println("Introduzca el primer N.º: ");
        x = sc.nextInt();
        System.out.println("Introduzca el segundo N.º: ");
        y = sc.nextInt();
        
        mayorOmenor = (x > y) ? " x > y" : "x < y";
        
        System.out.println(mayorOmenor);
    }
    
}
