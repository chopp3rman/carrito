
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.carro;
import mx.itson.carrito.enums.TipoMotor;

/**
 *
 * @author CHOPER
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la distancia recorrida: ");
        
        double distancia = sc.nextDouble();
        
        System.out.println("Ingresa la velocidad a la que viaja el carro: ");
        
        double velocidad = sc.nextDouble();
        
        // Generamos una instancia de la clase carro
        carro bmw = new carro();
        bmw.setMarca("BMW");
        bmw.setColor("Negro");
        bmw.setAño(2021);
        bmw.setKilometraje(10000);
        bmw.setTipoMotor(TipoMotor.HÍBRIDO);
        //Invocamos al metodo contenido en la clase carro
      double tiempo =  bmw.calcularTiempo(distancia, velocidad);
        
        System.out.println("El tiempo que le tomara al carro " + bmw.getMarca() + " de color " + bmw.getColor() + " y cuyo modelo es " + bmw.getAño() + " le tomo " +  tiempo 
        + " y ahora su kilometraje es de " + bmw.getKilometraje());
    }
}
