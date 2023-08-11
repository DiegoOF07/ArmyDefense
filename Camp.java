import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Camp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camp extends World
{

    /**
     * Constructor for objects of class Camp.
     * 
     */
    private int enemy;
    public Camp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 720, 1);
        getBackground().scale(1500, 720);
        //<a href="https://www.freepik.es/vector-gratis/proceso-construccion-forma-curva-vista-superior-carretera-partes-barreras-asfaltadas-o-tierra-camino-ventoso-hierba-verde-rocas-alrededor-paisaje-camino-construccion-ilustracion-vectorial-dibujos-animados_23592793.htm#query=vista%20superior%20paisaje&position=3&from_view=keyword&track=ais">Imagen de upklyak</a> en Freepik
        addGenerator();
    }
    
    public void act(){
        generateEnemies();
    }
    
    
    public void generateEnemies(){
        if (enemy > 0){
            enemy--;
        }else{
            enemy = 100;
        }
        if (enemy == 1){
            int posY = Greenfoot.getRandomNumber(getHeight());
            addObject(new AlienMonster(), getWidth()-10, posY);
            
        }
    }
    
    public void addGenerator(){
        addObject(new GenLightSoldier(), 0,0);
        addObject(new GenHeavySoldier(), 0,0);
        addObject(new GenLightPlane(), 0,0);
    }
}
