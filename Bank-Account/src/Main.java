import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Main class
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String command = "";
        long account = -1;
        while (command != "exit") {
            System.out.println("What do do?");
            //Query command
            command = scanner.nextLine();
            switch (command) {
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
                case "login": {
                    System.out.println("What account?");
                    String name = scanner.nextLine();
                    if (Array.getLength(AccountHandler.getInstance().findAccounts(name)) == 0) {
                        System.out.println("User does not exist");
                        System.out.println(Arrays.toString(AccountHandler.getInstance().accounts.values().stream().map(it -> it.user).toArray()));
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
                case "balance": {
                    if (account == -1) {
                        System.out.println("Not logged in");
                        continue;
                    }
                    System.out.println("Your balance is " + String.valueOf(AccountHandler.getInstance().accounts.get(account).getBalance()));
                    break;
                }
                case "add": {
                    if (account == -1) {
                        System.out.println("Not logged in");
                        continue;
                    }
                    System.out.println("How much?");
                    double money = scanner.nextDouble();
                    AccountHandler.getInstance().accounts.get(account).addBalance(money);
                    System.out.println("Your balance is " + String.valueOf(AccountHandler.getInstance().accounts.get(account).getBalance()));
                    break;
                }
                case "withdraw": {
                    if (account == -1) {
                        System.out.println("Not logged in");
                        continue;
                    }
                    break;
                }
            }
        }
    }

}
