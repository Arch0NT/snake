package game;

import java.io.IOException;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class Launcher {

	public static void main(String[] args) throws IOException {
		
		Terminal terminal = new DefaultTerminalFactory().setInitialTerminalSize(new TerminalSize(152,42)).createTerminal();
		//terminal.enterPrivateMode();
		terminal.setCursorVisible(false);
        terminal.flush();
        Point leftUpperConner = new Point (terminal,0,0,'+');
        Point leftLowerConner = new Point (terminal,0,40,'+');
        Point rightLowerConner = new Point (terminal,150,40,'+');
        Point rightUpperConner = new Point (terminal,150,0,'+');
        
        Line upperLine = new Line(leftUpperConner, 150, Direction.RIGHT );
        Line leftLine = new Line(leftLowerConner, 40, Direction.UP );
        Line rightLine = new Line(rightUpperConner, 40, Direction.DOWN);
        Line lowerLine = new Line(rightLowerConner, 150, Direction.LEFT);
        upperLine.Draw();
        leftLine.Draw();
        lowerLine.Draw();
        rightLine.Draw();
        
        Point test = new Point (terminal,5,5,'*');
        do {
        	test.Draw();
        	test.Move(1, Direction.RIGHT);
        //	for (long i=0; i<=150000;i++);
        }
        while (terminal.pollInput()==null);
        
        //terminal.exitPrivateMode();
        System.exit(0);
	}

}
