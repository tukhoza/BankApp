package COM.bank.app;

public class AccountUser {
    private String name;
    private String email;
    private String cellPhoneNumber;
    private double accountNumber;
    private double balance;

    public AccountUser(String name, String email, String cellPhoneNumber) {
        this.name = name;
        this.email = email;
        this.cellPhoneNumber = cellPhoneNumber;
        this.accountNumber = Math.random()*9 + 7;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public int withDraw(double amount){
        if (amount > this.balance){
            System.out.println("Request was not successful");
            System.out.println("Current balance is :"+this.balance);
            return 0;
        }
        else{
            this.balance -= amount;
            System.out.println("Request was successful. Money withdrawed "+amount);
            System.out.println("Current balance is :"+this.balance);
            return 0;
        }
    }

    public int depost(double amout){
        if(amout <= 0){
            System.out.println("Request was not successful");
            return 0;
        }
        else{
            this.balance += amout;
            System.out.println("Request was successful. MOeny Deposted "+amout);
            System.out.println("Current balance is :"+this.balance);
            return 0;
        }
    }
}
