package Hospital;

import net.proteanit.sql.DbUtils;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class editreception extends JFrame implements ActionListener {

    int labW = 150, labH = 50;
    int txtW = 200, txtH = 45;

    JLabel l1;
    JTextField Username;
    JButton display, update1, update2, Back, Back1, update3, update4, Back2, Back3,display2;
    JTabbedPane tabs;
    JPanel p1, p2, p3, p4;
    JScrollPane sp1, sp2, sp3, sp4;
    JTable AppDetails, DoctorDetails, RecpDetails, Doctorlist;


    JTextField name, aadhar, Time, gender, address, phoneNo, Dr1, bldGrp, DrName, DrSpecailization, DrQualification, DrTimeofArr, DrTimeofDep, DrRoom, DrAvability, Username2, pass2, Username1, pass1;


    Font f1 = new Font("Times New Roman", Font.HANGING_BASELINE, 20);
    Font f2 = new Font("Times New Roman", Font.HANGING_BASELINE, 24);


    editreception() {
        setSize(750, 800);

        l1 = new JLabel("Enter Username");
        l1.setBounds(60, 20, 150, 50);
        l1.setFont(new Font("Times New Roman", Font.HANGING_BASELINE, 22));
        add(l1);

        Username = new JTextField();
        Username.setBounds(270, 20, 150, 50);
        Username.setFont(f1);
        add(Username);

        display = new JButton("Display");
        display.setBounds(440, 20, 150, 50);
        display.addActionListener(this);
        display.setBackground(Color.white);
        display.setFont(f1);
        add(display);

        tabs = new JTabbedPane();
        tabs.setBounds(5, 100, 725, 660);
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
        tabs.addTab("Doctorlist", p4);


        AppDetails = new JTable();
        AppDetails.setFont(new Font("Times New Roman", Font.HANGING_BASELINE, 15));
        AppDetails.setBackground(Color.yellow);
        AppDetails.setRowHeight(30);
        DoctorDetails = new JTable();
        DoctorDetails.setBackground(Color.yellow);
        DoctorDetails.setFont(new Font("Times New Roman", Font.HANGING_BASELINE, 15));
        DoctorDetails.setRowHeight(30);
        RecpDetails = new JTable();
        RecpDetails.setBackground(Color.yellow);
        RecpDetails.setFont(new Font("Times New Roman", Font.HANGING_BASELINE, 15));
        RecpDetails.setRowHeight(30);
        Doctorlist = new JTable();
        Doctorlist.setBackground(Color.yellow);
        Doctorlist.setFont(new Font("Times New Roman", Font.HANGING_BASELINE, 15));
        Doctorlist.setRowHeight(30);


        JTableHeader tb1 = AppDetails.getTableHeader();
        tb1.setFont(f1);

        JTableHeader tb2 = DoctorDetails.getTableHeader();
        tb2.setFont(f1);
        JTableHeader tb3 = RecpDetails.getTableHeader();
        tb3.setFont(f1);
        JTableHeader tb4 = Doctorlist.getTableHeader();
        tb4.setFont(f1);


        sp1 = new JScrollPane();
        sp1.setBounds(30, 40, 670, 80);
        p1.add(sp1);

        sp2 = new JScrollPane();
        sp2.setBounds(30, 40, 670, 80);
        p2.add(sp2);
        sp3 = new JScrollPane();
        sp3.setBounds(30, 40, 670, 80);
        p3.add(sp3);
        sp4 = new JScrollPane();
        sp4.setBounds(30, 40, 670, 80);
        p4.add(sp4);


        sp1.setViewportView(AppDetails);
        sp2.setViewportView(DoctorDetails);
        sp3.setViewportView(RecpDetails);
        sp4.setViewportView(Doctorlist);


        JLabel l1 = new JLabel("NAME");
        l1.setBounds(50, 130, labW, labH);
        l1.setFont(f1);
        p1.add(l1);

        name = new JTextField();
        name.setBounds(300, 130, txtW, txtH);
        name.setFont(f1);
        p1.add(name);

        JLabel l2 = new JLabel("AADHAR");
        l2.setBounds(50, 190, labW, labH);
        l2.setFont(f1);
        p1.add(l2);

        aadhar = new JTextField();
        aadhar.setBounds(300, 190, txtW, txtH);
        aadhar.setFont(f1);
        p1.add(aadhar);

        JLabel l3 = new JLabel("TIME");
        l3.setBounds(50, 250, labW, labH);
        l3.setFont(f1);
        p1.add(l3);

        Time = new JTextField();
        Time.setBounds(300, 250, txtW, txtH);
        Time.setFont(f1);
        p1.add(Time);

        JLabel l4 = new JLabel("GENDER");
        l4.setBounds(50, 300, labW, labH);
        l4.setFont(f1);
        p1.add(l4);

        gender = new JTextField();
        gender.setBounds(300, 300, txtW, txtH);
        gender.setFont(f1);
        p1.add(gender);

        JLabel l5 = new JLabel("ADDRESS");
        l5.setBounds(50, 350, labW, labH);
        l5.setFont(f1);
        p1.add(l5);

        address = new JTextField();
        address.setBounds(300, 350, txtW, txtH);
        address.setFont(f1);
        p1.add(address);

        JLabel l6 = new JLabel("PHONE NO.");
        l6.setBounds(50, 400, labW, labH);
        l6.setFont(f1);
        p1.add(l6);
        phoneNo = new JTextField();
        phoneNo.setBounds(300, 400, txtW, txtH);
        phoneNo.setFont(f1);
        p1.add(phoneNo);

        JLabel l7 = new JLabel("DOCTORS");
        l7.setBounds(50, 450, labW, labH);
        l7.setFont(f1);
        p1.add(l7);

        Dr1 = new JTextField();
        Dr1.setBounds(300, 450, txtW, txtH);
        Dr1.setFont(f1);
        p1.add(Dr1);

        JLabel l8 = new JLabel("BLDGRP");
        l8.setBounds(50, 500, labW, labH);
        l8.setFont(f1);
        p1.add(l8);

        bldGrp = new JTextField();
        bldGrp.setBounds(300, 500, txtW, txtH);
        bldGrp.setFont(f1);
        p1.add(bldGrp);

        JLabel l9 = new JLabel("DOCTOR NAME");
        l9.setBounds(50, 130, labW, labH);
        l9.setFont(f1);
        p4.add(l9);

        DrName = new JTextField();
        DrName.setBounds(300, 130, txtW, txtH);
        DrName.setFont(f1);
        p4.add(DrName);
        JLabel l10 = new JLabel("DOCTOR SPECIALIZATION");
        l10.setBounds(50, 190, labW, labH);
        l10.setFont(f1);
        p4.add(l10);

        DrSpecailization = new JTextField();
        DrSpecailization.setBounds(300, 190, txtW, txtH);
        DrSpecailization.setFont(f1);
        p4.add(DrSpecailization);
        JLabel l11 = new JLabel("DOCTOR QUALIFICATION");
        l11.setBounds(50, 250, labW, labH);
        l11.setFont(f1);
        p4.add(l11);

        DrQualification = new JTextField();
        DrQualification.setBounds(300, 250, txtW, txtH);
        DrQualification.setFont(f1);
        p4.add(DrQualification);
        JLabel l12 = new JLabel("TIME OF ARRIVAL");
        l12.setBounds(50, 300, labW, labH);
        l12.setFont(f1);
        p4.add(l12);

        DrTimeofArr = new JTextField();
        DrTimeofArr.setBounds(300, 300, txtW, txtH);
        DrTimeofArr.setFont(f1);
        p4.add(DrTimeofArr);
        JLabel l13 = new JLabel("TIME OF DEPARTURE");
        l13.setBounds(50, 350, labW, labH);
        l13.setFont(f1);
        p4.add(l13);

        DrTimeofDep = new JTextField();
        DrTimeofDep.setBounds(300, 350, txtW, txtH);
        DrTimeofDep.setFont(f1);
        p4.add(DrTimeofDep);
        JLabel l14 = new JLabel("DOCTOR ROOM");
        l14.setBounds(50, 400, labW, labH);
        l14.setFont(f1);
        p4.add(l14);

        DrRoom = new JTextField();
        DrRoom.setBounds(300, 400, txtW, txtH);
        DrRoom.setFont(f1);
        p4.add(DrRoom);
        JLabel l15 = new JLabel("DOCTOR AVABILITY");
        l15.setBounds(50, 450, labW, labH);
        l15.setFont(f1);
        p4.add(l15);

        DrAvability = new JTextField();
        DrAvability.setBounds(300, 450, txtW, txtH);
        DrAvability.setFont(f1);
        p4.add(DrAvability);

        JLabel l0 = new JLabel("USERNAME");
        l0.setBounds(50, 150, labW, labH);
        l0.setFont(f1);
        p2.add(l0);
        Username1 = new JTextField();
        Username1.setBounds(300, 150, txtW, txtH);
        Username1.setFont(f1);
        p2.add(Username1);
        JLabel la = new JLabel("PASSWORD");
        la.setBounds(50, 230, labW, labH);
        la.setFont(f1);
        p2.add(la);
        pass1 = new JTextField();
        pass1.setBounds(300, 230, txtW, txtH);
        pass1.setFont(f1);
        p2.add(pass1);
        JLabel lg = new JLabel("USERNAME");
        lg.setBounds(50, 150, labW, labH);
        lg.setFont(f1);
        p3.add(lg);
        Username2 = new JTextField();
        Username2.setBounds(300, 150, txtW, txtH);
        Username2.setFont(f1);
        p3.add(Username2);
        JLabel lf = new JLabel("PASSWORD");
        lf.setBounds(50, 230, labW, labH);
        lf.setFont(f1);
        p3.add(lf);
        pass2 = new JTextField();
        pass2.setBounds(300, 230, txtW, txtH);
        pass2.setFont(f1);
        p3.add(pass2);
        update1 = new JButton("ADD");
        update1.setBounds(200, 555, 150, 50);
        update1.setFont(f1);
        update1.setBackground(Color.white);
        update1.addActionListener(this);
        p1.add(update1);
        Back = new JButton("BACK");
        Back.setBounds(400, 555, 150, 50);
        Back.setBackground(Color.white);
        Back.setFont(f1);
        Back.addActionListener(this);
        p1.add(Back);
        update2 = new JButton("ADD");
        update2.setBounds(150, 500, 150, 50);
        update2.setFont(f1);
        update2.addActionListener(this);
        p4.add(update2);
        Back1 = new JButton("BACK");
        Back1.setBounds(400, 500, 150, 50);
        Back1.setFont(f1);
        Back1.addActionListener(this);
        p4.add(Back1);
        update3 = new JButton("ADD");
        update3.setBounds(150, 500, 150, 50);
        update3.setFont(f1);
        update3.addActionListener(this);
        p2.add(update3);
        Back2 = new JButton("BACK");
        Back2.setBounds(400, 500, 150, 50);
        Back2.setFont(f1);
        Back2.addActionListener(this);
        p2.add(Back2);
        update4 = new JButton("ADD");
        update4.setBounds(150, 500, 150, 50);
        update4.setFont(f1);
        update4.addActionListener(this);
        p3.add(update4);
        Back3 = new JButton("BACK");
        Back3.setBounds(400, 500, 150, 50);
        Back3.setFont(f1);
        Back3.addActionListener(this);
        p3.add(Back3);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p1.jpg"));
        JLabel l99 = new JLabel(i1);
        l99.setBounds(0,0,750,800);
        add(l99);



        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent af) {
        if (af.getSource() == display) {

            try {
                String Username = this.Username.getText();
                conn1 c1 = new conn1();
                String query1 = "select name,aadhar,Time,gender,address,phoneNo,Dr1,bldGrp from appdetails where Username= '" + Username + "';";
                ResultSet rs1 = c1.s1.executeQuery(query1);
                AppDetails.setModel(DbUtils.resultSetToTableModel(rs1));

            } catch (Exception e) {
                System.out.println(e);
            }


            try {
                String Dr12 = this.DrName.getText();
                conn3 c3 = new conn3();
                String query2 = "select DrName,DrSpecailization,DrQualification,DrTimeofArr,DrRoom,DrAvability from dr where DrName= '" + Dr12 + "';";
                ResultSet rs3 = c3.s3.executeQuery(query2);
                Doctorlist.setModel(DbUtils.resultSetToTableModel(rs3));

            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                String Username1 = this.Username.getText();
                conn2 c2 = new conn2();
                String query3 = "select Username,Password from doctor where Username = '" + Username1 + "';";
                ResultSet rs3 = c2.s2.executeQuery(query3);
                DoctorDetails.setModel(DbUtils.resultSetToTableModel(rs3));

            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                String Username2 = this.Username.getText();
                conn5 c5 = new conn5();
                String query5 = "select Username,Password from recp where Username = '" + Username2 + "';";
                ResultSet rs4 = c5.s5.executeQuery(query5);
                RecpDetails.setModel(DbUtils.resultSetToTableModel(rs4));

            } catch (Exception e) {
                System.out.println(e);

            }
        }
        if (af.getSource() == update1) {


            try {
                String Username1 = this.Username.getText();

                String name = this.name.getText();
                String aadhar1 = this.aadhar.getText();
                String Time = this.Time.getText();
                String gender = this.gender.getText();
                String address = this.address.getText();
                String phoneNo = this.phoneNo.getText();
                String Dr1 = this.Dr1.getText();
                String bldGrp = this.bldGrp.getText();


                conn1 c1 = new conn1();
                String query = "update appDetails set name = '" + name + "', aadhar = '" + aadhar1 + "', Time = '" + Time + "' ,gender = '" + gender + "', address= '" + address + "', phoneNo = '" + phoneNo + "' ,Dr1 = '" + Dr1 + "' ,bldGrp = '" + bldGrp + "' where Username = '" + Username1 + "';";

                c1.s1.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "AppDetails Data updated successfully!");
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Some error occured :(");
            }

        }


        if (af.getSource() == update2) {
            try {
                String Username2 = this.Username.getText();
                String DrName = this.DrName.getText();


                String DrSpecailization = this.DrSpecailization.getText();
                String DrQualification = this.DrQualification.getText();
                String DrTimeofArr = this.DrTimeofArr.getText();
                String DrTimeofDep = this.DrTimeofDep.getText();
                String DrRoom = this.DrRoom.getText();
                String DrAvability = this.DrAvability.getText();


                conn3 c3 = new conn3();
                String query = "update dr set DrName = '" + DrName + "', DrSpecailization = '" + DrSpecailization + "', DrQualification = '" + DrQualification + "' ,DrTimeofArr = '" + DrTimeofArr + "', DrTimeofDep = '" + DrTimeofDep + "', DrRoom = '" + DrRoom + "' ,DrAvability = '" + DrAvability + "'  Where Username = '" + Username2 + "';";

                c3.s3.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "DoctorList Data updated successfully!");
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Some error occured :(");
            }
        }
        if (af.getSource() == update4) {
            try {
                String Username13 = this.Username2.getText();

                String Username2 = this.Username2.getText();
                String password1 = this.pass2.getText();
                conn5 c5 = new conn5();
                String query4 = "update recp set  Username = '" + Username2 + "', Password = '" + password1 + "' where Username = '" + Username13 + "';";
                c5.s5.executeUpdate(query4);
                JOptionPane.showMessageDialog(null, "RECP DETAILS Data updated successfully!");
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Some error occured :(");
            }
        }
        if(af.getSource()==update3){
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







            if (af.getSource() == Back) {
                new receptionpage();
                setVisible(false);


            }
            if (af.getSource() == Back1) {
                new receptionpage();
                setVisible(false);


            }
            if (af.getSource() == Back2) {
                new receptionpage();
                setVisible(false);


            }
        if (af.getSource() == Back3) {
            new receptionpage();
            setVisible(false);


        }



    }
    public static void main(String[] args) {
        new editreception();
    }
}