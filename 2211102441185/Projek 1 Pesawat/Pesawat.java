import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesawat extends Actor
{
    /**
     * Act - do whatever the Pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int JumlahEnergiDiambil =0;
    public void act()
    {
        // Add your action code here.
        move(1);
        if(Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(5);
        }
        cekScore();
        getWorld().showText("Score : "+JumlahEnergiDiambil, 100,50);
        
        Actor Energi = getOneObjectAtOffset(0,0, Energi.class);
        if(Energi != null){
            getWorld().removeObject(Energi);
            JumlahEnergiDiambil++;
        }
    }
    public void cekScore(){
        if(JumlahEnergiDiambil == 5){
        Tamat alert_Tamat = new Tamat();
        getWorld().addObject(alert_Tamat,300,300);
        }
    }
}
