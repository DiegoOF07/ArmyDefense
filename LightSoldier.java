import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LightSoldier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LightSoldier extends Terrest
{
    /**
     * Act - do whatever the LightSoldier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LightSoldier(){
        super(100,10,10,2);
    }
    
    public void act()
    {
        movement();
        border();
    }
}
