import javax.swing.*;
import java.awt.*;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javabinary {
    private JPanel javabinary;
    private JTextField textField1;
    private JButton btnTwelve;
    private JButton btnNine;
    private JButton btnSix;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnTen;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnEleven;
    private JButton btnThirteen;
    private JRadioButton binary;
    private JRadioButton hexadecimal;
    private JButton btnEquals;
    private JButton hexandecimal;




    public javabinary() {


        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textField1.getText() + btnTwo.getText();
                textField1.setText(btnTwoText);

            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textField1.getText() + btnFour.getText();
                textField1.setText(btnFourText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textField1.getText() + btnSeven.getText();
                textField1.setText(btnSevenText);
            }
        });
        btnTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTenText = textField1.getText() + btnTen.getText();
                textField1.setText(btnTenText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textField1.getText() + btnTwo.getText();
                textField1.setText(btnNineText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textField1.getText() + btnSix.getText();
                textField1.setText(btnSixText);
            }
        });
        btnTwelve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwelveText = textField1.getText() + btnTwelve.getText();
                textField1.setText(btnTwelveText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textField1.getText() + btnFive.getText();
                textField1.setText(btnFiveText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textField1.getText() + btnEight.getText();
                textField1.setText(btnEightText);
            }
        });
        btnEleven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnElevenText = textField1.getText() + btnEleven.getText();
                textField1.setText(btnElevenText);
            }
        });
        btnThirteen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });


        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = textField1.getText();
                String result = "";


                int i = Integer.parseInt(s);
                while (i > 0) {

                    int x = i % 2;
                    String str = String.valueOf(x);
                    result = str + result;
                    i = i / 2;
                }

                textField1.setText(result);
            }
        });
        hexandecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = textField1.getText();
                String result = "";
                int i = Integer.parseInt(s);
                while (i > 0) {
                    char ch;
                    int x = i % 16;
                    if (x > 9) {
                        ch= (char)( x+55);
                        result=ch+result;

                    }
                    else  {
                        ch= (char)( x+48);
                        result=ch+result;

                    }
                    i=i/16;
                    textField1.setText(result);

                }
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = textField1.getText();
                String result ="";
                int k=s.length();
                if( k>1)
                result = s.substring(0,k-1);
                else
                    result="";
                textField1.setText(result);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Decimal_Converter");
        frame.setBackground(Color.decode("#070f1d"));
        frame.setSize(420, 600);
        frame.setContentPane(new javabinary().javabinary);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);




    }
}
