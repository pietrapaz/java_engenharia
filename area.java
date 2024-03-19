import java.util.Scanner;

public class area{
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);

        System.out.println("Calculo de Area");
        System.out.println("+++++++++++++++");
        System.out.print("Digite a altura: ");
        int altura = input.nextInt();
        System.out.print("Digite a largura: ");
        int largura = input.nextInt();
        System.out.println("Area Total: " + altura*largura);
	}
}