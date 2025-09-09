/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03;

/**
 *
 * @author UPN
 */
public class Empleado {
    
    //Atributos encapsulados
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;
    
    //Metodos de acceso público

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    
    // Métodos de cálculo
    public double sueldoBasico() {
        return horasTrabajadas * tarifaHora;
    }

    public double bonificacion() {
        return sueldoBasico() * 0.20;
    }

    public double sueldoBruto() {
        return sueldoBasico() + bonificacion();
    }

    public double descuento() {
        return sueldoBruto() * 0.10;
    }

    public double sueldoNeto() {
        return sueldoBruto() - descuento();
    }

    // Método mostrar 
    public String mostrar() {
        return "Nombre: " + nombre +
                "\nHoras trabajadas: " + horasTrabajadas +
                "\nTarifa por hora: " + tarifaHora +
                "\nSueldo Básico: " + sueldoBasico() +
                "\nBonificación (20%): " + bonificacion() +
                "\nSueldo Bruto: " + sueldoBruto() +
                "\nDescuento (10%): " + descuento() +
                "\nSueldo Neto: " + sueldoNeto();
    }
}
