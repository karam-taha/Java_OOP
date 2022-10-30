public class BankAccountTest {
    public static void main(String[] args){
        BankAccount karam = new BankAccount(10000, 20000);
        System.out.println(karam.getCheckingBalance());
        System.out.println(karam.getSavingsBalance());
        System.out.println("Total: " + karam.getTotalMoney());
        karam.deposite("savings", 3000);
        karam.deposite("checking", 1500);
        System.out.println("Total: " + karam.getTotalMoney());
        System.out.println(karam.getCheckingBalance());
        System.out.println(karam.getSavingsBalance());
        karam.withdraw("savings", 5000);
        karam.withdraw("checking", 9000);
        System.out.println(karam.getCheckingBalance());
        System.out.println(karam.getSavingsBalance());
        System.out.println("Total: " + karam.getTotalMoney());
    }
}