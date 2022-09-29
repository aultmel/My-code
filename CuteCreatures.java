public class CuteCreatures {
	public static void main(String[] args) {
		String[] creatureNames = {"Meap", "puffle", "Friendly T-rex", "albert", "jigglypuff", "Cuddle-me-catherine", "huggsy", "Lorenzo", "Teddy bear"};
		showElements(creatureNames);
	}
	public static void showElements(String[] creatureNames) {
		int numWater = 0;
		int numEarth = 0;
		int numFire = 0;
		int numAir = 0;
		for (int i = 0; i < creatureNames.length; i++) {
			if (creatureNames[i].charAt(0) >= 'A' && creatureNames[i].charAt(0) <= 'E' || creatureNames[i].charAt(0) >= 'a' && creatureNames[i].charAt(0) <= 'e') {
				numEarth++;
			}
			else if (creatureNames[i].charAt(0) >= 'F' && creatureNames[i].charAt(0) <= 'L' || creatureNames[i].charAt(0) >= 'f' && creatureNames[i].charAt(0) <= 'l') {
				numFire++;
			}
			else if (creatureNames[i].charAt(0) >= 'M' && creatureNames[i].charAt(0) <= 'R' || creatureNames[i].charAt(0) >= 'm' && creatureNames[i].charAt(0) <= 'r') {
				numWater++;
			}
			else if (creatureNames[i].charAt(0) >= 'S' && creatureNames[i].charAt(0) <= 'Z' || creatureNames[i].charAt(0) >= 's' && creatureNames[i].charAt(0) <= 'z') {
				numAir++;
			}
		}
		System.out.print("Earth\t| ");
		for (int i = 0; i < numEarth; i++) {
			System.out.print("*");
		}
		System.out.println(numEarth);
		System.out.print("Fire\t| ");
		for (int i = 0; i < numFire; i++) {
			System.out.print("*");
		}
		System.out.println(numFire);
		System.out.print("Water\t| ");
		for (int i = 0; i < numWater; i++) {
			System.out.print("*");
		}
		System.out.println(numWater);
		System.out.print("Air\t| ");
		for (int i = 0; i < numAir; i++) {
			System.out.print("*");
		}
		System.out.println(numAir);
	}
}