package org.girmit.assignments;

import java.util.*;
import java.util.stream.Collectors;

class Employee
{
	int id;
	String ename;
	int sal;
	public Employee(int id, String ename, int sal) {
		super();
		this.id = id;
		this.ename = ename;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
}
public class Assignment5 {
	public static void main(String[] args) {
		
	List<Employee> listEmp=Arrays.asList(new Employee(101,"Bharadwaj",25000),
			                             new Employee(102,"Ravi",22000),
			                             new Employee(103,"Shyam",38000),
			                             new Employee(104,"Raj",42000),
			                             new Employee(105,"Leela",58000),
			                             new Employee(106,"Maala",39000),
			                             new Employee(107,"Geeta",20000));
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	
	Optional<Employee> NthMaxSal=listEmp.stream().distinct().sorted(Comparator.comparingDouble(Employee::getSal).reversed()).skip(n).findFirst();
	//System.out.println(NthMaxSal);
	NthMaxSal.ifPresent(e-> System.out.println("Employee: "+e.getEname()+" Salary: "+e.getSal() +" Id: "+e.getId()));
	
	
	
	 
	
	}

}
