package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsorcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.println("Outsorced (y/n):");
			char outSourced = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Hours:");
			int hours = sc.nextInt();
			System.out.println("Value per hour:");
			double valuePerHour = sc.nextDouble();
			if(outSourced == 'y') {
				System.out.println("Addtional charge:");
				double addCharge = sc.nextDouble();
				Employee empOutSourced = new OutsorcedEmployee(name, hours, valuePerHour, addCharge);
				list.add(empOutSourced);
				empOutSourced.payment();
			}
			else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
				emp.payment();
			}
			
		}
	
		System.out.println("PAYMENTS:");
		for(Employee show : list) {
			System.out.println(show);
		}
		
		sc.close();
		
	}
}
