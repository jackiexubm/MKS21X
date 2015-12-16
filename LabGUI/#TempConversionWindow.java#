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
	toF.addActionListener(this);
	toF.setActionCommand("convertF");


	input = new JTextField();

	result = new JLabel("Please type number in textfield");

    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("convertC")){
	    String inText = input.getText();
	    double num = Double.parseDouble(inText);
	    String display = "" + HwTemperature.FtoC(num);
	    result.setText(display);
	}
	if(event.equals("convertF")){
	    String inText = input.getText();
	    double num = Double.parseDouble(inText);
	    String display = "" + HwTemperature.CtoF(num);
	    result.setText(display);
  
	}
    }
}

