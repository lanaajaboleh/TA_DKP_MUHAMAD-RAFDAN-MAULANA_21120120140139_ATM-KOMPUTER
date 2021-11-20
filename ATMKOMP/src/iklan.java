package bank;

import javax.swing.*;

public class iklan extends ATM{
    public iklan(){
        initComponents();
    }
    private void initComponents(){
        JDialog frame = new JDialog();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(20,30,406,520);
        frame.getContentPane().setLayout(null);
        ImageIcon icon = new ImageIcon("src/images/promo.jpg", "iklan");
        JLabel label = new JLabel(icon);
        label.setBounds(0,0,403,484);
        frame.getContentPane().add(label);
        frame.setModal(true);
        frame.setVisible(true);
    }
}
