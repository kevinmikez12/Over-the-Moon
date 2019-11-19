import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public void act() 
    {
        checkForCollisionsEnemy();
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
