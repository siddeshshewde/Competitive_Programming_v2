/*
Title:
	Take a Ten Minute Walk

Kata:
	https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java

Description:
	You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block in a direction and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.

	Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).

*/

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int x = 0, y = 0;
        if (walk.length > 10)
            return false;
        if (walk.length < 10)
            return false;
        for (int i = 0; i < 10; i++) {
            if (walk[i] == 'n')
                x = x + 1;
            if (walk[i] == 's')
                x = x - 1;
            if (walk[i] == 'e')
                y = y + 1;
            if (walk[i] == 'w')
                y = y - 1;
        }
        if (x == 0 && y == 0)
            return true;
        else
            return false;
    }
}
