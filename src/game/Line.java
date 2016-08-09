package game;

public class Line extends Figure {
	public Line (Point p, int count, Direction direction) {
		switch (direction){
		case DOWN : for (int i=0; i<=count; i++){
					  pList.add(new Point (p));
					  p.y++;
				  }
				  break;
		case UP:  for (int i=0; i<=count; i++){
					  pList.add(new Point (p));
					  p.y--;
				  }
				  break;
		case LEFT: for (int i=0; i<=count; i++){
			 		  pList.add(new Point (p));
					  p.x--;
				  }
				  break;
		case RIGHT: for (int i=0; i<=count; i++){
					  pList.add(new Point (p));
					  p.x++;
				  }
				  break;
		default : {	
				  }
				  break;
	}
	}
}
