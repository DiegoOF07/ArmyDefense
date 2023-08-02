import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GenLightSoldier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenLightSoldier extends Button
{
    /**
     * Act - do whatever the GenLightSoldier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isPressed = false;
    public GenLightSoldier(){
        
    }
    public void act()
    {
        if(isPressed && Greenfoot.isKeyDown("SPACE")){
            int posY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new LightSoldier(), 10, posY); 
            isPressed=false;
        }else if(!isPressed && !Greenfoot.isKeyDown("SPACE")){
            isPressed=true;
        }
    }
    
}
