package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class robotGrafiti {
		// TODO Auto-generated constructor stub
public static void main(String[] args) {
		Robot oof=new Robot();
		oof.setSpeed(50);
		oof.penDown();
		oof.move(200);
		oof.penUp();
		oof.move(-100);
		oof.turn(40);
		oof.penDown();
		oof.move(120);
		oof.penUp();
		oof.move(-120);
		oof.turn(100);
		oof.penDown();
		oof.move(120);
		oof.hide();
	}
}
