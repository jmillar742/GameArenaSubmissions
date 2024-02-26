public class Player 
{
    private int xLoc;
    private int yLoc;
    private Rectangle Body = new Rectangle(xLoc, yLoc, 15, 40, "BLUE");
    private Rectangle Head = new Rectangle(xLoc, yLoc - 40, 10, 10, "PINK"); 
    public Player(int x, int y)
    {
        this.xLoc = x;
        this.yLoc = y;
        Head.setYPosition(y - 10);
        Body.setYPosition(y);
        Head.setXPosition(x+2);
        Body.setXPosition(x);
    }
    public void addTo(GameArena arena)
    {
        arena.addRectangle(Body);
        arena.addRectangle(Head);
    }   
    public void move(int Direction)
    {
        if(Direction == 0)
        {
            yLoc--;
            Head.setYPosition(yLoc - 10);
            Body.setYPosition(yLoc);
        }
        else if(Direction == 1)
        {
            xLoc++;
            Head.setXPosition(xLoc+2);
            Body.setXPosition(xLoc);
        }
        else if(Direction == 2)
        {
            yLoc++;
            Head.setYPosition(yLoc - 10);
            Body.setYPosition(yLoc);
        }
        else if(Direction == 3)
        {
            xLoc--;
            Head.setXPosition(xLoc+2);
            Body.setXPosition(xLoc);
        }
        else if(Direction == 4)
        {
            yLoc -= 100;
            Head.setYPosition(yLoc - 10);
            Body.setYPosition(yLoc);

        }
        else if(Direction == 5)
        {
            yLoc += 100;
            Head.setYPosition(yLoc - 10);
            Body.setYPosition(yLoc);
        }
    }
    public int GetXLoc()
    {
        return xLoc;
    }
    public int GetYLoc()
    {
        return yLoc;
    }
    public void setXLoc(int x)
    {
        xLoc = x;
    }
    public void setYLoc(int y)
    {
        yLoc = y;

    }

    public Rectangle getBody()
    {
        return Body;
    }
}
