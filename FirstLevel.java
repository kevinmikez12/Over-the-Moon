import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevel extends Level
{
    //creamos una variable de tipo LifeIzaro para hacer un contador para las vidas
    LifeIzaro counter = new LifeIzaro();
    //creamos una variable de tipo Score para hacer un contador para las lunas recogidas
    Score counter2 = new Score();
    /**
     * Constructor for objects of class FirstLevel.
     * 
     */
    public FirstLevel()
    {
        izaro.setLocation(izaro.getX(),izaro.getY());
        prepare();
    }
    //creamos un metodo que relizara el conteo del tipo vidas de LifeIzaro
        public LifeIzaro getCounter(){
        return counter;
    }
    //creamos un metodo que relizara el conteo del tipo vidas de LifeIzaro
        public Score getCounter2(){
        return counter2;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter2,900,40);//score
        addObject(counter,100,40);//vidas
        /*--------------------------------------------*/
        Moons moons = new Moons();
        addObject(moons,508,509);
        moons.setLocation(244,332);
        Moons moons2 = new Moons();
        addObject(moons2,505,411);
        moons2.setLocation(505,401);
        Moons moons3 = new Moons();
        addObject(moons3,109,132);
        moons3.setLocation(53,126);
        Moons moons4 = new Moons();
        addObject(moons4,747,126);
        moons4.setLocation(978,140);
        /*--------------------------------------------*/
        Enemy enemy = new Enemy();
        addObject(enemy,709,513);
        enemy.setLocation(989,321);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,424,218);
        enemy2.setLocation(586,192);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,145,332);
        enemy3.setLocation(237,318);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,876,129);
        enemy4.setLocation(984,126);
        /*--------------------------------------------*/
        Plataforma plataforma = new Plataforma();
        addObject(plataforma,316,436);
        plataforma.setLocation(497,433);
        Plataforma plataforma2 = new Plataforma();
        addObject(plataforma2,235,332);
        plataforma2.setLocation(132,364);
        Plataforma plataforma3 = new Plataforma();
        addObject(plataforma3,879,324);
        plataforma3.setLocation(867,367);
        Plataforma plataforma4 = new Plataforma();
        addObject(plataforma4,302,192);
        plataforma4.setLocation(478,241);
        Plataforma plataforma5 = new Plataforma();
        addObject(plataforma5,804,150);
        plataforma5.setLocation(866,174);
        Plataforma plataforma6 = new Plataforma();
        addObject(plataforma6,195,174);
        plataforma6.setLocation(134,158);
        Plataforma plataforma7 = new Plataforma();
        addObject(plataforma7,145,543);
        plataforma7.setLocation(137,537);
        Plataforma plataforma8 = new Plataforma();
        addObject(plataforma8,474,533);
        plataforma8.setLocation(407,538);
        plataforma8.setLocation(401,537);
        Plataforma plataforma9 = new Plataforma();
        addObject(plataforma9,666,537);
        plataforma9.setLocation(660,537);
        Plataforma plataforma10 = new Plataforma();
        addObject(plataforma10,911,527);
        plataforma10.setLocation(911,527);
        plataforma10.setLocation(911,527);
        plataforma10.setLocation(911,527);
        plataforma10.setLocation(911,527);
        plataforma10.setLocation(911,527);
        plataforma10.setLocation(911,527);
        plataforma10.setLocation(880,537);
        /*--------------------------------------------*/


    }
}
