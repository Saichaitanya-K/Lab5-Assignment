/**
 * 
 * @author Sai Chaitanya Krishna
 * Date 31-10-2020
 * Description Ex-2: Checking if the first and last name are filled if not throws an exception
 *
 */
import java.util.*;
public class EmployeeName {

	public static void main(String[] args) {
		String firstName,lastName;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name : ");
		firstName=sc.nextLine();
		System.out.println("Enter the last name : ");
		lastName=sc.nextLine();
		try {
			String message=validateName(firstName,lastName);
			System.out.println(message);		//Print message returned by the validateName method
		}catch(InvalidException e) {
			System.out.println(e.getMessage());	//Print message thrown by user defined exception class
		}
		sc.close();
	}
/**
 * Method to check first and last name fields are filled or not
 * if not throws an exception
 * @param firstName
 * @param lastName
 * @return
 * @throws InvalidException
 */
	private static String validateName(String firstName, String lastName) throws InvalidException {
			if(firstName.length()==0) {
				if(lastName.length()==0) {
					throw new InvalidException ("The first name and last name should not be empty");
				}else {
					throw new InvalidException("The first name should not be empty");
				}
			}
			else if(lastName.length()==0) {
				throw new InvalidException("The last name should not be empty");
			}
			String str="The name is valid";
			return str;
		
	}

}
