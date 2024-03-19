public class FuncSuperior extends Funcionario{
    private String nomeFaculdade;

    // metodo get e set
    public String getNomeFaculdade(){
        return this.nomeFaculdade;
    }
    public void setNomeFaculdade(String nomeFaculdade){
        this.nomeFaculdade = nomeFaculdade;
    }

    // construtor
    public FuncSuperior(String nome, int codigo, double renda, String nomeFaculdade) {
        super(nome, codigo, renda);
        this.nomeFaculdade = nomeFaculdade;
    }

    // metodo para calcular renda total
    public double getRendaTotal() {
        return super.getRenda() * 2.0;
    }

    // metodo para mostrar as informacoes dos funcionarios com ensino basico
    public void infoFunc(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Renda: " + this.getRendaTotal());
        System.out.println("Escola ensino SUPERIOR: " + getNomeFaculdade());
        System.out.println(" ---------------- ");
    }
    
}
