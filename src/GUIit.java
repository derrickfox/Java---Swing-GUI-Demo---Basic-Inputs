/* Derrick Fox
 * CS 213
 * GUIit.java
 * In-Class Assignment
 * GUI Test
 * April 15, 2014
 */

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

// Custom class inherits from JFrame
public class GUIit extends JFrame{
	
	// Image for the "x" icon
	private ImageIcon x = new ImageIcon("x.gif");
	
	// Constructor accepting no parameters 
	public GUIit() {
		setLayout(new BorderLayout(5, 10));
		
		// Creates two new check boxes 
		JCheckBox checkText = new JCheckBox("Text", true);
		JCheckBox checkIcon = new JCheckBox("Icon", true);
		
		// Creates a panel for the left 
		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(new GridLayout(2, 1));
		leftPanel.add(checkText);
		leftPanel.add(checkIcon);
		add(leftPanel, BorderLayout.WEST);
		
		// Creates a button group
		ButtonGroup buttonGrpTop = new ButtonGroup();
		
		// Creates buttons
		JRadioButton left = new JRadioButton("Left");
		JRadioButton center = new JRadioButton("Center", true);
		JRadioButton right = new JRadioButton("Right");
		buttonGrpTop.add(left);
		buttonGrpTop.add(center);
		buttonGrpTop.add(right);
		
		// Creates top panel
		JPanel topPanel = new JPanel();
		topPanel.setBorder(new TitledBorder("Horizontal Alignment"));
		topPanel.add(left);
		topPanel.add(center);
		topPanel.add(right);
		add(topPanel, BorderLayout.NORTH);
		
		// Creates right panel
		JPanel rightPanel = new JPanel();
		JComboBox box = new JComboBox(new Object[]
				{"Red", "Blue", "Green", "Orange"});
		box.setSelectedItem("Red");
		rightPanel.add(box);
		add(rightPanel, BorderLayout.EAST);
		
		// Creates button group
		ButtonGroup buttonGrpBottom = new ButtonGroup();

		JRadioButton top = new JRadioButton("Top");
		JRadioButton middle = new JRadioButton("Middle", true);
		JRadioButton bottom = new JRadioButton("Bottom");
		buttonGrpBottom.add(top);
		buttonGrpBottom.add(middle);
		buttonGrpBottom.add(bottom);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBorder(new TitledBorder("Vertical Alignment"));
		bottomPanel.add(top);
		bottomPanel.add(middle);
		bottomPanel.add(bottom);
		add(bottomPanel, BorderLayout.SOUTH);
		
		Color color = new Color(204, 238, 241);
		
		JPanel centerPanel = new JPanel();
		
		JLabel cross = new JLabel("Cross", x, JLabel.CENTER);
		Font font = new Font("Verdana", Font.BOLD, 16);
		cross.setFont(font);
		cross.setForeground(Color.RED);
		cross.setOpaque(true);
		cross.setBackground(color);
		add(cross, BorderLayout.CENTER);
	}
}
