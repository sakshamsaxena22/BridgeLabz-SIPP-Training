package Day_1;

public class VolumeOfEarth {
	public static void main(String args[]) {
		double radiusKm = 6378;
        double volumeKm = (4.0/3) * 3.14 * radiusKm * radiusKm*radiusKm ;//value of pi=3.14 * ;
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles = (4.0/3) * 3.14 *radiusMiles*radiusMiles*radiusMiles;
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + 
                          " and cubic miles is " + volumeMiles);	
	}

}
