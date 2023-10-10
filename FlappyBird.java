import greenfoot.*;

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    double dy = 0;
    double g = .3;
    double BOOST_SPEED = -5;
    GreenfootSound backgroundMusic = new GreenfootSound("07-Skrillex-Scary_Monsters_And_Nice_Sprites_Noisia.wav");
    GreenfootSound sed4me = new GreenfootSound("air_horn_sad_violin_preview.wav");
    
    public void act() 
    {
        
        backgroundMusic.playLoop();
        
        //If we r touching a pipe the u suck
        
        if(getOneIntersectingObject(Pipe.class) !=null){
        displayGameOver();
        Greenfoot.stop();
        }
        
        if(getOneIntersectingObject(Pipe2.class) !=null){
        displayGameOver();
        Greenfoot.stop();
        }
        setLocation( getX(),(int)(getY() +dy));
        if(Greenfoot.isKeyDown("up") == true ){
        dy= BOOST_SPEED;
    }
        if(Greenfoot.isKeyDown("space") == true ){
        dy= BOOST_SPEED;
    }
    if((dy >-8) && (dy < 7)){
        setRotation(-30);
        
    }
    
        else if(dy >= 0){
       setRotation(30); 
   }
        
    
 
    if(getY() > 395 || getY() < -200){
        displayGameOver();
    }
    dy = dy+g;
    } 
    // This method displays game over and plays the nusic for it.
        public void displayGameOver(){
        Score scoreG = new Score();
      //  scoreG.setScore(score);
        GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
        getWorld().addObject(scoreG, getWorld().getWidth()/2, getWorld().getHeight()/2);
        backgroundMusic.stop();
        sed4me.play();
        Greenfoot.stop();
        }
    public int getYValue(){
        return getY();
    }
}
