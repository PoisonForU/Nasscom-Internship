// MyLogin.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyLogin {
	private JFrame f = new JFrame("Login");
	private JButton bok = new JButton("OK");
	
	public MyLogin() {
	
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		f.getContentPane().add(bok);
		
		bok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame1.setVisible(false); //if you want to save the frame
				frame1.dispose(); //if you want to kill the frame

					SecondGUI frame2 = new SecondGUI("Title text");
					frame2.setVisible(true);
				new SecondFrame();
			}
		});
		f.setSize(100,100);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyLogin();
	}
}

/*SecondFrame.javax
 class SecondFrame extends JFrame {
	public SecondFrame() {
			 JTextField tup;
				tup=new JTextField();
				JLabel lup;
				lup =new JLabel("id to be Updated");
				lup.setBounds(50,100,100,50);
				add(lup);
				tup.setBounds(300,100,100,50);
				add(tup);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setVisible(true);
	}
}
/*yourJTextField.getDocument().addDocumentListener(new DocumentListener() {
  public void changedUpdate(DocumentEvent e) {
    changed();
  }
  public void removeUpdate(DocumentEvent e) {
    changed();
  }
  public void insertUpdate(DocumentEvent e) {
    changed();
  }

  public void changed() {
     if (yourJTextField.getText().equals("")){
       loginButton.setEnabled(false);
     }
     else {
       loginButton.setEnabled(true);
    }

  }
});*/