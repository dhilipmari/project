import java.util.Scanner;

public class student {
    String name;
    int rno;
    int mark1,mark2,mark3;
    void get_display()
    {
        System.out.println("student name="+ name);
        System.out.println("student rno="+ rno);
        System.out.println("mark="+mark1+","+mark2+","+mark3);
    }
    int get_total()
    {
        return mark1+mark2+mark3;
    }
    double get_avg()
    {
        return get_total()/3.0;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        student stu=new student();
        while (true) {
            System.out.println("Enter The Choice:");
			System.out.println("1.ADD\n2.DISPLAYVALUES\n3.GET TOTALS\n4.GET AVG\n5.exit");
			int ch=in.nextInt();
            if(ch==1)
            {
               System.out.println("ENTER YOUR NAME:");
               stu.name=in.next();
               System.out.println("ENTER THE ROLLNO:");
               stu.rno=in.nextInt();
               System.out.println("ENTER THE MARK1:");
               stu.mark1=in.nextInt(); 
               System.out.println("ENTER THE MARK2:"); 
               stu.mark2=in.nextInt();
               System.out.println("ENTER THE MARK3:");
               stu.mark3=in.nextInt(); 
               System.out.println("stored"); 
               
            }
           else if(ch==2){
                
              stu.get_display();
              
            }
           else if(ch==3){
               
                int get_total=stu.get_total();
                System.out.println("get_totals"+ get_total);
               }
                 
            else if(ch==4){
                double get_avg=stu.get_avg();
                System.out.println("get_avg"+ get_avg);
            }
           else{
              break;
          }

            
               
            
        }
        System.out.println("completed");

    }


    
}
