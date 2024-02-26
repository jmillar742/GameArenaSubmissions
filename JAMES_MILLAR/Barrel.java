public class Barrel
{
    private int xLoc;
    private int yLoc;
    private Rectangle bHead = new Rectangle(xLoc, yLoc, 20, 20,"#D8A55F");
    public Barrel(int x, int y)
    {
        this.xLoc = x;
        this.yLoc = y;
        bHead.setXPosition(x);
        bHead.setYPosition(y);
    }
    public void addTo(GameArena arena)
    {
        arena.addRectangle(bHead);
    }   
    public void move(int Direction)
    {
        if(Direction == 0)
        {
            yLoc--;
            bHead.setYPosition(yLoc);;
        }
        else if(Direction == 1)
        {
            xLoc++;
            bHead.setXPosition(xLoc);
        }
        else if(Direction == 2)
        {
            yLoc++;
            bHead.setYPosition(yLoc);
        }
        else if(Direction == 3)
        {
            xLoc--;
            bHead.setXPosition(xLoc);
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
    public boolean collides(Rectangle r)
    {
        return bHead.collides(r);
    }
}