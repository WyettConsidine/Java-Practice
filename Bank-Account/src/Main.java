import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Main class
 * Acts as an ATM
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String command = "";
        //Store the id of the account logged in
        //Might be nicer to store Account instead
        long account = -1;
        while (!command.equals("exit")) {
            System.out.println("What to do?");
            //Query command
            command = scanner.nextLine();
            switch (command) {
                //Create an account with specified username and password
                case "create": {
                    System.out.println("Name?");
                    String name = scanner.nextLine();
                    System.out.println("Password?");
                    String password = scanner.nextLine();
                    AccountHandler.getInstance().createAccount(name, password);
                    account = AccountHandler.getInstance().findAccounts(name)[AccountHandler.getInstance().accounts.size() - 1];
                    System.out.println("Successful! Please wait...");
                    break;
                }
                //Attempt to log in given a username
                //TODO: Account for non-unique username
                case "login": {
                    System.out.println("What account?");
                    String name = scanner.nextLine();
                    if (Array.getLength(AccountHandler.getInstance().findAccounts(name)) == 0) {
                        System.out.println("User does not exist");
                        continue;
                    }
                    Account accountToLogin = AccountHandler.getInstance().accounts.get(AccountHandler.getInstance().findAccounts(name)[0]);
                    System.out.println("Enter password:");
                    String password = scanner.nextLine();
                    if (accountToLogin.logIn(password)) {
                        System.out.println("Logged in successfully! Please wait...");
                        account = accountToLogin.id;
                    } else {
                        System.out.println("Incorrect password");
                    }
                    break;
                }
                //Logs out of current logged in account
                case "logout": {
                    if (account == -1) {
                        System.out.println("Not logged in");
                        continue;
                    }
                    AccountHandler.getInstance().accounts.get(account).logOut();
                    account = -1;
                    System.out.println("Successful! Please wait...");
                    break;
                }
                //Checks balance if logged in
                case "balance": {
                    if (account == -1) {
                        System.out.println("Not logged in");
                        continue;
                    }
                    System.out.println("Your balance is " + String.valueOf(AccountHandler.getInstance().accounts.get(account).getBalance()));
                    break;
                }
                //Adds balance if logged in
                case "add": {
                    if (account == -1) {
                        System.out.println("Not logged in");
                        continue;
                    }
                    System.out.println("How much?");
                    double toAdd = scanner.nextDouble();
                    System.out.println("Your balance is " + String.valueOf(AccountHandler.getInstance().accounts.get(account).addBalance(toAdd)));
                    break;
                }
                //Withdraws as much money as possible
                case "withdraw": {
                    if (account == -1) {
                        System.out.println("Not logged in");
                        continue;
                    }
                    System.out.println("How much?");
                    double toWithdraw = scanner.nextDouble();
                    System.out.println("You withdrew "
                            + String.valueOf(AccountHandler.getInstance().accounts.get(account).removeBalance(toWithdraw))
                            + " and your balance is "
                            + String.valueOf(AccountHandler.getInstance().accounts.get(account).getBalance())
                    );
                    break;
                }
                case "options": {
                    System.out.println("You can: \n create \nlogin \nlogout \nbalance \nadd \nwithdraw \noptions");
                    break;
                }
            }
        }
    }

}
