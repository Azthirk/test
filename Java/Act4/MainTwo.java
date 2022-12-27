import demo.packDemo.Order;
import demo.packDemo.Invoice;
import demo.HumanResource.Contract;
import demo.HumanResource.CVdocument;
import demo.UrgentOrder;
import java.util.Scanner;

public class MainTwo <A extends Order, B extends Invoice, C extends Contract, D extends CVdocument, E extends UrgentOrder>{
    public static void mainTwo(String[] args) {

        int option;
        Scanner sc = new Scanner(System.in);
        System.out.printf("1- Order \n 2-Invoice \n 3-Contract \n 4-CvDocument \n 5-UrgentOrder");
        option = sc.nextInt();
        while(option <= 0  || option > 5){
            if(option == 1){
                Order a = new Order();
            }else if(option == 2){
                Invoice b = new Invoice();
            }else if(option == 3){
                Contract c = new Contract();
            }else if(option == 4){
                CVdocument d = new CVdocument();
            }else if(option == 5){
                UrgentOrder e = new UrgentOrder();
            }
        }
    }
}