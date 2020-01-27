import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.Collections.*;

public class TheBox extends Player
{
    public int id;
    int j = 0;
    public TheBox(int next){
        lvl = next;
        GreenfootImage image = new GreenfootImage("kotak"+ lvl +".jpg");
        image.scale(70, 70);
        setImage(image);
    }
    public void flip()
    {
        GreenfootImage image = new GreenfootImage("img/lv"+ lvl +"/img" + Integer.toString(id) + ".jpg"); 
        image.scale(70, 70);
        setImage(image);
        j += 1;
        
    }
    
    public void unflip()
    {  
        j =0;
        GreenfootImage images = new GreenfootImage("kotak"+ lvl +".jpg"); 
        images.scale(70, 70);
        setImage(images);
    }
    
    private void click()
    {
        if(Greenfoot.mousePressed(this))
        {
           flip();
           if( j == 1)
           {
            Enggine.ids.add(this);
           }
        }
    }
    
    public void act()
    {
        click();
        
    }   
}
