import greenfoot.*;
/**
 * 
 * @author Koolkev246 a.k.a Kevin Kwan
 * @version 1.0.0
 */
public class image extends Platform

{
    private boolean destruct=true;
    public image(String image)
    {
        setSkin(image);
}
      public void act()
      {
          destroyBullets(destruct);
      
        }
       
}