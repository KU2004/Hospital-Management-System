package Hospital;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class Appiontment extends JFrame implements ActionListener {

    int x = 80;
    int txtX = 250;
    int txtWidth = 200;
    int txtHeight = 40;

    Font font = new Font("Tahoma", Font.HANGING_BASELINE,24);
    Font fontTxt = new Font("Tahoma", Font.PLAIN,20);

    JRadioButton male, female;
    JDateChooser dob,doa ;
    JButton add,back;
    JComboBox bldGrp;
    JComboBox Dr1;
    JTextField name, address, aadhar, phoneNo,Time,Username,Password;
    Appiontment(){
        setSize(600,900);
        JLabel l1  = new JLabel("Username");
        l1.setBounds(x,5,150,35);
        l1.setForeground(Color.black);
        l1.setFont(font);
        add(l1);
        JLabel l2  = new JLabel("Password");
        l2.setBounds(x,50,150,40);
        l2.setForeground(Color.black);
        l2.setFont(font);
        add(l2);

        JLabel l3  = new JLabel("Name");
        l3.setBounds(x,100,150,40);
        l3.setForeground(Color.black);
        l3.setFont(font);
        add(l3);

        JLabel l4  = new JLabel("Aadhar");
        l4.setBounds(x,150,150,50);
        l4.setForeground(Color.black);
        l4.setFont(font);
        add(l4);

        JLabel l5  = new JLabel("D.O.B");
        l5.setBounds(x,200,150,40);
        l5.setForeground(Color.black);
        l5.setFont(font);
        add(l5);

        JLabel lm  = new JLabel("D.O.A");
        lm.setBounds(x,250,150,40);
        lm.setForeground(Color.black);
        lm.setFont(font);
        add(lm);

        JLabel lc  = new JLabel("TIME");
        lc.setBounds(x,300,150,40);
        lc.setForeground(Color.black);
        lc.setFont(font);
        add(lc);

        JLabel l6  = new JLabel("Gender");
        l6.setBounds(x,350,150,40);
        l6.setForeground(Color.black);
        l6.setFont(font);
        add(l6);

        JLabel l7  = new JLabel("Address");
        l7.setBounds(x,400,150,40);
        l7.setForeground(Color.black);
        l7.setFont(font);
        add(l7);

        JLabel l8  = new JLabel("Phone No");
        l8.setBounds(x,450,150,40);
        l8.setForeground(Color.black);
        l8.setFont(font);
        add(l8);

        JLabel lp  = new JLabel("Doctor List");
        lp.setBounds(x,500,150,50);
        lp.setForeground(Color.black);
        lp.setFont(font);
        add(lp);

        JLabel l9  = new JLabel("Blood Grp");
        l9.setBounds(x,550,150,40);
        l9.setForeground(Color.black);
        l9.setFont(font);
        add(l9);

        Username = new JTextField();
        Username.setBounds(txtX, 5,  txtWidth,txtHeight);
        Username.setFont(fontTxt);
        add(Username);

       Password= new JTextField();
        Password.setBounds(txtX, 50,  txtWidth,txtHeight);
        Password.setFont(fontTxt);
        add(Password);



        name = new JTextField();
        name.setBounds(txtX, 100,  txtWidth,txtHeight);
        name.setFont(fontTxt);
        add(name);

        aadhar = new JTextField();
        aadhar.setBounds(txtX, 150,  txtWidth,txtHeight);
        aadhar.setFont(fontTxt);
        add(aadhar);

        address = new JTextField();
        address.setBounds(txtX, 400,  txtWidth,txtHeight);
        address.setFont(fontTxt);
        add(address);

        phoneNo = new JTextField();
        phoneNo.setBounds(txtX, 450,  txtWidth,txtHeight);
        phoneNo.setFont(fontTxt);
        add(phoneNo);

        Time = new JTextField();
        Time.setBounds(txtX, 300,  txtWidth,txtHeight);
        Time.setFont(fontTxt);
        add(Time);

        //        dob calender

        dob = new JDateChooser();
        dob.setBounds(txtX, 200, txtWidth, txtHeight);
        dob.setFont(fontTxt);
        add(dob);
        // doa
        doa = new JDateChooser();
        doa.setBounds(txtX, 250, txtWidth, txtHeight);
        doa.setFont(fontTxt);
        add(doa);


        ButtonGroup btn = new ButtonGroup();


        male = new JRadioButton("Male");
        male.setBounds(txtX, 350, txtWidth/2, txtHeight);
        male.setFont(fontTxt);
        btn.add(male);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(txtX+120, 350, txtWidth/2, txtHeight);
        female.setFont(fontTxt);
        btn.add(female);
        add(female);

        String [] arr = {"Dr.Suresh", "Dr.Ramesh","Dr.Akash","Dr.Soham","Dr.Aditya","Dr.Rahul","Dr.Sahil","Dr.Omkar","Dr.Atharva","Dr.Divesh","Dr.Purva","Dr.Pooja","Dr.Seema","Dr.Nikhil","Dr.Nitin","Dr.Kunal","Dr.Pranay","Dr.Aniket","Dr.Sanket","Dr.Aqdas","Dr.Shivam","Dr.Raj"};
        Dr1= new JComboBox(arr);
        Dr1.setBounds(txtX,500, txtWidth,txtHeight );
        Dr1.setFont(fontTxt);
        add(Dr1);

        String [] arr1 = {"A+", "AB+","O+","O-","AB-","A-","B-","B+"};
        bldGrp = new JComboBox(arr1);
        bldGrp.setBounds(txtX,550, txtWidth,txtHeight );
        bldGrp.setFont(fontTxt);
        add(bldGrp);


        add = new JButton("Add Details");
        add.setBounds(120,650,170,90);
        add.setFont(font);
        add.addActionListener(this);
        add.setBackground(Color.yellow);
        add(add);

        back= new JButton("BACK");
        back.setBounds(330,650,170,90);
        back.setFont(font);
        back.addActionListener(this);
        back.setBackground(Color.yellow);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p3.jpg"));
        JLabel l99 = new JLabel(i1);
        l99.setBounds(0,0,600,900);
        add(l99);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==add){
            String name =  this.name.getText();
            String aadhar = this.aadhar.getText();
            String phoneNo = this.phoneNo.getText();
            String address = this.address.getText();
            String Username = this.Username.getText();
            String Password = this.Password.getText();
            String Time = this.Time.getText();

            String bldGrp = (String)this.bldGrp.getSelectedItem();
            String Dr1 = (String)this.Dr1.getSelectedItem();

            String gender = null;
            if(male.isSelected()){
                gender = "Male";
            }
            else if(female.isSelected()){
                gender = "Female";
            }

            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String dob = df.format(this.dob.getDate());
            System.out.println(dob);
            SimpleDateFormat de = new SimpleDateFormat("dd-MM-yyyy");
            String doa = df.format(this.doa.getDate());
            System.out.println(doa);

            conn1 c1 = new conn1();

            String query = "insert into appdetails (Username,Password,name,aadhar,dob,doa,Time,gender,address,phoneNo,Dr1,bldGrp) values('"+Username+"','"+Password+"','"+name+"','"+aadhar+"','"+dob+"','"+doa+"','"+Time+"','"+gender+"','"+address+"','"+phoneNo+"','"+Dr1+"','"+bldGrp+"');";

            try{
                c1.s1.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Data Added Successfully!");
                this.Username.setText(null);
                this.Password.setText(null);
                this.name.setText(null);
                this.aadhar.setText(null);
                this.Time.setText(null);
                this.address.setText(null);
                this.phoneNo.setText(null);
                this.male.setSelected(false);
                this.female.setSelected(false);

            }catch (Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Some error occured :(");
            }




        }
        if (ae.getSource() == back) {
            new Homepage();
            setVisible(false);


        }

    }


    public static void main(String[] args) {
        new Appiontment();
    }
}
