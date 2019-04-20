
package houses;

import org.jointheleague.graphical.robot.Robot;
import java.util.*;

public class house {

	static Robot robo = new Robot ();
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		int num;
		
		Robot.setWindowColor(126, 126, 126);
		
		robo.moveTo(50, 450);
		
		robo.setSpeed(100);

		robo.penDown();
		
		for (int i = 0; i < 9; i++) 
		{
			num=rand.nextInt(3);
			
			if(num==0)
			{
				
				drawPeak("small",125,125,10);
				
			}
			
			if(num==1)
			{
				
				drawPeak("medium",125,125,10);
				
			}
			
			if(num==2)
			{
				
				drawFlat("large",125,125,10);
				
			}
			
			
		}
		
		//drawFlat("large", 125,125,10);
		drawPeak("small",125,125,10);
		drawPeak("medium",125,125,10);
		drawFlat("large",125,125,10);
	}

		static void drawFlat(String height, int r, int g, int b)
	{
			
		if (height.equals("small"))
			{
				
				robo.setPenColor(r,g,b);
				robo.move(60);//height
				robo.turn(90);
				robo.move(30);
				robo.turn(90);
				robo.move(60);//height
				robo.setPenColor(0,128,0); //Green grass
				robo.turn(-90);
				robo.move(20);
				robo.turn(-90);
				
			}
		
		if (height.equals("medium"))
			{
				
				robo.setPenColor(r,g,b);
				robo.move(120);//height
				robo.turn(90);
				robo.move(30);
				robo.turn(90);
				robo.move(120);//height
				robo.setPenColor(0, 128, 0); //Green grass
				robo.turn(-90);
				robo.move(20);
				robo.turn(-90);
				
			}
		
		if (height.equals("large"))
			{
				
				robo.setPenColor(r,g,b);
				robo.move(250);//height
				robo.turn(90);
				robo.move(30);
				robo.turn(90);
				robo.move(250);//height
				robo.setPenColor(0, 128, 0); //Green grass
				robo.turn(-90);
				robo.move(20);
				robo.turn(-90);
				
			}

		
	}
		
		static void drawPeak(String height, int r, int g, int b)
		{
				
			if (height.equals("small"))
				{
					
					robo.setPenColor(r,g,b);
					robo.move(60);//height
					
					robo.turn(45);//peak strt
					robo.move(21);
					robo.turn(90);
					robo.move(21);
					robo.turn(-45);//peak end
					
					robo.turn(90);
					robo.move(60);//height
					robo.setPenColor(0,128,0); //Green grass
					robo.turn(-90);
					robo.move(20);
					robo.turn(-90);
					
				}
			
			if (height.equals("medium"))
				{
					
					robo.setPenColor(r,g,b);
					robo.move(120);//height
					
					robo.turn(45);//peak strt
					robo.move(21);
					robo.turn(90);
					robo.move(21);
					robo.turn(-45);//peak end
					
					robo.turn(90);
					robo.move(120);//height
					robo.setPenColor(0, 128, 0); //Green grass
					robo.turn(-90);
					robo.move(20);
					robo.turn(-90);
					
				}
			
			if (height.equals("large"))
				{
					
					robo.setPenColor(r,g,b);
					robo.move(250);//height
					
					robo.turn(45);//peak strt
					robo.move(21);
					robo.turn(90);
					robo.move(21);
					robo.turn(-45);//peak end
					
					robo.turn(90);
					robo.move(250);//height
					robo.setPenColor(0, 128, 0); //Green grass
					robo.turn(-90);
					robo.move(20);
					robo.turn(-90);
					
				}

			
		}
	
}
