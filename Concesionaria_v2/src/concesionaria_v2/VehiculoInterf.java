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
public interface VehiculoInterf {
    String CENT_CUB = "cc";
    char DINERO = '$';
    
    void setMarca(String marca);    
    void setModelo(String modelo);
    void setPrecio(double precio);
    void setPuertas(int puertas);
    void setCilindrada(int cilindrada);
    
    String getMarca();    
    String getModelo();
    double getPrecio();
    int getPuertas();
    int getCilindrada();
    
}
