import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class GUI extends JFrame{
	
	
	//1
	JPanel panel = new JPanel();
	//2
	JTextField nameField , idField;
	JButton createStudentButton;
	
	public GUI() {
		
		nameField = new JTextField("Enter Name");
		idField = new JTextField("Enter ID");
		createStudentButton = new JButton("Create Student");
		
		//3
		panel.add(nameField);
		panel.add(idField);
		panel.add(createStudentButton);
		
		//4
		this.setContentPane(panel);
		
		//3.1
		ButtonListener listener = new ButtonListener();
		//4.1
		createStudentButton.addActionListener(listener);
		
		
		this.setSize(400,400);
		this.setVisible(true);
		this.setTitle("Student Form");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//1.1
	class ButtonListener implements ActionListener {
		
		//2.1
		public void actionPerformed(ActionEvent e) {
			String name = nameField.getText();
			String id = idField.getText();
			
			Student s = new Student(name,id);
			
			System.out.println("Student successfully created");
			System.out.println(s);
			
		}
		
	}

}
