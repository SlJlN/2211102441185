import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Energi energi = new Energi();
        addObject(energi,635,125);
        Energi energi2 = new Energi();
        addObject(energi2,634,515);
        Energi energi3 = new Energi();
        addObject(energi3,488,306);
        Energi energi4 = new Energi();
        addObject(energi4,418,50);
        Energi energi5 = new Energi();
        addObject(energi5,120,420);
        energi3.setLocation(153,121);
        Energi energi6 = new Energi();
        addObject(energi6,407,305);
        Energi energi7 = new Energi();
        addObject(energi7,414,537);
        Pesawat pesawat = new Pesawat();
        addObject(pesawat,80,290);
    }
}
