import greenfoot.*;

/**
 * Write a description of class Skeleton here.
 * 
 * @author (Prakhar) 
 * @version (22/8/2015)
 */
public class Skeleton extends Actor
{
    private static final int DELAY = 5;
    
    private int delayCount;
    /**
     * Act - do whatever the Skeleton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Skeleton(){
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
