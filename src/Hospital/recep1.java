package Hospital;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class recep1 extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField username;
    JPasswordField password;
    JButton login,Cancel;
    Font f1 =new Font("Times New Roman",Font.BOLD,22);

    recep1(){
        setSize(600,400);
        l1 = new JLabel("USERNAME");
        l1.setBounds(80,80,150,50);
        l1.setFont(f1);
        l1.setForeground(Color.white);
        add(l1);
        l2 = new JLabel("PASSWORD");
        l2.setBounds(80,160,170,50);
        l2.setFont(f1);
        l2.setForeground(Color.white);
        add(l2);
        username = new JTextField();
        username.setBounds(220,80,180,50);
        username.setFont(f1);
        add(username);
        password = new JPasswordField();
        password.setBounds(220,160,180,50);
        password.setFont(f1);
        add(password);
        login=new JButton("LOGIN");
        login.setBounds(100,260,120,50);
        login.setFont(f1);
        login.setForeground(Color.white);
        login.setBackground(Color.blue);
        login.addActionListener(this);
        add(login);
        Cancel =new JButton("CANCEL");
        Cancel.setBounds(280,260,170,50);
        Cancel.addActionListener(this);
        Cancel.setBackground(Color.red);
        Cancel.setForeground(Color.white);
        Cancel.setFont(f1);
        add(Cancel);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p22.jpeg"));
        JLabel l99 = new JLabel(i1);
        l99.setBounds(0,0,600,400);
        add(l99);


        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent af){
        if(af.getSource()==login){
            String username = this.username.getText();
            String password = String.valueOf(this.password.getPassword());
            conn5 c5 = new conn5();
            try{
                String str1 = "select * from recp where Username = '"+username+"' and Password ='"+password+"';";
                ResultSet rs = c5.s5.executeQuery(str1);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFUL!!");
                    new receptionpage();
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
        new recep1();
    }
}