import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Akurasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Akurasi extends Props
{
    int akurasi = 100;
    GreenfootImage akurasiImage;  
    public Akurasi()
    {
        this.akurasiImage = new GreenfootImage("Akurasi : "+ String.valueOf(this.akurasi), 36, Color.WHITE, Color.BLACK);
        this.setImage(akurasiImage);
    }
    
    public void addAkurasi(int akurasi){
        this.akurasi += akurasi ;
        this.setImage(akurasiImage);
        System.out.println("Akurasi : "+ akurasi);
    }
    
    public void setAkurasi(int akurasi){
        this.akurasi = akurasi;
    }
    
    public int getAkurasi(){
        return this.akurasi;
    }
    
    public void act()
    {
        System.out.println(this.akurasi);
        this.akurasiImage = new GreenfootImage("Akurasi : "+ String.valueOf(this.akurasi), 36, Color.WHITE, Color.BLACK);
        this.setImage(akurasiImage);
    }
}