import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
  
    public int timer=3000;
    public int timer_set;
    public int skor=0;
    public int lvl= 1;
    public void act() 
    {
    }
    public int getTimer(){
      //ubah ke detik
      timer_set = timer/100;  
      return timer_set;
    }
    public int getSkor(){
      //skor 
      return skor;
    }
}
