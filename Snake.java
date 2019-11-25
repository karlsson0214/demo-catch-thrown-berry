import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author Rikard Karlsson 
 * @version 2019-10-18
 * 
 */
public class Snake extends Actor
{
    private int score = 0;
    
    public void act() 
    {
        checkKeyboard();
        checkCollision();
    }    
    
    private void checkKeyboard()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-10);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(10);
        }
    }
    private void checkCollision()
    {
        if (isTouching(Berry.class))
        {
            removeTouching(Berry.class);
            score = score + 1;
            getWorld().showText("score: " + score, 100, 30);
        }
    }
}
