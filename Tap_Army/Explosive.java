import greenfoot.*;

/**
 * Write a description of class Explosive here.
 * 
 * @author (Prakhar) 
 * @version (22/8/2015)
 */
public class Explosive extends Actor
{
    /**
     * Act - do whatever the Explosive wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 2);
        if(getY() >= 420){
            getWorld().removeObject(this);
            return;
        }
    }    
}
