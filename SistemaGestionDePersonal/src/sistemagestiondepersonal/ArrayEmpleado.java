/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestiondepersonal;

/**
 *
 * @author w9d1o
 */
public class ArrayEmpleado extends Array {
    private Empleado[] empleados;
    
    public ArrayEmpleado(int max) {
        super(max);
        empleados = new Empleado[max];
    }
    
    private boolean existeDni(int num) {
        boolean vf = false;
        int i = 0;
        while (i < this.getOcupada() && this.empleados[i].getDni() != num) i++;
        
        if (i < this.getOcupada()) vf = true;
        
        return vf;
    }
    
    
    public void agreagarEmpleado(Empleado empleado) {
        if (!existeDni(empleado.getDni())) {
            this.empleados[getOcupada()] = empleado;
            aumentarOcupadas();
        }
    }
    
    public Empleado buscarEmpleado(int dni) {
        return this.empleados[getIndex(dni)];
    }
    
    
    
    @Override
    public int getIndex(int dni) {
        int i = 0;
        while (i < super.getOcupada() &&
                this.empleados[i].getDni() != dni) i++;
        
        return i;
    }
    
    public double arrayEmpleadoCostos() {
        double costos = 0;
        for(int i = 0; i < this.getOcupada(); i++) {
            this.empleados[i].calcularSalario();
            costos += this.empleados[i].getSueldo();
        }
        return costos;
    }
    
    @Override
    public void eliminarElemento(int posicion) {
        int max = super.getOcupada();
        if( posicion >= 0 && posicion < max) {
            for (int i = posicion; i < max - 1; i++) {
                this.empleados[i] = this.empleados[i + 1];
            }
            super.disminuirOcupadas();
        }
    }
}
