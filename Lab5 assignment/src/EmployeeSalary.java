/**
 * 
 * @author Sai Chaitanya Krishna
 * Date 31-10-2020
 * Description Ex-3: Checking salary
 *
 */
import java.util.*;

import com.cg.eis.exception.EmployeeException;
public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int salary;
		System.out.println("Enter the salary : ");
		salary=sc.nextInt();
		try {
			String message=employeeSalary(salary);
			System.out.println(message);		//Print message returned by the employeeSalary method
		}
		catch(EmployeeException e) {
			System.out.println(e.getMessage());	//Print message thrown by user defined exception class
		}
		sc.close();
	}
/**
 * Method to check salary is greater than 3000
 * if not throws an exception
 * @param salary
 * @return
 * @throws EmployeeException
 */
	private static String employeeSalary(int salary) throws EmployeeException {
		if(salary>=3000) {
			String message="The salary of an employee is greater than 3000";
			return message;
		}
		else {
			throw new EmployeeException("The salary of employee is less than 3000"); 
		}
	}

}
