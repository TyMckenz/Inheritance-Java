import java.util.*;
public class MapleTree {
	
	Scanner scn = new Scanner(System.in);
	
	private String plantDate;
	private double height;
	private String heightDate;
	
	public MapleTree () {
		plant();
		germinate();
	}
	
	public void plant() {
		
		System.out.print("Enter date of planting (dd/mm/yyyy): ");
		plantDate = scn.next();
	}
	
	public void germinate() {
		System.out.print("Enter sprouting date (dd/mm/yyyy): ");
		heightDate = scn.next();
		System.out.print("Enter height in meters: ");
		height = scn.nextDouble();
	}
	
	
	public void dumpData () {
		System.out.println("Plant date: " + plantDate);
		System.out.println("Sprouting date: " + heightDate);
		System.out.println("Sprout height: " + height +"m");
	}

}
