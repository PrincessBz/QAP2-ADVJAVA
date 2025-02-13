

public class MyLine {
    private MyPoint begin;
    private MyPoint end;


// constructors 
    public MyLine(int x1, int y1, int x2, int y2)
    {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end)
    {
        this.begin = begin;
        this.end = end;
    }

// Getters and setters
    public MyPoint getBegin()
    {
        return begin;
    }
    public void setBegin(MyPoint begin)
    {
        this.begin = begin;
    }

    public MyPoint getEnd()
    {
        return end;
    }
    public void setEnd(MyPoint end)
    {
        this.end = end;
    }

    public int getBeginX()
    {
        return this.begin.getX();
    }
    public int getBeginY()
    {
        return this.begin.getY();
    }

    public int getEndX()
    {
        return this.end.getX();
    }
    public int getEndY()
    {
        return this.end.getY();
    }

    public void setBeginX(int x)
    {
        this.begin.setX(x);
    }
    public void setBeginY(int y)
    {
        this.begin.setY(y);
    }
    public void setEndX(int x)
    {
        this.end.setX(x);
    }
    public void setEndY(int y)
    {
        this.end.setY(y);
    }
    public void setBeginXY(int x, int y)
    {
        this.begin.setXY(x, y);
    }
    public void setEndXY(int x, int y)
    {
        this.end.setXY(x, y);
    }
    public int[] getBeginXY()
    {
        int a[]  = new int[2];
        a[0] = this.begin.getX();
        a[1] = this.begin.getY();
        return a;
    }
    public int[] getEndXY()
    {
        int a[] = new int[2];
        a[0] = this.end.getX();
        a[1] = this.end.getY();
        return a;
    }

    // Length and Gradient method

    public double getLength()
    {
        return begin.distance(end);
    }
    public double getGradient()
    {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    // toString method
    @SuppressWarnings("override")
    public String toString()
    {
        return "MyLine[begin= " + begin + ", end= " + end + "]";
    }
}