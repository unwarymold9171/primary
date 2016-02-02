package core;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GuiBuild extends JFrame{
	private static final long serialVersionUID = -6695122079269918161L;

	private JPanel contentPane;
	private Color color;
	
	//   *   *   *   Constructors   *   *   *   //
	
	// My favorite
	public GuiBuild(String name, Color colour, int xPos, int yPos, int width, int height, boolean resizeable){
		setTitle(name);
		setBackground(colour);
		setBounds(xPos, yPos, width, height);
		setResizable(resizeable);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(colour);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		color = colour;
	}
	
	public GuiBuild(String name, Color colour, int width, int height, boolean resizeable){
		setTitle(name);
		setBackground(colour);
		setSize(width, height);
		setResizable(resizeable);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(colour);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		color = colour;
	}

	public GuiBuild(String name, Color colour, LayoutManager manager, int xPos, int yPos, int width, int height, boolean resizeable){
		setTitle(name);
		setBackground(colour);
		setBounds(xPos, yPos, width, height);
		setResizable(resizeable);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(colour);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(manager);
		color = colour;
	}
	
	public GuiBuild(String name, Color colour, LayoutManager manager, int width, int height, boolean resizeable){
		setTitle(name);
		setBackground(colour);
		setSize(width, height);
		setResizable(resizeable);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(colour);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(manager);
		color = colour;
	}
	
	//   *   *   *   Methods   *   *   *   //
	
	//makes up for the lack of adding to the content pane out of the class
	public void addToContentPane(Component c) {
		contentPane.add(c);
	}
	public void addToContentPane(PopupMenu pm) {
		contentPane.add(pm);
	}
	public void addToContentPane(Component c, int i) {
		contentPane.add(c, i);
	}
	public void addToContentPane(Component c, Object o) {
		contentPane.add(c, o);
	}
	public void addToContentPane(Component c, Object o, int i) {
		contentPane.add(c, o, i);
	}
	public void addToContentPane(String s, Component c) {
		contentPane.add(s, c);
	}
	
	
	//   *   *   *   Get Functions   *   *   *   //
	
	public Color getGUIColor(){
		return color;
	}
	
}
