
    public class myabst1 extends Abst_area {
        void get_details()
        {
            System.out.println("length="+l);
            System.out.println("breadth="+b);
        }
        public static void main(String[] args) {
            myabst1 ab=new myabst1();
            ab.set_details(10, 20);
            ab.get_details();
            ab.do_area();
            
        }
    
        @Override
        void do_area() {
            
            System.out.println("rectangle="+(l*b));
        }
    }
     
    
    

