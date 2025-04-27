package day17;

 class TablePrinter {
     
        synchronized void printTable(int number) {
            System.out.println("Table of " + number + ":");
            for (int i = 1; i <= 5; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
                try {
                    Thread.sleep(200); // Delay for better output visualization
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            System.out.println();
        }
    }
    
    class TableThread extends Thread {
        TablePrinter printer;
        int number;
    
        TableThread(TablePrinter printer, int number) {
            this.printer = printer;
            this.number = number;
        }
    
        public void run() {
            printer.printTable(number);
        }
    }
    
    public class SyncTableDemo {
        public static void main(String[] args) {
            TablePrinter printer = new TablePrinter();
    
            TableThread t1 = new TableThread(printer, 4);
            TableThread t2 = new TableThread(printer, 5);
            TableThread t3 = new TableThread(printer, 6);
    
            t1.start();
            t2.start();
            t3.start();
        }
    }
    
    

