public class studentcons {
     
        
        private String name;
        private int rno;
        private int mark1, mark2, mark3;
    
        // Constructor
        public studentcons(String name, int rno, int mark1, int mark2, int mark3) {
            this.name = name;
            this.rno = rno;
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }
    
        // Method to display all details
        public void get_details() {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rno);
            System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        }
    
        // Method to calculate total marks
        public int get_total() {
            return mark1 + mark2 + mark3;
        }
    
        // Method to calculate average marks
        public double get_avg() {
            return get_total() / 3.0;
        }
    
        // Main method to test the class
        public static void main(String[] args) {
            
            studentcons student1 = new studentcons("Arun", 101, 85, 90, 88);
    
            
            student1.get_details();
            
           
            
            System.out.println("Total Marks: " + student1.get_total());
            System.out.println("Average Marks: " + student1.get_avg());
        }
    }
    
    

