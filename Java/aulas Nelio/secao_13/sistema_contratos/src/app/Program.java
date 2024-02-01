package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		System.out.printf("Insira o nome do Setor: ");
		String departamento = sc.next();
		
		System.out.println("Insira os dados do trabalhador: ");
		System.out.printf("Name: ");
		String name = sc.next();
		
		System.out.printf("Level: ");
		String level = sc.next();
		
		System.out.printf("Salário base: ");
		double salary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(departamento));
		
		System.out.printf("Insira a quantia de contratos desse usuario: ");
		int n = sc.nextInt();
		System.out.printf("\n");
		
		for (int i=1; i<=n; i++)
		{
			System.out.printf("\n");
			System.out.println("Insira os dados do contrato #" +i+": ");
			System.out.printf("Data (dd/MM/yyyy): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.printf("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.printf("Duração (horas): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.print("Entre com a data desejada para o cálculo (MM/yyyy): ");
		String incomeDate = sc.next();
		int month = Integer.parseInt(incomeDate.substring(0,2));
		int year = Integer.parseInt(incomeDate.substring(3));
		
		System.out.println("");
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartment());
		System.out.println("Income for "+incomeDate+": " + String.format("R$%.2f", worker.Income(year, month)));
		sc.close();
	}

}
