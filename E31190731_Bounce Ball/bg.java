import greenfoot.*;
import java.util.List;
public class bg extends World
{
    Counter counter = new Counter("Skor: ");
    /**
     * Constructor for objects of class bg.
     * 
     */
    public bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        addObject(counter,70,550);
        addObject(new bata(),65,30);
        addObject(new bata(),65,80);
        addObject(new bata(),65,130);
        addObject(new bata(),65,180);
        addObject(new bata(),200,30);
        addObject(new bata(),200,80);
        addObject(new bata(),200,130);
        addObject(new bata(),200,180);
        addObject(new bata(),335,30);
        addObject(new bata(),335,80);
        addObject(new bata(),335,130);
        addObject(new bata(),335,180);
        addObject(new papan(),200,500);
        addObject(new bola(),200,450);
        
        GreenfootSound a = new GreenfootSound("login.mp3");
        a.play();
        a.playLoop();
        
        
        

    }
    public void tambah(){
        counter.add(5);
    }
}
