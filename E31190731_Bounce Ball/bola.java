import greenfoot.*;

public class bola extends Actor
{
    int x=3;
    int y=3;
    /**
     * Act - do whatever the bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        gerak();
        kanan();
        kiri();
        atas();
        papankayu();
    }    
    public void gerak()
    {
        setLocation(getX()+x,getY()+y);
    }
    public void kanan()
    {
        if(getX()>=getWorld().getWidth()-getImage().getWidth()/2){
            x=x-1;
        }
    }
    public void kiri()
    {
        if(getX()<=getImage().getWidth()/2){
            x=x+1;
        }
    }
    public void atas()
    {
        Actor batamerah=getOneIntersectingObject(bata.class);
        if(getY()<=getImage().getHeight()/2){
            y=y+1;
        }
        if(batamerah !=null){
            ((bg)getWorld()).tambah();
            getWorld().removeObject(batamerah);
            GreenfootSound a = new GreenfootSound("koin.mp3");
            a.play();
        }
    }
    public void papankayu()
    {
        Actor kayu=getOneIntersectingObject(papan.class);
        if(kayu !=null){
            y=y-1;
        }
        if(getY()>=getWorld().getHeight()-getImage().getHeight()/2){
            GreenfootSound a = new GreenfootSound("kalah.wav");
            a.play();
            getWorld().addObject( new gameover(),getWorld().getWidth()/2, getWorld().getHeight()/2
            );
            Greenfoot.stop(); 
        }
        if (getWorld().getObjects(bata.class).isEmpty()){
            GreenfootSound a = new GreenfootSound("win.wav");
            a.play();
            getWorld().addObject(new win(),getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop(); 
        }
    }
}
