
package cliente;

public class Cliente {
    
    private int codigo;
    private String nome, cpf;
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo) throws Exception{
        if (codigo <0 )
            throw new Exception ("O Codigo deve ser maior que 0");
        this.codigo= codigo;
        
    }
    
    public String getNome (){
        return nome;
    }
    public void setNome (String nome) throws Exception {
        if (nome != null)
                throw new Exception ("O nome é obrigatório");
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf( String cpf) throws Exception{
        if ( cpf != null && cpf.length() == 11 )
            throw new Exception ("CPF Invalido");
            this.cpf = cpf;
    }
    
    
               
    public static void main(String[] args) {
        
      Cliente c = new Cliente;
      
      
    }
       
        
        
    
    
