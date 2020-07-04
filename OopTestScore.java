import java.util.Scanner;

public class OopTestScore 
{
	public static void main(String[] args) 
    {
		String fName;
		String lName;
		int numTests, tScore, total;
		Scanner stdIn = new Scanner(System.in); // input

		System.out.print("Enter your first name: ");
		fName = stdIn.nextLine();

		System.out.print("Enter your last name: ");
		lName = stdIn.nextLine();

		System.out.print("How many test score do you want to enter: ");
		numTests = stdIn.nextInt();

		total = 0;

		for (int test = 1; test <= numTests; test++) {
			System.out.print("Enter your test scores: " + test + "\n");
			tScore = stdIn.nextInt();
			if (tScore < 0 || tScore > 100) {
				System.out.println("Invalid input");
				test--;
				continue;
			}

			total += tScore;
		}

		Student student = new Student(fName, lName, numTests, total);

		System.out.println("Your initial first name is " + student.getFName().charAt(0) + "." + "\n"
				+ "Your last name is " + student.getLName() + "." + "\n" + "The average of your test score is "
				+ student.getAvgTScore() + "%" + " with grade " + student.getGrade());
	}
}
//********************************************************************************************************************
class Student {
	String fName;
	String lName;
	int numTests, tScore, total;
	double avgTScore;
	String grade;

	Student(String fName, String lName, int numTests, int total) {
		this.fName = fName;
		this.lName = lName;
		this.numTests = numTests;
		this.total = total;
	}

	// getters
	String getFName() {
		return fName;
	}

	String getLName() {
		return lName;
	}

	int getNumTests() {
		return numTests;
	}

	int getTotal() {
		return total;
	}

	// setters
	void setFName(String fName) {
		this.fName = fName;
	}

	void setLName(String lName) {
		this.lName = lName;
	}

	void setNumTests(int numTests) {
		this.numTests = numTests;
	}

	void setTotal(int total) {
		this.total = total;
	}

	// calculations

	double getAvgTScore() {

		avgTScore = (double) total / numTests;
		return avgTScore;
	}

	String getGrade() {
		if (avgTScore > 100)
			grade = "?";
		else if (avgTScore >= 90)
			grade = "A";
		else if (avgTScore >= 80)
			grade = "B";
		else if (avgTScore >= 70)
			grade = "C";
		else if (avgTScore >= 60)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
}
