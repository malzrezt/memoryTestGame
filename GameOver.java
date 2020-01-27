import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
public class GameOver extends Enggine
{

    
    private String text;
    public GameOver(Integer[] nilai)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
        addObject(new GoToEnd(), getWidth()/2, getHeight()/2);
        showText(Integer.toString(nilai[0]), getWidth()/2 - 140, getHeight()/2 + 145);
        showText(Integer.toString(nilai[1]), getWidth()/2 + 140, getHeight()/2 + 145);
        if(nilai[1] >= 0 && nilai[1] <= 50){
            
            if(nilai[0] >= 0 && nilai[0] <= 10){
               text = "NICE TRY";
            }else if(nilai[0] > 10){
               text = "BAD";
            }
            showText(text, getWidth()/2, getHeight() - 25);
            
        }else if(nilai[1] >= 50 && nilai[1] < 80){
            
            if(nilai[0] >= 0 && nilai[0] <= 20){
               text = "OKE";
            }else if(nilai[0] > 20){
               text = "NOT BAD";
            }
            showText(text, getWidth()/2, getHeight() - 25);
            
        }else if(nilai[1] >= 80){
            
            if(nilai[0] >= 0 && nilai[0] <= 25){
               text = "EXCELENT";
            }else if(nilai[0] > 25){
               text = "GOOD";
            }
            showText(text, getWidth()/2, getHeight() - 25);
        }
    }
}
