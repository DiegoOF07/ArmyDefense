import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GenHeavySoldier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenHeavySoldier extends Button
{
    /**
     * Act - do whatever the GenHeavySoldier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isPressed = false;
    public void act()
    {
        if(isPressed && Greenfoot.isKeyDown("x")){
            int posY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new HeavySoldier(), 10, posY); 
            isPressed=false;
        }else if(!isPressed && !Greenfoot.isKeyDown("x")){
            isPressed=true;
        }
    }
}
