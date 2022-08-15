import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

   Boolean isOperatorClicked=false;
   int Operator;
   String oldValue;
   JFrame jf;
   JLabel displayLabel,displayLabelTwo;
   JButton SevenButton,EightButton,NineButton,Delbutton;
   JButton FourButton,FiveButton,SixButton,ModuButton;
   JButton OneButton,TwoButton,ThreeButton;
   JButton DotButton,ZeroButton,ClearButton;
   JButton DivButton,MultiButton,MinusButton,EqualButton,PlusButton;
   public Calculator(){
       jf=new JFrame("Calculator");
       jf.setLayout(null);
       jf.setSize(346, 527);
       jf.setLocation(900,100 );
       jf.getContentPane().setBackground(Color.white);

////////////////////////////////////////////////////////////////////////////

       displayLabel=new JLabel("");
       displayLabel.setBounds(3,50,325,65);
       displayLabel.setBackground(Color.GRAY) ;
       displayLabel.setOpaque(true);
       displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
       displayLabel.setForeground(Color.WHITE);
       displayLabel.setFont(new Font("Arial", Font.BOLD, 40));
       jf.add(displayLabel);

       displayLabelTwo=new JLabel("");
       displayLabelTwo.setBounds(3,100,325,60);
       displayLabelTwo.setBackground(Color.GRAY) ;
       displayLabelTwo.setOpaque(true);
       displayLabelTwo.setHorizontalAlignment(SwingConstants.RIGHT);
       displayLabelTwo.setForeground(Color.WHITE);
       displayLabelTwo.setFont(new Font("Arial", Font.PLAIN, 30));
       jf.add(displayLabelTwo);

////////////////////////////////////////////////////////////////////////////

       ///clear button
       ClearButton=new JButton("Clear");
       ClearButton.setBounds(3,249,120,47);
       ClearButton.addActionListener(this);
       ClearButton.setBackground(Color.orange);
       ClearButton.setFont(new Font("Arial", Font.BOLD, 25));
       jf.add(ClearButton);

       Delbutton=new JButton("Delete");
       Delbutton.setBounds(125,249,121,47);
       Delbutton.addActionListener(this);
       Delbutton.setFont(new Font("Arial", Font.BOLD, 25));
       jf.add(Delbutton);



       ModuButton=new JButton("%");
       ModuButton.setBounds(248,249,80,47);
       ModuButton.addActionListener(this);
       ModuButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(ModuButton);

       //first row
       SevenButton=new JButton("7");
       SevenButton.setBounds(3,297,80,47);
       SevenButton.addActionListener(this);
       SevenButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(SevenButton);

       EightButton=new JButton("8");
       EightButton.setBounds(85,297,80,47);
       EightButton.addActionListener(this);
       EightButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(EightButton);

       NineButton=new JButton("9");
       NineButton.setBounds(167,297,80,47);
       NineButton.addActionListener(this);
       NineButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(NineButton);

       DivButton=new JButton("/");
       DivButton.setBounds(248,297,80,47);
       DivButton.addActionListener(this);
       DivButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(DivButton);

       //second row
       FourButton=new JButton("4");
       FourButton.setBounds(3,345,80,47);
       FourButton.addActionListener(this);
       FourButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(FourButton);

       FiveButton=new JButton("5");
       FiveButton.setBounds(85,345,80,47);
       FiveButton.addActionListener(this);
       FiveButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(FiveButton);

       SixButton=new JButton("6");
       SixButton.setBounds(167,345,80,47);
       SixButton.addActionListener(this);
       SixButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(SixButton);

       MultiButton=new JButton("x");
       MultiButton.setBounds(248,345,80,47);
       MultiButton.addActionListener(this);
       MultiButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(MultiButton);

       //third row
       OneButton=new JButton("1");
       OneButton.setBounds(3,393,80,47);
       OneButton.addActionListener(this);
       OneButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(OneButton);

       TwoButton=new JButton("2");
       TwoButton.setBounds(85,393,80,47);
       TwoButton.addActionListener(this);
       TwoButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(TwoButton);

       ThreeButton=new JButton("3");
       ThreeButton.setBounds(167,393,80,47);
       ThreeButton.addActionListener(this);
       ThreeButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(ThreeButton);

       MinusButton=new JButton("-");
       MinusButton.setBounds(248,393,80,47);
       MinusButton.addActionListener(this);
       MinusButton.setFont(new Font("Arial", Font.BOLD, 40));
       jf.add(MinusButton);

       //fourth row
       DotButton=new JButton(".");
       DotButton.setBounds(3,441,80,47);
       DotButton.addActionListener(this);
       DotButton.setFont(new Font("Arial", Font.BOLD, 50));
       jf.add(DotButton);

       ZeroButton=new JButton("0");
       ZeroButton.setBounds(85,441,80,47);
       ZeroButton.addActionListener(this);
       ZeroButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(ZeroButton);

       EqualButton=new JButton("=");
       EqualButton.setBounds(248,441,80,47);
       EqualButton.addActionListener(this);
       EqualButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(EqualButton);

       PlusButton=new JButton("+");
       PlusButton.setBounds(167,441,80,47);
       PlusButton.addActionListener(this);
       PlusButton.setFont(new Font("Arial", Font.BOLD, 30));
       jf.add(PlusButton);

//////////////////////////////////////////////////////////////////////////

       //BUTTON COLOUR
       DivButton.setBackground(Color.orange);
       FourButton.setBackground(Color.orange);
       EightButton.setBackground(Color.orange);
       SixButton.setBackground(Color.orange);
       SevenButton.setBackground(Color.orange);
       ThreeButton.setBackground(Color.orange);
       EqualButton.setBackground(Color.RED);
       FiveButton.setBackground(Color.orange);
       DotButton.setBackground(Color.orange);
       TwoButton.setBackground(Color.orange);
       NineButton.setBackground(Color.orange);
       ZeroButton.setBackground(Color.orange);
       PlusButton.setBackground(Color.orange);
       OneButton.setBackground(Color.orange);
       ModuButton.setBackground(Color.orange);
       MinusButton.setBackground(Color.orange);
       MultiButton.setBackground(Color.orange);
       Delbutton.setBackground(Color.orange);
       ClearButton.setBackground(Color.orange);
       DivButton.setForeground(Color.WHITE);
       FourButton.setForeground(Color.WHITE);
       EightButton.setForeground(Color.WHITE);
       SixButton.setForeground(Color.WHITE);
       SevenButton.setForeground(Color.WHITE);
       ThreeButton.setForeground(Color.WHITE);
       EqualButton.setForeground(Color.WHITE);
       FiveButton.setForeground(Color.WHITE);
       DotButton.setForeground(Color.WHITE);
       TwoButton.setForeground(Color.WHITE);
       NineButton.setForeground(Color.WHITE);
       ZeroButton.setForeground(Color.WHITE);
       PlusButton.setForeground(Color.WHITE);
       OneButton.setForeground(Color.WHITE);
       ModuButton.setForeground(Color.WHITE);
       MinusButton.setForeground(Color.WHITE);
       MultiButton.setForeground(Color.WHITE);
       Delbutton.setForeground(Color.WHITE);
       ClearButton.setForeground(Color.WHITE);


//////////////////////////////////////////////////////////////////////////

       jf.setVisible(true);
       jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }

/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == SevenButton){
            if (isOperatorClicked) {
                displayLabel.setText("7");
                isOperatorClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText()+"7");
            }
        }else if (e.getSource() == EightButton) {
            if (isOperatorClicked) {
                displayLabel.setText("8");
                isOperatorClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText()+"8");
            }
        } else if (e.getSource() == NineButton) {
            if (isOperatorClicked) {
                displayLabel.setText("9");
                isOperatorClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }else if (e.getSource() == FourButton) {
            if (isOperatorClicked) {
                displayLabel.setText("4");
                isOperatorClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText()+"4");
            }
        } else if (e.getSource() == FiveButton) {
            if (isOperatorClicked) {
                displayLabel.setText("5");
                isOperatorClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText()+"5");
            }
        }else if (e.getSource() == SixButton) {
            if (isOperatorClicked) {
                displayLabel.setText("6");
                isOperatorClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText()+"6");
            }
        } else if (e.getSource() == OneButton) {
            if (isOperatorClicked) {
                displayLabel.setText("1");
                isOperatorClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }else if (e.getSource() == TwoButton) {
            if (isOperatorClicked) {
                displayLabel.setText("2");
                isOperatorClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText()+"2");
            }
        } else if (e.getSource() == ThreeButton) {
            if (isOperatorClicked) {
                displayLabel.setText("3");
                isOperatorClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }else if (e.getSource() == ZeroButton) {
            if (isOperatorClicked) {
                displayLabel.setText("0");
                isOperatorClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }else if (e.getSource() == DotButton) {
            if (isOperatorClicked) {
                displayLabel.setText(".");
                isOperatorClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText()+".");
            }
        }else if (e.getSource() == EqualButton) {

            String newValue=displayLabel.getText();
            float oldValueF=Float.parseFloat(oldValue);
            float NewValueF=Float.parseFloat(newValue);
            float Result;

            switch (Operator) {
                case 1 -> {
                    Result = oldValueF / NewValueF;
                    displayLabel.setText(Result + "");
                }
                case 2 -> {
                    Result = oldValueF * NewValueF;
                    displayLabel.setText(Result + "");
                }
                case 3 -> {
                    Result = oldValueF - NewValueF;
                    displayLabel.setText(Result + "");
                }
                case 4 -> {
                    Result = oldValueF + NewValueF;
                    displayLabel.setText(Result + "");
                }
                case 5 -> {
                    Result = oldValueF % NewValueF;
                    displayLabel.setText(Result + "");
                }

            }
        }else if (e.getSource() == DivButton ) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            Operator =1;
            displayLabelTwo.setText("/");
        }else if (e.getSource() == MultiButton ) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            Operator =2;
            displayLabelTwo.setText("x");
        }else if (e.getSource() == MinusButton) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            Operator =3;
            displayLabelTwo.setText("-");
        }else if (e.getSource() == PlusButton ) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            Operator =4;
            displayLabelTwo.setText("+");
        }else if (e.getSource() == ModuButton) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            Operator =5;
            displayLabelTwo.setText("%");
            //////////////////////////
        }else if (e.getSource() == ClearButton ) {
            displayLabel.setText(" ");
            displayLabelTwo.setText(" ");
        }else if (e.getSource() == Delbutton ) {
            String del=displayLabel.getText();
            displayLabel.setText("");
            for(int i=0;i<del.length()-1;i++)
                displayLabel.setText(displayLabel.getText()+del.charAt(i));
        }
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
