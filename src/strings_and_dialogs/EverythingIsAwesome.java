package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("What do u think is awesome?");
		JOptionPane.showMessageDialog(null, name+" is awesome!");	
	}
}
