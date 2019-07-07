public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Belarus Bank");

        bank.addBranch("Vitebsk");

        bank.addCustomer("Vitebsk", "Pavel", 1000.00);
        bank.addCustomer("Vitebsk", "Valera", 500.00);
        bank.addCustomer("Vitebsk", "Lisa", 20.00);

        bank.addBranch("Minsk");

        bank.addCustomer("Minsk", "Fred", 10000.00);

        bank.addCustomerTransaction("Vitebsk", "Valera", 26.36);
        bank.addCustomerTransaction("Vitebsk", "Lisa", 1000);

        bank.listCustomers("Vitebsk", true);
        bank.listCustomers("Minsk", true);

        if (!bank.addCustomer("Brest", "Senya", 56)){
            System.out.println("Error branch doesn't exist");
        }
    }
}
