import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moons extends Actor
{
    //int score = 0;
    /**
     * Act - do whatever the Moons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkForCollisions();
    }
 
    private void checkForCollisions(){
        Actor Izaro = getOneIntersectingObject(Izaro.class);
        if( Izaro != null  && Greenfoot.isKeyDown("x")) {
            World  myWorld = getWorld();
            FirstLevel level = (FirstLevel)myWorld;
            Score counter = level.getCounter2();
            counter.addScore();
            getWorld().removeObject(this);
            
        }
    }
    
}
