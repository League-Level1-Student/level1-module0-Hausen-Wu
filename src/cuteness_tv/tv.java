package cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.*;

public class tv implements ActionListener {

	public static void main(String[] args) {}
	
		JPanel panel=new JPanel();
		JFrame frame=new JFrame();
		JButton[] button=new JButton[3];
		public void ptv()
		{
			
			frame.setVisible(true);
			frame.add(panel);
				for (int i = 0; i < button.length; i++) 
				{
					button[i]=new JButton();
				}
				for (int i = 0; i < button.length; i++) 
				{
					panel.add(button[i]);
				}
				
				frame.pack();
				
				for (int i = 0; i < button.length; i++) 
				{
					button[i].addActionListener(this);
				}
				
		}
		
		void showDucks() {
		     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}

		void showFrog() {
		     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}

		void showFluffyUnicorns() {
		     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}

		void playVideo(String videoID) {
		     try {
		          URI uri = new URI(videoID);
		          java.awt.Desktop.getDesktop().browse(uri);
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton buttonPressed = (JButton) e.getSource();
			if(buttonPressed.equals(button[0]))
				showDucks();
			if(buttonPressed.equals(button[1]))
				showFrog();
			if(buttonPressed.equals(button[2]))
				showFluffyUnicorns();
			
		}
		
}
