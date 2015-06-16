/* Derrick Fox
 * CS 213
 * TestGUI.java
 * In-Class Assignment
 * GUI Test
 * April 15, 2014
 */

import javax.swing.JFrame;

public class TestGUI {
	public static void main(String[] args) {
		GUIit frame = new GUIit();
		frame.setTitle("Button and ComboBox Demo");
		frame.setSize(420, 310);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
