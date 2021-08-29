package driver;

import java.util.Scanner;
import model.Employee;
import model.Department;
import GreatLearning.CredentialService;

public class DriverClass {
	public static void main(String[] args) {
		Employee employee = new Employee("Talking", "Tom");
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Department department=new Department();
		CredentialService service = new CredentialService();
		switch(choice) {
		case 1:
			department.setDeptname("tech");
			String Email1 = service.generateEmail(employee, department);
			String Password1 = service.generatePassword();
			service.showCredentials(Email1, Password1, employee.getFirstName());
			break;
		case 2:
			department.setDeptname("admin");
			String Email2 = service.generateEmail(employee, department);
			String Password2 = service.generatePassword();
			service.showCredentials(Email2, Password2, employee.getFirstName());
			break;
		case 3:
			department.setDeptname("hr");
			String Email3 = service.generateEmail(employee, department);
			String Password3 = service.generatePassword();
			service.showCredentials(Email3, Password3, employee.getFirstName());
			break;
		case 4:
			department.setDeptname("legal");
			String Email4 = service.generateEmail(employee, department);
			String Password4 = service.generatePassword();
			service.showCredentials(Email4, Password4, employee.getFirstName());
			break;
		default:
			System.out.println("Invalid input!");		//for choice={Z \ 1,2,3,4}
		}
		sc.close();										// to eliminate resource leak warning
	}
}
