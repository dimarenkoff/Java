package druhy;

import Circle.Circle;

public class Cylinder extends Circle
{
    private double height;
    public Cylinder()
    {
        this.color=super.color;
        this.radius=super.radius;        
        double h = 1.0;
        this.height = h;
    }
    public Cylinder(double h)
    {
        //String c = this.color;
        //double r = this.radius;         
        this.height = h;
    }
    public Cylinder(double r, double h)
    {
        //String c = this.color;
        this.radius = r;
        this.height = h;
    }
    public double GetHeight()
    {
        return height;
    }

    public double GetVolume()
    {
        return Math.PI*(radius*radius) * height;
    }
    //public double GetArea()  { return Math.PI * (radius * radius); } }

}

