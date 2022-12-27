package demo;
import demo.packDemo.Order;
import demo.packDemo.Invoice;
import demo.HumanResource.Contract;
import demo.HumanResource.CVdocument;
import demo.UrgentOrder;

public class Generic <A extends Order, B extends Invoice, C extends Contract, D extends CVdocument, E extends UrgentOrder>{
    public static void generic(String[] args) {

    }
}
