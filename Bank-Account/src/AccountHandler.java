import java.util.HashMap;

import static java.util.Collections.max;

/**
 * Handles all accounts in a bank
 */
public class AccountHandler {

    private static AccountHandler instance;
    HashMap<Long, Account> accounts = new HashMap<>();

    AccountHandler() {}

    /**
     * Gets the singleton instance of the account handler
     * @return this
     */
    public static AccountHandler getInstance() {
        if (instance == null) {
            instance = new AccountHandler();
        }
        return instance;
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

    /**
     * Searches the list of accounts for ones matching the username
     * @param username the search keyword
     * @return a list of account ids
     */
    public long[] findAccounts(String username) {
        return this.accounts.keySet().stream().filter(it -> this.accounts.get(it).user.equals(username)).mapToLong(val -> val).toArray();
    }

    /**
     * @return a description
     */
    public String toString() {
        return "the account handler of accounts for" + String.valueOf(this.accounts.values().stream().map(acc -> acc.user));
    }

}
