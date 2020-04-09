/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contrarelojprofesor;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ContrarelojProfesor {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {

        //variables globales
        int opcion, dorsal;
        int llegados =0;  // corredores llegados
        int comprueba;
        Corredor acorredores[];
        acorredores = new Corredor[6];   // el array de los corredores inscritos
        // cargar los datos de los corredores 

        Corredor.cargarDatos(acorredores); // rellena el array  acorredores

        Dorti[]tiempos=new Dorti[6]; //Creamos array tiempos
        Dorti.inicializar(tiempos);//Iniciamos el array
        opcion = Corredor.menu();

        while (opcion != 99) {
            switch (opcion) {

                case 0:  // meter más datos de corredores, opcion oculta
                    break;
                case 1:  // mostrar la clasificación
                    Dorti.mostrarClasificacion(tiempos,acorredores,llegados);
                    break;
                case 2: // libre
                    break;
                case 3: // anotar la llegada de un corredor
                    Scanner teclado=new Scanner (System.in);
                    System.out.println("Digite el dorsal");
                    dorsal=teclado.nextInt();
                    comprueba=Dorti.comprobarDorsal(dorsal, acorredores, tiempos);
                    String nombre= Corredor.buscaNombre(dorsal, acorredores);
                    String equipo= Corredor.buscaEquipo(dorsal, acorredores);
                    if(comprueba==0){
                    System.out.println("Digite el tiempo");
                    int tiempo=teclado.nextInt();
                    Dorti.clasificar(dorsal, tiempo, tiempos, llegados);
                    llegados++;
                    String diferencia= Dorti.Diferencia(tiempos, tiempo);//Mostrará un mensaje con la diferencia de tiempos    
                     int posicion=Dorti.posicion(dorsal, tiempos); 
                    
                    System.out.print("El corredor "+nombre + " del equipo "
                        + equipo + " hizo un tiempo de "+tiempo+ " "+diferencia);
                    if(posicion!=1){
                        System.out.println("clasificandose en "+posicion+"º");
                    }
                    }
                    if(comprueba==2){
                        System.out.println("El corredor numero" + dorsal + " "+ nombre+" ya ha llegado");                        
                    }
                    if(comprueba==1){
                        System.out.println("No está en la lista");
                    }
                    break;
                case 4: // libre
                    break;
                case 5: // mostrar la información de un corredor
                     Scanner teclado1=new Scanner (System.in);
                    System.out.println("seleccione Dorsal del corredor");
                     dorsal=teclado1.nextInt();
                    comprueba=Dorti.comprobarDorsal(dorsal, acorredores, tiempos);
                    if(comprueba==0){
                  Corredor c= new Corredor(dorsal," ", " ");
                    c.mostrarUno(dorsal,acorredores);
                        System.out.println("tiempo en carrera: sin llegar");
                    }
                    if(comprueba==2){
                    int tiempo=  Dorti.mostrarTiempo(dorsal, tiempos);
                     Corredor c= new Corredor(dorsal," ", " ");
                    c.mostrarUno(dorsal,acorredores);  
                    System.out.println("tiempo en carrera: "+tiempo);
                    int posicion=Dorti.posicion(dorsal, tiempos);
                        System.out.println("Clasificación: "+ posicion+"º");
                    
                    }
                    if(comprueba==1)
                        System.out.println("Dorsal no inscrito");
                    break;
                case 6: // libre
                    break;
                case 7: // mostrar la lista de corredores de la carrera
                    Corredor.mostrarDatos(acorredores);
                    break;
                case 8:// mostrar equipos participantes
                    break;
                case 9: // mostrar información de un equipo
                    break;
                default:
                    // podemos mostrar un mensaje de error
                    break;
            } // fin del switch

            opcion = Corredor.menu();

        } // del while 
    } // fin del main


} // fin de la class
    
    

