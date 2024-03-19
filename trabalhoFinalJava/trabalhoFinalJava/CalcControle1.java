class CalcControle1 {
    private CalcDados1 dados;
    private CalcInterface1 calcInterface1;

    public CalcControle1() {
        dados = new CalcDados1();
        calcInterface1 = new CalcInterface1();
    }

    public void executar() {
        while (true) {
            double operando1 = calcInterface1.recebeOperando(1);
            dados.setOperando(1, operando1);

            double operando2 = calcInterface1.recebeOperando(2);
            dados.setOperando(2, operando2);

            char operacao = calcInterface1.recebeOperacao();
            dados.setOperacao(operacao);

            if (operacao == 's') {
                System.exit(0);
            }

            double resultado = opera(dados.getOperando(1), dados.getOperando(2), dados.getOperacao());
            calcInterface1.mostraResultado(resultado);

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
