package Hospital;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener {
    JButton HomePage1,AboutUs,Emergency;


    Login() {
        JLabel l1 = new JLabel("SARASWATI HOSPITAL");
        l1.setBounds(110, 200, 1000, 180);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 73));
        l1.setForeground(Color.black);
        add(l1);
        HomePage1 = new JButton("HOME PAGE");
        HomePage1.setBounds(380, 350, 220, 70);
        HomePage1.setFont(new Font("Times New Roman", Font.BOLD, 28));
        HomePage1.setForeground(Color.BLACK);
        HomePage1.setBackground(Color.pink);
        HomePage1.addActionListener(this);
        add(HomePage1);
        AboutUs = new JButton("ABOUT US");
        AboutUs.setBounds(380, 425, 220, 70);
        AboutUs.setFont(new Font("Times New Roman", Font.BOLD, 28));
        AboutUs.setBackground(Color.YELLOW);
        AboutUs.setForeground(Color.black);
        AboutUs.addActionListener(this);
        add(AboutUs);
        Emergency = new JButton("EMERGENCY");
        Emergency.setBounds(380, 500, 220, 70);
        Emergency.setFont(new Font("Times New Roman", Font.BOLD, 28));
        Emergency.setBackground(Color.RED);
        Emergency.setForeground(Color.white);
        Emergency.addActionListener(this);
        add(Emergency);
        setSize(1000, 700);
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("images/p26.png"));
        JLabel l98 = new JLabel(i2);
        l98.setBounds(210,-1,600,300);
        add(l98);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p27.jpg"));
        JLabel l99 = new JLabel(i1);
        l99.setBounds(0,0,1000,700);
        add(l99);

        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource()== HomePage1) {
            new Homepage();
            setVisible(false);


        }

        if (ae.getSource()== AboutUs) {
            new AboutUs();
            setVisible(false);


        }
        if (ae.getSource()== Emergency) {
            new Emergency();
            setVisible(false);


        }


    }


    public static void main(String[] args) {


new Login();
    }


}