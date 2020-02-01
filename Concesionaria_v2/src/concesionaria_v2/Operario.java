/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria_v2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Katsuo
 */
public class Operario implements OperarioInterf {

    private int opcionMenu = DEF_OPC;
    private Scanner opcionScan = null;

    private String nombreArchivo = DEF_NOMBRE;
    private Scanner nombreScan = null;

    private String info = DEF_INFO;

    int contadorLinea = CONTADOR_DEF;

    Operario() {
        opcionScan = new Scanner(System.in);
        nombreScan = new Scanner(System.in);
    }

    public void menu() {
        do {
            mostrarMenu();
            opcionMenu = opcionScan.nextInt();
            switch (opcionMenu) {
                case LEER_ARCH:
                    leerArchivo();
                    break;
                case GUARDAR_INF:
                    //
                    break;
                case SALIR:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingreso invalido");
            }
        } while (opcionMenu != SALIR);
    }

    private void mostrarMenu() {
        System.out.println("-------MENU------");
        System.out.println("•   Leer archivo    [1]");
        System.out.println("•   Guardar info    [2]");
        System.out.println("•   Salir           [0]");
        System.out.println("-----------------");
    }

    private void leerArchivo() {
        System.out.println("Ingrese el nombre del archivo incluyendo la extension");
        nombreArchivo = nombreScan.next();
        contadorLinea = 0;
        try {
            File archivoLectura = new File(nombreArchivo);
            Scanner archivoScan = new Scanner(archivoLectura);
            while (archivoScan.hasNext()) { // con nextline toma toda la linea hasta un salto(\n)
                info = archivoScan.next();
                System.out.println(info);
                /*
                    ver manejo de arrays para crear objetos y almacenarlos en el mismo
                */
                procesarInfo();
                verificarSalto();
            }
            archivoScan.close();
        } catch (IOException e) {
            System.out.println("Error al intentar leer el archivo");
            e.printStackTrace();
        }
    }

    private void procesarInfo() {
        switch(contadorLinea){
            case MODELO:
                System.out.println("modelo");
                break;
            case MARCA:
                System.out.println("marca");
                break;
            case CARACTERISTICA:
                System.out.println("caract");
                break;
            case PRECIO:
                System.out.println("precio");
                break;
        }
    }

    private void verificarSalto() {
        if (contadorLinea == PRECIO) {
            contadorLinea = 0;
            System.out.println("salto verificado");
        } else {
            contadorLinea++;
        }
    }
}
