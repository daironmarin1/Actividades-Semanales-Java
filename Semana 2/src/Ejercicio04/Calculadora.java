/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04;

/**
 *
 * @author UPN
 */
public class Calculadora {
    private double num1, num2,resultado;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
 
    //Métodos
    double calcularSuma(){
        return num1+num2;
    }
    
    double calcularResta(){
        return num1-num2;
    }
    
    double calcularDivision(){
        return num1/num2;
    }
    
    double calcularMultiplicacion(){
        return num1*num2;
    }
    
    //Metodo de mostrar
    public String mostrar(){
        return "Suma: " +calcularSuma()+
                "\nResta:" +calcularResta()+
                "\nDivisión:" +calcularDivision()+
                "\nMultiplicación:" +calcularMultiplicacion();
    }
                
}
