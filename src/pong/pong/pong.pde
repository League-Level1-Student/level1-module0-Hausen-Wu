import ddf.minim.*;  
Minim minim;
AudioSample sound;

PImage backgroundImage;

  int posX=0;
  int posY=300;
  
  int speedX=3;
  int speedY=2;

  int acc=2;
  
  boolean hit;
//int a=0;
  
void setup()
{
 //canvas
  size(600, 600);
  backgroundImage = loadImage("image.jpg");
 //sound
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
}

void draw()
{
  //scene reset
  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, 600, 600);
  
  //draw ball
  fill(255,255,255);
  stroke(0,0,0);
  ellipse(posX,posY,15,15);
  
  //draw paddle
  rect(30, mouseY, 20, 100);
  
  //speed control
  posX+=speedX*acc;
  posY+=speedY*acc;
  
  //Detect if the ball hit the floor
  groundDetection();
  
  //Detect if the ball hit the wall
  edgeDetection();
  
  //paddle
  paddleBounce();
  


}

void groundDetection()
{
  if(posY>=590)
    sound.trigger();
}

void edgeDetection()
{
    if(posX>=600||posX<=1)
    speedX*=-1;
    
    if(posY>=600||posY<=1)
    speedY*=-1;
}

void paddleBounce()
{
  if(mouseY>=posY-50 && mouseY<=posY+50 && posX-10<=30 && posX+10>=30)//detect if the ball hit the paddle
  {
    hit=true;
    /*a++;
    println("hit" + a);*/
  }
  else
  {
      hit=false;
  }
  
  if(hit)
    speedX*=-1;
  
}