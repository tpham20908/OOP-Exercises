import java.util.Scanner;

public class TestQueue {
	public static void main(String[] args) {
		Queue q = new Queue();
		int input;
		Scanner scanner = new Scanner(System.in);

		displayMenu();
		input = scanner.nextInt();
		
		while (input != 1 || input != 2 || input != 3 || input != 4) {
			switch (input) {
				case 1:
					int num;
					num = getInput();
					q.insert(num);
					break;
				case 2:
					q.delete();
					break;
				case 3:
					q.display();
					break;
				case 4:
					break;
			}
			displayMenu();
			input = scanner.nextInt();
		}
	}

	// display menu
	public static void displayMenu() {
		System.out.println("What do you want to fulfill: ");
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. Display");
		System.out.println("4. Exit");
	}

	// get input from user
	public static int getInput() {
		Scanner scanner = new Scanner(System.in);
		int answer;

		System.out.print("What number you want to insert? ");
		return scanner.nextInt();	
		
	}
}