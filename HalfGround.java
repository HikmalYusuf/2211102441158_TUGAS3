import greenfoot.*;

/**
 * Write a description of class HalfGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HalfGround extends Actor
{
    int GROUND_SPEED = 4;
    /**
     * Act - do whatever the HalfGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()- GROUND_SPEED, getY());
    }    
}
