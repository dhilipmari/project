
 class A {
    void display()
    {
        
        System.out.println("this is class A");

    }
    
}
class B extends A{
    void display()
    {
        System.out.println("this is class B");
        super.display();
    }
}
class C extends B{
    void display()
    {
        System.out.println("this is class C");
        super.display();
    }
}
class D extends C{
    void display()
    {
        System.out.println("this is class D");
        super.display();
    }

}
public class main{
public static void main(String[]args){
     D d1=new D();
     d1.display();
}
}

