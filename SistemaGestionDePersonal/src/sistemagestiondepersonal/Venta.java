/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestiondepersonal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static sistemagestiondepersonal.Empleado.aPositivo;

/**
 *
 * @author w9d1o
 */
public class Venta {
    private String nombreProducto;
    private LocalDate fecha;
    private double valor;
    private int numeroVenta;
    private int unidades;
    
    public Venta(String nombreProducto, double valor, int unidadesVendidas,
            LocalDate fecha) {
        this.nombreProducto = nombreProducto;
        this.valor = aPositivo(valor);
        this.unidades = unidadesVendidas;
        this.fecha = fecha;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    
    
    public String getNombreProducto() {
        return nombreProducto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getValor() {
        return valor;
    }

    public int getUnidades() {
        return unidades;
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }
    
    
    
    public double ventaTotal() {
        return this.valor * this.unidades;
    }
    
    @Override
    public String toString() {
        return "Fecha de Venta: " + this.fecha.format(DateTimeFormatter.ISO_DATE)
                + "\nNombre de producto: " + this.nombreProducto +
                "\nNumero de venta: " + this.numeroVenta +
                "\nValor del prducto: " + this.valor +
                "\nUnidades vendidas: " + this.unidades +
                "\nMonto total: " + ventaTotal();
    }
    
}
