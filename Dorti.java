/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contrarelojprofesor;

/**
 *
 * @author usuario
 */
public class Dorti {

  
    // atributos
    int dorsal;
    int tiempo;

    // metodo constructor 
    public Dorti(int dorsal, int tiempo) {
        this.dorsal = dorsal;
        this.tiempo = tiempo;
    }

    public static void inicializar(Dorti aaa[]) {

        /* le paso un dorsal, un tiempo, y lo pone en el array de clasificacion en la última celda libre */
        for (int i = 0; i < aaa.length; i++) {

            aaa[i] = new Dorti(888, 99999);

        }
    }

    public static int clasificar(int dorsal, int tiempo, Dorti aaa[], int llegados) {

        /* le paso un dorsal, un tiempo, y lo pone en el array de clasificacion en la última celda libre */
        aaa[llegados].dorsal = dorsal;

        aaa[llegados].tiempo = tiempo;

        //Ordenar array clasificación
        boolean cambio=true;
        while (cambio){
            cambio=false;
        for(int i=0;i<aaa.length-1;i++){
            if(aaa[i].tiempo>aaa[i+1].tiempo){
                Dorti aux=aaa[i];
                aaa[i]=aaa[i+1];
                aaa[i+1]=aux;
                cambio=true;
                }
        }
        }
        return llegados;

    }
    public static int mostrarTiempo(int dorsal,Dorti tiempos[]){
        int tiempo=0;
        int aux;
           for( int i=0;i<tiempos.length;i++){
               if(dorsal==tiempos[i].dorsal){
                   tiempo=tiempos[i].tiempo;
                    aux=i;
               }
           }
        return tiempo;
       
    }
    public static int posicion(int dorsal,Dorti tiempos[]){
        int posicion=99;
        for( int i=0;i<tiempos.length;i++){
               if(dorsal==tiempos[i].dorsal){
                    posicion=i+1;
               }
           }
        return posicion;
    }

    public static void mostrarClasificacion(Dorti aaa[],Corredor bbb[],int llegados) {
        String nombre=" ";
        String equipo=" ";
        for (int p = 0; p < llegados; p ++) {
            System.out.println(" * - * - * - * ");
            for(int i=0;i<bbb.length;i++){
             if(aaa[p].dorsal==bbb[i].dorsal) {
                 nombre=bbb[i].nombre;
                 equipo=bbb[i].equipo;
             }  
            }
            
            System.out.println(p +" : " + aaa[p].dorsal + " "+ nombre+ " >> " + aaa[p].tiempo);
        }
        System.out.println(" * - * - * - * ");

    }
    public static void anotarLlegada(Dorti aaa[], int dorsal, int llegados, int tiempo){
        
        
    }
    
    public static int comprobarDorsal(int dorsal,Corredor acorredores[] ,Dorti tiempos[]){
        int valido=-1;int i;
        boolean inscrito=false;
        boolean llegado=false;
          for(Corredor aux:acorredores){ // Recorremos acorredores para comprobar si está inscrito   
            if(aux.dorsal==dorsal)
                inscrito=true;
            
          }
            //Comprobamos si dorsal ya está en "tiempos"
           for(Dorti aux:tiempos){
              if(aux.dorsal==dorsal)
                  llegado=true;
             // i=aux;
           }
           
        if ( inscrito && !llegado ) valido=0;  
        if (!inscrito ) valido =1;
        if ( inscrito && llegado ) valido = 2;
       
        return valido;
  
    }
    public static String Diferencia (Dorti tiempos[],int tiempo){
        int diferencia; 
        String mensaje="";
        diferencia=tiempo-tiempos[0].tiempo;
        if (diferencia==0){//Igual a cero pq cuando se llama a este método, si el tiempo introducido es el mejor, ya va a estar en la posición 0 del array Tiempos
            mensaje="Nuevo lider "/*+(tiempo-tiempos[1].tiempo )+ " secs. del 2ºclasificado"*/;
          
        }
        if (diferencia>0){ // Para q imprima solo diferencias con el primer clasificado
            mensaje="A +"+ diferencia + "secs. del 1º clasificado," ;       
        }
 
        return mensaje;
    }

}
