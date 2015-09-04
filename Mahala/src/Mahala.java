import java.util.Scanner;

public class Mahala {

	public static void main(String[] args) {
		int occupants;
		Scanner scanner = new Scanner(System.in);
		System.out.print("number of occupants: ");
		occupants=scanner.nextInt();
		
		int age;
		Human[] person;
		person=new Human[10];
		int averageAge=0;
		for(int i=0;i<occupants;i++)
		{
			System.out.print("Enter age: ");
			age=scanner.nextInt();
			System.out.println();
			if(age<6) 
			{
				person[i]=new Baby();
				person[i].setAge(age);
				person[i].setLanguageSpoken();
				System.out.print("Enter name: ");
				person[i].setName();
				System.out.println();
			}
			else if(age>59) {
				person[i]=new Old();
				person[i].setAge(age);
				System.out.print("Enter language: ");
				person[i].setLanguageSpoken();
				System.out.println();
				System.out.print("Enter name: ");
				person[i].setName();
				System.out.println();

			}
			else 
			{
				person[i]=new Teen();
				person[i].setAge(age);
				System.out.print("Enter language: ");
				person[i].setLanguageSpoken();
				System.out.println();
				System.out.print("enter name: ");
				person[i].setName();
				System.out.println();
			}
			
			averageAge+=age;
		}
		
		averageAge/=occupants;
		System.out.print("Average age of people in this area: "+ averageAge);
		

	}

}
