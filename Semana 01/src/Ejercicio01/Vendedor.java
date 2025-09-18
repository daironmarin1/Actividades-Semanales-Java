
package Ejercicio01;


public class Vendedor {
    //ATRIBUTOS
    String nombre;
    double sueldoBase;
    double montoVenta1,montoVenta2,montoVenta3;
    
    //MÉTODOS
    double calcularComision(){
        return(montoVenta1+montoVenta2+montoVenta3)*0.10;
    }
    double calcularSueldoTotal(){
        return sueldoBase+calcularComision();
    }
    
    
}
