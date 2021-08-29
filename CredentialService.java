package GreatLearning;

import java.util.Random;		//package imported to generate random characters & numbers

import model.Department;
import model.Employee;

public class CredentialService {
	public String generateEmail(Employee employee, Department department) {
		String email = employee.getFirstName()+employee.getLastName()+"@"+department.getDeptname()+".company.com";
		return email;
	}

	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random objRandom = new Random();
		char password[] = new char[8];
		for(int i=0; i<8; i++) {
			password[i]=values.charAt(objRandom.nextInt(values.length()));
		}
		return password.toString();
	}

	public void showCredentials(String email, String password, String firstname) {
		System.out.println("Dear "+firstname+", your generated credentials are as follows");
		System.out.println("Email --> "+email);
		System.out.println("Password --> "+password);
	}

}
