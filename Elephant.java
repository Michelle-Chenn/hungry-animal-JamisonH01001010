import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(1);
        }
    }
}
