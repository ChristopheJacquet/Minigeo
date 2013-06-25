package eu.jacquet80.minigeo;


/**
 * Geographic point, defined by its coordinates and by a label.
 * 
 * @author Christophe Jacquet
 * @see POI
 *
 */
public class POI extends Point {
	private final String label;
	
	public POI(double latitude, double longitude, String label) {
		super(latitude, longitude);
		this.label = label;
	}
	
	public POI(Point point, String label) {
		this(point.getLatitude(), point.getLongitude(), label);
	}
	
	public String getLabel() {
		return label;
	}
}
