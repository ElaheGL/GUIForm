package com.example.infoform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoForm  extends JFrame implements ActionListener {
    JLabel Name = new JLabel("Name");
    JLabel Surname = new JLabel("Surname");
    JLabel Age = new JLabel("Age");
    JTextField  LabelName = new JTextField(30);
    JTextField LabelSurname = new JTextField(30);
    JTextField LabelAge = new JTextField(30);
    JButton Submit = new JButton("Submit");
    JButton Clear = new JButton("Clear");
    JPanel panelName = new JPanel(new FlowLayout());
    JPanel panelSurname = new JPanel(new FlowLayout());
    JPanel panelAge = new JPanel(new FlowLayout());
    JPanel panelButton = new JPanel(new FlowLayout());
    public InfoForm(){
        this.setTitle("student info");
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(4,1));

        this.Submit.addActionListener(this);
        this.Clear.addActionListener(this);

        this.panelName.add(Name);
        this.panelName.add(LabelName);

        this.panelSurname.add(Surname);
        this.panelSurname.add(LabelSurname);

        this.panelAge.add(Age);
        this.panelAge.add(LabelAge);

        this.panelButton.add(Submit);
        this.panelButton.add(Clear);

        this.add(panelName);
        this.add(panelSurname);
        this.add(panelAge);
        this.add(panelButton);



    }
    public  static void main(String[]args){
        InfoForm form = new InfoForm();
        form.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.Submit){
            JOptionPane.showMessageDialog(null,this.LabelAge.getText()+" "+
                    this.LabelSurname.getText()+" "+ this.LabelName.getText());
        }
        if (e.getSource()==this.Clear){
            this.LabelAge.setText(" ");
            this.LabelSurname.setText(" ");
            this.LabelName.setText(" ");
        }



    }
}
