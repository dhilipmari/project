import java.util.Scanner;

class cube{
    int area(int a)
    {
        return 0;

    } 
    int  perimeter (int a){
        return 0;

    }    
}    
  class cube1 extends cube{

  
    
     int   area(int a)
    {
        return 4*a;
        
        
    }
    int  perimeter (int a){
        return 12*a;

    }

} 
      
public class methodoverriding {
    public static void main(String[] args) {
        int side=5;
        cube1 c= new cube1();
        int area=c.area(side);
        int perimeter=c.perimeter(side);
        System.out.println("Area of cube:"+area);
        System.out.println("perimeter:"+perimeter);
    
        
    }
   
    
}

