import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window_confirm extends JFrame implements ActionListener {
    JTextField tf;
    JTextField TF;
    JTextField passField;
    JButton button;
    private String passFieldTest;
    private String username_Test;
    private String email_Test;
    public Window_confirm(){
        this.setTitle("Confirm");
        this.setBounds(300,400,300,370);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf = new JTextField();
        tf.setPreferredSize(new Dimension(300,20));
        tf.setText("username: ");
        tf.setToolTipText("Username");
        tf.setBackground(Color.LIGHT_GRAY);
        tf.setForeground(new Color(10, 141, 11));
        tf.setCaretColor(new Color(68, 226, 20));
        TF = new JTextField();
        TF.setPreferredSize(new Dimension(300,20));
        TF.setText("email: ");
        TF.setToolTipText("Email");
        TF.setBackground(Color.LIGHT_GRAY);
        TF.setForeground(new Color(10, 141, 11));
        TF.setCaretColor(new Color(68, 226, 20));
        passField = new JTextField();
        passField.setPreferredSize(new Dimension(300,20));
        passField.setText("password: ");
        passField.setToolTipText("Password");
        passField.setBackground(Color.LIGHT_GRAY);
        passField.setForeground(new Color(10, 141, 11));
        passField.setCaretColor(new Color(68, 226, 20));
        button = new JButton();
        button.addActionListener(this);
        button.setSize(200, 100);
        this.add(tf);
        this.add(TF);
        this.add(passField);
        this.add(button);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            username_Test = tf.getText();
            email_Test = TF.getText();
            passFieldTest = passField.getText();
            if(username_Test.equals(Login_Window.Submit)&& email_Test.equals(Login_Window.Email) && passFieldTest.equals(Login_Window.Pass)){
                this.setVisible(false);
                new AllHaveDone();
            } else{
                JOptionPane.showMessageDialog(null, "Incorrect parametr", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
