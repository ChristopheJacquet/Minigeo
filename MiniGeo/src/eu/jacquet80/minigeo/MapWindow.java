package eu.jacquet80.minigeo;

import java.awt.BorderLayout;
import java.util.Collection;

import javax.swing.JFrame;;

/**
 * Window that may display a set of segments, with support for panning and
 * zooming.
 * 
 * @author Christophe Jacquet
 *
 */
@SuppressWarnings("serial")
public class MapWindow extends JFrame {
	private final MapPanel map;
	
	/**
	 * Creates a new window.
	 */
	public MapWindow() {
		super("Map");
		map = new MapPanel();
		setLayout(new BorderLayout());
		add(map, BorderLayout.CENTER);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	/**
	 * Deletes all the registered segments.
	 */
	public synchronized void clearSegments() {
		map.clearSegments();
	}
	
	/**
	 * Adds a segment to the list of segments to display.
	 * @param segment the segment to add
	 */
	public synchronized void addSegment(Segment segment) {
		map.addSegment(segment);
	}
	
	/**
	 * Adds a whole collection of segments to the list of segments to display
	 * @param segments the collection of segments to add
	 */
	public void addSegments(Collection<Segment> segments) {
		map.addSegments(segments);
	}
}
