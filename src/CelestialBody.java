import sun.java2d.Surface;

import java.awt.*;

public class CelestialBody {
    private double xLoc = 0;
    private double yLoc = 0;
    private float mass = 0;
    private float diameter = 0;
    private float volume = 0;
    private float surface = 0;
    private float keliling = 0;
    private float ro_velocity = 0;
    private float re_velocity = 0;
    Color color;
    private double acceleration =0;
    private double dirX = 0;
    private double dirY = 0;
    private double distance = 0;
    private double initial=1000;
    private double max=0;
    boolean visible;
    int orbitDots[][] = new int[1000][2];
    int counter = 0;

    public CelestialBody (double x, double y, float Diameter, float Volume, float Surface, float Keliling, float rotationVelocity, float revolutionVelocity, Color bodyColor, float Mass)
    {
        xLoc = x;
        yLoc = y;
        diameter = Diameter;
        volume = Volume;
        surface = Surface;
        keliling = Keliling;
        ro_velocity = rotationVelocity;
        re_velocity = revolutionVelocity;
        color = bodyColor;
        mass = Mass;
    }
    public double getXPosition(){
        return xLoc;
    }
    public double getYPosition(){
        return yLoc;
    }
    public float getDiameter() {return diameter;}
    public float getVolume(){
        return volume;
    }
    public float getSurface(){
        return surface;
    }
    public float getKeliling(){
        return keliling;
    }
    public float getRo_velocity() { return ro_velocity; }
    public float getRe_velocity() { return re_velocity; }

    public float getMass(){ return mass; }
    public boolean getDescVisible() { return visible; }
    public void setDescVisible(boolean b) {
        visible = b;
    }


    public void move()
    {
        xLoc += ro_velocity;
        yLoc += re_velocity;
    }

    public void update(double StarX, double StarY, float mass) {
        if (visible){
            orbitDots[counter][0]=(int)(xLoc+.5);
            orbitDots[counter][1]=(int)(yLoc+.5);
            counter = (counter+1)%1000;
        }
        else{
            orbitDots = new int[1000][2];
            counter = 0;
        }
        distance = Math.sqrt((StarX - xLoc)*(StarX - xLoc) + (StarY - yLoc)*(StarY - yLoc));
        initial = Math.min(distance,initial);
        max = Math.max(distance,max);

        acceleration = mass/distance/distance;

        dirX = (StarX-xLoc)/distance;
        dirY = (StarY-yLoc)/distance;

        ro_velocity += dirX * acceleration;
        re_velocity += dirY * acceleration;
        move();
    }

    public void draw(Graphics g, double size) {
        g.setColor(color);
        g.fillOval((int)(650+(xLoc-diameter/2-650)*size), (int)(500+(yLoc-diameter/2-500)*size),
                (int)(diameter*size), (int)(diameter*size));
    }


   public void dispDesc(Graphics g, double scale) {
        g.setColor(color);
        for (int[] orbit : orbitDots)
            g.drawLine(orbit[0],orbit[1],orbit[0],orbit[1]);
        g.setFont(new Font("Arial", Font.PLAIN, 10));
        g.setColor(Color.MAGENTA);
        //gangeri ni apaan dan kenapa error:(((((
        //g.drawString((Math.round(distance*100.0)/100.0) * 1000000 + " km",
          //       diameter+ (int) (600+(xLoc-diameter/2-600)*scale), 16+(float)(400+(yLoc-diameter/2-400)*scale)+diameter);

   }

    public boolean hitPlanet(int x, int y, double scale) {
        return (x>600+(getXPosition()-diameter-600)*scale && x<600+(getXPosition()+diameter-600)*scale &&
                y>400+(getYPosition()-diameter-400)*scale && y<400+(getYPosition()+diameter-400)*scale);
    }


}
