import ddf.minim.*;  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
PImage pictureOfRecord;     //as member variable
int angle=0;

void setup()
{
  size(600,600);     //in setup method  
  pictureOfRecord= loadImage("record.png");     //in setup method  
  pictureOfRecord.resize(height,width);
  image(pictureOfRecord, 0, 0); 

  minim = new Minim(this);  //in the setup method
  song = minim.loadFile("a.mp3", 512);//in the setup method
}

void draw()
{

  if(mousePressed)
    {
       rotateImage(pictureOfRecord,angle);
             //in draw method
          angle+=2147483647;
          image(pictureOfRecord, 0, 0); 
          song.play();
    }

  else
  {
    song.pause();
  }
  

}

void rotateImage(PImage image, int amountToRotate) 
{
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}