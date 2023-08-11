import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HumanShot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HumanShot extends Actor
{
    /**
     * Act - do whatever the HumanShot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int damage;
    public HumanShot(int damage){
        this.damage = damage;
    }
    public void act()
    {
        move(7);
    }
}
