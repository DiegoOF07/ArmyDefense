import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GenLightPlane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenLightPlane extends Button
{
    /**
     * Act - do whatever the GenLightPlane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isPressed = false;
    public void act()
    {
        if(isPressed && Greenfoot.isKeyDown("c")){
            int posY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new LightPlane(), 10, posY); 
            isPressed=false;
        }else if(!isPressed && !Greenfoot.isKeyDown("c")){
            isPressed=true;
        }
    }
}
