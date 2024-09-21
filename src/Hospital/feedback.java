package Hospital;



import javax.swing.*;
import java.awt.*;

public class feedback extends JFrame {
    feedback(){
        setTitle("FEEDBACK");
        setResizable(false);
        JLabel l1 = new JLabel("SARASWATI HOSPITAL");
        l1.setBounds(80, 5, 800, 100);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 55));
        l1.setForeground(Color.black);
        add(l1);
        JLabel l2 = new JLabel("FOR ANY FEEDBACK:");
        l2.setBounds(40,80,800,80);
        l2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,22));
        l2.setForeground(Color.black);
        add(l2);
        JLabel l3 = new JLabel("https://docs.google.com/forms/d/e/1FAIpQLSdws0-_rpXvqLKMeeL3uyuaI26m");
        l3.setBounds(40,100,800,80);
        l3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
        l3.setForeground(Color.black);
        add(l3);
        JLabel L8 = new JLabel("THANK YOU");
        L8.setBounds(140,150,800,80);
        L8.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,45));
        L8.setForeground(Color.black);
        add(L8);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p20.jpeg"));
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
        new feedback();
    }
}