import mayflower.*;
public class YouWin2 extends World
{
    
    public YouWin2()
    {
        setBackground("img/Basic.png");
        
        showText("YOU WIN", 200, 300, Color.BLACK);
            showText("Press Enter to Continue", 300, 400, Color.BLACK);
    }

    public void act()
    {
       if(Mayflower.isKeyDown(Keyboard.KEY_ENTER))
       {
           World w = new World3();
           Mayflower.setWorld(w);
       }
    }
}