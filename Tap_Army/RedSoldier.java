import greenfoot.*;

/**
 * Write a description of class RedSoldier here.
 * 
 * @author (Taveesh) 
 * @version (22/8/2015)
 */
public class RedSoldier extends Actor
{
    private Counter count;
    
    public RedSoldier(Counter counter){
        count = counter;
    }
    /**
     * Act - do whatever the RedSoldier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 2);
        
        if(canSee(Soldier.class)){
            Soldier.gotKilled = true;
        }
    }    
    /**
     * Return true if we can see an object of class 'clss' right where we are. 
     * False if there is no such object here.
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
}
