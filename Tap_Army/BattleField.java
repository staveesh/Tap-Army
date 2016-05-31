import greenfoot.*;

/**
 * Write a description of class BattleField here.
 * 
 * @author (Taveesh) 
 * @version (22/8/2015)
 */
public class BattleField extends World
{
    private final static int DELAY = 30;
    Counter counter;
    private int delayCount;

    /**
     * Constructor for objects of class BattleField.
     * 
     */
    public BattleField()
    {    

        super(400, 600, 1);

        delayCount = DELAY;

        prepare();
    }

    public void act(){
        if(delayCount > 0){
            delayCount--;
            if(delayCount == 0){
                addEnemies();
                delayCount = DELAY;
            }
        }
    }

    /**
     * Add enemies randomly
     */
    private void addEnemies(){
        /**
         * To make EnemySoldier appear with a probability of 30%
         */
        if(Greenfoot.getRandomNumber(100) < 30){
            switch(Greenfoot.getRandomNumber(4)+ 1){
                case 1:
                addObject(new EnemySoldier(counter), 50, 0);
                break;
                case 2:
                addObject(new EnemySoldier(counter), 150, 0);
                break;
                case 3:
                addObject(new EnemySoldier(counter), 250, 0);
                break;
                default:
                addObject(new EnemySoldier(counter), 350, 0);
                break;
            }
        }
        /**
         * To make RedSoldier appear with a probability of 20%
         */
        if(Greenfoot.getRandomNumber(100) < 20){
            switch(Greenfoot.getRandomNumber(4)+ 1){
                case 1:
                addObject(new RedSoldier(counter), 50, 0);
                break;
                case 2:
                addObject(new RedSoldier(counter), 150, 0);
                break;
                case 3:
                addObject(new RedSoldier(counter), 250, 0);
                break;
                default:
                addObject(new RedSoldier(counter), 350, 0);
                break;
            }
        }
        /**
         * To make Helicopter appear with a probability of 10%
         */
        if(Greenfoot.getRandomNumber(100) < 10){
            switch(Greenfoot.getRandomNumber(4)+ 1){
                case 1:
                addObject(new Helicopter(counter), 50, 0);
                break;
                case 2:
                addObject(new Helicopter(counter), 150, 0);
                break;
                case 3:
                addObject(new Helicopter(counter), 250, 0);
                break;
                default:
                addObject(new Helicopter(counter), 350, 0);
                break;
            }
        }
        /**
         * To make Tank appear with a probability of 30%
         */
        if(Greenfoot.getRandomNumber(100) < 20){
            switch(Greenfoot.getRandomNumber(4)+ 1){
                case 1:
                addObject(new Tank(counter), 50, 0);
                break;
                case 2:
                addObject(new Tank(counter), 150, 0);
                break;
                case 3:
                addObject(new Tank(counter), 250, 0);
                break;
                default:
                addObject(new Tank(counter), 350, 0);
                break;
            }
        }
        /**
         * To make Explosive appear with a probability of 2%
         */
        if(Greenfoot.getRandomNumber(100) < 2){
            switch(Greenfoot.getRandomNumber(4)+ 1){
                case 1:
                addObject(new Explosive(), 50, 0);
                break;
                case 2:
                addObject(new Explosive(), 150, 0);
                break;
                case 3:
                addObject(new Explosive(), 250, 0);
                break;
                default:
                addObject(new Explosive(), 350, 0);
                break;
            }
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        counter = new Counter();
        addObject(counter, 208, 33);
        counter.setLocation(201, 33);
        Soldier soldier1 = new Soldier(counter);
        addObject(soldier1, 50, 553);
        Soldier soldier2 = new Soldier(counter);
        addObject(soldier2, 150, 553);
        Soldier soldier3 = new Soldier(counter);
        addObject(soldier3, 250, 553);
        Soldier soldier4 = new Soldier(counter);
        addObject(soldier4, 350, 553);
    }
}
