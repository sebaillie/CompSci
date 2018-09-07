package bearing;

import java.util.Scanner;

public class Bearing {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Latitude of Location1: ");
		double LatLoc1 = s.nextDouble();
		System.out.print("Longitude of Location1: ");
		double LonLoc1 = s.nextDouble();
		
		System.out.print("Latitude of Location2: ");
		double LatLoc2 = s.nextDouble();
		System.out.print("Longitude of Location2: ");
		double LonLoc2 = s.nextDouble();
		
		// degrees to radians
		
		double LatLoc1R = (LatLoc1 / 180) * Math.PI;
		double LonLoc1R = (LonLoc1 / 180) * Math.PI;
		double LatLoc2R = (LatLoc2 / 180) * Math.PI;
		double LonLoc2R = (LonLoc2 / 180) * Math.PI;
		
		double radian = Math.atan2(Math.sin(LonLoc2R - LonLoc1R) * Math.cos(LatLoc2R), Math.cos(LatLoc1R) * Math.sin(LatLoc2R) - Math.sin(LatLoc1R) * Math.cos(LatLoc2R) * Math.cos(LonLoc2R - LonLoc1R));
		
		double degrees = (radian / Math.PI) * 180;
		
		System.out.println("\nFrom (" + LatLoc1 + ", " + LonLoc1 + ") to (" + LatLoc2 + ", " + LonLoc2 + "):");
		System.out.printf("bearing %.6f degrees\n", degrees);
		
	}
	
}
