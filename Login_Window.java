import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Window extends JFrame implements ActionListener {
    JTextField tf;
    JTextField email;
    JPasswordField pass;
    JLabel label;
    JButton submit;
    public static String Submit;
    public static String Email;
    public static String Pass;

    public Login_Window(){
        this.setTitle("Login");
        this.setBounds(200,200,300,200);
        this.getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("Please Sign In");
        label.setHorizontalTextPosition(JLabel.CENTER);
        tf = new JTextField();
        tf.setPreferredSize(new Dimension(300,20));
        tf.setText("username");
        tf.setToolTipText("Username");
        tf.setBackground(Color.LIGHT_GRAY);
        tf.setForeground(new Color(10, 141, 11));
        tf.setCaretColor(new Color(68, 226, 20));
        email = new JTextField("@gmail.com");
        email.setForeground(Color.LIGHT_GRAY);
        email.setForeground(new Color(10, 141, 11));
        email.setCaretColor(new Color(68, 226, 20));
        email.setPreferredSize(new Dimension(300,20));
        pass = new JPasswordField("password");
        pass.setForeground(Color.LIGHT_GRAY);
        pass.setForeground(new Color(10, 141, 11));
        pass.setCaretColor(new Color(68, 226, 20));
        pass.setPreferredSize(new Dimension(300,20));
        submit = new JButton();
        submit.setSize(200,100);
        submit.setText("Submit");
        submit.addActionListener(this);
        this.add(label);
        this.add(tf);
        this.add(email);
        this.add(pass);
        this.add(submit);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){
            Submit = tf.getText();
            Email = email.getText();
            Pass = pass.getText();
            System.out.println(Email);
            System.out.println(Submit);
            this.setVisible(false);
            new Window_confirm();
        }
    }
}
