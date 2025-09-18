/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author UPN
 */
public class Jefe {
    
    //Atributos encapsulados
    private String nombre,cargo,area,tipoSeguro;
    private int dni,años,bonificacion=2000;
    private double sueldoBruto;
    //Constructor

        public Jefe(String nombre, String cargo, String area, String tipoSeguro, int dni, int años) {
            this.nombre = nombre;
            this.cargo = cargo;
            this.area = area;
            this.tipoSeguro = tipoSeguro;
            this.dni = dni;
            this.años = años;
        }
    
    //Sobrecarga de cosntrutor
    public Jefe(){
        
    }
    
    //Método GET/SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    //Métodos
        public double calcularSueldoBase(){
            if(cargo.equalsIgnoreCase("Gerente")){
                if(area.equalsIgnoreCase("Contabilidad"))
                    return 6000;
                if(area.equalsIgnoreCase("Planificación"))
                    return 7000;
            }else if (cargo.equalsIgnoreCase("Subgerente")){
                if(area.equalsIgnoreCase("Contabilidad"))
                    return 5000;
                if(area.equalsIgnoreCase("Planificación"))
                    return 6000;
            }
            return 0;
        }
   
    public double calcularDescuentoSeguro(){
        if(tipoSeguro.equals("AFP")){
            return calcularSueldoBase()*0.15;
        }
        if(tipoSeguro.equals("SNP")){
            return calcularSueldoBase()*0.08;
        }
        return 0;
    }
    
    public double calcularSueldoBruto(){
        return calcularSueldoBase()+bonificacion;
    }
    
    public double montoMovilidad(){
        if(cargo.equals("Gerente")){
            return calcularSueldoBase()+700;
        }
        if(cargo.equals("SubGerente")){
          return calcularSueldoBase()+400;
        }
        return 0;
    }
    
    public double calcularDescuentoSueldo(){
        if(años<7){
            return sueldoBruto*0.05;
        }
        if(años>=8){
            return sueldoBruto*0.04;
        }
        return 0;
    }
    
    public double calcularSueldoNeto(){
        return calcularSueldoBruto()+calcularDescuentoSeguro()+montoMovilidad();
    }
    
    
    //Método Mostrar
    public String mostrarDatos(){
        return "Nombre:" +nombre+
                "\nDni:" +dni+
                "\nÁrea:" +area+
                "\nCargo:" +cargo+
                "\nAños de antiguedad:" +años+
                "\nTipo de Seguro:" +tipoSeguro+
                "\nSueldo Base:" +calcularSueldoBase()+
                "\nDescuentos:" +calcularDescuentoSeguro()+
                "\nSueldo Bruto:" +calcularSueldoBruto()+
                "\nBono movilidad:" +montoMovilidad()+
                "\nSueldo neto:" +calcularSueldoNeto();
    }
    }