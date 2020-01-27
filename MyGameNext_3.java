import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyGameNext_3 extends Enggine
{

    public MyGameNext_3(Integer[] nilai)
    {
        
       player.lvl = 3;
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
