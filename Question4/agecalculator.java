package TASK5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class agecalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthdate (YYYY-MM-DD): ");
        String birthdateString = scanner.nextLine();

        LocalDate birthdate = LocalDate.parse(birthdateString);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthdate, currentDate);
        int age = period.getYears();
        int month = period.getMonths();
        int days = period.getDays();

        System.out.println("Your age is: " + age + " years,"+ month + " months, and "+ days + " days.");

        scanner.close();
    }

}
