package firstpackage;

import java.util.Scanner;
public class NestedComputer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("what do yu know computer skills (JAVA/SQL/CLOUD");

        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase(" java")) {
            System.out.println("what is your java score");
            int javaScore = scanner.nextInt();
            if (javaScore >= 80) {
                System.out.println("Nice job");
            } else {
                System.out.println("you can do it");

            }
        }     else if(answer.equalsIgnoreCase(("SQL"))) {
                System.out.println("what is your Hackerrenk score:(0-1000):");
                int score = scanner.nextInt();
                if (score < 500) {
                    System.out.println("solve more problems");
                } else {
                    System.out.println("nice ");
                }

            } else if (answer.equalsIgnoreCase("Cloud")) {
                System.out.println("Do you have certificate  Y/N");
                String certificate = scanner.next();
                if (certificate.equalsIgnoreCase("y")) {
                    System.out.println("huge plas");
                } else if(certificate.equalsIgnoreCase("N")) {
                    System.out.println("you need to be ");
                }


            } else {
                System.out.println("only java /sql/cloud ");
            }


        }
    }
