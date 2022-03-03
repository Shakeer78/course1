package email_Validation;

import java.util.*;
import java.util.regex.*; 

public class emailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> emails = new ArrayList<String>();
		// valid email addresses emails.add("shakeer@.com"); emails.add("shaik.shakeer@example.com"); emails.add("shakeer@example.me.org");
		//invalid email addresses emails.add("shakeer.example.com"); emails.add("shakeer.bob@example.com"); emails.add("shakeer@.example.com");

		for (String value : emails) {
		System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));

		}
		System.out.println("Enter any email address to check"); Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));


		}

		public static boolean isValidEmail(String email) { String regex = "^(.+)@(.+)$";
		//initialize the Pattern object
		Pattern pattern = Pattern.compile(regex); Matcher matcher = pattern.matcher(email); return matcher.matches();


		}

		}
