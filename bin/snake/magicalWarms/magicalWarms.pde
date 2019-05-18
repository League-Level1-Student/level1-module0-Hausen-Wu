import java.util.*;

float frequency = .001;
float noiseInterval = PI;

Random rand = new Random();

void setup()
{
  size(500,500);
  background(0,0,0);
}

void draw()
{
  //background(0,0,0);
  //fill(255, 255, 255);
  fill(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  stroke(255,255,255);
  
  makeMagical();
  
  for(int a=0;a<=300;a++)
  {
    fill(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    ellipse(getWormX(a), getWormY(a), 10, 10);
  }
  
}

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}