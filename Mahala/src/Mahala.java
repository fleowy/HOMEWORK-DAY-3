import java.util.Scanner;

public class Mahala {

	public static void main(String[] args) {
		
		int occupants;
<<<<<<< HEAD
		Scanner scanner = new Scanner(System.in);
=======
		Scanner sc = new Scanner(System.in);
>>>>>>> 780dd84d76fc5236816a0e97fc8cb04c7f2f971c
		System.out.print("number of occupants: ");
		occupants=scanner.nextInt();
		
		int age;
<<<<<<< HEAD
		Human[] person;
		person=new Human[10];
		int averageAge=0;
		for(int i=0;i<occupants;i++)
		{
			System.out.print("Enter age: ");
			age=scanner.nextInt();
=======
		Human[] ppl;
		ppl = new Human[10];
		int averageAge = 0;
		for(int i = 0; i < occupants; i++)
		{
			System.out.print("enter age: ");
			age = sc.nextInt();
>>>>>>> 780dd84d76fc5236816a0e97fc8cb04c7f2f971c
			System.out.println();
			if(age < 6) 
			{
<<<<<<< HEAD
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
=======
				ppl[i] = new Baby();
				ppl[i].setAge(age);
				ppl[i].setLanguageSpoken();
				System.out.print("enter name: ");
				ppl[i].setName();
				System.out.println();
			}
			else if(age > 59) {
				
				ppl[i] = new Old();
				ppl[i].setAge(age);
				System.out.print("enter language: ");
				ppl[i].setLanguageSpoken();
>>>>>>> 780dd84d76fc5236816a0e97fc8cb04c7f2f971c
				System.out.println();
				System.out.print("Enter name: ");
				person[i].setName();
				System.out.println();
			}
			else 
			{
<<<<<<< HEAD
				person[i]=new Teen();
				person[i].setAge(age);
				System.out.print("Enter language: ");
				person[i].setLanguageSpoken();
=======
				ppl[i] = new Teen();
				ppl[i].setAge(age);
				System.out.print("enter language: ");
				ppl[i].setLanguageSpoken();
>>>>>>> 780dd84d76fc5236816a0e97fc8cb04c7f2f971c
				System.out.println();
				System.out.print("enter name: ");
				person[i].setName();
				System.out.println();
			}
			
			averageAge += age;
		}
		
		averageAge /= occupants;
		System.out.print("Average age of people in this area: " + averageAge);
	}

}
