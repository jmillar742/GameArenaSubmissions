public class HorseGodzilla
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(500, 300);
        /*Ball b = new Ball(250, 150, 20, "GREEN");

        arena.addBall(b);

        while(true)
        {
            arena.pause();
        }
        */
        Player James = new Player(200, 200);
        Barrel Bar1 = new Barrel(400, 200);
        int barDirection = 3;
        boolean jump = false;
        int barLoc1 = 0;
        int barLoc2 = 0;
        James.addTo(arena);
        Bar1.addTo(arena);
        while(true)
        {
            
            /*if(arena.letterPressed('w'))
            {
                James.move(0);
            }
            */
            if(arena.letterPressed('d'))
            {
                James.move(1);
            }
            /* 
            else if(arena.letterPressed('s'))
            {
                James.move(2);
            }
            */
            else if(arena.letterPressed('a'))
            {
                James.move(3);
            }
            if(!jump)
            {
                if(arena.spacePressed())
                {
                    barLoc1 = Bar1.GetXLoc();
                    if(barDirection == 1)
                    {
                    
                        barLoc2 = barLoc1 + 80;
                    }
                    else
                    {
                        barLoc2 = barLoc1 - 80;
                    }
                    jump = true;
                    James.move(4);
                
                    
                
                
                }
            }
            if(jump)
            {
                if(Bar1.GetXLoc() == barLoc2)
                {
                    jump = false;
                    James.move(5);
                }
            }
            
            /*if(Bar1.GetXLoc() > 0 && barDirection != 1)
            {
                barDirection = 3;
                
            }
            else if(Bar1.GetXLoc() < 500 && barDirection != 3)
            {

            } */
            if(Bar1.GetXLoc() == 0)
            {
                barDirection = 1;
            }
            if (Bar1.GetXLoc() == 500)
            {
                barDirection = 3;
            }
            Bar1.move(barDirection);
            if(Bar1.collides(James.getBody()))
            {
                Bar1.setXLoc(500);
            }
            
            arena.pause();
            
        }
    }
}
