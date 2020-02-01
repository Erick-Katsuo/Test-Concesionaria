/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria_v2;

public interface OperarioInterf {
    int SALIR = 0;
    int DEF_OPC = SALIR;
    
    int LEER_ARCH = 1;
    int GUARDAR_INF = 2;
    
    
    String DEF_NOMBRE = "def_nombre";
    String DEF_INFO = "def_info";
    
    int MARCA = 0;
    int MODELO = 1;
    int CARACTERISTICA = 2;
    int PRECIO = 3;
    
    int CONTADOR_DEF = -1;
    
}
