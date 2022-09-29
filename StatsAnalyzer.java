public class StatsAnalyzer {
	public static void main(String[] args) {
		int[][] scores = {	{20, 27, 16, 23, 20, 27, 18},
							{8, 18, 14, 17, 9, 12, 0},
							{34, 19, 25, 22, 19, 25, 31},
							{17, 8, 11, 34, 15, 0, 9},
							{2, 0, 3, 0, 10, 2, 4}
													};
		System.out.println(playerTotalPoints(scores, 2));
		System.out.println(playerAvgPoints(scores, 2));
		System.out.println(worstPlayerInGame(scores, 4));
		System.out.println(teamPointsInGame(scores, 6));
		System.out.println(teamBestGame(scores));
		System.out.println(topScoringPlayer(scores));
	}
	public static int playerTotalPoints(int[][] scores, int p) {
		int sum = 0;
		for (int i = 0; i < scores[p].length; i++) {
			sum += scores[p][i];
		}
		return sum;
	}
	public static double playerAvgPoints(int[][] scores, int p) {
		int sum = playerTotalPoints(scores, p);
		double average = (double)sum / scores[p].length;
		return average;
	}
	public static int worstPlayerInGame(int[][] scores, int g) {
		int lowestScore = scores[0][0];
		int lowestScorer = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i][g] < lowestScore) {
				lowestScore = scores[i][g];
				lowestScorer = i;
			}
		}
		return lowestScorer;
	}
	public static int teamPointsInGame(int[][] scores, int g) {
		int sum = 0; 
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i][g];
		}
		return sum;
	}
	public static int teamBestGame(int[][] scores) {
		int highestScore = scores[0][0];
		int highestScoringGame = 0;
		for (int i = 0; i < scores.length; i++) {
			if (teamPointsInGame(scores, i) > highestScore) {
				highestScore = teamPointsInGame(scores, i);
				highestScoringGame = i;
			}
		}
		return highestScoringGame;
	}
	public static int topScoringPlayer(int[][] scores) {
		int highestScore = scores[0][0];
		int highestScorer = 0;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] > highestScore) {
					highestScore = scores[i][j];
					highestScorer = i;
				}
			}
		}
		return highestScorer;
	}
}