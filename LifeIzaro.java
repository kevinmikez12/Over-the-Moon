import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeIzaro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeIzaro extends Actor
{
    /**
     * Act - do whatever the LifeIzaro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage life4 = new GreenfootImage("Life4.png");
    private GreenfootImage life3 = new GreenfootImage("Life3.png");
    private GreenfootImage life2 = new GreenfootImage("Life2.png");
    private GreenfootImage life1 = new GreenfootImage("Life1.png");
    private GreenfootImage life0 = new GreenfootImage("Life0.png");
    
    
    private int vida=4;
    public void act() 
    {
       
        String lastKey ;
        lastKey = Greenfoot.getKey();
    } 
    
    public void modifyLives(){
        vida--;
        refreshLife();
    }
    
    public void refreshLife(){
        if(vida == 4){
            setImage(life4);
        }
        if(vida == 3){
            setImage(life3);
        }
        if(vida == 2){
            setImage(life2);
        }
        if(vida == 1){
            setImage(life1);
        }
        if(vida == 0){
            setImage(life0);
        }
        
    }
}
