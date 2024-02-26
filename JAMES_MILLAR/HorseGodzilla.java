public class HorseGodzilla
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(2400, 900);
        /*Ball b = new Ball(250, 150, 20, "GREEN");

        arena.addBall(b);

        while(true)
        {
            arena.pause();
        }
        */
        Player James = new Player(1000, 800);
        //Barrel BarrelList[0] = new Barrel(2000, 800);
        Barrel[] BarrelList;
        int NumOfBarrels = 5;
        BarrelList = new Barrel[NumOfBarrels];
        for(int i = 0; i < NumOfBarrels; i++)
        {
            BarrelList[i] = new Barrel(2000, 800);
        }
        
        BarrelList[0].setDirection(3);
        boolean jump = false;
        int barLoc1 = 0;
        int barLoc2 = 0;
        int currentBarrelCount = 1;
        James.addTo(arena);
        BarrelList[0].addTo(arena);
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
                    barLoc1 = BarrelList[0].GetXLoc();
                    if(BarrelList[0].getDirection() == 1)
                    {
                    
                        barLoc2 = barLoc1 + 80 * BarrelList[0].getSpeed();
                    }
                    else
                    {
                        barLoc2 = barLoc1 - 80 * BarrelList[0].getSpeed();
                    }
                    jump = true;
                    James.move(4);
                
                    
                
                
                }
            }
            if(jump)
            {
                if(BarrelList[0].GetXLoc() == barLoc2)
                {
                    jump = false;
                    James.move(5);
                }
            } 
            
            
            
            /*if(BarrelList[0].GetXLoc() > 0 && barDirection != 1)
            {
                barDirection = 3;
                
            }
            else if(BarrelList[0].GetXLoc() < 500 && barDirection != 3)
            {

            } */
            for(Barrel b : BarrelList)
            {
                if(b.GetXLoc() <= 400)
                {
                    b.setDirection(1);
                    b.SpeedUp();
                }
                if (b.GetXLoc() >= 2000)
                {
                    b.setDirection(3);
                    b.SpeedUp();
                }
                b.move();
                
                if(b.collides(James.getBody()))
                {
                    b.setXLoc(2000);
                    b.setSpeed(1);
                }
                
            }
            if(BarrelList[0].getSpeed() >= 12) // end of level, adds another barrel
            {
                currentBarrelCount++; 
                for(int j = 0; j < currentBarrelCount; j++)
                {
                    BarrelList[j].removeFrom(arena);
                    BarrelList[j].setSpeed(currentBarrelCount-j);
                    BarrelList[j].addTo(arena);
                }
                                 

                
            }
            
            
            
            arena.pause();
            
        }
    }
}
