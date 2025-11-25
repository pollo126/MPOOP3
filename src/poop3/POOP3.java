/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

import java.util.ArrayList; //Importada para el Array List
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author poo02alu04
 */
public class POOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("///////////////////ARREGLOS///////////////////");
        int a = 23;
        int [] b = new int[3]; //Forma heredada de C
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        System.out.println("b.length = "+b.length);
        for (int i = 0; i < b.length; i++) {
            int j = b[i];
            System.out.println(j);            
        }
        int [] c = {1, 2, 3, 4, 5};
        int [] d;
        d = new int[10];
        
        System.out.println("///////////////////FOR///////////////////");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba: "+i);
        }
        
        for (int i = 0; i < d.length; i++) {
            d[i] = i*100;
            System.out.println(d[i]);
        }
        
        System.out.println("///////////////////FOR EACH///////////////////");
        for(int temp : d){
            System.out.println(temp);
        }
        
        System.out.println("/////////////CADENA DE CARACTERES/////////////");
        String s = new String("Hola Mundo");
        System.out.println(s);
        String s1 = "Hola Mundo en s1";
        System.out.println(s1);
        
        String nombre = "Esteban";
        String apellido = "Dominguez";
        String nombreCompleto = nombre +" "+ apellido;
        System.out.println(nombreCompleto);
        
        System.out.println("///////////////////OPERADOR PUNTO///////////////////");
        
        System.out.println("Arreglo con "+ d.length+ " elementos");
        System.out.println("Nombre completo tiene "+ nombreCompleto.length()+" caracteres");
        char [] hola2 = {'H', 'o', 'l', 'a'};
        System.out.println("Elementos en hola "+ hola2.length);
        //String holaCadena = hola2; //ERROR, char no puede ser convertido en cadena
        
        System.out.println("///////////////////WRAPPER///////////////////");
        int f = 35;
        Integer g = new Integer(35); //Tachada porque esta deprecada
        Integer h = 35;
        String s3 = h.toString();
        System.out.println(s3);
        
        System.out.println("///////////////////COLECCIONES///////////////////");
        
        System.out.println("###### ArrayList #######");
        System.out.println("List: Coleccion de datos ordenados y que mantiene un orden de insercion");
        
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(4);
        miArrayList.add(11);
        System.out.println("Elementos en List: "+ miArrayList.size());
        System.out.println(miArrayList.get(1));
        miArrayList.add(0, 22);
        System.out.println("···········");
        System.out.println(miArrayList.get(0));
        for (Integer integer : miArrayList) {
            System.out.println(integer);
            
        }
        System.out.println("···········");
        miArrayList.add(2, 8);
        for (Integer integer : miArrayList) {
            System.out.println(integer);
            
        }
        
        System.out.println("///////////////////HASH TABLE///////////////////");
        // <key, value>
        // key  -> Set
        // value -> List
        
        Hashtable<Integer, String> miTabla = new Hashtable<Integer, String>();
        miTabla.put(322216149, "Estebandido Dominguez");
        miTabla.put(312452564, "Coraline Martinez");
        System.out.println("Elementos en Tabla: "+ miTabla.size());
        miTabla.put(323412456, "Agustin Inturbide");
        System.out.println("Elementos en Tabla: "+ miTabla.size());
        
        for (String valor : miTabla.values()) {
            System.out.println(valor);
        }
        /*
        for (Integer key : miTabla.keys()) {
            System.out.println(key);
        }
        */
        
        System.out.println("///////////////////ENUMERACION///////////////////");
        Integer llave;
        String valor;
        
        Enumeration<Integer> llaves = miTabla.keys() ;
        while (llaves.hasMoreElements()) {
            llave = llaves.nextElement();
            valor = miTabla.get(llave);
            System.out.println("Elemento<"+llave+", "+valor+">");
        }
        
        System.out.println("///////////////////MATH///////////////////");
        
        System.out.println(Math.PI);
        System.out.println(Math.abs(-66));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(3, 2));
        
        System.out.println("///////////////////DATE///////////////////");
        Date hoy = new Date();
        System.out.println(hoy);
        
        System.out.println("///////////////////CALENDAR///////////////////");
        
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);
        
        String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH)+ " de "+ (calendarioHoy.get(Calendar.MONTH)+1)+ " de "+ calendarioHoy.get(Calendar.YEAR);
        System.out.println(fechaActual);
        
        //E1. Realizar un diccionario de 5 palabras con su respectiva definicion en un HashTable e imprimir todos los elementos
        //E2. Realizar una agenda con 5 registros guardando el nombre y el cumpleaños de la persona <String, Calendar> e imprimir todos los registros
        
    }
}
