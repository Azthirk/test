public class Main {

    public static void main(String[] args) {
        int[] M = { 1, 0, 2, 0, 0, 3, 4 };
        System.out.printf("Total != 0 : %d", orderArray(M));
    }

    public static int orderArray(int[] array) {
        int cont = 0;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                for (int k = i + 1; k < array.length; k++) {
	               if (array[k] != 0) {
	                    int temp = array[i];
	                    array[i] = array[k];
	                    array[k] = temp;
	               }
	           }
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                array[i] = -1;
            }else{
                cont++;
            }
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("\n");
        
        return cont;
    }
    
}