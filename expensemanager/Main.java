package expensemanager;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BudgetManager manager=new BudgetManager();
		while(true) { //Creates an infinite loop , menu keeps showing again and again until the user chooses to exit.
			//Menu Display
			System.out.println("========Business Expenses and Budget Tracker=======\n");
			System.out.println("1.Add Expenses");
			System.out.println("2.View All Expenses");
			System.out.println("3.Set Monthly Budget");
			System.out.println("4.View Budget Status");
			System.out.println("5.View Category-wise Summary");
			System.out.println("6.Exit");
			System.out.println("Choose an option ");
			int choice=sc.nextInt();
			
			//Menu Actions
			switch(choice){
			case 1:
				manager.addExpense(sc);
				break;
			case 2:
				manager.viewExpenses();
				break;
			case 3:
				manager.setBudget(sc);
				break;
			case 4:
				manager.checkBudgetStatus();
				break;
			case 5:
				manager.categoryWiseSummary();
				break;
			case 6:
				System.out.println("Exiting.... Thank you!! ");
				System.exit(0);
			default:
				System.out.println("Invalid Choice. Try again.");
		}
		
		}
	}

}
