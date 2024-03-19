public class Main {
    public static void main (String[] args){
        Funcionario f1 = new Funcionario("Bianca Lima", 100, 1000);
        Funcionario f2 = new Funcionario("Matheus Nunes", 101, 1000);
        FuncBasico f3 = new FuncBasico("Karla Medeiros", 102, 1000, "Galois");
        FuncBasico f4 = new FuncBasico("Fernando Borges", 103, 1000, "Dom Jose");
        FuncMedio f5 = new FuncMedio("Cecilia Soares", 104, 1000, "Leonardo da Vinci");
        FuncMedio f6 = new FuncMedio("Miguel Vieira", 105, 1000, "Sigma");
        FuncSuperior f7 = new FuncSuperior("Marcela Guimarães", 106, 1000, "CEUB");
        FuncSuperior f8 = new FuncSuperior("Jose Almeida", 107, 1000, "UNB");

        f1.infoFunc();
        f2.infoFunc();
        f3.infoFunc();
        f4.infoFunc();
        f5.infoFunc();
        f6.infoFunc();
        f7.infoFunc();
        f8.infoFunc();
    }
}