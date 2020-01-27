import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Collections;
public class MyGameNext_2 extends Enggine
{

    public MyGameNext_2(Integer[] nilai)
    {
        player.lvl = 2;
        core.salah = nilai[0];
        player.skor  = nilai[1];
        player.timer = nilai[2];
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
