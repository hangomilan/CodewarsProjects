package takeTenMinuteWalk;

/*You live in the city of Cartesia where all roads are laid out in a perfect grid. 
 You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. 
 The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). 
 You know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. 
 Return false otherwise.*/

public class TenMinWalk {
	public static boolean isValid(char[] walk) {

		final int NUM = 10;
		if (walk.length != NUM)
			return false;
		int x = 0;
		int y = 0;
		for (int i = 0; i < NUM; i++) {

			switch (walk[i]) {
			case 'n':
				y++;
				break;
			case 's':
				y--;
				break;
			case 'e':
				x++;
				break;
			case 'w':
				x--;
				break;
			}
		}
		if (x == 0 && y == 0)
			return true;
		return false;
	}
}
