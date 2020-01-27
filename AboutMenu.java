import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AboutMenu extends Menu
{

    public AboutMenu()
    {    
        
        prepare();
    }

    private void prepare()
    {

        GoBack goBack = new GoBack();
        addObject(goBack,((getWidth()/2) * 2) - 100,((getHeight()/2) * 2) - 50);
        
    }
}
