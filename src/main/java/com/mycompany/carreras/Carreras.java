/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carreras;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Carreras implements Runnable {

    
    private String nombre;
    private int velocidad;
    private int posicion;
    private static String ganador=null;
    
    public Carreras(String nombre){
        this.nombre=nombre;
        this.velocidad= new Random().nextInt(10)+1;
        this.posicion=0;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getPosicion(){
        return posicion;
    }
    
    
    public void avanzar(){
           posicion+=velocidad;
}

    @Override
    public void run() {
        while (posicion <400){
            avanzar();
            System.out.println(nombre+"avanzo a la posición"+ posicion);
            
            try{
                Thread.sleep(400);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            
        }
        if(ganador==null){
            ganador=nombre;
            System.out.println(nombre+"es el ganador");
        }
    }
}
