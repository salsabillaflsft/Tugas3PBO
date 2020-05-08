public class Formula {
    float r, p_orbit, volume, surface, v_rotation, v_revolution;

    void Volume(float r) {
        this.r = r;
        volume = (float) (4 * Math.pow(r,3)/3);
    }

    void Surface(float r) {
        surface = (float) (4 * 3.14 * Math.pow(r,2));
    }

    public float getVolume() {
        return volume;
    }

    public float getSurface() {
        return surface;
    }
}
