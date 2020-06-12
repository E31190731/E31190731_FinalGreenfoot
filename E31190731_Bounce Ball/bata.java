import greenfoot.*;

public class bata extends Actor
{
    /**
     * Act - do whatever the bata wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bata()
    {
        GreenfootImage img=getImage();
        img.scale(img.getWidth(),img.getHeight()-30);
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}

