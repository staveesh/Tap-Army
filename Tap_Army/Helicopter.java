import greenfoot.*;

/**
 * Write a description of class Helicopter here.
 * 
 * @author (Taveesh) 
 * @version (22/8/2015)
 */
public class Helicopter extends Actor
{
    private Counter count;

    public Helicopter(Counter counter){
        count = counter;
    }

    /**
     * Act - do whatever the Helicopter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        setLocation(getX(), getY() + 2);

        checkForSoldier();
    }

    /**
     * Check for soldier
     */
    private void checkForSoldier(){

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
