package strings_and_dialogs;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
    	Robot oof = new Robot();
    	oof.penDown();
    	oof.setSpeed(100000);
    for(int i=0; i<4; i++) {
    		oof.move(200);
    		oof.turn(90);
    	}
    }
}
