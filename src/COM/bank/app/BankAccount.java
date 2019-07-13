package COM.bank.app;

import java.util.HashMap;

public class BankAccount {
    private String name;
    HashMap<String, AccountUser> accoountStore = new HashMap<String, AccountUser>();

    public void addAccount(AccountUser accountUser){
        this.name = accountUser.getName();
        accoountStore.put(this.name, accountUser);
    }

    public AccountUser findAccount(String name){
        return accoountStore.get(name);
    }
}
