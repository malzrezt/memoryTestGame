import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Core extends World
{
   
    Player player = new Player();
    public int salah=0;
    public Integer[] skor = {0,0,0};
    public ArrayList<TheBox> cards = new ArrayList<TheBox>();
    Integer[] intArray = { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23 };
    List<Integer> intList = Arrays.asList(intArray);
    public static ArrayList<TheBox> ids = new ArrayList<TheBox>();
    GreenfootSound music_benar = new GreenfootSound("Benar.wav");
    GreenfootSound music_salah = new GreenfootSound("Salah.wav");
    public Core()
    {    
       // Greenfoot.setSpeed(55);
        super(950, 439, 1); 
    }
}
