package expensemanager;
import java.util.ArrayList;
import java.util.Scanner;
public class BudgetManager {
	ArrayList<Expense> expenseList=new ArrayList<>();//Stores all the expense objects.Every time a new expense is added, it's stored here.
	double budgetAmount; //Stores the monthly budget amount set by the user.  Example: ₹10,000
	double totalExpenses;
	//Scanner sc=new Scanner(System.in);//Keeps track of the total amount spent so far.Every time a new expense is added, this total increases.
	void addExpense(Scanner sc) {
		
		System.out.println("Enter amount:Rs");
		double amount=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Category(Food/Travel/Other): ");
		String category=sc.nextLine();
		System.out.println("Enter date (DD-MM-YYYY)");
		String date=sc.nextLine();
		System.out.println("Enter description: ");
		String description=sc.nextLine();
		Expense ob1=new Expense(amount,category,date,description);
		
		expenseList.add(ob1);
		totalExpenses=totalExpenses+amount;
		
		ob1.displayExpense();
		System.out.println(ob1);
		
		
	}
	
	void viewExpenses() {
			if(expenseList.isEmpty()) {
				System.out.println("No Expense Recorded!!");
				return;
			}
			System.out.println("============All Expense Recorded=============");
			for(int i=0;i<expenseList.size();i++) {
				Expense e=expenseList.get(i);
				e.displayExpense();
			}
			System.out.println("Total Expenses: Rs "+totalExpenses);
	}

	void setBudget(Scanner sc) {
		System.out.println("Enter your monthly Budget: Rs");
		budgetAmount=sc.nextDouble();
		System.out.println("Budget set to Rs:"+budgetAmount);
			
	}

	void checkBudgetStatus() {
			System.out.println("=====Budget Status=====");
			System.out.println("Budget Amount :Rs"+budgetAmount);
			System.out.println("Total Expense :Rs"+totalExpenses);
			double remaining=budgetAmount-totalExpenses;
			if(remaining>=0) {
				System.out.println("Remaining Budget: Rs"+remaining);
				System.out.println("You are within your Budget.");
			}
			else {
				System.out.println("You are over your budget by Rs"+remaining);
				
			}
	}

	void categoryWiseSummary() {
				System.out.println("====Category wise Summary=======");
				String[] categories=new String[100];
				double[] total=new double[100];
				int count =0;//how many unique categories so far
				for(int i=0;i<expenseList.size();i++) {
					Expense e=expenseList.get(i);
					boolean found=false;
					for(int j=0;j<count;j++) {
						if(categories[j].equals(e.category)) {
							total[j]=total[j]+e.amount;
							found =true;
							break;
						}
					}
					if(!found) {
						categories[count]=e.category;
						total[count]=e.amount;
						count++;
					}
				}
				for(int i=0;i<count;i++) {
					System.out.println(categories[i]+":Rs"+total[i]);
				}
	}
	
}
