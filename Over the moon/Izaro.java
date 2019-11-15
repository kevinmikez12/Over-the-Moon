import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Izaro1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Izaro extends LifeIzaro
{
    /**Guardamos en variables los frames de nuestro personaje.
     * Di# significa Derecha Izaro y el numero el sprite guardado
     * Ii# Izquierda Izaro y el numero de sprite guardado**/
    //Variables de sprites ->
    private GreenfootImage Di0 = new GreenfootImage("A0.png");
    private GreenfootImage Di1 = new GreenfootImage("A1.png");
    private GreenfootImage Di2 = new GreenfootImage("A2.png");
    private GreenfootImage Di3 = new GreenfootImage("A3.png");
    private GreenfootImage Di4 = new GreenfootImage("A4.png");
    private GreenfootImage Di5 = new GreenfootImage("A5.png");
    //Variables de sprites <-
    private GreenfootImage Ii0 = new GreenfootImage("B0.png");
    private GreenfootImage Ii1 = new GreenfootImage("B1.png");
    private GreenfootImage Ii2 = new GreenfootImage("B2.png");
    private GreenfootImage Ii3 = new GreenfootImage("B3.png");
    private GreenfootImage Ii4 = new GreenfootImage("B4.png");
    private GreenfootImage Ii5 = new GreenfootImage("B5.png");
    //  Variables de sprites (up)->
    private GreenfootImage DU1 = new GreenfootImage("SA1.png");
    private GreenfootImage DU2 = new GreenfootImage("SA2.png");
    private GreenfootImage DU3 = new GreenfootImage("SA3.png");
    private GreenfootImage DU4 = new GreenfootImage("SA4.png");
    private GreenfootImage DU5 = new GreenfootImage("SA5.png");
    private GreenfootImage DU6 = new GreenfootImage("SA6.png");
    //  Variables de sprites (up)<-
    private GreenfootImage IU1 = new GreenfootImage("SB1.png");
    private GreenfootImage IU2 = new GreenfootImage("SB2.png");
    private GreenfootImage IU3 = new GreenfootImage("SB3.png");
    private GreenfootImage IU4 = new GreenfootImage("SB4.png");
    private GreenfootImage IU5 = new GreenfootImage("SB5.png");
    private GreenfootImage IU6 = new GreenfootImage("SB6.png");
    
    
    //Variable para avanzar en el eje de las x
    private int speed = 4;
    //Varibale para cambiar el frame ( sprite )
    private int frameI = 0;
    //Velocidad de la animacion
    private int animationC;
    //Validar si salta
    private boolean jumping;
    private int jumpStrength =20;
    //Variable para saber la direccion del personaje
    private int arrow = 1;
    
    /**
     * Act - do whatever the Izaro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKey();
        animationC++;
        
    }   
    /**Funcion que checka la tecla que se oprime**/
    public void checkKey(){
        //Inicializamos esta variable para saber en que direccion se quedo Izaro
        //y asi poder establecer el sprite.
         String lastKey ;
         lastKey = Greenfoot.getKey();
        //Movimiento 
        if(Greenfoot.isKeyDown("Left")){
            moveLeft();
            if(animationC % 5 == 0){
               animateLeft();
            }
        }
        if(Greenfoot.isKeyDown("Right")){
           moveRight();
           
           if(animationC % 5 == 0){
               animateRight();
            }
       }
        //Salto
        if(Greenfoot.isKeyDown("Up")){
           //moveRight();
           if(arrow == 1){
           if(animationC % 5 == 0){
               animateUPR();
            }}
           if(arrow == 2){
               if(animationC % 5 == 0){
               animateUPL();
            }}
        }
       
        //Establece el estado del sprite en la ultima posicion que se movio (izquierda o derecha)
        if("right".equals(lastKey)){
            setImage(Di0);
            arrow = 1;
        }else{
            if("left".equals(lastKey)){
                setImage(Ii0);
                arrow = 2;
            }
        }
        
    }
    /**---------------------------------------------------------------------------**/
   
  
    /** --- Desplazamiento del personaje ------- **/
    public void moveRight(){
        setLocation(getX()+speed, getY()); 
    }
    public void moveLeft(){
        setLocation(getX()-speed, getY());
    }
   
    /** --------------------------------------------- **/
    
    /** --- Izaro Animation ----------------------- **/
    public void animateRight(){
        if(frameI == 0){
            setImage(Di0);
        }else{
            if(frameI == 1){
                setImage(Di1);
            }else{
                if(frameI == 2){
                    setImage(Di2);
                }else{
                    if(frameI == 3){
                        setImage(Di3);
                    }else{
                        if(frameI == 4){
                            setImage(Di4);
                        }else{
                            if(frameI == 5){
                                setImage(Di5);
                                frameI = 0;
                                return;
                            }}}}}}
        frameI++;
    }
    public void animateLeft(){
        if(frameI == 0){
            setImage(Ii0);
        }else{
            if(frameI == 1){
                setImage(Ii1);
            }else{
                if(frameI == 2){
                    setImage(Ii2);
                }else{
                    if(frameI == 3){
                        setImage(Ii3);
                    }else{
                        if(frameI == 4){
                            setImage(Ii4);
                        }else{
                            if(frameI == 5){
                                setImage(Ii5);
                                frameI = 0;
                                return;
                            }}}}}}
        frameI++;
    }  
    public void animateUPR(){
        if(frameI == 0){
            setImage(DU1);
        }else{
            if(frameI == 1){
                setImage(DU2);
            }else{
                if(frameI == 2){
                    setImage(DU3);
                }else{
                    if(frameI == 3){
                        setImage(DU4);
                    }else{
                        if(frameI == 4){
                            setImage(DU5);
                        }else{
                            if(frameI == 5){
                                setImage(DU6);
                                frameI = 0;
                                return;
                            }}}}}}
        frameI++;
    }
    public void animateUPL(){
        if(frameI == 0){
            setImage(IU1);
        }else{
            if(frameI == 1){
                setImage(IU2);
            }else{
                if(frameI == 2){
                    setImage(IU3);
                }else{
                    if(frameI == 3){
                        setImage(IU4);
                    }else{
                        if(frameI == 4){
                            setImage(IU5);
                        }else{
                            if(frameI == 5){
                                setImage(IU6);
                                frameI = 0;
                                return;
                            }}}}}}
        frameI++;
    }
    /**------------------------------------------------------------------------------ **/
}
