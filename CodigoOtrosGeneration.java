/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigootrosgeneration;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class CodigoOtrosGeneration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    Scanner s = new Scanner(System.in);
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    String j2 = s.nextLine();
    
    int g = 2;
    
    if (j1.equals(j2)) {
      System.out.println("Empate");
    } else {
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") 
            g = 1;
             break;
        case "papel":
          if (j2 == "piedra") 
            g = 1;
             break; 
        case "tijera":
          if (j2.equals("papel")) 
            g = 1; 
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
    }
    
}
