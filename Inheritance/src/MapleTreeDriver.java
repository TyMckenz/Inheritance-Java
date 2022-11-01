import java.util.*;
public class MapleTreeDriver {

	public static void main(String[] args) {
		String answer;
		Scanner scn = new Scanner(System.in);
		
		do {
		System.out.print("Would you like to record a new tree? (y/n): ");
		answer = scn.next();
	
		MapleTree newTree = new MapleTree();
		

		 newTree.dumpData();

		} while(answer.equalsIgnoreCase("y"));
		
		if (answer.equalsIgnoreCase("n")) {
			scn.close();
			main(null);
		}
			
	}
}
