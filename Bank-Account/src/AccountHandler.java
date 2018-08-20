import java.util.ArrayList;
import java.util.HashMap;

import static java.util.Collections.max;

/**
 * Handles all accounts in a bank
 */
public class AccountHandler {

    AccountHandler instance;
    HashMap<Long, Account> accounts;

    AccountHandler() {}

    /**
     * Gets the singleton instance of the account handler
     * @return this
     */
    public AccountHandler getInstance() {
        if (this.instance == null) {
            this.instance = new AccountHandler();
        }
        return this.instance;
    }

    /**
     * Creates a new account with specified username and password
     * @param username
     * @param password
     */
    public void createAccount(String username, String password) {
        if (this.accounts.isEmpty()) {
            this.accounts.put((long)0, new Account(0, username, password));
        } else {
            long newId = max(this.accounts.keySet()) + 1;
            this.accounts.put(newId, new Account(newId, username, password));
        }
    }

}
