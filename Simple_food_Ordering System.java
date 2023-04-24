import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        System.out.println("Hello welcome to food app");
        System.out.println("Please Create a password: ");
        Scanner scan = new Scanner(System.in);
        String Password1 = scan.next();

        System.out.println("Your Password iS now: " + Password1);

        System.out.println("Please Enter your Password: ");
        String Password2 = scan.next();

        while (!Password2.equals(Password1)){
            System.out.println("THis is not the right Password Please try angain: ");
            Password2 = scan.next();
        }

        System.out.println("Access Granted");
        System.out.println("Are you Hungry Yes or NO: ");
        String Answer1 = scan.next();

        if(Answer1.equals("Yes") || Answer1.equals("yes")){
            System.out.println("Chose what do you want to eat " +
                    "Rice, Mash Potato or Fish....");
            String Answer2 = scan.next();

            while (!Answer2.equals("Rice") && !Answer2.equals("Mash Potato") && !Answer2.equals("Fish") && !Answer2.equals("rice") && !Answer2.equals("mash potato") && !Answer2.equals("fish")){
                System.out.println("Sorry!! We do note Have it" +
                        "Would you like to have Rice Mash Potato or Fish");
                Answer2 = scan.next();
            }
            if (Answer2.equals("Rice") || Answer2.equals("Mash Potato") || Answer2.equals("Fish") || Answer2.equals("rice") || Answer2.equals("mash potato") || Answer2.equals("fish")){
                System.out.println("Do you want something to drink? Yes or No");
                String Answer3 = scan.next();
                while (!Answer3.equals("Yes") && !Answer3.equals("yes") && !Answer3.equals("No") && !Answer3.equals("no")){
                    System.out.println("Wrong Commend please try again: ");
                    Answer3 = scan.next();
                }
                if(Answer3.equals("Yes") || Answer3.equals("yes")){
                    System.out.println("What would you like to drink coke or juice: ");
                    String Answer4 = scan.next();

                    while (!Answer4.equals("Coke") && !Answer4.equals("coke") && !Answer4.equals("Juice") && !Answer4.equals("juice")){
                        System.out.println("Sorry we don't have it.. what would you like between coke and juice");
                        Answer4 = scan.next();
                    }
                    if (Answer4.equals("Coke") || Answer4.equals("coke") || Answer4.equals("Juice") || Answer4.equals("juice")){
                        System.out.println("Grate you have ordered " + Answer2 + " and " + Answer4);
                    }

                    System.out.println("Please Confirm your password to make the order");
                    Password2 = scan.next();

                    while (!Password2.equals(Password1)){
                        System.out.println("THis is not the right Password Please try angain: ");
                        Password2 = scan.next();
                    }
                    System.out.println("Thank your order is on the way....");
                }
                else {
                    System.out.println("YOu have ordered " + Answer2 );
                }
                System.out.println("Please Confirm your order");
                Password2 = scan.next();

                while (!Password2.equals(Password1)){
                    System.out.println("THis is not the right Password Please try angain: ");
                    Password2 = scan.next();
                }
            }


        }
        else {
            System.out.println("Have a grate day sir!!!");
        }

    }
}
