import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author Koolkev246 a.k.a Kevin Kwan
 * @version 1.0.0
 */
public class unfairblock extends hazard
{
private boolean destruct=true;
        public unfairblock(String blocktype)
    {setSkin(blocktype);

}
public void act()
{
    hurt();
    destroyBullets(destruct);
}
}
