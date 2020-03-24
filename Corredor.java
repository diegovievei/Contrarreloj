
package contrareloj;

import java.util.Scanner;

public class Corredor {
    //Atributos de la clase
    String nombre;
    String equipo;
    int dorsal;
    String nacionalidad;
    int tiempo;
    
    
public Corredor(int dorsal, String nombre, String equipo, String nacionalidad ) {

        this.dorsal = dorsal;
        this.nombre = nombre;
        this.equipo = equipo;
        this.nacionalidad= nacionalidad;
    
       }
public Corredor(String nombre,int dorsal, int tiempo){
    this.nombre=nombre;
    this.dorsal=dorsal;
    this.tiempo=tiempo;
}
//Lista de corredores en la carrera
public static void mostrarInscritos(Corredor xxx[] ){
 
    for (int numero=0;numero<xxx.length;numero++){
        System.out.println("Corredor: "+ xxx [numero].dorsal+ " " + xxx[numero].nombre+
        " "+xxx[numero].equipo+" "+xxx[numero].nacionalidad);
        System.out.println("---------------------");
    }
}
//Mostrar Clasificación
public static void mostrarClasificacion(Corredor xxx[]){
    for(int i=0;i<xxx.length;i++){
//        if(xxx[i].tiempo =){
//            System.out.println("No ha llegado");
//        }
        System.out.println("Tiempo ciclicsta "+ xxx[i].nombre
        + " "+ xxx[i].tiempo + " segundos "+ xxx[i].dorsal );
    }
}


public static void cargarInscritos(Corredor xxx[]){
    int dorsal=0;
    String nombre, equipo, nacionalidad;
    nombre="nombreCorredor";
    nacionalidad="nacionalidadCorredor";
    equipo="EquipoCorredor";
    
   // Corredor participante= new Corredor(dorsal,nombre,equipo,nacionalidad);
    xxx[0]=new Corredor(10,"Tom Boonen","Quick Step","BLG");
    xxx[1]=new Corredor(20,"Peter Sagan","Tinkoff","SVK");
    xxx[2]=new Corredor(30,"Oscar Pereiro","Astana","ESP");
   
  
    }

//Metodo para CARGAR INSCRITOS RECORRIENDO EL ARRAY
public static void cargarInscritos2(Corredor xxx[]){
    int[]dorsal={10,20,30};
    String[]nombres={"Tom Boone","Peter Sagan","Oscar Pereiro"};
    String[]equipos={"Quick Step","Tinkoff","Astana"};
    String[]nacionalidad={"BLG","SVK","ESP"};
      for (int i=0;i<xxx.length;i++){
        Corredor c=new Corredor(dorsal[i],nombres[i],equipos[i],nacionalidad[i]);
        xxx[i]=c;
    }
}
public static int menu(){
    int leido;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println(" ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
        System.out.println("1 : ");
        System.out.println("3 : ");
        System.out.println("5 : ");
        System.out.println("7 : Mostrar corredores participantes ");
        System.out.println("8 : ");
        System.out.println("9 : ");
        System.out.println("99 : Salir");

        leido = entradaTeclado.nextInt();
        return (leido);
    }
public static void nuevaLlegada(Corredor xxx[],Corredor yyy[], int llegados,int tiempo){
     
            //int auxdorsal=xxx[llegados].dorsal;
                Corredor c=new Corredor(xxx[llegados].nombre,xxx[llegados].dorsal,tiempo);
                yyy[llegados]=c;
  
}
    

}


//public static int menu(int leido){
//    
//}

