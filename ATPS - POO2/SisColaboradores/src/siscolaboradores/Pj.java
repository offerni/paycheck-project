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
public class Pj extends Colaboradores implements Impostos {
    private String cnpj;
    
    
    Pj (String nome, String endereco, String tel, String cnpj, int horas, double salario, double irrf){
        super (nome, endereco, tel, horas, salario, irrf);
        this.cnpj = cnpj;        
    }
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    @Override 
    public double calcularGanhoPorHora(double salario , int horas){ // calcula o salario BRUTO baseado nos ganhos por hora
        return salario * horas;
    }
    
    @Override 
    public double calcularIRRF(double salario){ // calcula o importo de renda retiro na fonte
        setIrrf(salario * 0.015);
        return getIrrf();
    }
    
    public double calcularImpostos(){
        double salario = getSalario();
        int horas = getHoras(); 
        double total = calcularGanhoPorHora(salario, horas);
        if (total >5000){
            return (total * 0.0865);
        }
        else
            return 0;
    }
        
    @Override 
    public double salarioLiquido(){// função para salário líquido
        int horasTrabalhadas = getHoras(); 
        double salario = getSalario();
        double ganhoPorHora = calcularGanhoPorHora(salario, horasTrabalhadas); 
        double irrf = calcularIRRF(ganhoPorHora);
        double taxa = calcularImpostos();
        
        if (ganhoPorHora > 5000){
            double salarioLiquido = (ganhoPorHora - taxa - irrf);
            setSalario(salarioLiquido); // subtrai o salário Bruto pelos impostos
            return getSalario();
        }
        else if (ganhoPorHora <= 5000) {
            double salarioLiquido = (ganhoPorHora - irrf);
            setSalario(salarioLiquido);
            return getSalario();
        }        
        return ganhoPorHora; // retorna o salário Líquido com os impostos descontados
    } 
}