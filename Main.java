import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, Student! ");
        System.out.println("Select one of the following options: \n" +
                "1. Place a group order \n" +
                "2. Profile page \n" +
                "3. Marketplace " );

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Group order, method to be implemented ");
                break;
            case 2:
                System.out.println("Profile: \n" +
                        "Name: Saad \n" +
                        "Email: msm335@university.com \n" +
                        "Password: 1239njes \n" +
                        "University: UOB \n" +
                        "Credit card info: XXXXXXXXXX \n");
                break;
            case 3:
                System.out.println("Dairy \n" +
                        "Protein \n" +
                        "Sweets \n");
                break;
            default:
                System.out.println("Error");
        }
    }



}