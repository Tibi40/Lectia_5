import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimeZone;

//ctrl + shift + anter = localTime
public class BankAccountService {

    public static void main(String[] args) {

        /* Aici am definit setUserDetails //1 */
        UserDetails userDetails = new UserDetails();
        userDetails.setFirstName("Ion");
        userDetails.setLastName("Popescu");
        UserDetails.setEmail("popescu@gmail.com");

        UserBankAccount userBankAccount = new UserBankAccount();
        userBankAccount.setUsername("alexi");
        userBankAccount.setBic("FD57");
        userBankAccount.setBalance(254864);
        userBankAccount.setIban("INGB65RO00000002546123500");
        //1
        //Ce am definit mai sus in UserDetails, va fi folosi, aici jos
        userBankAccount.setUserDetails(userDetails);
        System.out.println("Initial balance: " + userBankAccount.getBalance());

        double balance = userBankAccount.getBalance();
        double amountSpent = 243.5;
        double overflowAmount = 2334999.45;

        BankAccountService bankAccountService = new BankAccountService();
        double valueAfterWithdraw = bankAccountService.atmWithdrowMoney(balance.amountSpent);
        userBankAccount.setBalance(valueAfterWithdraw);
        System.out.println("Updated balance after ATM withdraw: " + userBankAccount.getBalance());

        String curretnDay = "Sunday";
        bankAccountService.bankWithdrawMoney(curretnDay, balance, 5431.3484);
        userBankAccount.setBalance(valueAfterBankWithdraw);
        System.out.println("Update balace after ATM withdraw: " + userBankAccount.getBalance());
        // List<String> workingDays2 = Array.asList("Monday");

    }

    //aici s-a definit o clasa (o actiune)
    public void atmWithdrowMoney(double balance, double amountwithdraw) {

        if(amountWithdraw > balance) {
            System.out.println("You don't have enough money.");
            return balance;
        }
        double remainingAmount = balance - amountwithdraw;
        System.out.println("Transaction was successfully made: ");

        return balance - amountwithdraw;
    }

    public double bankWithdrawMoney(String currentDay, double balance, double Withdraw) {...}

    // List<String> workingDays2 = Array.asList("Monday");
        List<String> workingDays = new ArrayList<>();
        workingDays.add("Monday");
        workingDays.add("Tuesday");
        workingDays.add("Wendnesday");
        workingDays.add("Thrusday");
        workingDays.add("Friday");
        workingDays.add("Saturday");
        workingDays.add("Sunday");

        if(workingDays.contains(currentDay)) {
            System.out.println("Please comeback Monday - Friday, from 08:00 - 17:00");
            return balance;
    }
        LocalTime time = LocalTime.now();
        LocalTime afternoonTime = LocalTime(16, 0);
        LocalTime moningTime = LocalTime.of(8, 0);


    if(currentTime.isBefore(moningTime) || currentTime.isAfter(afternoonTime)) {
        System.out.println("Please come back from Monday to Friday, from 8 to 16.");
        return balance;
    }

    return remainingAmount;
    return 243.5;
}

