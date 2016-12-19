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
public class Colaboradores {
    private String nome, endereco, tel;
    private double salario = 0,irrf;
    private int horas = 0;
    
    Colaboradores (String nome, String endereco, String tel, int horas, double salario, double irrf){
        this.nome = nome;
        this.endereco = endereco;
        this.tel = tel;
        this.horas = horas;
        this.salario = salario;
        this.irrf = irrf;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getTel(){
        return tel;
    }
    public void setTel (String tel){
        this.tel = tel;
    }
    public int getHoras(){
        return horas;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
     public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
     public double getIrrf(){
        return irrf;
    }
    public void setIrrf(double irrf){
        this.irrf = irrf;
    }

    @Override
    public String toString() {
        return "Colaboradores{" + "nome=" + nome + ", endereco=" + endereco + ", tel=" + tel + ", salario=" + salario + ", irrf=" + irrf + ", horas=" + horas + '}';
    } 
}
