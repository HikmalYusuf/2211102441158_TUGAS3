import greenfoot.*;


/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    public Score(){
        GreenfootImage ScoreImg = new GreenfootImage(200,50);
        
        setImage(ScoreImg);
    }
    
    public void setScore(int score){
        GreenfootImage ScoreImg = getImage();
        ScoreImg.clear();
        Font f = new Font("Comic Sans MS", 32);

        ScoreImg.setFont(f);
        Color c = new Color(127,127,127,0);
        ScoreImg.setColor(c);
        ScoreImg.fill();
        ScoreImg.setColor(Color.BLACK);

        ScoreImg.drawString("Score: " + score, 30, 30);
        setImage(ScoreImg);
    }
}
