import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public boolean addTransaction(double amount) {
        this.transactions.add(amount);
        if (transactions.contains(amount)) {
            return true;
        } else return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
