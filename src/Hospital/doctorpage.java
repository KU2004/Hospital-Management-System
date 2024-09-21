package Hospital;


import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class doctorpage extends JFrame implements ActionListener {
    JTabbedPane tabs;
    JScrollPane sp1, sp2,sp3,sp4;
    JTable AppDetails,DoctorDetails,RecpDetails,doctorlist;
    JButton addData,Back;


    doctorpage(){
        setSize(1200,700);

        tabs = new JTabbedPane();
        tabs.setBounds(300,100,880,550);
        tabs.setFont(new Font("Times New Roman", Font.BOLD, 16));
        tabs.setBackground(Color.yellow);
        add(tabs);

        AppDetails = new JTable();
        AppDetails.setBackground(Color.cyan);
        DoctorDetails= new JTable();
        DoctorDetails.setBackground(Color.cyan);
        RecpDetails = new JTable();
        RecpDetails.setBackground(Color.cyan);
        doctorlist = new JTable();
        doctorlist.setBackground(Color.cyan);

        sp1 = new JScrollPane();
        sp1.setViewportView(AppDetails);

        sp2 = new JScrollPane();
        sp2.setViewportView(DoctorDetails);
        sp3 = new JScrollPane();
        sp3.setViewportView(doctorlist);


        sp4 = new JScrollPane();
        sp4.setViewportView(RecpDetails);

        getDetails();

        tabs.addTab("APP DETAILS", sp1);
        tabs.addTab("DOCTOR DETAILS", sp2);
        tabs.addTab("DOCTOR LIST", sp3);
        tabs.addTab("RECP DETAILS", sp4);

        addData = new JButton("Add/Update");
        addData.setBounds(60,120,190,80);
        addData.setFont(new Font("Times New Roman", Font.BOLD, 20));
        addData.addActionListener(this);
        addData.setBackground(Color.white);
        add(addData);

        Back = new JButton("BACK");
        Back.setBounds(60,360,190,80);
        Back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Back.setBackground(Color.white);
        Back.addActionListener(this);
        add(Back);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p15.jpeg"));
        JLabel l99 = new JLabel(i1);
        l99.setBounds(0,0,1200,700);
        add(l99);





        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void getDetails(){

        try{
            conn1 c1 = new conn1();
            String query2 = "select Username,name,aadhar,dob,doa,Time,gender,address,phoneNo,Dr1,bldGrp from appdetails ;";
            ResultSet rs2 = c1.s1.executeQuery(query2);
            AppDetails.setModel(DbUtils.resultSetToTableModel(rs2));
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            conn5 c5 = new conn5();
            String query3 = "select Username,Password from recp ;";
            ResultSet rs3 = c5.s5.executeQuery(query3);
            RecpDetails.setModel(DbUtils.resultSetToTableModel(rs3));
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            conn2 c2 = new conn2();
            String query4 = "select Username,Password from doctor ;";
            ResultSet rs4 = c2.s2.executeQuery(query4);
            DoctorDetails.setModel(DbUtils.resultSetToTableModel(rs4));
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            conn3 c3 = new conn3();
            String query3 = "select DrName,DrSpecailization,DrQualification,DrTimeofArr,DrTimeofDep,DrRoom,DrAvability from dr ;";
            ResultSet rs3 = c3.s3.executeQuery(query3);
            doctorlist.setModel(DbUtils.resultSetToTableModel(rs3));
        }catch (Exception e){
            System.out.println(e);
        }


    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Back) {
            new Homepage();
            setVisible(false);


        }
        if (ae.getSource() == addData) {
            new editreception();
            setVisible(false);


        }
    }


    public static void main(String[] args) {
        new doctorpage();
    }
}
