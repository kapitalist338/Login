import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllHaveDone extends JFrame implements ActionListener {
    JButton button;
    public AllHaveDone(){
        this.setTitle("Surprise!");
        this.setBounds(200,200,200,120);
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton();
        button.setSize(100,50);
        button.setText("EXIT");
        this.add(button);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            this.setVisible(false);
            System.exit(2);
        }
    }
}
