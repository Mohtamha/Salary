
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id;
		String name;
		Double salary;
		Double sales;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Id Employee : ");
		id = sc.nextLine();
		System.out.print("Input Name Employee : ");
		name = sc.nextLine();
		System.out.print("Input Salary Employee: ");
		salary = sc.nextDouble();
		System.out.print("Input Sals : ");
		sale=sc.nextDouble();
		ProjectC send= new ProjectC(id,name,salary,sale);
		send.output();
	}

}
