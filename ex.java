import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ex{
    public static void main(String[] args){
        new ex();
    }
    ex(){
        JFrame f = new JFrame();
        JButton b1 = new JButton("admin");
         JButton b2 = new JButton("new customer");
          JButton b3 = new JButton("exist customer");
           JButton b4 = new JButton("Exit");
            b1.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
                 Admin ob=new Admin();
                  
              }
          });
          b2.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
register ob2=new register();
              }
          });
          b3.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
Loans obj=new Loans();
SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                obj.createAndShowGUI();
            }
        }
        );
              }
          });
          b4.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
             System.exit(0);
              }
          });


           f.add(b1);
           f.add(b2);f.add(b3);f.add(b4);
           f.setLayout(new GridLayout(2,2));
           f.setSize(400,400);
           f.setVisible(true);

           

    }
}
