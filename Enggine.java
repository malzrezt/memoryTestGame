
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Collections;
public class Enggine extends Core
{
    Core core = new Core();
    public void boxs(){
        
        Greenfoot.setSpeed(55);
        
            for(int i = 0; i < 25; i++)
            {
               core.cards.add(new TheBox(player.lvl));
            }
                   
            for(int i = 0; i < 12; i++)
            {
                core.cards.get(i).id = i;
                core.cards.get(i + 12).id = i;
            }
          
          
           //Collections.shuffle(core.intList);
           int d=0;
           for(int x=1; x<=4; x++){
               int n = 50;
                for(int z=0; z<6; z++){
                    
                        addObject(core.cards.get(core.intList.get(d)),20 + n, 95  * x);
                        n = n + 100;
                        d = d + 1;
                    
                }
            }  
    }
   
public void AI()
    {
        if(core.ids.size() > 1)
        {
            if(core.ids.get(0).id == core.ids.get(1).id)
            {
                core.music_benar.play();
                player.timer += 200;
                player.skor += 10; 
                Greenfoot.delay(25);
                core.ids.get(0).getImage().setTransparency(90);
                core.ids.get(0).getImage().setTransparency(55);
                
                core.ids.get(1).getImage().setTransparency(90);
                core.ids.get(1).getImage().setTransparency(55);
                Greenfoot.delay(25);
                
                removeObject(ids.get(0));
                removeObject(ids.get(1));
                core.ids.remove(1);
                core.ids.remove(0);
                
            }
            else
            {
                core.salah +=1;
                core.music_salah.play();
                Greenfoot.delay(25);
                core.ids.get(0).getImage().setTransparency(90);
                core.ids.get(0).getImage().setTransparency(55);
                
                core.ids.get(1).getImage().setTransparency(90);
                core.ids.get(1).getImage().setTransparency(55);
                Greenfoot.delay(25);
                core.ids.get(0).unflip();
                core.ids.get(1).unflip();
                core.ids.remove(1);
                core.ids.remove(0);
            }
        }
        if(player.lvl == 3 && numberOfObjects() < 1)
        {
            core.skor = new Integer[]{core.salah,player.getSkor()};
            Greenfoot.setWorld(new GameOver(core.skor));
        }
        if(numberOfObjects() < 1 && player.getTimer() > 0 )
        {
            player.lvl += 1;
            if(player.lvl == 1)
            {
                Greenfoot.setWorld(new MyGameNext_1());
            }
            else if(player.lvl == 2)
            {
                core.skor = new Integer[]{core.salah,player.getSkor(),player.timer};
                Greenfoot.setWorld(new MyGameNext_2(core.skor));
            }
            else if(player.lvl == 3)
            {
                core.skor = new Integer[]{core.salah,player.getSkor(),player.timer};
                Greenfoot.setWorld(new MyGameNext_3(core.skor));
            }
        }
        else if(player.getTimer() == 0)
        {
            //showText("kwkwkw", getWidth()/2, getHeight() - 25);
            core.skor = new Integer[]{core.salah,player.getSkor()};
            Greenfoot.setWorld(new GameOver(core.skor));
        }
    } 
    public void ShowTimes(){
      showText(Integer.toString(player.getTimer()), getWidth()/2, getHeight() - 25);
    }
    public void showScore(){
      showText("Skor : "+Integer.toString(player.skor), 65, (getHeight()-getHeight())+25);
    }
    public void showLvl(){
      showText("Level : "+Integer.toString(player.lvl), ((getWidth()/2) * 2) - 65, (getHeight()-getHeight())+25);
    }
    public void act(){
        
        
       
    }
}
