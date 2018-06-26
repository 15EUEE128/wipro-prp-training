// details of 3 employee
import java.io.*;
import java.util.Scanner;
public class employee
{
	int id;
	String name;
	String dept;
	int salary;
	int age;
	String address;
public void getdata()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter employee id:");
	id = Integer.parseInt(sc.nextLine());
	System.out.println("Enter name");
	name= sc.nextLine();
	System.out.println("Enter dept:");
	dept=sc.nextLine();
	System.out.println("Enter salary");
	salary=Integer.parseInt(sc.nextLine());
	System.out.println("Enter age");
	age=Integer.parseInt(sc.nextLine());
	System.out.println("Enter address");
	address=sc.nextLine();
}
public void display()
{
	System.out.println("Employee id:"+id);
	System.out.println("Name:"+name);
	System.out.println("Dept:"+dept);
	System.out.println("Salary:"+salary);
	System.out.println("Age:"+age);
	System.out.println("Address:"+address);

}
	public static void main(String[] args) 
	{
		employee[] emp=new employee[3];
		int i;
		for(i=0;i<3;i++)
		{
			emp[i]=new employee();
		}
		for(i=0;i<3;i++)
		{
			emp[i].getdata();
		}
		for(i=0;i<3;i++)
		{
			emp[i].display();
		}
		int n;
		Scanner no=new Scanner(System.in);
		System.out.println("Enter the id to get details");
		n=Integer.parseInt(no.nextLine());
		for(i=0;i<3;i++)
		{
			if(emp[i].id==n)
				emp[i].display();
		}

	}

}
