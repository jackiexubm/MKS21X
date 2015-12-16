import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel result;
    private JTextField input;

    public TempConversionWindow() {
	this.setTitle("My first GUI");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(
				      EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton toC = new JButton("toC");
	toC.addActionListener(this);
	toC.setActionCommand("convertC");
	JButton toF = new JButton("toF");
	b2.addActionListener(this);
	b2.setActionCommand("convertF");


	input = new JTextField();

    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("convertC")){
	    String input = input.getText();
	    double num = parseDouble(input);
	    s = ;
	    j.setText(s);
	}
	if(event.equals("convertF")){
	    String input = input.getText();
	    double num = parseDouble(input);
	    s = ;
	    j.setText("Fish");
  
	}
    }
}

