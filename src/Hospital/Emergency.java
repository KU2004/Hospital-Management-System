package Hospital;



import javax.swing.*;
import java.awt.*;

public class Emergency extends JFrame {
    Emergency(){
        setTitle("EMERGENCY");
        setResizable(false);
        JLabel l1 = new JLabel("SARASWATI HOSPITAL");
        l1.setBounds(80, 5, 800, 100);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 55));
        l1.setForeground(Color.black);
        add(l1);
        JLabel l2 = new JLabel("HOSPITAL AMBULANCE :+91 8923961946");
        l2.setBounds(40,50,800,80);
        l2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,22));
        l2.setForeground(Color.red);
        add(l2);
        JLabel l3 = new JLabel("HOSPITAL RECEP : +91 7342562178");
        l3.setBounds(40,100,800,80);
        l3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,22));
        l3.setForeground(Color.red);
        add(l3);
        JLabel L4 = new JLabel("HOSPIAL PHARMACY : +91 9307256784");
        L4.setBounds(40,150,800,80);
        L4.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,22));
        L4.setForeground(Color.black);
        add(L4);
        JLabel L5 = new JLabel("HOSPIAL DOCTOR : +91 7354282983");
        L5.setBounds(40,200,800,80);
        L5.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,22));
        L5.setForeground(Color.black);
        add(L5);
        JLabel L6 = new JLabel("POLICE : 100");
        L6.setBounds(40,230,800,80);
        L6.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,22));
        L6.setForeground(Color.blue);
        add(L6);
        JLabel L7 = new JLabel("FIRE : 181");
        L7.setBounds(40,270,800,80);
        L7.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,22));
        L7.setForeground(Color.blue);
        add(L7);
        JLabel L8 = new JLabel("THANK YOU!!!");
        L8.setBounds(140,550,800,80);
        L8.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,45));
        L8.setForeground(Color.blue);
        add(L8);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p19.jpeg"));
        JLabel l99 = new JLabel(i1);
        l99.setBounds(0,0,800,800);
        add(l99);

        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setUndecorated(true);

    }

    public static void main(String[] args) {
        new Emergency();
    }
}