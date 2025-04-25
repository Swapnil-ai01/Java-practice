import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Registration extends JFrame{
    Registration(){
        JLabel l1,l2,l3,l4,l5;
        JButton b1,b2;
        JPanel p = new JPanel();
        p.setBackground(Color.GRAY);
        l1 = new JLabel("Registration Form");
        l2 = new JLabel("Login");
        l3 = new JLabel("User Name");
        l4 = new JLabel("Password");
        JTextField t1 = new JTextField();
        JPasswordField pf = new JPasswordField();
        b1 = new JButton("SIGN UP");
        b2 = new JButton("SIGN IN");

        l1.setBounds(30,40,400,50);
        l2.setBounds(230, 20,400,30);
        l3.setBounds(30,50,400,30);
        l4.setBounds(30,130,400,30);
        p.setBounds(50,100,500,300);
        t1.setBounds(50,90,400,30);
        pf.setBounds(50,170,400,30);
        b1.setBounds(90,250,100,25);
        b2.setBounds(280,250,100,25);

        l1.setForeground(Color.blue);
        l2.setForeground(Color.RED);
        l1.setFont(new Font("Parcel",Font.BOLD,24));
        l2.setFont(new Font("Parcel",Font.BOLD,16));

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new signUpPage();
                dispose();
            }
        });

        p.add(l2);p.add(l3);p.add(l4);p.add(t1);p.add(pf);p.add(b1);p.add(b2);
        add(l1);add(p);
        setSize(600,500);
        p.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Form Project");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[]args){
        new Registration();
    }
}
class signUpPage extends JFrame{
    signUpPage(){
        JLabel l1,l2,l3,l4;
        JTextField t1,t2;
        l1 = new JLabel("Create new account");
        l2 = new JLabel("Create User Name");
        l3 = new JLabel("Create Password");
        l4 = new JLabel("Re-enter Password");
        t1 = new JTextField();
        t2 = new JTextField();
        JPasswordField pf = new JPasswordField();
        JButton b = new JButton("REGISTER");
        JPanel p = new JPanel();

        p.setBackground(Color.gray);
        l1.setForeground(Color.cyan);
        l1.setFont(new Font("Arial",Font.BOLD,20));

        l1.setBounds(30,40,400,50);
        l2.setBounds(30,10,400,30);
        t1.setBounds(50,50,400,30);
        l3.setBounds(30,90,400,30);
        pf.setBounds(50,130,400,30);
        l4.setBounds(30,170,400,30);
        t2.setBounds(50,210,400,30);
        b.setBounds(180, 250,150,30);
        p.setBounds(50,100,500,300);
        p.add(l2);p.add(t1);p.add(l3);p.add(pf);p.add(l4);
        p.add(t2);p.add(b);
        add(l1);add(p);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Registration();
                dispose();
            }
        });

        p.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Form Project");
        setSize(600,500);
        setLayout(null);
        setVisible(true);

    }

}
