import greenfoot.*;

/**
 * Write a description of class Boom here.
 * 
 * @author (Taveesh) 
 * @version (22/8/2015)
 */
public class Boom extends Actor
{
    private static final int DELAY = 5;
    
    private int delayCount;
    /**
     * Act - do whatever the Blast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boom(){
        delayCount = DELAY;
    }
    public void act() 
    {
        if(delayCount > 0){
            delayCount--;
            if(delayCount == 0){
                getWorld().removeObject(this);
                return;
            }
        }
    }      
}
