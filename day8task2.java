public class day8task2 {
    public static void main(String[] args) {
        
              {
                // Employee data: empId, salary, bonus
                int[][] employeeData = {
                    {1, 10000, 1000},
                    {2, 15000, 1500}
                };
        
                System.out.printf("%-6s %-8s %-6s %-6s %-6s %-6s %-7s\n", "EmpID", "Salary", "Bonus", "PF", "DA", "HRA", "Gross");
        
                for (int[] emp : employeeData) {
                    int empId = emp[0];
                    int salary = emp[1];
                    int bonus = emp[2];
        
                    double pf = salary * 0.25;
                    double da = salary * 0.15;
                    double hra = salary * 0.30;
                    double gross = bonus + da + hra - pf;
        
                    System.out.printf("%-6d %-8d %-6d %-6.2f %-6.2f %-6.2f %-7.2f\n",
                            empId, salary, bonus, pf, da, hra, gross);
                }
            }
        }
        
    }
    

