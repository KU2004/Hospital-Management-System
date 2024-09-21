package Hospital;

import javax.swing.*;
import java.awt.*;

public class AboutUs extends JFrame {
    AboutUs(){
        setTitle("ABOUT US");
        setResizable(false);
        JLabel l1 = new JLabel("SARASWATI HOSPITAL");
        l1.setBounds(100, 95, 800, 100);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 55));
        add(l1);
        JLabel l2 = new JLabel("THE HOSPITAL WAS ESTASBISHED BY MR.PURANSINGH RAWAT in 1969.");
        l2.setBounds(40,200,800,80);
        l2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
        add(l2);
        JLabel l3 = new JLabel("HE WAS A GREAT DOCTOR IN HIS ERA.");
        l3.setBounds(40,240,800,80);
        l3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
        add(l3);
        JLabel L4 = new JLabel("HE HELPED MANY POOR PEOPLE AND SAVED LIFES OF MANY PEOPLE");
        L4.setBounds(40,280,800,80);
        L4.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
        add(L4);
        JLabel L5 = new JLabel("THE HOSPIAL WILL BE EAGER TO HELP POOR AND HELPLESS PEOPLE");
        L5.setBounds(40,320,800,80);
        L5.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
        add(L5);
        JLabel L6 = new JLabel("BECAUSE WE THINK THIS OUR RESPONSEBILITY AND TO TAKE SIR'S IDEAS FORWARD");
        L6.setBounds(40,360,800,80);
        L6.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,16));
        add(L6);
        JLabel L7 = new JLabel("ADDRESS:BLD 2,MAHATMA PHULE ROAD,LOKMANYA TILAK NAGAR,KALYAN(WEST)");
        L7.setBounds(40,400,800,80);
        L7.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,16));
        add(L7);
        JLabel L8 = new JLabel("THANK YOU!!!");
        L8.setBounds(140,440,800,80);
        L8.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,45));
        add(L8);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p18.jpeg"));
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
        new AboutUs();
    }
}