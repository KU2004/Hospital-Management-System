package Hospital;


import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class doctorlist extends JFrame implements ActionListener {
    JTabbedPane tabs;
    JScrollPane sp1;
    JTable DoctorList;
    JButton Back;


    doctorlist(){
        setSize(1200,700);

        tabs = new JTabbedPane();
        tabs.setBounds(300,40,880,620);
        tabs.setFont(new Font("Times New Roman", Font.HANGING_BASELINE, 22));
        tabs.setBackground(Color.yellow);
        add(tabs);

        DoctorList = new JTable();
        DoctorList.setBackground(Color.cyan);


        sp1 = new JScrollPane();
        sp1.setViewportView(DoctorList);



        getDetails();

        tabs.addTab("DOCTOR LIST", sp1);






        Back = new JButton("BACK");
        Back.setBounds(60,360,190,80);
        Back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Back.addActionListener(this);
        Back.setBackground(Color.white);
        add(Back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p10.jpeg"));
        JLabel l99 = new JLabel(i1);
        l99.setBounds(0,0,1200,700);
        add(l99);





        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void getDetails(){

        try{
            conn3 c3 = new conn3();
            String query3 = "select DrName,DrSpecailization,DrQualification,DrTimeofArr,DrTimeofDep,DrRoom,DrAvability from dr ;";
            ResultSet rs3 = c3.s3.executeQuery(query3);
            DoctorList.setModel(DbUtils.resultSetToTableModel(rs3));
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
        new doctorlist();
    }
}
