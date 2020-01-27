import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class GoToTutorial extends Tombol
{
    
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
           {
               Greenfoot.setWorld(new TutorialMenu());
           }
    }    
}
