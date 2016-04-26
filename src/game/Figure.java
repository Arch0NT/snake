package game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Figure extends Point {
	protected List <Point> pList = new ArrayList <Point> ();
	
	public void Draw () throws IOException {
		for (Point i : pList) {
			i.Draw();
		}
	}

}
