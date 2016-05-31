import greenfoot.*;

/**
 * Write a description of class Bullet here.
 * 
 * @author (Taveesh) 
 * @version (22/8/2015)
 */
public class Bullet extends Actor
{

    
    private Counter points;

    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Bullet(Counter counter){
        points = counter;
        
    }

    public void act() 
    {
        /**
         * Move vertically
         */
        setLocation(getX(), getY() - 8);
        if(canSee(Helicopter.class)){
            eat(Helicopter.class);
            points.add(20);
            getWorld().addObject(new Boom(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        if(canSee(Tank.class)){
            eat(Tank.class);
            points.add(15);
            getWorld().addObject(new Boom(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        if(canSee(RedSoldier.class)){
            eat(RedSoldier.class);
            points.add(10);
            getWorld().addObject(new Boom(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        if(canSee(EnemySoldier.class)){
            eat(EnemySoldier.class);
            points.add(5);
            getWorld().addObject(new Boom(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        if(getY() == 0){
            getWorld().removeObject(this);
            return;
        }
        if(canSee(Explosive.class)){
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
