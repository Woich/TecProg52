/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author woich
 */
public class Equacao2Grau <T extends Number>{

    private T a;
    private T b;
    private T c;
    
    public Equacao2Grau(T a, T b, T c) throws RuntimeException{
        if(((Number)a).doubleValue() == 0.0){
            throw new RuntimeException("Valor de 'a' não pode ser 0");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /**
     * @return the a
     */
    public T getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(T a) throws RuntimeException{
        if(((Number)a).doubleValue() == 0.0){
            throw new RuntimeException("Valor de 'a' não pode ser 0");
        }
        
        this.a = a;
    }

    /**
     * @return the b
     */
    public T getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(T b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public T getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(T c) {
        this.c = c;
    }
    
    public double getRaiz1() throws RuntimeException{
        
        if((Math.pow(b.doubleValue(), 2)-4*a.doubleValue()*c.doubleValue())/2 < 0){
            throw new RuntimeException("Equação não tem solução real");
        }
        
        return (-b.doubleValue() + Math.sqrt( (Math.pow(b.doubleValue(), 2)-4*a.doubleValue()*c.doubleValue() ) ))/2;
        
    }
    /*---------------------------------------------------------------------------------------------------------------*/
    public double getRaiz2() throws RuntimeException{
        
        if((Math.pow(b.doubleValue(), 2)-4*a.doubleValue()*c.doubleValue())/2 < 0){
            throw new RuntimeException("Equação não tem solução real");
        }
        
        return (-b.doubleValue() - Math.sqrt( (Math.pow(b.doubleValue(), 2)-4*a.doubleValue()*c.doubleValue() ) ))/2;
        
    }
}
