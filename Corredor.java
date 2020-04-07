/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contrarelojprofesor;
import java.util.Scanner;

public class Corredor {

    // atributos
    int dorsal;
    String nombre;
    String equipo;
  //  int tiempo;

      // metodo constructor
    public Corredor(int dorsal, String nombre, String equipo) {

        this.dorsal = dorsal;
        this.nombre = nombre;
        this.equipo = equipo;

    }

    public static void mostrarDatos(Corredor aaa[]) {

        for (int d = 0; d < aaa.length; d++) {
            System.out.println(" * - * - * - * ");
            System.out.println("Corredor : " + aaa[d].dorsal + " >> " + aaa[d].nombre + " >> " + aaa[d].equipo);
        }
        System.out.println(" * - * - * - * ");

    }

    public static void cargarDatos(Corredor aaa[]) {

        int dorsal = 10;
        String nombre = "Merck";
        String equipo = "TDK";

        // Corredor uno;
        Corredor uno = new Corredor(dorsal, nombre, equipo);

        aaa[0] = uno;

        aaa[1] = new Corredor(20, "Perico", "Movistar");
        aaa[2] = new Corredor(30, "Indurain", "Banesto");
        aaa[3]=new Corredor(40,"Tom Boonen","Quick Step");
        aaa[4]=new Corredor(50,"Peter Sagan","Tinkoff");
        aaa[5]=new Corredor(60,"Oscar Pereiro","Astana");
    }

    public static int menu() {

        int leido;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println(" ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
        System.out.println("1 : Mostrar Clasificación ");
        System.out.println("3 : Anotar nueva llegada a meta");
        System.out.println("5 : Mostrar info. corredor ");
        System.out.println("7 : Mostrar corredores participantes ");
        System.out.println("8 : ");
        System.out.println("9 : ");
        System.out.println("99 : Salir");

        leido = entradaTeclado.nextInt();
        return (leido);
    } // fin del método menu

 
    public void mostrarUno(int dorsal, Corredor aaa[]) {

        // muestra los datos de un corredor
        int d=dorsal;  
        boolean c=false;
        String nombre=" ",equipo=" ";
      
        for(int i=0;i<aaa.length;i++){
          c=false;
            if(d==aaa[i].dorsal){
                c=true;
                nombre=aaa[i].nombre;
                equipo=aaa[i].equipo;
   
                break; 
            }
            
        }
        if (c==true){
               
            System.out.println("Corredor : " + this.dorsal+ " nombree: " + nombre + "equipo: "+ equipo);
   
        }
        else 
            System.out.println("No esta en la lista");
       
       
    }
    
        

        

} // fin de la class corredor
    
    
