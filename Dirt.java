import mayflower.*;
public class Dirt extends Block
{
    public static int num;
    public Dirt()
    {
        setImage("img/Tiles/5.png");
        num = 2;
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
        super.act();
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
