package fourA;
import javax.swing.*;
import java.awt.*;
public class HelloSwing{
public static void main(String[] args){
JFrame f=new JFrame();
JLabel l=new JLabel("Hello! VI C , Welcome to Swing Programming");
l.setForeground(Color.BLUE);
l.setFont(new Font("Arial",Font.PLAIN,32));
l.setBounds(50,100,700,50);
f.add(l);
f.setSize(800,300);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}