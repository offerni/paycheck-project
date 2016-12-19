/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolaboradores;
import javax.swing.JOptionPane;
/**
 *
 * @author Offerni
 */
public class SisColaboradores {
    
    public static void main(String[] args){
        String opcao;
        do{
                opcao = JOptionPane.showInputDialog("Informe o tipo de colaborador (CLT ou PJ)");
                if (opcao == null) {
                    System.exit(0);
                }
                
                opcao = opcao.toUpperCase(); // transforma em caixa alta caso a opção tenha sido digitada em caixa baixa
                
                if (opcao.equals("CLT")){
                    new CltFormulario().setVisible(true); // exibe o formulário caso a condição acima seja verdadeira
                }
                else if (opcao.equals("PJ")){
                    new PjFormulario().setVisible(true);
                }     
        } while (!opcao.equals("CLT") && ! opcao.equals("PJ"));   
    }      
}