import javax.swing.JOptionPane;

public class CalcInterface {

    public CalcInterface() {
        
    }

    public double recebeOperando(int i) {
        String resposta = JOptionPane.showInputDialog("Digite o operando " + i + ": ");
        return Double.parseDouble(resposta);
    }

    public char recebeOperacao() {
        String operacaoResposta = JOptionPane.showInputDialog("Digite a operação (+, -, *, /) ou 's' para sair: ");
        return (operacaoResposta).charAt(0);
    }

    public void mostraResultado(double res) {
        JOptionPane.showMessageDialog(null, "Resultado: "+ res);
    }
}
