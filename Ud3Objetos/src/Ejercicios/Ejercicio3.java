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
public class Ejercicio3 {
    public static void main(String[] args) {
        int anno, anno_nac, edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intrudizca el año actual: ");
        anno = sc.nextInt();
        
        System.out.println("Intrudizca su año de nacimiento: ");
        anno_nac = sc.nextInt();
        
        edad = anno - anno_nac;
        
        System.out.println("Su edad es: " + edad + " años");
        
        
        
        
    }
    
}
