import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LightPlane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LightPlane extends AirForce
{
    /**
     * Act - do whatever the LightPlane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public LightPlane(){
        super(250, 45, 100, 3);
    }
    public void act()
    {
        movement();
        border();
    }
}
