import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LigthAlienShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LigthAlienShip extends AirForce
{
    /**
     * Act - do whatever the LigthAlienShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public LigthAlienShip(){
        super(150, 50, 150, -3);
    }
    public void act()
    {
        movement();
    }
}
