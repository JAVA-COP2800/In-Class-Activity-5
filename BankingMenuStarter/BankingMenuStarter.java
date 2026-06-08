import java.util.Scanner;

public class BankingMenuStarter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 1000.00;
        int choice;

        // TODO 1: Create a do-while loop so the menu displays at least once.
        do {
            System.out.println("\n--- INTERACTIVE BANKING MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            // TODO 2: Use a switch statement or if-else structure to process the menu choice.
            switch (choice){
                // TODO 3: If choice is 1, display the current balance.
                case 1:
                    System.out.printf("Balance: %.2f%n", balance);
                    break;

                // TODO 4: If choice is 2, ask for a deposit amount.
                // Validate that deposit is greater than 0 before adding it to balance.
                case 2:
                    System.out.print("How much would like to deposit: ");
                    double depositAmount = input.nextDouble();

                    if(depositAmount <= 0){
                        System.out.println("Invalid Amount. Deposit amount has to be greater than 0");
                        break;
                    }
                    else balance += depositAmount;
                    System.out.printf("Deposit Successful. New balance: %.2f%n", balance);
                    break;

                // TODO 5: If choice is 3, ask for a withdrawal amount.
                // Validate that withdrawal is greater than 0 and less than or equal to balance.
                case 3:
                    System.out.print("How much would like to withdraw: ");
                    double withdrawalAmount = input.nextDouble();

                    if(withdrawalAmount <= 0 || balance < withdrawalAmount ){
                        System.out.println("Invalid Amount. Withdrawal amount has to be greater than 0 and less than or equal to balance");
                        break;
                    }
                    else balance -= withdrawalAmount;
                    System.out.printf("Deposit Successful. New balance: %.2f%n", balance);
                    break;

                // TODO 6: If choice is 4, display an exit message.
                case 4:
                    System.out.println("Exiting...");
                    break;

                // TODO 7: If choice is not 1, 2, 3, or 4, display an invalid selection message.
                default:
                    System.out.println("Invalid selection. Please select one of the available options");
                    break;
            }

        } while (choice != 4); // TODO 8: Replace false with condition that repeats until choice equals 4.

        input.close();
    }
}
