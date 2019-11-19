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
    
    /*------------------------------------------------*/
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -20; //que tan alto brincar
    /*------------------------------------------------*/
    //Variable para avanzar en el eje de las x
    private int speed = 4;
    //Varibale para cambiar el frame ( sprite )
    private int frameI = 0;
    //Velocidad de la animacion
    private int animationC;
    
    /**
     * Act - do whatever the Izaro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKey();
        checkFalling();
        animationC++;
        
    }    
    
    /**Funcion que checka la tecla que se oprime**/
    public void checkKey(){
        //Inicializamos esta variable para saber en que direccion se quedo Izaro
        //y asi poder establecer el sprite.
         String lastKey ;
         lastKey = Greenfoot.getKey();
         
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
          if(Greenfoot.isKeyDown("space")){
           vSpeed = jumpHeight;
           fall();
        }
        //Establece el estado del sprite en la ultima posicion que se movio (izquierda o derecha)
        if("right".equals(lastKey)){
            setImage(Di0);
        }else{
            if("left".equals(lastKey)){
                setImage(Ii0);
            }
        }
        
    }
    /**-------------------- Caida del Personaje -----------------------------**/
    //Metodos para permitir y checar que Izaro este sobre plataformas
    private void fall(){
        setLocation(getX(),getY() + vSpeed);
        if(getY() > getWorld().getHeight()-getY()/9)
        vSpeed = 0;
        else
        vSpeed = vSpeed + acceleration;
        
    }
    
    boolean sobrePlataforma(){
        Actor sobre = getOneObjectAtOffset(0,getImage().getHeight()/2,Plataforma.class);
        return sobre != null;
    }
    
    public void checkFalling(){
        if(sobrePlataforma() == false){
            fall();}
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
    //******Corregi la animacion hacia la izquierda
    public void animateLeft(){
        if(frameI == 0){
            setImage(Ii0);
        }else{
            if(frameI == 1){
                setImage(Ii5);
            }else{
                if(frameI == 2){
                    setImage(Ii4);
                }else{
                    if(frameI == 3){
                        setImage(Ii3);
                    }else{
                        if(frameI == 4){
                            setImage(Ii2);
                        }else{
                            if(frameI == 5){
                                setImage(Ii1);
                                frameI = 0;
                                return;
                            }}}}}}
        frameI++;
    }  
    /**------------------------------------------------------------------------------ **/
}
