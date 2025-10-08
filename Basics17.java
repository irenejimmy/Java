package irene;
import javax.swing.*;
import java.awt.*;
public class Basics17 {
	public static void main(String[] args) {
	JFrame mainFrame= new JFrame();
	mainFrame.setTitle("Sign up form");
	JPanel mainPanel = new JPanel();
	mainPanel.setLayout(new GridLayout(6,2,10,10));
	
	JLabel nameLabel = new JLabel("Name");
	JTextField nameField = new JTextField();
	JLabel emailLabel = new JLabel("Email");
	JTextField emailField = new JTextField();
	JLabel genderLabel = new JLabel("Gender");
	JRadioButton male = new JRadioButton("Male");
	JRadioButton female = new JRadioButton("Female");
	ButtonGroup buttonGroup = new ButtonGroup();
	buttonGroup.add(male);
	buttonGroup.add(female);
	
	JPanel genderPanel = new JPanel();
	genderPanel.setLayout(new FlowLayout());
	genderPanel.add(male);
	genderPanel.add(female);
	
	JLabel countryLabel = new JLabel("Country");
	String [] countries = {"India","China","USA"};
	JComboBox<String> countryBox = new JComboBox<>(countries);
	JLabel addressJLabel = new JLabel("Address");
	JTextArea addressArea = new JTextArea(3,4);
	JButton submitbtn = new JButton("Submit");
	mainPanel.add(nameLabel);mainPanel.add(nameField);
	mainPanel.add(emailLabel);mainPanel.add(emailField);
	mainPanel.add(genderPanel);
	mainPanel.add(countryLabel);mainPanel.add(countryBox);
	mainPanel.add(addressJLabel);mainPanel.add(addressArea);
	mainPanel.add(submitbtn);
	mainFrame.add(mainPanel);
	mainFrame.setLocationRelativeTo(null);

	
	
	
	
	mainFrame.setVisible(true);



}
}
