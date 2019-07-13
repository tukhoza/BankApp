package COM.bank.app;
//Bank APP

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Printer {
    private String name;
    private String email;
    private String cell;
    private String string;
    private double aDouble;
    private AccountUser accountUser;
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    BankAccount bank = new BankAccount();


    private String stringLister(){
         return this.string = scan.nextLine();
    }
    private double doubleLister(){
        return this.aDouble = scan.nextDouble();
    }

    private void openAccount(){
        System.out.println("Enter your details in this order = name ,email and cellphone number.\n");
        bank.addAccount(new AccountUser(scan2.nextLine(),scan2.nextLine(),scan2.nextLine()));
        System.out.println(this.name);
    }


    private AccountUser accountExist(String name){
        AccountUser user = bank.findAccount(name);
        if (user != null){
            return bank.findAccount(name);
        }
        return null;
    }

    public int reader(){
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("          WELCOME        ");
        System.out.println("+++++++++++++++++++++++++\n");
        System.out.println("TO OPEN A BANK ACCOUNT PRESS 1");
        System.out.println("IF YOU BANK WITH US PRESS 2");
        System.out.println("TO EXIT PRESS 3");

        doubleLister();
        if (this.aDouble == 1){
            openAccount();
            return 0;
        }
        else if (this.aDouble == 2){
            System.out.println("Enter your name");
            string = scan2.nextLine();
            this.accountUser = accountExist(string);
            if (this.accountUser != null) {

                this.bank.toString();
                System.out.println("TO WITHDRAW PRESS 1");
                System.out.println("TO DEPOSIT PRESS 2");
                System.out.println("TO EXIT PRESS 3");
                doubleLister();
                if (this.aDouble == 1) {
                    System.out.println("Enter amount");
                    return accountUser.withDraw(doubleLister());
                } else if (this.aDouble == 2) {
                    System.out.println("Enter amount");
                    return accountUser.depost(doubleLister());
                }
            }
            else{
                System.out.println("You dont exist try again");
                return 0;
            }
        }
        return -1;
    }
}
