/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestiondepersonal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author w9d1o
 */
public class Venta {
    private String nombreProducto;
    private LocalDate fecha;
    private BigDecimal valor;
    private int unidades;
    
    public Venta(String nombreProducto, BigDecimal valor, int unidadesVendidas,
            LocalDate fecha) {
        this.nombreProducto = nombreProducto;
        this.valor = valor;
        this.unidades = unidadesVendidas;
        this.fecha = fecha;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getUnidades() {
        return unidades;
    }
    
    public BigDecimal ventaTotal() {
        BigDecimal total = new BigDecimal(0);
        BigDecimal mul = new BigDecimal(this.unidades);
        total.add(this.valor.multiply(mul));
        return total;
    }
    
    @Override
    public String toString() {
        return "Fecha de Venta: " + this.fecha.format(DateTimeFormatter.ISO_DATE)
                + "\nNombre de producto: " + this.nombreProducto +
                "\nValor del prducto: " + this.valor.toPlainString() +
                "\nUnidades vendidas: " + this.unidades +
                "\nMonto total: " + ventaTotal().toPlainString();
    }
    
}
