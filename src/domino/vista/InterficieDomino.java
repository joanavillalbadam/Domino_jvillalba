/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.vista;

import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Jugador;
import domino.model.Torn;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ALUMNEDAM
 */
public class InterficieDomino {
   
public Scanner lector = new Scanner (System.in);
  Fitxa fitx;    

 public String mostraMenu(){
 System.out.println("Seleccionar operació:"
 +"\n 1.Jugada Normal"+"\n 2.Jugada Doble" + "\n 3. Pasar");
 return lector.nextLine(); 
}

    public void missatgeError() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("no has seleccionat cap opcio correcta");
    }

   /* public String DarNombres(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // System.out.println("llega a entrar en Darnombres!!");
        String nom;
    System.out.println("Introdueix el nom del jugador " + i);
    nom = lector.nextLine();
    
    return nom;
    }*/

    public void MostrarNombreJugador(Jugador jugador) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("nom: "+jugador.nom);
    }

    public void MostrarTurnoJugador(int torn) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Torn: "+torn);
    }

    public void MostrarFitxasJugador(ArrayList<Fitxa> fitxes) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    for(int i=0; i < fitxes.size(); i++){
       System.out.println("**"+fitxes.get(i).valors[0]+"|"+fitxes.get(i).valors[1]+"**");
    }
    }

    public void MostrarFitxasMesa(ArrayDeque<Fitxa> fitxesJugades) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       for (Fitxa fitxa : fitxesJugades) {
             System.out.println("*fitxasMesa*"+fitxa.getValors()[0]+"|"+fitxa.getValors()[0]+"**");
        }
       
      /* for(int i = 0; i < fitxesJugades.size(); i++){
        
        System.out.println("*fitxasMesa*"+fitxesJugades.getFirst().getValors()[0]+"|"+fitxesJugades.getFirst().valors[1]+"**");
               
        //System.out.println("*fitxasMesa*"+fitxesJugades.getFirst().getValors()[0]+"|"+fitxesJugades.getFirst().valors[1]+"**");
    //preguntar por este metodo!!
            }*/
    }

    public boolean elejirLado() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    boolean conseguido = false;
     int x;
     System.out.println("Escribe en que lado quieres poner la ficha");
        System.out.println("1.-Izquierda");
        System.out.println("2.-Derecha");
     x = lector.nextInt();
     if(x == 1){ 
     conseguido = true;
     }
     if(x == 2){
     conseguido =false;
     }   
     return conseguido;
    }

    public int elejirFitxa(ArrayList<Fitxa> fitxes) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int pos; 
       int decis;
      
       System.out.println("Escoje mediante el numero de posicion que fitxa quieres jugar");
        pos = lector.nextInt();
       
        System.out.println("Has escollit **"+fitxes.get(pos).valors[1]+"|"+fitxes.get(pos).valors[0]+"**");

        return pos;
    }

    public String DarNombres(int m) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String nom;
    System.out.println("Introdueix el nom del jugador " + m);
    nom = lector.nextLine();
    
    return nom;
    }


}
