import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeavySoldier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeavySoldier extends Terrest
{
    /**
     * Act - do whatever the HeavySoldier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HeavySoldier(){
        super(120,25,20,1);
    }
    
    public void act()
    {
        moverse();
    }
}
