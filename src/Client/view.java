package Client;

import javax.swing.*;
import java.awt.event.ActionListener;

public class view {
    private JTextField ipwher;
    private JPanel panel;
    private JButton Skicka;
    private JButton anslut;
    private JButton quit;
    private JEditorPane input;
    private JFormattedTextField output;
    private JFormattedTextField ip;

    public view(){
    }
    public JPanel getPanel(){
        return panel;
    }
    public String getOutput(){
        return output.getText();
    }
    public String getIp(){
        return ip.getText();
    }
    public void setInput(String c){
        input.setText(c);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("View");
        frame.setContentPane(new view().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void setSkickaListener(ActionListener skickaListener) {
        Skicka.addActionListener(skickaListener);
    }
    public void setQuitListener(ActionListener quitListener) {
        quit.addActionListener(quitListener);
    }
    public void setAnslutListener(ActionListener anslutListener) {
        anslut.addActionListener(anslutListener);
    }

}
