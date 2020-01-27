import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HomeMenu extends Menu
{

    public HomeMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        prepare();
    }

    private void prepare()
    {
        addObject(new ImagesLogo(),getWidth()/2,getHeight()/2 - 130);
        addObject(new GoToGame(),getWidth()/2,getHeight()/2);
        GoToTutorial goToTutorial = new GoToTutorial();
        addObject(goToTutorial,getWidth()/2 + 62,getHeight()/2 + 70);
        GoToAbout goToAbout = new GoToAbout();
        addObject(goToAbout,getWidth()/2 - 62,getHeight()/2 + 70);
    }
}
