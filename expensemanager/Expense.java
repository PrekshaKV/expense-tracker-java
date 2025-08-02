package expensemanager;

public class Expense {
	double amount;
	String category;
	String date;
	String description;
	
	Expense(){
		
	}
	Expense(double amount){
		this();
		this.amount=amount;
	}
	Expense(double amount,String category){
		this(amount);
		this.category=category;
	}
	Expense(double amount,String category,String date){
		this(amount,category);
		this.date=date;
	}
	Expense(double amount,String category,String date,String description){
		this(amount,category,date);
		this.description=description;
	}
	public void displayExpense() {
		System.out.println(date+"|"+category+"|"+amount+"|"+description);
	}
	/*   @Override
    public String toString() {
        return date + " | " + category + " | ₹" + amount + " | " + description;
    }*/

}
