import java.awt.*;
import javax.swing.*;

class Image extends JFrame{
	private ImageIcon image1;
	private ImageIcon image2;
	private ImageIcon image3;
	private ImageIcon image4;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	
	Image(){
		setLayout(new GridLayout(2,2)); 
		image1 = new ImageIcon(getClass().getResource("machine.png"));
		label1= new JLabel(image1);
		add(label1);
		
		image2 = new ImageIcon(getClass().getResource("machine.png"));
		label2= new JLabel(image2);
		add(label2);
		
		image3 = new ImageIcon(getClass().getResource("machine.png"));
		label3= new JLabel(image3);
		add(label3);
		
		image4 = new ImageIcon(getClass().getResource("machine.png"));
		label4= new JLabel(image4);
		add(label4);
	}
	public static void main(String ar[]){
		Image img=new Image();
		img.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		img.setVisible(true);
		img.pack();
		img.setTitle("PROJECT");
	}
}