
package Ejercicio01;

import java.text.DecimalFormat; //Aproximacion de decimales.

public class Deportista {
    
    DecimalFormat df =new DecimalFormat("#.##");
    
    //Atributos Encapsulados
    private String nombre;
    private double peso, altura;
    
    //Métodos de Acceso Público (Get-Set)
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //Métodos Adicionales
    
    public double calcularIMC(){
    if(altura>=1){
       // return peso/(altura*altura);
       return peso/Math.pow(altura,2);
    }else{
        return 0;
    }
    }
    public String determinaNivelPeso(){
    double imc=calcularIMC();
    
    if(imc>0 && imc<18.5){
        return "Bajo peso";
        
    }else if(imc>=18.5 && imc<24.9){
        return "Peso normal";
        
    }else if(imc>=24.9 && imc<=29.9){
        return "Sobrepeso";
        
    }else{
        return "Obesidad";
    }
    }
    
    public String mostrar(){
        return "Nombre:"+nombre+
                "\nPeso:"+peso+
                "\nAltura:"+altura+
                "\nÍndice de Masa Corporal:"+df.format(calcularIMC())+
                "\nNivel de Peso:"+determinaNivelPeso();        
    }
    
    }
    
    
    
    
    
    
    
    
    

