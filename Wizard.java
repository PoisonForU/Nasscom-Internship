import javax.swing.*;
import java.awt.event.*;

public class Wizard {

private JLabel lblPicture;
private JRadioButton btLdap, btKerbegos, btSpnego, btSaml2;
private JButton btNext;
private JPanel panel;										//frame_name.pack();

public static void main(String[] args) {
    new Wizard();

}
public Wizard() {
    JFrame frame = new JFrame("Wizard");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600,360);
    frame.setVisible(true);
    MyPanel();
    RadioButtons();
    Button();
    Image();
    groupButton();
    frame.add(panel); 
    frame.setVisible(true);
	}
public void MyPanel() {
    panel = new JPanel();
    panel.setLayout(null);}
public void RadioButtons() {
    btLdap = new JRadioButton ("Ldap");
    btLdap.setBounds(60,85,100,20);
    panel.add(btLdap);

    btKerbegos = new JRadioButton ("Kerbegos");
    btKerbegos.setBounds(60,115,100,20);
    panel.add(btKerbegos);

    btSpnego =new JRadioButton("Spnego");
    btSpnego.setBounds(60,145,100,20);
    panel.add(btSpnego);

    btSaml2 = new JRadioButton("Saml2");
    btSaml2.setBounds(60,175,100,20);
    panel.add(btSaml2);
}
public void Button() {
    btNext = new JButton ("Next");
    btNext.setBounds(400,260,100,20);
    panel.add(btNext);
	btNext.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					//frame.setVisible(false); 
					//if you want to save the frame
					//frame.dispose(); //if you want to kill the frame

					JFrame frame2 = new JFrame("Title text");
					JTextField tup;
				tup=new JTextField();
				JLabel lup;
				lup =new JLabel("id to be Updated");
				lup.setBounds(50,100,100,50);
				frame2.add(lup);
				tup.setBounds(300,100,100,50);
				frame2.add(tup);
				frame2.setLayout(null);
					frame2.setVisible(true);
					frame2.setSize(600,360);
			}
	});
}
public void Image() {
    ImageIcon image = new ImageIcon("image.jpg");
    lblPicture = new JLabel(image);
    lblPicture.setBounds(200,20, 330, 270);
    panel.add(lblPicture);
}

private void groupButton() {

    ButtonGroup bg1 = new ButtonGroup( );

    bg1.add(btLdap);
    bg1.add(btKerbegos);
    bg1.add(btSpnego);
    bg1.add(btSaml2);

    }
}