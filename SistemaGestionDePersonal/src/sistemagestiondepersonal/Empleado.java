/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestiondepersonal;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author w9d1o
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    private double base;
    private double sueldo;
    private LocalDate fechaIngreso;
    
    public Empleado(String nombre, String apellido, int dni,
            double sueldoBase, LocalDate fechaDeIngreso){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = aPositivo(dni);

        this.base = aPositivo(sueldoBase);
        this.sueldo = this.base;
        this.fechaIngreso = fechaDeIngreso;
    }
    
    /*Aparentemente Java no tiene numeros sin signo*/
    public static int aPositivo(int valor) {
        if (valor < 0) valor *= -1;
        return valor;
    }
    
    public static double aPositivo(double valor) {
        if (valor < 0) valor *= -1;
        return valor;
    }
    
    public double getBase() {
        return base;
    }
    
    /*Este metodo me trae muchas dudas, pero si no lo tengo no puedo
    usar calcularSalario en las otras clases*/
    public void setSalario(double valor) {
        valor = aPositivo(valor);
        this.sueldo = valor;
    }
    
    public void calcularSalario() {
       this.sueldo = this.base; 
    };

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    
    public void setAumento(double porcentaje){
        this.base *= (porcentaje / 100);
    }
    
    public String getInformacion() {
        String informacion = "Nombre: " + this.nombre + "\nApellido: " +
                this.apellido + "\nNumero de DNI: " + this.dni +
                "\nFecha de ingreso: " + 
                this.fechaIngreso.format(DateTimeFormatter.ISO_DATE) +
                 "\nSueldo Base: " + this.base + this.sueldo +
                "\nSueldo a liquidar: " + this.sueldo;
        
        return informacion;
    }
}
