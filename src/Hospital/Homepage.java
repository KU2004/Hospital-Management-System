package Hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage  extends JFrame implements ActionListener {
    JMenuBar mb;
    JButton admin,patient,reception,Appiont,AboutUs,Emergency,pharmacy,doctorlist,doctorlogin1,feedback;
    Homepage() {
        setSize(1000, 700);
        JLabel l1 = new JLabel("SARASWATI HOSPITAL");
        l1.setBounds(290, 208, 700, 180);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 50));
        l1.setForeground(Color.black);
        add(l1);
        mb = new JMenuBar();
        mb.setBounds(0,1,150,660);
        mb.setLayout(new GridLayout(10,1,0,9));
        mb.setBackground(Color.cyan);
        admin = new JButton("ADMIN LOGIN");
        admin.addActionListener(this);
        admin.setBackground(Color.white);
        mb.add(admin);
        patient = new JButton("PATIENT LOGIN");
        patient.addActionListener(this);
        patient.setBackground(Color.white);
        mb.add(patient);
        reception = new JButton("RECEPTIONIST");
        reception.addActionListener(this);
        reception.setBackground(Color.white);
        mb.add(reception);
        doctorlogin1 = new JButton("DOCTOR LOGIN");
        doctorlogin1.addActionListener(this);
        doctorlogin1.setBackground(Color.white);
        mb.add(doctorlogin1);
        Appiont = new JButton("APPOINTMENT");
        Appiont.addActionListener(this);
        Appiont.setBackground(Color.white);
        mb.add(Appiont);
        pharmacy = new JButton("PHARMACY");
        pharmacy.addActionListener(this);
        pharmacy.setBackground(Color.white);
        mb.add(pharmacy);
        doctorlist = new JButton("DOCTORS_LIST");
        doctorlist.addActionListener(this);
        doctorlist.setBackground(Color.white);
        mb.add(doctorlist);
        AboutUs = new JButton("ABOUT US");
        AboutUs.addActionListener(this);
        AboutUs.setBackground(Color.white);
        mb.add(AboutUs);
        Emergency = new JButton("EMERGENCY");
        Emergency.addActionListener(this);
        Emergency.setBackground(Color.white);
        mb.add(Emergency);
        feedback = new JButton("FEEDBACK");
        feedback.setBackground(Color.white);
        feedback.addActionListener(this);
        mb.add(feedback);
        add(mb);
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("images/p26.png"));
        JLabel l98 = new JLabel(i2);
        l98.setBounds(260,-1,600,300);
        add(l98);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/p11.jpeg"));
        JLabel l99 = new JLabel(i1);
        l99.setBounds(0,0,1000,700);
        add(l99);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == Appiont) {
            new Appiontment();
            setVisible(false);


        }
        if (ae.getSource() == admin) {
            new Adminlogin();
            setVisible(false);


        }
        if (ae.getSource() == patient) {
            new patientlogin();
            setVisible(false);


        }
        if (ae.getSource() == reception) {
            new recep1();
            setVisible(false);


        }
        if (ae.getSource() == doctorlogin1) {
            new doctorlogin();
            setVisible(false);


        }
        if (ae.getSource() == doctorlist) {
            new doctorlist();
            setVisible(false);


        }
        if (ae.getSource() == pharmacy) {
            new pharmacy();
            setVisible(false);


        }
        if (ae.getSource() ==AboutUs) {
            new AboutUs();
            setVisible(false);


        }
        if (ae.getSource() ==Emergency) {
            new Emergency();
            setVisible(false);


        }
        if (ae.getSource() ==feedback) {
            new feedback();
            setVisible(false);


        }
    }

        public static void main(String[] args) {
        new Homepage();
    }
}
