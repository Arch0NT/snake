package game;

public class Line extends Figure {
	public Line (Point p, int count, char direction) {
		switch (direction){
			case 'v': for (int i=0; i<count; i++){
						  pList.add(new Point (p));
						  p.y++;
					  }
					  break;
			case '^': for (int i=0; i<count; i++){
						  pList.add(new Point (p));
						  p.y--;
					  }
					  break;
			case '<': for (int i=0; i<count; i++){
				 		  pList.add(new Point (p));
						  p.x--;
					  }
					  break;
			case '>': for (int i=0; i<count; i++){
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
