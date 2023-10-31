
package pessoa;


public class Pessoa {
    
    int numero, codseguranca;
    String nome, bandeira;
    
    
    public void setNumero (int numero){
        this.numero=numero;
    }
    
    public int getnumero(){
        return this.numero;
    
    }
    
    public void setCodseguranca (int codseguranca){
        this.codseguranca=codseguranca;
    }
    
    public int getCodseguranca(){
        return this.codseguranca;
    }
    
    
    public void setBandeira (int bandeira){
        this.bandeira=bandeira;
    }
    
    public int getBandeira(){
        return this.bandeira;
    }
    
    
    public static void main(String[] args) {
        
        Pessoa obj = new Pessoa();
        obj.setNumero(123);
        obj.setCodseguranca(543);
        obj.setBandeira("visa");
        
        Cartao obj2=new Cartao();
        obj2.setNumero(976);
        System.out.print(obj2.setNome());
        
        
        
                
    }
    
}
