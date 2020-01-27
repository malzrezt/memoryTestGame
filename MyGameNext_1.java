import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Collections;
public class MyGameNext_1 extends Enggine
{
  
    public MyGameNext_1()
    {
        boxs();
    }
    public void act(){
        player.timer -=1;
        AI();
        ShowTimes();
        showScore();
        showLvl();
    } 
    
}
