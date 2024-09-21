package Hospital;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class patientlogin extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField Username;
    JPasswordField Password;
    JButton login,Cancel;
    Font f1 =new Font("Times New Roman",Font.BOLD,22);

    patientlogin(){
        setSize(600,400);
        l1 = new JLabel("USERNAME");
        l1.setBounds(80,80,150,50);
        l1.setForeground(Color.white);
        l1.setFont(f1);
        add(l1);
        l2 = new JLabel("PASSWORD");
        l2.setBounds(80,160,170,50);
        l2.setForeground(Color.white);
        l2.setFont(f1);
        add(l2);
        Username = new JTextField();
        Username.setBounds(220,80,180,50);
        Username.setFont(f1);
        add(Username);
        Password = new JPasswordField();
        Password.setBounds(220,160,180,50);
        Password.setFont(f1);
        add(Password);
        login=new JButton("LOGIN");
        login.setBounds(100,260,120,50);
        login.setFont(f1);
        login.setBackground(Color.blue);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        Cancel =new JButton("CANCEL");
        Cancel.setBounds(280,260,170,50);
        Cancel.setFont(f1);
        Cancel.setForeground(Color.white);
        Cancel.setBackground(Color.RED);
        Cancel.addActionListener(this);
        add(Cancel);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p14.jpeg"));
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
            conn1 c1 = new conn1();
            try{
                String str = "select * from appdetails where Username = '"+Username+"' and Password ='"+Password+"';";
                ResultSet rs = c1.s1.executeQuery(str);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFUL!!");
                    new patientpage();
                }
                else{
                    JOptionPane.showMessageDialog(null,"INVALID LOGIN CREDENTIALS !!");
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

        if (af.getSource()==Cancel) {
            new Homepage();
            setVisible(false);


        }

    }

    public static void main(String[] args) {
        new patientlogin();
    }
}
