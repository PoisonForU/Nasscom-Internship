import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Main {

  public static void main(final String args[]) {
    final DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
    
    model.addElement("A");
    model.addElement("C");
    model.addElement("D");
    model.addElement("E");
    
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JComboBox<String> comboBox1 = new JComboBox<String>(model);
    comboBox1.setMaximumRowCount(5);
    comboBox1.setEditable(true);
    frame.add(comboBox1, BorderLayout.NORTH);
    
    JList<String> jlist = new JList<String>(model);
    JScrollPane scrollPane = new JScrollPane(jlist);
    frame.add(scrollPane, BorderLayout.CENTER);

    JButton button = new JButton("Add");
    frame.add(button, BorderLayout.SOUTH);
    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        model.addElement("a");
      }
    };
    button.addActionListener(actionListener);


    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}