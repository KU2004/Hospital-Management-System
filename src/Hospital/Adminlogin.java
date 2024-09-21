package Hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Adminlogin extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField Username;
    JPasswordField Password;
    JButton login,Cancel;
    Font f1 =new Font("Times New Roman",Font.BOLD,22);

    Adminlogin() {
        setSize(600,400);
        l1 = new JLabel("USERNAME");
        l1.setBounds(80,80,150,50);
        l1.setForeground(Color.WHITE);
        l1.setFont(f1);
        add(l1);
        l2 = new JLabel("PASSWORD");
        l2.setBounds(80,160,170,50);
        l2.setForeground(Color.white);
        l2.setFont(f1);
        add(l2);
        Username = new JTextField();
        Username.setBounds(250,80,180,50);
        Username.setFont(f1);
        add(Username);
        Password = new JPasswordField();
        Password.setBounds(250,160,180,50);
        Password.setFont(f1);
        add(Password);
        login=new JButton("LOGIN");
        login.setBounds(100,260,120,50);
        login.setFont(f1);
        login.setBackground(Color.BLUE);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        Cancel =new JButton("CANCEL");
        Cancel.setBounds(280,260,150,50);
        Cancel.setFont(f1);
        Cancel.setBackground(Color.RED);
        Cancel.setForeground(Color.WHITE);
        Cancel.addActionListener(this);
        add(Cancel);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p23.jpeg"));
        JLabel l99 = new JLabel(i1);
        l99.setBounds(0,0,600,400);
        add(l99);


        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent af){
        if(af.getSource()==login){
            String Username = this.Username.getText();
            String Password = String.valueOf(this.Password.getPassword());
            conn c = new conn();
            try{
                String str1 = "select * from adminlogin where Username = '"+Username+"' and Password ='"+Password+"';";
                ResultSet rs = c.s.executeQuery(str1);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFUL!!");
                    new adminpage();
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"INVALID LOGIN CREDENTIALS !!");

                }

            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        if (af.getSource() ==Cancel) {
            new Homepage();
            setVisible(false);


        }
    }

    public static void main(String[] args) {
        new Adminlogin();
    }
}
