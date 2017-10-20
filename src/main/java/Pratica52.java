
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica52 {
    public static void main(String[] args) {
        Equacao2Grau<Integer> equacao;
        
        //raizes diferentes
        try{
            equacao = new Equacao2Grau<>(1,-3,1);
            System.out.println("A equação é x^2 - 3x + 1");
            System.out.println("As raízes são "+equacao.getRaiz1()+" e "+equacao.getRaiz2());
        }
        catch(Throwable t){
            System.out.println(t.getMessage());
        }
        
        //raizes iguais
        try{
            equacao = new Equacao2Grau<>(2,4,2);
            System.out.println("A equação é 2x^2 + 4x + 2");
            System.out.println("As raízes são "+equacao.getRaiz1()+" e "+equacao.getRaiz2());
        }
        catch(Throwable t){
            System.out.println(t.getMessage());
        }
        
        //sem raízes
        try{
            equacao = new Equacao2Grau<>(1,2,3);
            System.out.println("A equação é x^2 + 2x + 3");
            System.out.println("As raízes são "+equacao.getRaiz1()+" e "+equacao.getRaiz2());
        }
        catch(Throwable t){
            System.out.println(t.getMessage());
        }
    }
}

