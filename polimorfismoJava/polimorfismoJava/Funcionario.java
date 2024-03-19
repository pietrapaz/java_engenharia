public class Funcionario {
    private int codigo;
    private String nome;
    private double renda, rendaTotal;

    public Funcionario (String nome, int codigo, double renda){
        this.nome = nome;
        this.codigo = codigo;
        this.renda = renda;
    }

    public void infoFunc(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Renda: " + this.getRenda());
        System.out.println(" ---------------- ");
    }

    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getRenda(){
        return this.renda;
    }
    public void setRenda(double renda){
        this.renda = renda;
    }
    public double getRendaTotal(){
        return this.rendaTotal;
    }
    public void setRendaTotal(double rendaTotal){
        this.rendaTotal = rendaTotal;
    }
}
