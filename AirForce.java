import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AirForce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirForce extends Actor
{
    /**
     * Act - do whatever the AirForce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int life;
    private int attack;
    private int shell;
    private int speed;
    
    public void act()
    {
        
    }
    
    public AirForce(int life, int attack, int shell, int speed){
        this.life = life;
        this.attack = attack;
        this.shell = shell;
        this.speed = speed;
    }
    
    public int getLife(){
        return this.life;
    }
    
    public int getAttack(){
        return this.attack;
    }
    
    public int getShell(){
        return this.shell;
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
    public void movement(){
        move(this.speed);
    }
    
    public void border(){
        if(getX()>getWorld().getWidth()-5 || getX()<5){
            getWorld().removeObject(this);
        }
    }
}
