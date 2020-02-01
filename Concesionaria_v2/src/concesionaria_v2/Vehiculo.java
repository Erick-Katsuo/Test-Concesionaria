/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria_v2;

/**
 *
 * @author Katsuo
 */
public abstract class Vehiculo implements VehiculoInterf {
    protected String marca;
    protected String modelo;
    protected double precio;
    protected int puertas;
    protected int cilindrada;
    
    //DEF OVERRIDE
    @Override
    public void setPuertas(int puertas){
        System.out.println("Def override, necesario implementar en la clase correspondiente");
    }
    @Override
    public void setCilindrada(int cilindrada){
        System.out.println("Def override, necesario implementar en la clase correspondiente");        
    }
    //DEF OVERRIDE
        
    @Override
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    @Override
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    @Override
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    @Override
    public String getModelo(){
        return modelo;
    }
    
    @Override
    public String getMarca(){
        return marca;
    }
    
    @Override
    public double getPrecio(){
        return precio;
    }
    
    @Override
    public int getPuertas(){
        return puertas;
    }
    
    @Override
    public int getCilindrada(){
        return cilindrada;
    }
}
