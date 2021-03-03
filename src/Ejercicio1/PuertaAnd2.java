/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Alejandro
 */
public class PuertaAnd2 {
    private boolean a;
    private boolean b;
    
    public PuertaAnd2(){
        a = false;
        b = false;
    }
    
    public PuertaAnd2(boolean entrada){
        a = entrada;
        b = entrada;  
    }
    
    public PuertaAnd2(boolean a, boolean b){
        this.a = a;
        this.b = b;
    }

    public boolean getA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public boolean getB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
    
        
    /*@Override    
    public boolean equals (Object otro){
        if(otro instanceof PuertaAnd2){
           PuertaAnd2 puertaAnd = (PuertaAnd2) otro;
           return a == puertaAnd.getA() && b == puertaAnd.getB();
        }
        return false;
    }*/
    public boolean equals (PuertaAnd2 otro){
        return a == otro.getA() && b == otro.getB();
    }
    
    public boolean getSalida(){
       return getA() && getB();
    }
    
    @Override
    public String toString(){
        return "A: " + getA() + " B: " + getB();
    }
    
}
