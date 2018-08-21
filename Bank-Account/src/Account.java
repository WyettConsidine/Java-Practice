/**
 *
 */
public class Account {
    public long id; //The unique account ID
    String user; //The name of the user
    private int hashedPassword; //Passwords are hashed using Java's default string hashing for now
    private double balance; //The amount of money in the account
    private boolean loggedIn = false; //Whether the user is logged in; false by default

    /**
     * Constructor for the account
     * @param id unique account id assigned by AccountHandler
     * @param user user's name
     * @param password password in plaintext
     */
    Account(long id, String user, String password) {
        this.id = id;
        this.user = user;
        this.hashedPassword = password.hashCode();
    }

    /**
     * Sets loggedIn to true if the password is correct or false if not
     * @param password the guessed password
     */
    public boolean logIn(String password) {
        loggedIn = (password.hashCode() == this.hashedPassword);
        return loggedIn;
    }

    /**
     * Logs out of the account
     */
    public void logOut() {
        //No verification required
        loggedIn = false;
    }

    /**
     * Adds money to account
     * @param money how much to add
     */
    public void addBalance(double money) {
        this.balance += money;
    }

    /**
     * Removes money from account
     * @param money how much to remove
     */
    public void removeBalance(double money) {
        this.balance -= money;
        //TODO: debt
    }

    /**
     * @return current balance
     */
    public double getBalance() {
        return this.balance;
    }

}
