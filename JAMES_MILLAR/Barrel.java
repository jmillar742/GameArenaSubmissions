public class Barrel
{
    private int direction;
    private int xLoc;
    private int yLoc;
    private int speed = 1;
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
    public void removeFrom(GameArena arena)
    {
        arena.removeRectangle(bHead);
    }
    public void move()
    {
        if(direction == 0)
        {
            yLoc--;
            bHead.setYPosition(yLoc);
        }
        else if(direction == 1)
        {
            xLoc = xLoc + this.speed;
            bHead.setXPosition(xLoc);
        }
        else if(direction == 2)
        {
            yLoc++;
            bHead.setYPosition(yLoc);
        }
        else if(direction == 3)
        {
            xLoc = xLoc - this.speed;
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
    public void SpeedUp()
    {
        speed+=1;
    }
    public int getSpeed()
    {
        return this.speed;
    }
    public void setSpeed(int v)
    {
        this.speed = v;
    }
    public void setDirection(int d)
    {
        this.direction = d;
    }
    public int getDirection()
    {
        return direction;
    }
    public boolean collides(Rectangle r)
    {
        return bHead.collides(r);
    }
}