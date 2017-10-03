
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MainFrame extends JFrame{
    private Container cp;
    private JButton btn1=new JButton("Add");
    private JButton btn2=new JButton("Sub");
    private int cont=0;
    private JLabel lb1=new JLabel("0");
    private JButton btn3=new JButton("Exit");

    public MainFrame(){
        init();
    }
    private void init(){
        this.setTitle("");
        this.setBounds(100,100,500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        lb1.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(btn1);
        cp.add(lb1);
        cp.add(btn2);
        cp.add(btn3);
        cp.setLayout(new GridLayout(5,1,3,3));
        btn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lb1.setText(Integer.toString(++cont));
            }
        });
        btn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lb1.setText(Integer.toString(--cont));
            }
        });
        btn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}
