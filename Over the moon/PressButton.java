import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PressButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PressButton extends Actor
{
    
    private GreenfootImage St1 = new GreenfootImage("ButSt1.png");
    private GreenfootImage St2 = new GreenfootImage("ButSt2.png");
    private GreenfootImage St3 = new GreenfootImage("ButSt3.png");
    private GreenfootImage St4 = new GreenfootImage("ButSt4.png");
    
    private int i=1, animationCounter=0;
    GreenfootSound musicMenu;
    private int j =1;
    
    /**
     * Act - do whatever the PressButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(j==1){
            musicMenu = new GreenfootSound("Lisa Chong - Lisa's waltz.mp3");
            musicMenu.play();
            j++;
        }
        
        if(animationCounter % 7 == 0)
            setPosition();
        animationCounter++;
    }
    
    public void setPosition(){
        if(Greenfoot.isKeyDown("down") && i>=1 && i<=4){
            if(i==1){
                setImage(St2);
            }else{
                if(i==2){
                    setImage(St3);
                }else{
                    if(i==3){
                        setImage(St4);
                    }else{
                        if(i==4){
                            i=0;
                            setImage(St1);
                        }
                    }
                }
            }
            i++;
        }
        if(Greenfoot.isKeyDown("up") && i>0 && i<5){
            if(i==1){
                i=5;
                setImage(St4);

            }else{
                if(i==2){
                    setImage(St1);
                }else{
                    if(i==3){
                        setImage(St2);
                    }else{
                        if(i==4){
                            setImage(St3);
                        }
                    }
                }
            }
            i--;
        }
        if(Greenfoot.isKeyDown("enter")){
            checkWorld();
            
        }
    }
    public void checkWorld(){
        if(i==1){
            musicMenu.stop();
            FirstLevel world = new FirstLevel();

            Greenfoot.setWorld(world);
        }else{
            if(i==2){
                
            }else{
                if(i==3){
                    
                }else{
                    if(i==4){
                         
                    }
                }
            }
        }
    }
}
