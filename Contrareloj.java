
package contrareloj;

import java.util.Scanner;


public class Contrareloj {

    
    public static void main(String[] args) {
      int opcion, dorsal;
      int llegados=0;
      int tiempo;
      
      Corredor[] corredores=new Corredor[3]; //Array Corredores inscritos
      Corredor.cargarInscritos2(corredores);
      
      Corredor[]llegadas=new Corredor[3];//Array para anotar llegadas
      
      opcion=Corredor.menu();
      
       while (opcion != 99) {
           switch (opcion) {

                case 0:  // meter más datos de corredores, opcion oculta
                    break;
                case 1:  // mostrar la clasificación
                    Corredor.mostrarClasificacion(llegadas);
                    break;
                case 2: // libre
                    break;
                case 3: // anotar la llegada de un corredor
                  Scanner teclado=new Scanner(System.in);
                  tiempo= teclado.nextInt();
                  Corredor.nuevaLlegada(corredores,llegadas,llegados,tiempo);
                  llegados++;//Añadimos un llegado 
                   break;
                case 4: // libre
                    
                    break;
                case 5: // mostrar la información de un corredor
                //dorsal = leer dorsal();
                //mostrar_info(dorsal);
                case 6: // libre
                    break;
                case 7: // mostrar la lista de corredores de la carrera
                    Corredor.mostrarInscritos(corredores);
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

        }
      
     
   
        
    }
    
}
