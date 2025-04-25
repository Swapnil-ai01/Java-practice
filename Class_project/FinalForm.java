import javax.swing.*;
import java.awt.*;

public class FinalForm{
    FinalForm(){
        JFrame f = new JFrame("Club Registration Form");
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setPreferredSize(new Dimension(500, 600));
        p.setBackground(Color.cyan);

        JLabel l1,l2,l3,l4,l5,l6,l7;
        JTextField t1,t2;
        JRadioButton r1,r2,r3;
        JCheckBox c1,c2,c3,c4,c5;
        ButtonGroup bg = new ButtonGroup();
        l1= new JLabel("Club Registration Form");
        l2= new JLabel("Name");
        t1= new JTextField();
        l3= new JLabel("Age");
        t2= new JTextField();
        l4= new JLabel("Gender");
        r1= new JRadioButton("Male");
        r2= new JRadioButton("Female");
        r3= new JRadioButton("Other");
        l5= new JLabel("Which club you want");
        String clubName[] ={"Gryffindor","Hufflepuff","Ravenclaw","Slytherin"};
        JComboBox cb =new JComboBox(clubName);
        l6= new JLabel("Your Hobbies");
        JTextArea ta = new JTextArea(10,30);

        JScrollPane sp = new JScrollPane(ta);
        l7= new JLabel("Skill You Bring");
        c1= new JCheckBox("Event Management");
        c2= new JCheckBox("Photography / Videography");
        c3= new JCheckBox("Graphic Designing");
        c4= new JCheckBox("Content Writing");
        c5= new JCheckBox("Social Media Handling");
        JButton b = new JButton("Submit");

        JScrollPane sp1 = new JScrollPane(p);
        sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        ta.setLineWrap(true);
        l1.setFont(new Font("Parcel",Font.BOLD,24));
        l1.setForeground(Color.blue);

        l1.setBounds(20,30,300,40);
        l2.setBounds(20,90,100,20);
        t1.setBounds(180,90,300,20);
        l3.setBounds(20,130,70,20);
        t2.setBounds(180,130,300,20);
        l4.setBounds(20,170,70,20);
        r1.setBounds(180,170,60,20);
        r2.setBounds(260,170,70,20);
        r3.setBounds(350,170,70,20);
        l5.setBounds(20,210,150,20);
        cb.setBounds(180,210,300,20);
        l6.setBounds(20,250,100,20);
        sp.setBounds(180,250,300,90);
        l7.setBounds(20,350,150,20);
        c1.setBounds(180,350,300,20);
        c2.setBounds(180,370,300,20);
        c3.setBounds(180,390,300,20);
        c4.setBounds(180,410,300,20);
        c5.setBounds(180,430,300,20);
        b.setBounds(230,470,150,30);



        bg.add(r1);bg.add(r2);bg.add(r3);
        p.add(l1);p.add(l2);p.add(t1);p.add(l3);p.add(t2);p.add(l4);p.add(r1);p.add(r2);p.add(r3);
        p.add(l5);p.add(cb);p.add(l6);p.add(l7);p.add(b);
        p.add(c1);p.add(c2);p.add(c3);p.add(c4);p.add(c5);p.add(sp);

        f.setContentPane(sp1);
        f.setSize(600,500);
        f.setTitle("Form Project");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
    public static void main(String[] args){
        new FinalForm();
    }
}
