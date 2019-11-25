import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Berry here.
 * 
 * @author Rikard Karlsson 
 * @version 2019-10-18
 */
public class Berry extends Actor
{
    private int speedX;
    private int speedY;
    
    public Berry()
    {
        speedX = Greenfoot.getRandomNumber(8) + 1;
        speedY = -18;
    }
    
    public void act() 
    {
        int x = getX() + speedX;
        int y = getY() + speedY;
        setLocation(x, y);
        speedY = speedY + 1;
        
        if (getY() >= 399)
        {
            getWorld().removeObject(this);
        }
    }    
}
