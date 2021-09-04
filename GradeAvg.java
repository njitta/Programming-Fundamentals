
public class GradeAvg {

	public static void main(String[] args) {
		
		double quizScore1 = 40;
		double quizScore2 = 45;
		double quizScore3 = 50;
		double testScore1 = 70;
		double testScore2 = 80;
		double quizScoreAvg = 0;
		double testScoreAvg = 0;
		
		quizScoreAvg = (quizScore1 + quizScore2 + quizScore3)/3; // Expression Calculates the Average of Quiz score
		
		testScoreAvg = (testScore1 + testScore2)/2; //Expression Calculates the Average of Test Scores
		
		System.out.println("Average Quiz Score is :" +quizScoreAvg); // Display Average Quiz Score 
		
		System.out.println("Average Test Score is :" +testScoreAvg); // Display Average Test Score 

	}

}
