/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author UPN
 */

public class Persona {
    
    
    //Atributos encapsulados
    private String nombre, apellidos,sexo;
    private int dni,nacimiento,edad;

    //Métodos de acceso Público (Get- Set)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


   public String mostrar(){
        return "Nombre: "+nombre+
                "\nEdad: "+edad+
                "\nApellidos: "+apellidos+
                "\nDni: "+dni+
                "\nSexo: "+sexo+
                "\nAño de Nacimiento: "+nacimiento;
   }
    
    
    
    
    
}
