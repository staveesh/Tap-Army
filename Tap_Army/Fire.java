import greenfoot.*;

/**
 * Write a description of class Fire here.
 * 
 * @author (Taveesh) 
 * @version (22/8/2015)
 */
public class Fire extends Actor
{
    
    private int score = 0;
    private Counter points;
    
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fire(Counter counter){
        points = counter;
    }
    public void act() 
    {
         setLocation(getX(), getY() - 6);
        if(isTouching(Helicopter.class)){
            removeTouching(Helicopter.class);
            points.add(20);
            getWorld().addObject(new Boom(), getX(), getY());

            return;
        }
        if(isTouching(Tank.class)){
            removeTouching(Tank.class);
            points.add(15);
            getWorld().addObject(new Boom(), getX(), getY());
            
            return;
        }
        if(isTouching(RedSoldier.class)){
            removeTouching(RedSoldier.class);
            points.add(10);
            getWorld().addObject(new Boom(), getX(), getY());
            
            return;
        }
        if(isTouching(EnemySoldier.class)){
            
            removeTouching(EnemySoldier.class);
            getWorld().addObject(new Boom(), getX(), getY());
            points.add(5);
            
            return;
        }
        if(getY() == 0){
            getWorld().removeObject(this);
            return;
        }
        if(isTouching(Explosive.class)){
            Greenfoot.playSound("bomb.wav");
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

    
    /**
     * Try to eat an object of class 'clss'. This is only successful if there
     * is such an object where we currently are. Otherwise this method does
     * nothing.
     */
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
}

