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
public class Menu {
    private String pessoa;
    
    Menu(String pessoa){
        this.pessoa = pessoa;
    }
    
    public String getPessoa(){
        return pessoa;
    }
    public void setPessoa(String pessoa){
        this.pessoa = pessoa;
    }
    
    public String Menu() {
        return "\tMENU: \n" + "1 - Pessoa Física\n" + "2 - Pessoa Jurídica\n" + "0 - Sair" ;
        }
    
    public String SubMenu() {   
        return "\n   MENU" + pessoa + ": " + "\n1 - Alterar Valor do Pagamento\n" + "2 - Calcular Pagamento\n" + "0 - Voltar" ;
    }  
}
