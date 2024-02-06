import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choices;
        String fname = "";
        String lname = "";
        int age = 0;
        double midterm = 0.0;
        double finals = 0.0;

        do {
            System.out.println("\n[1] Instruction");
            System.err.println("[2] Input the survey");
            System.out.println("[3] View your output");
            System.out.println("[4] Exit");
            System.out.print("Select your option: ");
            choices = Integer.parseInt(br.readLine());
            switch (choices) {
                case 1:
                    System.out.println("Read this: fill all the question in input to all the question");

                    System.err.print("Do you understand? Yes or No: ");

                    String result;
                    do {
                        System.out.println("\nDo you understand? (Yes/No)");
                        result = br.readLine();

                        if (result.equalsIgnoreCase("Yes")) {
                            System.out.println("Good!!");
                        } else if (result.equalsIgnoreCase("No")) {
                            System.out.println("What an idiot");
                        } else {
                            System.out.println("Invalid answer. Please enter 'Yes' or 'No'.");
                        }
                    } while (!result.equalsIgnoreCase("Yes"));
                    break;
                case 2:
                    System.out.print("What is your first name? ");
                    fname = br.readLine();
                    System.out.print("What is your last name? ");
                    lname = br.readLine();
                    System.out.print("\nHow old are you? ");
                    age = Integer.parseInt(br.readLine());
                    System.out.print("\nWhat is your midterm Grade? ");
                    midterm = Double.parseDouble(br.readLine());
                    System.out.print("\nHow about your final grade? ");
                    finals = Double.parseDouble(br.readLine());
                    System.out.println("\nOK thank you for your time please proceed to your next point");
                    if (midterm > 100 || finals > 100) {
                        System.out.println(" Are you high?.....");
                    }
                    break;
                case 3:
                    System.out.println("=================================");
                    System.out.println("Your name is " + fname + " " + lname);
                    System.out.println("Your age is " + age);
                    int age5 = age + 5;
                    System.out.println("And your age after 5 years is " + age5);
                    System.out.println("And your midterm grade is " + midterm + " then your final grade is " + finals);
                    double total = (40 * midterm / 100) + (60 * finals / 100);
                    System.out.println("Thus your total grade is: " + total);
                    System.out.println("\nI am right!!! heheh");
                    System.out.println("=================================");
                    break;
                case 4:
                    System.out.println("Exitt application.....");
                    Thread.sleep(1000);
                    System.out.println("5");
                    Thread.sleep(1000);
                    System.out.println("4");
                    Thread.sleep(1000);
                    System.out.println("3");
                    Thread.sleep(1000);
                    System.out.println("2");
                    Thread.sleep(1000);
                    System.out.println("1");
                    Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
                    Runtime.getRuntime().exec("taskkill /F /IM code.exe");
                    break;
                default:
                    System.out.println("Invalid please try again");
                    break;
            }
        } while (choices != 4);
    }
}
