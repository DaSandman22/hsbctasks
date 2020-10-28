package project7;


import java.sql.*;
import java.util.*;

class employee {

	private int empID;
	private String name;
	private float salary;
	public employee(int empID, String name, float salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}

	public employee(int empID, String name) {
		super();
		this.empID = empID;
		this.name = name;
		salary = 10000;
	}
	
	public int getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void show()
	{
		System.out.println("EmpId : "+empID);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);		
	}
	
	public void increment(int per)
	{
		this.salary = this.salary+ (this.salary*per)/100;
	}

}

public class Main {

	public static void main(String[] args) throws SQLException {
		//Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:d:/firstdb");
		System.out.println("Connection successfully created");
		Statement st = con.createStatement();
		String query = "select empid,name,salary from employee";
		ArrayList<employee> list = new ArrayList<employee>();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			int eid = rs.getInt(1);
			String nam = rs.getString(2);
			float sal = rs.getFloat(3);
			list.add(new employee(eid,nam,sal));
		}
		for(employee e : list)
		{
			System.out.println("---------");
			e.show();
		}
	}

}
