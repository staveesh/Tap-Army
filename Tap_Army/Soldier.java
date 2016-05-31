import greenfoot.*;

/**
 * Write a description of class Soldier here.
 * 
 * @author (Taveesh) 
 * @version (22/8/2015)
 */
public class Soldier extends Actor
{
    public static boolean gotKilled = false;
    
    private Counter scoreCounter;
    private int fire_upper = 400;
    private int fire_lower = 200;
    private int laser_upper = 600;
    private int laser_lower = 400;
    
    public Soldier(Counter counter){
        scoreCounter = counter;
    }
    /**
     * Act - do whatever the Soldier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        String s = Greenfoot.getKey();
        
        if("a".equals(s)){
            if((scoreCounter.getValue() >= fire_lower)&&(scoreCounter.getValue() < fire_upper)){
                getWorld().addObject(new Fire(scoreCounter), 50, 362);
                Greenfoot.playSound("fireFlame.wav");
            }
            else if((scoreCounter.getValue() >= laser_lower)&&(scoreCounter.getValue() < laser_upper)){
                getWorld().addObject(new Laser(scoreCounter), 50, 260);
                Greenfoot.playSound("beep.wav");
            }
            else{
                getWorld().addObject(new Bullet(scoreCounter), 50, 497);
                Greenfoot.playSound("minigunshot.wav");
            }
        }
            
        
        if("s".equals(s)){
            if((scoreCounter.getValue() >= fire_lower)&&(scoreCounter.getValue() < fire_upper)){
                getWorld().addObject(new Fire(scoreCounter), 150, 362);
                Greenfoot.playSound("fireFlame.wav");
            }
            if((scoreCounter.getValue() >= laser_lower)&&(scoreCounter.getValue() < laser_upper)){
                getWorld().addObject(new Laser(scoreCounter), 150, 260);
                Greenfoot.playSound("beep.wav");
            }
            else{
                getWorld().addObject(new Bullet(scoreCounter), 150, 497);
                Greenfoot.playSound("minigunshot.wav");
            }
        }
        
        if("d".equals(s)){
            if((scoreCounter.getValue() >= fire_lower)&&(scoreCounter.getValue() < fire_upper)){
                getWorld().addObject(new Fire(scoreCounter), 250, 362);
                Greenfoot.playSound("fireFlame.wav");
            }
            if((scoreCounter.getValue() >= laser_lower)&&(scoreCounter.getValue() < laser_upper)){
                getWorld().addObject(new Laser(scoreCounter), 250, 260);
                Greenfoot.playSound("beep.wav");
            }
            else{
                getWorld().addObject(new Bullet(scoreCounter), 250, 497);
                Greenfoot.playSound("minigunshot.wav");
            }
        }
        
        if("f".equals(s)){
            if((scoreCounter.getValue() >= fire_lower)&&(scoreCounter.getValue() < fire_upper)){
                getWorld().addObject(new Fire(scoreCounter), 350, 362);
                Greenfoot.playSound("fireFlame.wav");
            }
            if((scoreCounter.getValue() >= laser_lower)&&(scoreCounter.getValue() < laser_upper)){
                getWorld().addObject(new Laser(scoreCounter), 350, 260);
                Greenfoot.playSound("beep.wav");
            }
            else{
                getWorld().addObject(new Bullet(scoreCounter), 350, 497);
                Greenfoot.playSound("minigunshot.wav");
            }
        }
        
        if(scoreCounter.getValue() > laser_upper){
            fire_upper += 1000;
            fire_lower += 1000;
            laser_upper += 1000;
            laser_lower += 1000;
        }

        if(gotKilled){
            getWorld().addObject(new Boom(), 50, 551);
            getWorld().addObject(new Boom(), 150, 551);
            getWorld().addObject(new Boom(), 250, 551);
            getWorld().addObject(new Boom(), 350, 551);
            getWorld().addObject(new GameOver(), 200, 300);
            Greenfoot.playSound("gameOver.wav");
            getWorld().removeObjects(getWorld().getObjects(Soldier.class));
            gotKilled = false;
            Greenfoot.stop();
            return;
        }
    }    
  }

