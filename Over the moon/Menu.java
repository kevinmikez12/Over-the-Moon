import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

   
    
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 550, 1); 
        prepare();
        
    }

    private void prepare()
    {
        /*PressButton pressbutton1 = new PressButton(1);
        PressButton pressbutton2 = new PressButton(0);
        PressButton pressbutton3 = new PressButton(0);
        PressButton pressbutton4 = new PressButton(0);

        addObject(pressbutton1,760,155);
        addObject(pressbutton2,760,247);
        addObject(pressbutton3,760,340);
        addObject(pressbutton4,760,430);*/

        
        PressButton pressbutton = new PressButton();
        addObject(pressbutton,734,290);
        pressbutton.setLocation(743,290);
        
    }
    
    
}
