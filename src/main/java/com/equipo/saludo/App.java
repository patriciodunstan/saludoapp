package com.equipo.saludo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String saluda(String nombre){
        return "!Hola, " + nombre + "!";
    }
    public static void main( String[] args )

    {
        System.out.println( saluda("DevOps") );
    }
}
