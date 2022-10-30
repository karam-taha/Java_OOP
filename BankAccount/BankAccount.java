public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private static int numOfAccounts;
    private static double totalMoney;

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numOfAccounts++;
        totalMoney = savingsBalance + checkingBalance;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

        public double getSavingsBalance(){
        return savingsBalance;
    }

    public void deposite(String type, double amount){
        if(type.toLowerCase().equals("savings")){
            savingsBalance += amount;
        }
        else {
            checkingBalance += amount;
        }
        totalMoney += amount;
    }

    public void withdraw(String type, double amount){
        if(type.toLowerCase().equals("savings")){
            savingsBalance -= amount;
        }
        else {
            checkingBalance -= amount;
        }
        totalMoney -= amount;
    }

    public double getTotalMoney(){
        return totalMoney;
    }
}