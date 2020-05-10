public class Bola {
    float r, p_orbit, volume, surface, keliling, t_rotation, t_revolution, v_rotation, v_revolution,diameter;

    public void Volume(float r) {
        this.r = r;
        volume = (float) (4 * 3.14 * Math.pow(r,3)/3);
    }
    public void Diameter(float r) {
        this.r = r;
        diameter =  r*2;
    }

    void Surface(float r) {
        surface = (float) (4 * 3.14 * Math.pow(r,2));
    }

    void KelilingPlanet(float r) {
        keliling = (float) (2 * 3.14 * r);
    }

    void RotationVelocity(float keliling, float t_rotation) {
        v_rotation = keliling / t_rotation;
    }

    void RevolutionVelocity(float p_orbit, float t_revolution) {
        v_revolution = p_orbit / t_revolution;
    }

    public float getDiameter() {return diameter;}

    public float getVolume(float r) {
        return volume;
    }

    public float getSurface(float r) {
        return surface;
    }

    public float getKeliling(float r) {
        return keliling;
    }

    public float getRotationVelocity(float keliling, float t_rotation) {
        return v_rotation;
    }

    public float getRevolutionVelocity(float p_orbit, float t_revolution) {
        return v_revolution;
    }
}
