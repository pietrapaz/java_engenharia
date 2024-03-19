public class CalcDados {
    double num1;
    double num2;
    char operacao;

    public void setOperando(int i, double valor) {
        if (i == 1) {
            num1 = valor;
        } else if (i == 2) {
            num2 = valor;
        }
    }

    public double getOperando(int i) {
        if (i == 1) {
            return num1;
        } else if (i == 2) {
            return num2;
        }
        return 0;
    }

    public void setOperacao(char op) {
        operacao = op;
    }

    public char getOperacao() {
        return operacao;
    }
}
