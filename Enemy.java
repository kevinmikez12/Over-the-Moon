import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    int speed = -3;
    int count = 0;
    public void act() 
    {
        count ++;
        moveAround();
        checkForCollisionsEnemy();
    }    
    
    public Enemy(){
        getImage().scale(140,80);
        getImage().mirrorHorizontally();
    }
    
    public void moveAround(){
        if(count <60)
        setLocation(getX() + speed, getY());
        else{
            speed = -speed;
            getImage().mirrorHorizontally();
            count = 0;
        }
    }
        public void checkForCollisionsEnemy(){
        Actor Izaro =this.getOneIntersectingObject(Izaro.class);
        if( Izaro != null) {
            World  myWorld = getWorld();
            FirstLevel level = (FirstLevel)myWorld;
            LifeIzaro counter = level.getCounter();
            counter.modifyLives();
            getWorld().removeObject(this);
            
        }
    }
    
}
