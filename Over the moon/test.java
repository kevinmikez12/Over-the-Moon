import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test extends World
{

    /**
     * Constructor for objects of class test.
     * 
     */
    public test()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 550, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Izaro izaro = new Izaro();
        addObject(izaro,55,520);
        izaro.setLocation(50,512);
        LifeIzaro lifeizaro = new LifeIzaro();
        addObject(lifeizaro,480,37);
        lifeizaro.setLocation(513,36);
    }
}
