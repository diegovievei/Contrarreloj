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

            aaa[i] = new Dorti(888, 100000);

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
        return (llegados);

    }

    public static void mostrarClasificacion(Dorti aaa[], int llegados) {

        for (int p = 0; p < llegados; p ++) {
            System.out.println(" * - * - * - * ");
            System.out.println(p +" : " + aaa[p].dorsal + " >> " + aaa[p].tiempo);
        }
        System.out.println(" * - * - * - * ");

    }
    public static void anotarLlegada(Dorti aaa[], int dorsal, int llegados, int tiempo){
        
        
    }

}
