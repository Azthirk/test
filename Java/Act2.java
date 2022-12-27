import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] M = newArray();
        
        cuadradoMagico(M);
        
        mostrar(M);
    }

    public static int[][] newArray() {
        Scanner sc = new Scanner(System.in);
        int filas;
        
        do {
            System.out.printf("Numero de la matriz (impar): ");
            filas = sc.nextInt();
        } while (filas % 2 == 0 || filas < 0);
        
        int[][] array = new int[filas][filas];
        return array;
    }

    public static void cuadradoMagico(int[][] array) {         
        int n = array.length;
        int i = 0, j = n / 2, cont = 1;
        boolean mult = false;
        
        array[i][j] = cont;
        
        for (cont = 2; cont <= n * n; cont++) {
            
            if (!mult) {
                i--;
                if (i < 0){ 
                    i = n - 1;
                }
                j++;
                if (j >= n){ 
                    j = 0; 
                }
            } else {
                i++;
                if (i >= n){
                    i = 0;
                }
            }
            
            array[i][j] = cont;
            
            mult = false;
            
            if (cont % n == 0) mult = true;
        }
    }

    public static void mostrar(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.printf("%d ", array[i][k]);
            }
            System.out.printf("\n");
        }
    }
}