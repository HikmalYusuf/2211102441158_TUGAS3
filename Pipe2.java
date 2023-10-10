import greenfoot.*;

/**
 * Write a description of class Pipe2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pipe2 extends Actor
{
    int PIPE_SPEED =4;
    /**
     * Act - do whatever the Pipe2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        setLocation(getX()- PIPE_SPEED, getY());
    }    
}
