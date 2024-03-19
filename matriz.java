import java.io.*;

public class matriz{
	public static void main (String args[]) {
		int[][] matrix;
        int tam = Integer.parseInt(args[0]);
        matrix = new int[tam][tam];
        for (int i = 1; i<tam+1;i++){
            for (int j = 1; j<tam+1;j++){
                if (i%j ==0 || j%i ==0){
                    System.out.print("*");
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.print("\n");
        }
	}
}