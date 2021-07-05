import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	JFrame jf;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton sixButton;
	JButton fiveButton;
	JButton fourButton;
	JButton threeButton;
	JButton twoButton;
	JButton oneButton;
	JButton dotButton;
	JButton equalButton;
	JButton zeroButton,clearButton;
	JButton aditionButton;
	JButton subtractionButton;
	JButton multiplicationButton;
	JButton divisionButton;
	JLabel displayLabel;
	
	String oldValue;
	
	
	boolean isOperatorClicked =false;
	boolean isPlusButtonPressed=false;
	boolean isMinusButtonPressed=false;
	boolean isMultButtonPressed=false;
	boolean isDivButtonPressed=false;
	boolean isEqualButtonPressed= false;
	
	Calculator(){
		
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(800, 600);
		jf.setLocation(200, 300);
		
		displayLabel = new JLabel();
		displayLabel.setText("");
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setOpaque(true);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		 nineButton = new JButton("9");
		nineButton.setLayout(null);
		nineButton.setBounds(30, 100, 100, 100);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		 eightButton = new JButton("8");
		eightButton.setBounds(140, 100, 100, 100);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		sevenButton = new JButton("7");
		sevenButton.setBounds(250, 100, 100, 100);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		 sixButton = new JButton("6");
		sixButton.setBounds(30, 210, 100, 100);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		 fiveButton = new JButton("5");
		fiveButton.setBounds(140, 210, 100, 100);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		 fourButton = new JButton("4");
		fourButton.setBounds(250, 210, 100, 100);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		 threeButton = new JButton("3");
		threeButton.setBounds(30, 320, 100, 100);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		 twoButton = new JButton("2");
		twoButton.setBounds(140, 320, 100, 100);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		 oneButton = new JButton("1");
		oneButton.setBounds(250, 320, 100, 100);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		

		 dotButton = new JButton(".");
		dotButton.setBounds(30, 430, 100, 100);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		 zeroButton = new JButton("0");
		zeroButton.setBounds(140, 430, 100, 100);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		 clearButton = new JButton("Clear");
		 clearButton.setBounds(470, 430, 100, 100);
		 clearButton.addActionListener(this);
		jf.add(clearButton);
		
		 equalButton = new JButton("=");
		equalButton.setBounds(250, 430, 100, 100);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		 multiplicationButton = new JButton("X");
		multiplicationButton.setBounds(360, 100, 100, 100);
		multiplicationButton.addActionListener(this);
		jf.add(multiplicationButton);
		

		 divisionButton = new JButton("/");
		divisionButton.setBounds(360, 210, 100, 100);
		divisionButton.addActionListener(this);
		jf.add(divisionButton);
		
		 aditionButton = new JButton("+");
		aditionButton.setBounds(360, 320, 100, 100);
		aditionButton.addActionListener(this);
		jf.add(aditionButton);
		
		 subtractionButton = new JButton("_");
		subtractionButton.setBounds(360, 430, 100, 100);
		subtractionButton.addActionListener(this);
		jf.add(subtractionButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new Calculator();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenButton)
		{
			if (isEqualButtonPressed)
			{
				equalButton.setBackground(null);
				equalButton.setForeground(null);
				
				aditionButton.setBackground(null);
				aditionButton.setForeground(null);
				
				subtractionButton.setBackground(null);
				subtractionButton.setForeground(null);
				
				multiplicationButton.setBackground(null);
				multiplicationButton.setForeground(null);
				
				divisionButton.setBackground(null);
				divisionButton.setForeground(null);
			}
			equalButton.setBackground(null);
			equalButton.setForeground(null);
		if(isOperatorClicked||isEqualButtonPressed)
		{
			if(isMinusButtonPressed&&oldValue=="")
			{
				displayLabel.setText("-7");
				isMinusButtonPressed=false;
			}
			else
			{
			displayLabel.setText("7");
			}
			isOperatorClicked=false;
			isEqualButtonPressed=false;
			
		}
		else
		{
			if(isMinusButtonPressed)
			{
				displayLabel.setText(displayLabel.getText()+"-7");
				isMinusButtonPressed=false;
			}
			else
			{
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		}
		
		if((e.getSource()==eightButton))
		{
			if (isEqualButtonPressed)
			{
				equalButton.setBackground(null);
				equalButton.setForeground(null);
				
				aditionButton.setBackground(null);
				aditionButton.setForeground(null);
				
				subtractionButton.setBackground(null);
				subtractionButton.setForeground(null);
				
				multiplicationButton.setBackground(null);
				multiplicationButton.setForeground(null);
				
				divisionButton.setBackground(null);
				divisionButton.setForeground(null);
			}
			
			
			if(isOperatorClicked||isEqualButtonPressed)
			{
				if(isMinusButtonPressed&&oldValue==null)
				{
					displayLabel.setText("-8");
					isMinusButtonPressed=false;
				}
				else
				{
				displayLabel.setText("8");
				}
				isOperatorClicked=false;
				isEqualButtonPressed=false;
				
			}
			else
			{
				if(isMinusButtonPressed)
				{
					displayLabel.setText(displayLabel.getText()+"-8");
					isMinusButtonPressed=false;
				}
				else
				{
					displayLabel.setText(displayLabel.getText()+"8");
				}
				
					
			}
			
		    
			}
		if(e.getSource()==nineButton)
		{
			if (isEqualButtonPressed)
			{
				equalButton.setBackground(null);
				equalButton.setForeground(null);
				
				aditionButton.setBackground(null);
				aditionButton.setForeground(null);
				
				subtractionButton.setBackground(null);
				subtractionButton.setForeground(null);
				
				multiplicationButton.setBackground(null);
				multiplicationButton.setForeground(null);
				
				divisionButton.setBackground(null);
				divisionButton.setForeground(null);
			}
			if(isOperatorClicked||isEqualButtonPressed)
				{if(isMinusButtonPressed&&oldValue==null)
				{
					displayLabel.setText("-9");
					isMinusButtonPressed=false;
				}
				else
				{
				displayLabel.setText("9");
				}
				isOperatorClicked=false;
				isEqualButtonPressed=false;
				
			}
			else
			{
				if(isMinusButtonPressed)
				{
					displayLabel.setText(displayLabel.getText()+"-9");
					isMinusButtonPressed=false;
				}
				else
				{
					displayLabel.setText(displayLabel.getText()+"9");
				}
			}
	}
	
		if(e.getSource()==sixButton)
		{
			if (isEqualButtonPressed)
			{
				equalButton.setBackground(null);
				equalButton.setForeground(null);
				
				aditionButton.setBackground(null);
				aditionButton.setForeground(null);
				
				subtractionButton.setBackground(null);
				subtractionButton.setForeground(null);
				
				multiplicationButton.setBackground(null);
				multiplicationButton.setForeground(null);
				
				divisionButton.setBackground(null);
				divisionButton.setForeground(null);
			}
			if(isOperatorClicked||isEqualButtonPressed)
			{
				if(isMinusButtonPressed&&oldValue==null)
				{
					displayLabel.setText("-6");
					isMinusButtonPressed=false;
				}
				else
				{
				displayLabel.setText("6");
				}
				isOperatorClicked=false;
				isEqualButtonPressed=false;
				
			}
			else
			{
				if(isMinusButtonPressed)
				{
					displayLabel.setText(displayLabel.getText()+"-6");
					isMinusButtonPressed=false;
				}
				else
				{
					displayLabel.setText(displayLabel.getText()+"6");
				}
			}
		}
		if((e.getSource()==fiveButton))
		{
			if (isEqualButtonPressed)
			{
				equalButton.setBackground(null);
				equalButton.setForeground(null);
				
				aditionButton.setBackground(null);
				aditionButton.setForeground(null);
				
				subtractionButton.setBackground(null);
				subtractionButton.setForeground(null);
				
				multiplicationButton.setBackground(null);
				multiplicationButton.setForeground(null);
				
				divisionButton.setBackground(null);
				divisionButton.setForeground(null);
			}
			if(isOperatorClicked||isEqualButtonPressed)
			{
				if(isMinusButtonPressed&&oldValue==null)
				{
					displayLabel.setText("-5");
					isMinusButtonPressed=false;
				}
				else
				{
				displayLabel.setText("5");
				}
				isOperatorClicked=false;
				isEqualButtonPressed=false;
				
			}
			else
			{
				if(isMinusButtonPressed)
				{
					displayLabel.setText(displayLabel.getText()+"-5");
					isMinusButtonPressed=false;
				}
				else
				{
					displayLabel.setText(displayLabel.getText()+"5");
				}
			}
		}
		if(e.getSource()==fourButton)
		{
			if (isEqualButtonPressed)
			{
				equalButton.setBackground(null);
				equalButton.setForeground(null);
				
				aditionButton.setBackground(null);
				aditionButton.setForeground(null);
				
				subtractionButton.setBackground(null);
				subtractionButton.setForeground(null);
				
				multiplicationButton.setBackground(null);
				multiplicationButton.setForeground(null);
				
				divisionButton.setBackground(null);
				divisionButton.setForeground(null);
			}
			if(isOperatorClicked||isEqualButtonPressed)
			{
				if(isMinusButtonPressed&&oldValue==null)
				{
					displayLabel.setText("-4");
					isMinusButtonPressed=false;
				}
				else
				{
				displayLabel.setText("4");
				}
				isOperatorClicked=false;
				isEqualButtonPressed=false;
				
			}
			else
			{
				if(isMinusButtonPressed)
				{
					displayLabel.setText(displayLabel.getText()+"-4");
					isMinusButtonPressed=false;
				}
				else
				{
					displayLabel.setText(displayLabel.getText()+"4");
				}
			}
		}
		if(e.getSource()==threeButton)
		{
			if (isEqualButtonPressed)
			{
				equalButton.setBackground(null);
				equalButton.setForeground(null);
				
				aditionButton.setBackground(null);
				aditionButton.setForeground(null);
				
				subtractionButton.setBackground(null);
				subtractionButton.setForeground(null);
				
				multiplicationButton.setBackground(null);
				multiplicationButton.setForeground(null);
				
				divisionButton.setBackground(null);
				divisionButton.setForeground(null);
			}
			if(isOperatorClicked||isEqualButtonPressed)
			{
				if(isMinusButtonPressed&&oldValue==null)
				{
					displayLabel.setText("-3");
					isMinusButtonPressed=false;
				}
				else
				{
				displayLabel.setText("3");
				}
				isOperatorClicked=false;
				isEqualButtonPressed=false;
				
			}
		
			else
			{
				if(isMinusButtonPressed)
				{
					displayLabel.setText(displayLabel.getText()+"-3");
					isMinusButtonPressed=false;
				}
				else
				{
					displayLabel.setText(displayLabel.getText()+"3");
				}
			}
		}
		if((e.getSource()==twoButton))
		{
			if (isEqualButtonPressed)
			{
				equalButton.setBackground(null);
				equalButton.setForeground(null);
				
				aditionButton.setBackground(null);
				aditionButton.setForeground(null);
				
				subtractionButton.setBackground(null);
				subtractionButton.setForeground(null);
				
				multiplicationButton.setBackground(null);
				multiplicationButton.setForeground(null);
				
				divisionButton.setBackground(null);
				divisionButton.setForeground(null);
			}
			if(isOperatorClicked||isEqualButtonPressed)
			{
				if(isMinusButtonPressed&&oldValue=="")
				{
					displayLabel.setText("-2");
					isMinusButtonPressed=false;
				}
				else
				{
				displayLabel.setText("2");
				}
				isOperatorClicked=false;
				isEqualButtonPressed=false;
				
			}
			else
			{
				if(isMinusButtonPressed)
				{
					displayLabel.setText(displayLabel.getText()+"-2");
					isMinusButtonPressed=false;
				}
				else
				{
					displayLabel.setText(displayLabel.getText()+"2");
				}
			}
		}
		if(e.getSource()==oneButton)
		{
			if (isEqualButtonPressed)
			{
				equalButton.setBackground(null);
				equalButton.setForeground(null);
				
				aditionButton.setBackground(null);
				aditionButton.setForeground(null);
				
				subtractionButton.setBackground(null);
				subtractionButton.setForeground(null);
				
				multiplicationButton.setBackground(null);
				multiplicationButton.setForeground(null);
				
				divisionButton.setBackground(null);
				divisionButton.setForeground(null);
			}
			if(isOperatorClicked||isEqualButtonPressed)
			{
				if(isMinusButtonPressed&&oldValue=="")
				{ 
					
					displayLabel.setText("-1");
					isMinusButtonPressed=false;
				}
				else
				{
				displayLabel.setText("1");
				}
				isOperatorClicked=false;
				isEqualButtonPressed=false;
				
			}
			else
			{
				if(isMinusButtonPressed)
				{
					displayLabel.setText(displayLabel.getText()+"-1");
					isMinusButtonPressed=false;
				}
				else
				{
					displayLabel.setText(displayLabel.getText()+"1");
				}
			}
		}
		if(e.getSource()==zeroButton)
		{
			if (isEqualButtonPressed)
			{
				equalButton.setBackground(null);
				equalButton.setForeground(null);
				
				aditionButton.setBackground(null);
				aditionButton.setForeground(null);
				
				subtractionButton.setBackground(null);
				subtractionButton.setForeground(null);
				
				multiplicationButton.setBackground(null);
				multiplicationButton.setForeground(null);
				
				divisionButton.setBackground(null);
				divisionButton.setForeground(null);
			}
			if(isOperatorClicked||isEqualButtonPressed)
			{
				displayLabel.setText("0");
				isOperatorClicked=false;
				isEqualButtonPressed=false;
			}
			else
			{
			displayLabel.setText(displayLabel.getText()+"0");
		    }
			}
		if(e.getSource()==dotButton)
		{
			if (isEqualButtonPressed)
			{
				equalButton.setBackground(null);
				equalButton.setForeground(null);
				
				aditionButton.setBackground(null);
				aditionButton.setForeground(null);
				
				subtractionButton.setBackground(null);
				subtractionButton.setForeground(null);
				
				multiplicationButton.setBackground(null);
				multiplicationButton.setForeground(null);
				
				divisionButton.setBackground(null);
				divisionButton.setForeground(null);
			}
			if(isOperatorClicked||isEqualButtonPressed)
			{
				if(isMinusButtonPressed&&oldValue=="")
				{
					displayLabel.setText("-0.");
					isMinusButtonPressed=false;
				}
				else
				{
				displayLabel.setText(".");
				}
				isOperatorClicked=false;
				isEqualButtonPressed=false;
				
			}
		
			else
			{
				if(isMinusButtonPressed)
				{
					displayLabel.setText(displayLabel.getText()+"-0.");
					isMinusButtonPressed=false;
				}
				else
				{
					displayLabel.setText(displayLabel.getText()+".");
				}
			}
		}
		if(e.getSource()==clearButton)
		{
			equalButton.setBackground(null);
			equalButton.setForeground(null);
			
			aditionButton.setBackground(null);
			aditionButton.setForeground(null);
			
			subtractionButton.setBackground(null);
			subtractionButton.setForeground(null);
			
			multiplicationButton.setBackground(null);
			multiplicationButton.setForeground(null);
			
			divisionButton.setBackground(null);
			divisionButton.setForeground(null);
			
			displayLabel.setText("");
		}
		if(e.getSource()==aditionButton)
		{
			aditionButton.setBackground(Color.GRAY);
			aditionButton.setForeground(Color.white);
			
			subtractionButton.setBackground(null);
			subtractionButton.setForeground(null);
			
			multiplicationButton.setBackground(null);
			multiplicationButton.setForeground(null);
			
			divisionButton.setBackground(null);
			divisionButton.setForeground(null);
			
			isPlusButtonPressed=true;
			isMinusButtonPressed=false;
			isMultButtonPressed=false;
			isDivButtonPressed=false;
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		}
		if(e.getSource()==subtractionButton)
		{
			if (isEqualButtonPressed&&oldValue=="")
			{
				equalButton.setBackground(null);
				equalButton.setForeground(null);
				
				aditionButton.setBackground(null);
				aditionButton.setForeground(null);
				
				subtractionButton.setBackground(null);
				subtractionButton.setForeground(null);
				
				multiplicationButton.setBackground(null);
				multiplicationButton.setForeground(null);
				
				divisionButton.setBackground(null);
				divisionButton.setForeground(null);
			}
			subtractionButton.setBackground(Color.GRAY);
			subtractionButton.setForeground(Color.white);
			
			isPlusButtonPressed=false;
			isMinusButtonPressed=true;
			isMultButtonPressed=false;
			isDivButtonPressed=false;
			
			aditionButton.setBackground(null);
			aditionButton.setForeground(null);	
			
			multiplicationButton.setBackground(null);
			multiplicationButton.setForeground(null);
			
			divisionButton.setBackground(null);
			divisionButton.setForeground(null);
			
			isOperatorClicked=true;
			
			oldValue=displayLabel.getText();
			if(oldValue==""||isEqualButtonPressed)
			{
			displayLabel.setText("-");
			}
		
		}
		if(e.getSource()==multiplicationButton)
		{
			multiplicationButton.setBackground(Color.GRAY);
			multiplicationButton.setForeground(Color.white);
			
			aditionButton.setBackground(null);
			aditionButton.setForeground(null);	
			
			subtractionButton.setBackground(null);
			subtractionButton.setForeground(null);
			
			divisionButton.setBackground(null);
			divisionButton.setForeground(null);
			
			isPlusButtonPressed=false;
			isMinusButtonPressed=false;
			isMultButtonPressed=true;
			isDivButtonPressed=false;
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		}
		if(e.getSource()==divisionButton)
		{
			divisionButton.setBackground(Color.GRAY);
			divisionButton.setForeground(Color.white);
			

			aditionButton.setBackground(null);
			aditionButton.setForeground(null);	
			
			subtractionButton.setBackground(null);
			subtractionButton.setForeground(null);
			
			multiplicationButton.setBackground(null);
			multiplicationButton.setForeground(null);
			
			isPlusButtonPressed=false;
			isMinusButtonPressed=false;
			isMultButtonPressed=false;
			isDivButtonPressed=true;

			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		}
		
		if(e.getSource()==equalButton)
		{
		
			equalButton.setBackground(Color.GRAY);
			equalButton.setForeground(Color.white);
			
			aditionButton.setBackground(null);
			aditionButton.setForeground(null);	
			
			subtractionButton.setBackground(null);
			subtractionButton.setForeground(null);
			
			multiplicationButton.setBackground(null);
			multiplicationButton.setForeground(null);
			
			divisionButton.setBackground(null);
			divisionButton.setForeground(null);
			
			isEqualButtonPressed=true;
			String newValue = displayLabel.getText();
			float newValue1 = Float.parseFloat(newValue);	
			float oldValue1 = Float.parseFloat(oldValue);
			if(isPlusButtonPressed)
			{
			float result = newValue1+oldValue1;
			displayLabel.setText(result+"");
			isPlusButtonPressed=false;
			}
			if(isMinusButtonPressed)
			{
			float result = oldValue1-newValue1;
			displayLabel.setText(result+"");
			isMinusButtonPressed=false;
			}
			if(isMultButtonPressed)
			{
			float result = newValue1*oldValue1;
			displayLabel.setText(result+"");
			isMultButtonPressed=false;
			}
			if(isDivButtonPressed)
			{
			float result = oldValue1/newValue1;
			displayLabel.setText(result+"");
			isDivButtonPressed=false;
			}
			
			
			
		}
		
		
	}

}
