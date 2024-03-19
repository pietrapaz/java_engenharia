public class FuncMedio extends Funcionario {
    private String nomeEscola;

    // metodo get e set
    public String getNomeEscola(){
        return this.nomeEscola;
    }
    public void setNomeEscola(String nomeEscola){
        this.nomeEscola = nomeEscola;
    }

    // construtor
    public FuncMedio(String nome, int codigo, double renda, String nomeEscola) {
        super(nome, codigo, renda);
        this.nomeEscola = nomeEscola;
    }
    
    // metodo para calcular renda total
    public double getRendaTotal() {
        return super.getRenda() * 1.5;
    }

    // metodo para mostrar as informacoes dos funcionarios com ensino basico
    public void infoFunc(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Renda: " + this.getRendaTotal());
        System.out.println("Escola ensino MEDIO: " + getNomeEscola());
        System.out.println(" ---------------- ");
    }
}
