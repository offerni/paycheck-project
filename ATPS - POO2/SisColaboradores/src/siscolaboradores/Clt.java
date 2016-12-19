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
public class Clt extends Colaboradores implements Impostos{
    private long rg;
    private String cpf;
    private double inss;
    
    Clt(String nome, String endereco, String tel, int horas, long rg, String cpf, 
            double salario, double irrf, double inss){
        
        super (nome, endereco, tel, horas, salario, irrf);
        this.rg = rg;
        this.cpf = cpf;
        this.inss = inss;
    }
    
    public long getRg(){
        return rg;
    }
    
    public void setRg(int rg){
        this.rg = rg;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public double getInss(){
        return inss;
    }
    
    public void setInss(double inss){
        this.inss = inss;
    }
    
    @Override 
    public double calcularGanhoPorHora(double salario, int horas){
        
        if (horas <= 160){
            return salario;
        }
        return (salario / 160) * horas; // Cálculo para hora extra!
    }
    
    @Override 
    public double calcularIRRF(double salario){
        if (salario <= 1499.15){
        }
        else if ((salario >= 1499.16) && (salario <= 2246.75)){
            setIrrf((salario*0.075)-(112.43));
        }
        else if ((salario >= 2246.76) && (salario <= 2995.70)){
            setIrrf((salario*0.15)-(280.94));
        }
        else if ((salario >= 2995.71) && (salario <= 3743.19)){
            setIrrf((salario*0.225)-(505.62));
        }
        else{
            setIrrf((salario*0.275)-(692.78));
        }
        return getIrrf();
    }
    
    public double calcularINSS(){
        double salario = getSalario(); // Variável Local para o método getSalario()
        if (salario <= 965.67){
            this.inss = (salario *0.08);
        }
        else if (salario >= 965.68 && salario < 1609.45){
            this.inss = (salario*0.09);
        }
        else if (salario >= 1609.46){
            this.inss = (salario * 0.11);
            if (this.inss >= 354.08){
                   this.inss = 354.08;
            }
        }
        return this.inss;               
    }
   
    public double horasExtras(){
        double salario = getSalario();
        double irrf = calcularIRRF(salario);
        int horas = getHoras();
        double inss = calcularINSS();
        double ext = ((salario / 160) * horas- irrf - inss);
        double hPadrao = ((salario / 160) * 160 - irrf - inss);
        double total = ((ext) - (hPadrao));
        
        return total;
    }
    
   @Override 
    public double salarioLiquido(){
        double salario = getSalario();
        double irrf = calcularIRRF(salario);
        int horas = getHoras();
        double ganhoPorHora = calcularGanhoPorHora(salario, horas);
        double inss = calcularINSS();
        double salarioLiquido = (ganhoPorHora - irrf - inss);
        setSalario(salarioLiquido); 

        return getSalario();
    }
}
