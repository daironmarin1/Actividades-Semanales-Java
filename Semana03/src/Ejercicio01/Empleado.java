
package Ejercicio01;

public class Empleado {
    
    //Atributos encapsulados
    private String nombre,area,codigo,tipoSeguro;
    private double sueldoBase,horasExtra;
    
    //Constructor
    public Empleado(String nombre, String codigo, String area, String tipoSeguro, double sueldoBase, double horasExtra) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.area = area;
        this.tipoSeguro = tipoSeguro;
        this.sueldoBase = sueldoBase;
        this.horasExtra = horasExtra;
    }
        
    //Sobrecarga de constructores, (por dos constructores o más)
    public Empleado(){
        
    }
    
    //Metodos de GET/SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    //Métodos Adicionales
    public double calcularMontoHorasExtra(){
        return sueldoBase*horasExtra/240;
    }
    
    public double calcularMontoSeguro(){
        if(tipoSeguro.equals("AFP")){
            return sueldoBase*0.11;
        }
        if(tipoSeguro.equals("SNP")){
            return sueldoBase*0.06;
        }
        return 0;
    }
    
    public double calcularMontoEsSalud(){
        return sueldoBase*0.03;
    }
    
    public double calcularDescuentoTotal(){
        return calcularMontoSeguro()+calcularMontoEsSalud();
    }
    
    public double calcularSueldoBruto(){
        return sueldoBase+calcularMontoHorasExtra();
    }
    
    public double calcularSueldoNeto(){
        return calcularSueldoBruto()-calcularDescuentoTotal();
    }
    
    
    //Método Mostrar
    public String mostrarDatos(){
        return "Código:" +codigo+
                "\nNombre:" +nombre+
                "\nÁrea:" +area+
                "\nSueldo Base:" +sueldoBase+
                "\nTipo de Seguro" +tipoSeguro+
                "\nMonto por Horas extra:" +calcularMontoHorasExtra()+
                "\nMonto por Tipo de Seguro:" +calcularMontoSeguro()+
                "\nMonto por EsSalud:" +calcularMontoEsSalud()+
                "\nDescuentos:" +calcularDescuentoTotal()+
                "\nSueldo Bruto:" +calcularSueldoBruto()+
                 "\nSueldo Neto:" +calcularSueldoNeto();
    }
}
