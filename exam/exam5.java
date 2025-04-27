package exam;

public class exam5 {
    

    static class cuboid{
        int length,width,height;
        cuboid(int l,int w,int h){
            length=l;
            width=w;
            height=h;
        }
        void calculate()
        {
            int area=2*(length*width+width*height+height*length);
            System.out.println("Area of cuboid="+area);
        }
    }
    static class volumecuboid extends cuboid{
    
            volumecuboid(int l, int w, int h) {
                super(l, w, h);
                //TODO Auto-generated constructor stub
            }

            void calculate()
            {
                int volume=length*width*height;
                System.out.println("volume of cuboid="+volume);
            }
        
    }
    public static void main(String[] args) {
        volumecuboid v2=new volumecuboid(5, 7, 6);
        v2.calculate();
    }
    
}
