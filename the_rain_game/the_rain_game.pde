 int x = 25;
int y = 25;
 int score = 0
void checkCatch( x){
if (x > mouseX && x < mouseX+100)
      score++;
   else if (score > 0)
     score--;
println("Your score is now: " + score);
}

void setup() {
  size(500, 500);
  
}  


void draw() {
  background(238, 119, 68);

  ellipse(x, y+=5, 50, 50);
  fill(255, 238, 187);
  stroke(0, 0, 34 );
  if (y==500)
  { 
    y = 25 ;
    x = (int )random( 500 );
    
  }
rect(mouseX,450, 100,50 );
 
}


