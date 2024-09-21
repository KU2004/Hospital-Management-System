package Hospital;


import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class patientpage extends JFrame implements ActionListener {
    JTabbedPane tabs;
    JScrollPane sp1, sp2,sp3;
    JTable AppDetails,Doctorlist,phar;
    JButton Back;


   patientpage(){
        setSize(1200,700);

        tabs = new JTabbedPane();
        tabs.setBounds(300,100,880,550);
        tabs.setFont(new Font("Times New Roman", Font.BOLD, 16));
        tabs.setBackground(Color.yellow);
        add(tabs);

        AppDetails = new JTable();
        AppDetails.setBackground(Color.cyan);
        Doctorlist = new JTable();
        Doctorlist.setBackground(Color.cyan);
        phar = new JTable();
        phar.setBackground(Color.cyan);


        sp1 = new JScrollPane();
        sp1.setViewportView(AppDetails);

        sp2 = new JScrollPane();
        sp2.setViewportView(Doctorlist);

       sp3 = new JScrollPane();
       sp3.setViewportView(phar);


        getDetails();

        tabs.addTab("APP DETAILS", sp1);
        tabs.addTab("DOCTOR LIST", sp2);
        tabs.addTab("PHARMACY", sp3);




        Back = new JButton("BACK");
        Back.setBounds(60,360,190,80);
        Back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Back.setBackground(Color.white);
        Back.addActionListener(this);
        add(Back);
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p25.jpeg"));
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
            conn3 c3 = new conn3();
            String query3 = "select DrName,DrSpecailization,DrQualification,DrTimeofArr,DrTimeofDep,DrRoom,DrAvability from dr ;";
            ResultSet rs3 = c3.s3.executeQuery(query3);
            Doctorlist.setModel(DbUtils.resultSetToTableModel(rs3));
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            conn6 c6 = new conn6();
            String query6 = "select MedicineName,DOM,DOE,Rupees,Avability from pharm ;";
            ResultSet rs6 = c6.s6.executeQuery(query6);
            phar.setModel(DbUtils.resultSetToTableModel(rs6));
        }catch (Exception e){
            System.out.println(e);
        }


    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Back) {
            new Homepage();
            setVisible(false);


        }

    }


    public static void main(String[] args) {
        new patientpage();
    }
}
