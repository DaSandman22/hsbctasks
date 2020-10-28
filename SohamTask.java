package day3Project3Task;

import java.util.ArrayList;
import java.util.Scanner;

public class SohamTask {

	public static void main(String[] args) {
		
		// List to store employee data
		ArrayList<Employee> empList = new ArrayList<Employee>();

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter EmpID, Name, Salary.\nEnter EmpID as 0 to Exit!");

			/// Scan the input data
			int eid = sc.nextInt();
			sc.nextLine();  // Consume newline left-over
			if(eid==0) {
				System.out.println("Exit Succesful");
				break;
			}
			String name = sc.nextLine();
			
			int sal = sc.nextInt();
			sc.nextLine();  // Consume newline left-over
			
			//Create Employee object
			Employee temp = new Employee(eid, name, sal);
			
			// Add Employee to list
			empList.add(temp);

		}
		
		// Print Employee Data
		System.out.println("The Employee Data is: ");
		for(Employee e:empList) {
			e.show();
		}
		
		//close the scanner
		sc.close();

	}

}
