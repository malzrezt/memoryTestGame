import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GoBack extends Tombol
{
    
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
           {
               Greenfoot.setWorld(new HomeMenu());
           }
    }    
}
