import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevel extends Level
{

    /**
     * Constructor for objects of class FirstLevel.
     * 
     */
    public FirstLevel()
    {

        izaro.setLocation(izaro.getX(),izaro.getY());
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Moons moons = new Moons();
        addObject(moons,508,509);
    }
}
