package Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class controler extends JFrame {
    Client Client;
    view view;

    public controler(Client m, view v){
        this.Client = m;
        this.view = v;
        this.setContentPane(view.getPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        view.setSkickaListener(new skickaListener());
        view.setQuitListener(new quitListener());
        view.setAnslutListener(new anslutListener());
    }
    private class skickaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Client.setOutput(view.getOutput());
        }
    }
    private class quitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Client.setIp(view.getIp());
        }
    }
    private class anslutListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setInput(Client.getInput());
        }
    }
    public static void main(String[] args) throws IOException {
        Client m = new Client();
        view v = new view();
        controler thisIsTheProgram = new controler(m,v);
        thisIsTheProgram.setVisible(true);

    }
}
