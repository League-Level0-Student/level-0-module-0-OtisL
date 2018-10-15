package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("Tell me ur name.");
		JOptionPane.showMessageDialog(null, "Hello, "+name);		
	}
}
