import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eu.jacquet80.minigeo.MapWindow;
import eu.jacquet80.minigeo.Point;
import eu.jacquet80.minigeo.Segment;


public class MinigeoDemo {
	private static Pattern POINT = Pattern.compile("^.*?(-?\\d+\\.\\d+)\\s+(-?\\d+\\.\\d+)$");
	
	public static void main(String[] args) throws IOException {
		MapWindow window = new MapWindow();
		
		BufferedReader r = new BufferedReader(new FileReader("france.poly"));
		String line;
		Point cur, prec = null;
		int readCount = 0;
		int errCount = 0;
		while((line = r.readLine()) != null) {
			readCount++;
			Matcher m = POINT.matcher(line);
			if(m.matches()) {
				double lon = Double.parseDouble(m.group(1));
				double lat = Double.parseDouble(m.group(2));
				cur = new Point(lat, lon);
				if(prec != null) window.addSegment(new Segment(prec, cur, lon<0 ? Color.BLUE : Color.RED));
				prec = cur;
			} else errCount++;
		}
		
		System.out.println("Read " + readCount + " lines; ignored " + errCount);
		
		window.setVisible(true);
	}

}
