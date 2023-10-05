import mayflower.*;
public class MovingBlock extends Block
{
    
    private static int num;
    public MovingBlock()
    {
        setImage("img/Tiles/14.png");
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
