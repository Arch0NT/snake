package game;

import java.io.IOException;

import com.googlecode.lanterna.terminal.Terminal;

public class Point {
	public Terminal terminal;
	public int x;
	public int y;
	public char sym;
	
	public Point() {
	}
	
	public Point (Terminal _terminal, int _x, int _y, char _sym){
		terminal=_terminal;
		x=_x;
		y=_y;
		sym=_sym;
	}

	public Point(Point p) {
		terminal=p.terminal;
		x=p.x;
		y=p.y;
		sym=p.sym;
	}
	
	public void Draw () throws IOException {
		terminal.setCursorPosition(x, y);
		terminal.putCharacter(sym);
	}
	
	public void Move (int offset, Direction direction){
		switch (direction){
		case DOWN : y+=offset;
				  break;
		case UP:  y-=offset;
				  break;
		case LEFT: x-=offset;
				  break;
		case RIGHT: x+=offset;
				  break;
		default : {	
				  }
				  break;
		}
	}
}
