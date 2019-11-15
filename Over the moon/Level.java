import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{

    /**
     * Constructor for objects of class Level.
     * 
     */
    protected Izaro izaro;
    
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 550, 1); 
        prepare();
    }
    private void prepare()
    {

        izaro = new Izaro();
        addObject(izaro,55,520);
        izaro.setLocation(50,512);
        LifeIzaro lifeizaro = new LifeIzaro();
        addObject(lifeizaro,480,37);
        lifeizaro.setLocation(513,36);
    }
}
