 class BMW extends car {

    BMW(String name, int price) {
        super(name, price);
        //TODO Auto-generated constructor stub
    }

    @Override
    int get_price() {
        return 2000000;
    
    }
    
}
class TOYOTA extends car{

    TOYOTA(String name, int price) {
        super(name, price);
        //TODO Auto-generated constructor stub
    }

    @Override
    int get_price() {
        return 340000000;
        
    }
    
}
//main class
public class carprice{
    public static void main(String[] args) {
        BMW obj=new BMW("BMW M34Oi", 50000000);
        TOYOTA obj2=new TOYOTA("URBAN CRUISER EV", 10000000);
        obj.get_details();
        System.out.println("------------------------------");
        obj2.get_details();
        
    }
     
}
