import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Gradebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name, grade, gender, major, state, score;
		int choice, overSum = 0, overAvg, femaleSum = 0, maleSum = 0, mdSum = 0, vaSum = 0, paSum = 0, bioSum = 0,
				mathSum = 0, acctSum = 0, femaleCount = 0, maleCount = 0, mdCount = 0, vaCount = 0, paCount = 0,
				bioCount = 0, mathCount = 0, acctCount = 0, numStudents, mdAvg = 0, vaAvg = 0, paAvg = 0, maleAvg = 0,
				femaleAvg = 0, mathAvg = 0, bioAvg = 0, acctAvg = 0;

		String[][] students = new String[100][6];

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Student Gradebook Application");

		System.out.println("Enter Student's Name? ");
		name = keyboard.next();

		System.out.println("Enter Student's grade? ");
		grade = keyboard.next();

		System.out.println("Enter Student's gender? ");
		gender = keyboard.next();

		System.out.println("Enter Student's major? ");
		major = keyboard.next();

		System.out.println("Enter Student's state? ");
		state = keyboard.next();

		System.out.println("Enter Student's score? ");
		score = keyboard.next();

		students[0][0] = name;
		students[0][1] = grade;
		students[0][2] = gender;
		students[0][3] = major;
		students[0][4] = state;
		students[0][5] = score;

		System.out.println("Enter (1) to enter more data, (2) to print report, or (3) to finish.");
		choice = keyboard.nextInt();

		int i = 0;
		numStudents = 1;

		while ((choice == 1) || (choice == 2)) {

			i++;

			if (choice == 1) {

				System.out.println("Enter Student's Name? ");
				students[i][0] = keyboard.next();

				System.out.println("Enter Student's grade? ");
				students[i][1] = keyboard.next();

				System.out.println("Enter Student's gender? ");
				students[i][2] = keyboard.next();

				System.out.println("Enter Student's major? ");
				students[i][3] = keyboard.next();

				System.out.println("Enter Student's state? ");
				students[i][4] = keyboard.next();

				System.out.println("Enter Student's score? ");
				students[i][5] = keyboard.next();
			} else {
				// code for running total report

			}

			System.out.println("Enter (1) to enter more data, (2) to print report, or (3) to finish.");
			choice = keyboard.nextInt();
			numStudents++;
		}

		for (int k = 0; k <= i; k++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(students[k][j] + "\t");

			}
			System.out.println();
		}



		for (int k = 0; k <= i; k++) {

			int intScore = Integer.parseInt(students[k][5]);
			overSum = overSum + intScore;
			System.out.println("std [k][2]" + students[k][2]);
			if (students[k][2].equals("F")) {
				femaleCount++;
				femaleSum = femaleSum + intScore;

			} else if (students[k][2].equals("M")) {
				maleCount++;
				maleSum = maleSum + intScore;

			}

			if (students[k][3].equals("Math")) {
				mathCount++;
				mathSum = mathSum + intScore;
			} else if (students[k][3].equals("Bio")) {
				bioCount++;
				bioSum = bioSum + intScore;

			} else if (students[k][3].equals("Acct")) {
				acctCount++;
				acctSum = acctSum + intScore;
			}

			if (students[k][4].equals("MD")) {
				mdCount++;
				mdSum = mdSum + intScore;
			} else if (students[k][4].equals("VA")) {
				vaCount++;
				vaSum = vaSum + intScore;

			} else if (students[k][4].equals("PA")) {
				paCount++;
				paSum = paSum + intScore;
			}

		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String date = sdf.format(new Date());
		System.out.println("Report Date : " + date + "\n");

		overAvg = overSum / numStudents;
		System.out.println("Number of Students :" + numStudents);
		System.out.println("Overall Average :" + overAvg);
		
		
		System.out.println("here and there" + mdCount + "tjere" + mdSum );
		
		

		if (maleCount > 0) {
			System.out.println("Average for Males :" + (maleSum / maleCount));
		}
		if (femaleCount > 0) {
			System.out.println("Average for Females :" + (femaleSum / femaleCount));
		}
		if (mathCount > 0) {
			System.out.println("Average for Math majors :" + (mathSum / mathCount));
		}
		if (bioCount > 0) {
			System.out.println("Average for Biology majors :" + (bioSum / bioCount));
		}
		if (acctCount > 0) {
			System.out.println("Average for Accounting majors :" + (acctSum / acctCount));
		}
		if (mdCount > 0) {
			System.out.println("Average for Maryland :" + (mdSum / mdCount));
		}
		if (paCount > 0) {
			System.out.println("Average for Pennsylvania :" + (paSum / paCount));
		}
		if (vaCount > 0) {
			System.out.println("Average for Biology majors :" + (vaSum / vaCount));
		}

		keyboard.close();

	}

}
