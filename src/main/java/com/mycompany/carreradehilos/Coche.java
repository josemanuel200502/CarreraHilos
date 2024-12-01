/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carreradehilos;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Coche  implements Runnable{
    
    private String nombre;
    private int velocidad;
    private int posicion;
    private static String ganador=null;
    
    public Coche(String nombre){
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
