package DieterLessons;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JLabel northLabel = new JLabel("Abdul");
		ImageIcon labelIcon = new ImageIcon("/Users/aRsyed/Downloads/IMG_20120509_194505.jpg");
		JLabel centerLabel = new JLabel(labelIcon);
		centerLabel.setText("which picture is this?");
		JFrame app = new JFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(northLabel,BorderLayout.NORTH);
		app.add(centerLabel,BorderLayout.CENTER);
		app.add(centerLabel,BorderLayout.SOUTH);
		app.setSize(400,400);
		app.setVisible(true);
		

	}

}
