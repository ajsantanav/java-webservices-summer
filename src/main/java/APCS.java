import java.util.*;

public class APCS {

    public static void main(String[] args) {
        String input;
        int count = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("What would you like to do today? ");
        input = obj.nextLine();

        while(!input.equals("E")){

            if(count > 0){
                System.out.println("What would you like do anything else? ");
                input = obj.nextLine();
            }

            choice(input);
            count++;
        }

//        choice(input);
    }

    private static double choice(String input) {

        Scanner obj = new Scanner(System.in);

        double money;

        double balance = 1000;

        switch (input) {
            case "D":

                System.out.println("ADD MONEY");
                money = obj.nextDouble();
                balance = balance + money;
                System.out.println("New balance: " + balance);
                break;

            case "W":
                System.out.println("SUBSTRACT MONEY ");
                money = obj.nextDouble();
                balance = balance + money;
                System.out.println("New balance: " + balance);
                break;

            case "B":
                System.out.print("CURRENT BALANCE: ");
                System.out.println(balance);
                break;

            case "E":
                System.out.println("Goodbye! Have a nice day!");
                break;
            default:
                System.out.println("That was not an option try again");
                break;
        }

        return balance;
    }


}
