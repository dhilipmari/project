
import java.util.Scanner;
public class employee {
    




	
	String name;// non-static global variables
	int eid,salary;
	
	/*
	 * return_type method_name(parameters)// parameters - optional
	 * {
	 * 		statements;
	 * 		return statement;//optional
	 * }
	 */
	void print_details()
	{
		System.out.println("Name="+name);
		System.out.println("EmpID="+eid);
		System.out.println("Salary="+salary);
	}
	float find_bonus()
	{
		return salary*0.25f;
	}
	float find_pf()
	{
		return salary*0.12f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		employee emp=new employee();//object creation
		while(true)
		{
			System.out.println("Enter The Choice:");
			System.out.println("1.ADD\n2.PRINT\n3.BONUS\n4.PF\n5.EXIT");
			int ch=in.nextInt();
			if(ch==1)
			{
				System.out.println("Enter The Name:");
				emp.name=in.next();
				System.out.println("Enter The EmpID:");
				emp.eid=in.nextInt();
				System.out.println("Enter The Salary:");
				emp.salary=in.nextInt();
				System.out.println("Stored");
			}
			else if(ch==2)
			{
				emp.print_details();
			}
			else if(ch==3)
			{
				float bonus=emp.find_bonus();
				System.out.println("Bonus="+bonus);
			}
			else if(ch==4)
			{
				float pf=emp.find_pf();
				System.out.println("Pf="+pf);
			}
			else
			{
				break;
			}
		}
		System.out.println("completed");
		

	}

}




