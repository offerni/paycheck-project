/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolaboradores;

/**
 *
 * @author Offerni
 */
public interface Impostos {
    public double calcularGanhoPorHora(double salario, int horas);
    public double calcularIRRF(double salario);
    public double salarioLiquido();
}
