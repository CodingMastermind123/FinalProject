import mayflower.*;
public class Water extends Actor
{
    private static int num;
    public Water()
    {
        num = 2;
        setImage("img/Tiles/17.png");
    }

    public void act()
    {
        if(Mayflower.isKeyDown(Keyboard.KEY_LEFT))
        {
            setLocation(getX() + num, getY());
        }
        if(Mayflower.isKeyDown(Keyboard.KEY_RIGHT))
        {
            setLocation(getX() - num, getY());
        }
        
    }
    public int getNum()
    {
        return num;
    }
    
    public static void increaseNum()
    {
        num += 2;
    }
}
