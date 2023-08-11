import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlienMonster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlienMonster extends Terrest
{
    /**
     * Act - do whatever the AlienMonster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public AlienMonster(){
        super(150,20,20,-2, 75);
    }
    public void act()
    {
        movement();
        border();
    }
}
