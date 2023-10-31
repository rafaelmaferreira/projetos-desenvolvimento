
package precodevenda;
import java.util.Scanner;


public class Precodevenda {

    float p_venda, custo, icms, v_icms, ipi , v_ipi, pis, v_pis, cofins, v_cofins, lucro, v_lucro, desconto, v_desconto;
    
    Scanner leia = new Scanner(System.in);
    
    public void entradaDados(){
               
        System.out.println("Digite o preço de compra: ");
        custo = leia.nextFloat();
        
        System.out.println("Digite a % de icms: ");
        icms = leia.nextFloat();
        
        System.out.println("Digite a % de ipi: ");
        ipi = leia.nextFloat();
        
        System.out.println("Digite a % do pis: ");
        pis = leia.nextFloat();
        
        System.out.println("Digite a % de cofins: ");
        cofins = leia.nextFloat();
        
        System.out.println("Digite a % de lucro desejada: ");
        lucro = leia.nextFloat();
        
    }
        
    public void calculoVenda(){
        
     v_icms = custo*(icms/100);
     v_ipi = custo*(ipi/100);
     v_pis = custo*(pis/100);
     v_cofins = custo*(cofins/100);
     v_lucro = custo*(lucro/100);
     
     p_venda = custo + v_icms + v_ipi + v_pis + v_cofins + v_lucro;
     
        System.out.println("Digite a porcetagem de desconto, 0 para sem desconto");
        desconto = leia.nextFloat();
        v_desconto = p_venda*(desconto/100);
        
        p_venda = p_venda - v_desconto;    
        
    }
    
    public void imprimeDados(){
        
        System.out.println("O preço da venda é: " + p_venda);
        
    }
            
    public static void main(String[] args) {
        
        Precodevenda obj = new Precodevenda();
        
        obj.entradaDados();
        obj.calculoVenda();
        obj.imprimeDados();
        
    }
    
}
