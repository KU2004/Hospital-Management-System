package Hospital;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class editadmin extends JFrame implements ActionListener {

    int labW = 150, labH = 50;
    int txtW = 160, txtH = 45;

    JLabel l1;
    JTextField Username;
    JButton display,update2,update3,update4,update1, Back,Back2,Back3,Back4;
    JTabbedPane tabs;
    JPanel p1, p2,p3,p4;
    JScrollPane sp1 ,sp2,sp3,sp4;
    JTable AppDetails,DoctorDetails,RecpDetails,AdminDetails;
    JTextField name,aadhar,Time,gender,address,phoneNo,Dr1,bldGrp,Username1,Username2,Username3,pass1,pass2,pass3 ;


    Font f1 = new Font("Times New Roman", Font.HANGING_BASELINE, 20);
    Font f2 = new Font("Times New Roman", Font.HANGING_BASELINE, 24);

    editadmin(){
        setSize(750,800);

        l1 = new JLabel("Enter Username");
        l1.setBounds(40,20,350,50);
        l1.setFont( new Font("Times New Roman", Font.BOLD, 27));
        l1.setForeground(Color.white);
        add(l1);

        Username = new JTextField();
        Username.setBounds(250,20,180,50);
        Username.setFont(f1);
        add(Username);

        display = new JButton("Display");
        display.setBounds(450, 20, 150,50);
        display.addActionListener(this);
        display.setBackground(Color.white);
        display.setFont(f1);
        add(display);

        tabs = new JTabbedPane();
        tabs.setBounds(5,100,725,660);
        tabs.setBackground(Color.yellow);
        tabs.setFont(f2);
        add(tabs);

        p1 = new JPanel();
        p1.setLayout(null);

        p2 = new JPanel();
        p2.setLayout(null);

        p3 = new JPanel();
        p3.setLayout(null);

        p4 = new JPanel();
        p4.setLayout(null);

        tabs.addTab("AppDetails", p1);
        tabs.addTab("DoctorDetails", p2);
        tabs.addTab("RecpDetails", p3);
        tabs.addTab("AdminDetails", p4);


        AppDetails = new JTable();
        AppDetails.setFont(new Font("Times New Roman", Font.BOLD, 15));
        AppDetails.setRowHeight(30);
        DoctorDetails = new JTable();
        DoctorDetails.setFont(new Font("Times New Roman", Font.BOLD, 15));
        DoctorDetails.setRowHeight(30);
        RecpDetails = new JTable();
        RecpDetails.setFont(new Font("Times New Roman", Font.BOLD, 15));
        RecpDetails.setRowHeight(30);
        AdminDetails = new JTable();
        AdminDetails.setFont(new Font("Times New Roman", Font.BOLD, 15));
        AdminDetails.setRowHeight(30);

        JTableHeader tb1 = AppDetails.getTableHeader();
        tb1.setFont(f1);

        JTableHeader tb2 = DoctorDetails.getTableHeader();
        tb2.setFont(f1);
        JTableHeader tb3 = RecpDetails.getTableHeader();
        tb2.setFont(f1);
        JTableHeader tb4 = AdminDetails.getTableHeader();
        tb2.setFont(f1);

        sp1 = new JScrollPane();
        sp1.setBounds(30,40,670,80);
        p1.add(sp1);

        sp2 = new JScrollPane();
        sp2.setBounds(30,40,670,80);
        p2.add(sp2);
        sp3 = new JScrollPane();
        sp3.setBounds(30,40,670,80);
        p3.add(sp3);
        sp4 = new JScrollPane();
        sp4.setBounds(30,40,670,80);
        p4.add(sp4);

        sp1.setViewportView(AppDetails);
        sp2.setViewportView(DoctorDetails);
        sp3.setViewportView(RecpDetails);
        sp4.setViewportView(AdminDetails);

        JLabel l1 = new JLabel("NAME");
        l1.setBounds(50,130,labW,labH);
        l1.setFont(f1);
        p1.add(l1);

        name = new JTextField();
        name.setBounds(300,130,txtW,txtH);
        name.setFont(f1);
        p1.add(name);

        JLabel l2 = new JLabel("AADHAR");
        l2.setBounds(50,190,labW,labH);
        l2.setFont(f1);
        p1.add(l2);

        aadhar = new JTextField();
        aadhar.setBounds(300,190,txtW, txtH);
        aadhar.setFont(f1);
        p1.add(aadhar);

        JLabel l3 = new JLabel("TIME");
        l3.setBounds(50,250,labW,labH);
        l3.setFont(f1);
        p1.add(l3);

        Time = new JTextField();
        Time.setBounds(300,250,txtW, txtH);
        Time.setFont(f1);
        p1.add(Time);

        JLabel l4 = new JLabel("GENDER");
        l4.setBounds(50,300,labW,labH);
        l4.setFont(f1);
        p1.add(l4);

        gender = new JTextField();
        gender.setBounds(300,300,txtW, txtH);
        gender.setFont(f1);
        p1.add(gender);

        JLabel l5 = new JLabel("ADDRESS");
        l5.setBounds(50,350,labW,labH);
        l5.setFont(f1);
        p1.add(l5);

        address = new JTextField();
        address.setBounds(300,350,txtW, txtH);
        address.setFont(f1);
        p1.add(address);

        JLabel l6 = new JLabel("PHONE NO.");
        l6.setBounds(50,400,labW,labH);
        l6.setFont(f1);
        p1.add(l6);
        phoneNo = new JTextField();
        phoneNo.setBounds(300,400,txtW, txtH);
        phoneNo.setFont(f1);
        p1.add(phoneNo);

        JLabel l7 = new JLabel("DOCTORS");
        l7.setBounds(50,450,labW,labH);
        l7.setFont(f1);
        p1.add(l7);

        Dr1 = new JTextField();
        Dr1.setBounds(300,450,txtW, txtH);
        Dr1.setFont(f1);
        p1.add(Dr1);

        JLabel l8 = new JLabel("BLDGRP");
        l8.setBounds(50,500,labW,labH);
        l8.setFont(f1);
        p1.add(l8);

        bldGrp = new JTextField();
        bldGrp.setBounds(300,500,txtW, txtH);
        bldGrp.setFont(f1);
        p1.add(bldGrp);

        JLabel lp = new JLabel(" USERNAME ");
        lp.setBounds(50,130,labW,labH);
        lp.setFont(f1);
        p2.add(lp);

        Username1 = new JTextField();
        Username1.setBounds(300,130,txtW,txtH);
        Username1.setFont(f1);
        p2.add(Username1);

        JLabel lm = new JLabel("PASSWORD");
        lm.setBounds(50,190,labW,labH);
        lm.setFont(f1);
        p2.add(lm);

        pass1= new JTextField();
        pass1.setBounds(300,190,txtW,txtH);
        pass1.setFont(f1);
        p2.add(pass1);

        JLabel ln = new JLabel(" USERNAME ");
        ln.setBounds(50,130,labW,labH);
        ln.setFont(f1);
        p3.add(ln);

        Username2 = new JTextField();
        Username2.setBounds(300,130,txtW,txtH);
        Username2.setFont(f1);
        p3.add(Username2);

        JLabel lb = new JLabel("PASSWORD");
        lb.setBounds(50,190,labW,labH);
        lb.setFont(f1);
        p3.add(lb);

        pass2= new JTextField();
        pass2.setBounds(300,190,txtW,txtH);
        pass2.setFont(f1);
        p3.add(pass2);

        JLabel ld = new JLabel(" USERNAME ");
        ld.setBounds(50,130,labW,labH);
        ld.setFont(f1);
        p4.add(ld);

        Username3 = new JTextField();
        Username3.setBounds(300,130,txtW,txtH);
        Username3.setFont(f1);
        p4.add(Username3);

        JLabel lc = new JLabel("PASSWORD");
        lc.setBounds(50,190,labW,labH);
        lc.setFont(f1);
        p4.add(lc);

        pass3= new JTextField();
        pass3.setBounds(300,190,txtW,txtH);
        pass3.setFont(f1);
        p4.add(pass3);

        update1 = new JButton("ADD");
        update1.setBounds(200,555,150,50);
        update1.setFont(f1);
        update1.addActionListener(this);
        p1.add(update1);
        update2 = new JButton("ADD");
        update2.setBounds(200,555,150,50);
        update2.setFont(f1);
        update2.addActionListener(this);
        p2.add(update2);
        update3 = new JButton("ADD");
        update3.setBounds(200,555,150,50);
        update3.setFont(f1);
        update3.addActionListener(this);
        p3.add(update3);
        update4 = new JButton("ADD");
        update4.setBounds(200,555,150,50);
        update4.setFont(f1);
        update4.addActionListener(this);
        p4.add(update4);
        Back = new JButton("BACK");
        Back.setBounds(400,555,150,50);
        Back.setFont(f1);
        Back.addActionListener(this);
        p1.add(Back);
        Back2 = new JButton("BACK");
        Back2.setBounds(400,555,150,50);
        Back2.setFont(f1);
        Back2.addActionListener(this);
        p2.add(Back2);
        Back3 = new JButton("BACK");
        Back3.setBounds(400,555,150,50);
        Back3.setFont(f1);
        Back3.addActionListener(this);
        p3.add(Back3);
        Back4 = new JButton("BACK");
        Back4.setBounds(400,555,150,50);
        Back4.setFont(f1);
        Back4.addActionListener(this);
        p4.add(Back4);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p21.jpeg"));
        JLabel l99 = new JLabel(i1);
        l99.setBounds(0,0,750,800);
        add(l99);







        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == display) {
            String Username = this.Username.getText();
            try {
                conn1 c1 = new conn1();
                String query1 = "select name,aadhar,Time,gender,address,phoneNo,Dr1,bldGrp from appdetails where Username= '" + Username + "';";
                ResultSet rs1 = c1.s1.executeQuery(query1);
                AppDetails.setModel(DbUtils.resultSetToTableModel(rs1));

            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                String Username1 = this.Username1.getText();

                conn2 c2 = new conn2();
                String query2 = "select Username,Password from doctor  where Username= '" + Username1 + "';";
                ResultSet rs2 = c2.s2.executeQuery(query2);
                DoctorDetails.setModel(DbUtils.resultSetToTableModel(rs2));

            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                String Username2 = this.Username2.getText();

                conn5 c5 = new conn5();
                String query5 = "select Username,Password from recp  where Username= '" + Username2 + "';";
                ResultSet rs5 = c5.s5.executeQuery(query5);
                RecpDetails.setModel(DbUtils.resultSetToTableModel(rs5));

            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                String Username3 = this.Username3.getText();

                conn c = new conn();
                String query5 = "select Username,Password from adminlogin where Username= '" + Username3 + "';";
                ResultSet rs5 = c.s.executeQuery(query5);
                AdminDetails.setModel(DbUtils.resultSetToTableModel(rs5));

            } catch (Exception e) {
                System.out.println(e);
            }

        }


        if(ae.getSource()==update1){
            try{
            String  Username =  this.Username .getText();

            String name = this.name.getText();
            String aadhar = this.aadhar.getText();
            String Time = this.Time.getText();
            String gender = this.gender.getText();
            String address = this.address.getText();
            String phoneNo = this.phoneNo.getText();
            String Dr1 = this.Dr1.getText();
            String bldGrp = this.bldGrp.getText();


            conn1 c1 = new conn1();
            String query = "update appDetails set name = '"+name+"', aadhar = '"+aadhar+"', Time = '"+Time+"' ,gender = '"+gender+"', address= '"+address+"', phoneNo = '"+phoneNo+"' ,Dr1 = '"+Dr1+"' ,bldgrp = '"+bldGrp+"' where Username = '"+Username+"';";
            c1.s1.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"APP DETAILS Data updated successfully!");
            }catch (Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Some error occured :(");
            }
        }

        if(ae.getSource()==update2){
            try{
                String  Username12 =  this.Username1 .getText();

                String Username1 = this.Username1.getText();
                String password = this.pass1.getText();
                conn2 c2 = new conn2();
                String query3 = "update doctor set  Username = '"+Username1+"', Password = '"+password+"' where Username = '"+Username12+"';";
                c2.s2.executeUpdate(query3);
                JOptionPane.showMessageDialog(null,"DOCTOR DETAILS Data updated successfully!");
            }catch (Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Some error occured :(");
            }
        }
        if(ae.getSource()==update3){
            try{
                String  Username13 =  this.Username2 .getText();

                String Username2 = this.Username2.getText();
                String password1 = this.pass2.getText();
                conn5 c5 = new conn5();
                String query3 = "update recp set  Username = '"+Username2+"', Password = '"+password1+"' where Username = '"+Username13+"';";
                c5.s5.executeUpdate(query3);
                JOptionPane.showMessageDialog(null,"RECP DETAILS Data updated successfully!");
            }catch (Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Some error occured :(");
            }
        }
        if(ae.getSource()==update4){
            try{
                String  Username14 =  this.Username3 .getText();

                String Username4 = this.Username3.getText();
                String password2 = this.pass3.getText();
                conn c = new conn();
                String query3 = "update adminlogin set  Username = '"+Username4+"', Password = '"+password2+"' where Username = '"+Username14+"';";
                c.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null,"RECP DETAILS Data updated successfully!");
            }catch (Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Some error occured :(");
            }
        }
        if (ae.getSource() == Back) {
            new adminpage();
            setVisible(false);


        }
        if (ae.getSource() == Back2) {
            new adminpage();
            setVisible(false);


        }
        if (ae.getSource() == Back3) {
            new adminpage();
            setVisible(false);


        }
        if (ae.getSource() == Back4) {
            new adminpage();
            setVisible(false);


        }



        }



    public static void main(String[] args) {
        new editadmin();
    }
}
