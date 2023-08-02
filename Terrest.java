import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terrest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terrest extends Actor
{
    private int life;
    private int attack;
    private int shell;
    private int speed;
    
    /**
     * Act - do whatever the Terrest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public Terrest(int life, int attack, int shell, int speed){
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
    
    public void moverse(){
        move(this.speed);
    }
    
}
