package pessoa1;

public class Pessoa1 {

   private String id, nome;
    private int cpf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public Pessoa1 (){
        this.id = 000001;
        this.cpf = 000000000;
        this.nome = "joao";
    }
}
