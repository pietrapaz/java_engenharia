class CalcControle{
    CalcDados dados;
    CalcInterface ci;

    public CalcControle() {
        dados = new CalcDados();
        ci = new CalcInterface();
    }

    public void executar() {
        while (true) {
            double num1 = ci.recebeOperando(1);
            dados.setOperando(1, num1);

            double num2 = ci.recebeOperando(2);
            dados.setOperando(2, num2);

            char operacao = ci.recebeOperacao();
            dados.setOperacao(operacao);

            if (operacao == 's') {
                System.exit(0);
            }

            double resultado = opera(dados.getOperando(1), dados.getOperando(2), dados.getOperacao());
            ci.mostraResultado(resultado);

            dados.setOperando(1, resultado);
        }
    }

    private double opera(double opn1, double opn2, char op) {
        double resultado = 0;
        switch (op) {
            case '+':
                resultado = opn1 + opn2;
                break;
            case '-':
                resultado = opn1 - opn2;
                break;
            case '*':
                resultado = opn1 * opn2;
                break;
            case '/':
                resultado = opn1 / opn2;
                break;
        }
        return resultado;
    }
}
