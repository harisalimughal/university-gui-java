
package university.portal;



  


import javax.swing.JScrollPane;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.table.TableModel;
import java.awt.event.*;

public class UniversityPortal implements ActionListener  {


    DefaultTableModel tableModel;
    JTable table;
    JScrollPane scrollPane;
    JTextField f1;
    JTextField f2;
    JTextField f3;
    JTextField f4;
    JTextField f5;
    JLabel label;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    
    JPanel panel;
    JButton button1;
    JButton button2;
    JFrame frame;





    public void call()
{



    tableModel = new DefaultTableModel();
    tableModel.addColumn("Sap");
    tableModel.addColumn("Name");
    tableModel.addColumn("Semester");
    tableModel.addColumn("age");
    tableModel.addColumn("Adress");



    table = new JTable(tableModel);
    //table.addActionListener(this);


    scrollPane = new JScrollPane(table);
    scrollPane.setBounds(40,40,340,65);


    f1 = new JTextField();
    f1.setLocation(200,115);
    f1.setSize(150,25);


    f2 = new JTextField();
    f2.setLocation(200,155);
    f2.setSize(150,25);


    f3 = new JTextField();
    f3.setLocation(200,195);
    f3.setSize(150,25);
    
    
    f4 = new JTextField();
    f4.setLocation(200,235);
    f4.setSize(150,25);
    
    
    f5 = new JTextField();
    f5.setLocation(200,275);
    f5.setSize(150,25);
    
    
    


    label = new JLabel("University Portal");
    label.setBounds(170,0,100,35);


    label1 = new JLabel("sap");
    label1.setBounds(100,110,200,40);


    label2 = new JLabel("Name");
    label2.setBounds(100,150,200,40);


    label3 = new JLabel("Semester");
    label3.setBounds(100,190,200,40);
    
    
    label4 = new JLabel("Age");
    label4.setBounds(100,230,200,40);
    
    
    label5 = new JLabel("Address");
    label5.setBounds(100,270,200,40);
    
    
   





    panel = new JPanel();
    panel.setLayout(null);
    panel.setSize(500,500);
    panel.setBackground(Color.cyan);


    button1 = new JButton("Submit");
    button1.setBounds(105,320,75,30);
    button1.setBackground(Color.GREEN);
    button1.setFocusable(false);
    button1.addActionListener(this);


    button2 = new JButton("DELETE");
    button2.setBounds(220,320,80,30);
    button2.setBackground(Color.RED);
    button2.setFocusable(false);
    button2.addActionListener(this);


    panel.add(label);
    panel.add(scrollPane);
    panel.add(label1);
    panel.add(label2);
    panel.add(label3);
    panel.add(label4);
    panel.add(label5);
    panel.add(f1);
    panel.add(f2);
    panel.add(button1);
    panel.add(f3);
    panel.add(button2);
    panel.add(f4);
    panel.add(f5);
    


    frame = new JFrame("Lab activity");
    frame.setBounds(800,250,panel.getWidth(),panel.getHeight());
    frame.setResizable(false);
    frame.setLayout(null);

    frame.add(panel);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

}
    public void actionPerformed(ActionEvent e) {

    if(e.getSource()==button1)
    {

      if(f1.getText().equals("") || f2.getText().equals("")|| f3.getText().equals("")) {
      JOptionPane.showMessageDialog(null,"Please fill all the blocks");
        }
      else{
          String s1 = f1.getText();
          String s2 = f2.getText();
          String s3 = f3.getText();
          String s4 = f4.getText();
          String s5 = f5.getText();
          String [] strings = {s1,s2,s3,s4,s5};
          tableModel.addRow(strings);
          f1.setText("");
          f2.setText("");
          f3.setText("");
          f4.setText("");
          f5.setText("");
      }

    }

    else if (e.getSource()==button2)
    {      tableModel.setRowCount(0);

           /* DefaultTableModel model = (DefaultTableModel) table.getModel();
            if (table.getRowCount()>=1)
            {
                tableModel.removeRow(table.getSelectedRow());
            }*/

    }

    }




}


 

