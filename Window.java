import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window  extends JFrame implements ActionListener {
    JButton signIn;
    public Window(){
        this.setTitle("Sing up");
        this.setBounds(200,200,450,340);
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lab = new JLabel("Please sign up");
        lab.setForeground(Color.LIGHT_GRAY);
        lab.setBounds(100,0,400,100);
        ImageIcon ii = new ImageIcon("src/sign_in.png");
        //lab.setIcon(ii);
        lab.setHorizontalTextPosition(JLabel.CENTER);
        lab.setVerticalTextPosition(JLabel.TOP);
        signIn = new JButton("", ii);
        signIn.addActionListener(this);
        //signIn.setSize(200,60);
        this.add(lab);
        this.add(signIn);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == signIn){
            this.setVisible(false);
            new Login_Window();
            System.out.println("hello");
        }
    }
}
