
package mx.itson.carrito.entidades;

import mx.itson.carrito.enums.TipoMotor;

/**
 *
 * @author CHOPER
 */
public class carro 
{

    /**
     * @return the tipoMotor
     */
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the kilometraje
     */
    public double getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
        private String color;
        
        private int año;
        
        private String marca;
        
        private double kilometraje;
        
        private TipoMotor tipoMotor;
        
        /**
         * Sirve para calcular el tiempo en que tarda en recorrer una distancia.
         * @param distancia Distancia que recorre el carro.
         * @param velocidad Velocidad a la que viaja el carro,
         * @return  Tiempo en el que llegará el carro.
         */
        public double calcularTiempo(double distancia, double velocidad)
        {
            this.kilometraje += distancia;
            // La linea de arriba es lo mismo que esta de abajo
            // this.kilometraje = this.kilometraje + distancia;
            double tiempo = distancia / velocidad;
            return tiempo;
        }
            
}
