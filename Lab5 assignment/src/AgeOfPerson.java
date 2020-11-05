/**
 * 
 * @author Sai Chaitanya Krishna
 * Date 31-10-2020
 * Description Ex-1: Validating the age of a person
 *
 */
import java.util.*;
public class AgeOfPerson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter the age : ");
		age=sc.nextInt();
		try {
			String message=ageValidation(age);
			System.out.println(message);		//Print message returned by the ageValidation method
		}catch(InvalidException e) {
			System.out.println(e.getMessage());	//Print message thrown by user defined exception class
		}
		sc.close();
	}
/**
 * This method is to validate age and gives corresponding message
 * @param age
 * @return
 * @throws InvalidException
 */
	private static String ageValidation(int age) throws InvalidException{
		if(age<=15) {
			throw new InvalidException("The age is not valid"); 
		}
		else {
			String str="Age is valid";
			return str;
		}
	}

}
