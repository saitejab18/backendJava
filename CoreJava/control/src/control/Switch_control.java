package control;

public class Switch_control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user_salary = 30000;
		switch(user_salary) {
		case 10000:
		System.out.println("user salary is" + user_salary);
		break;
		case 20000:
			System.out.println("user salary is" + user_salary);
			break;
		case 30000:
			System.out.println("user salary is" + user_salary);
			break;
		default:
			System.out.println("out of range");
		}

	}

}
