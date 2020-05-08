public class Earth extends Bola {
    float r, p_orbit, V_earth, s_earth, v_rotation, v_revolution;
    Bola bola = new Bola();

    void setVolumeAndSurface(float r) {
        bola.Volume(r);
        bola.Surface(r);
        V_earth = bola.getVolume(r);
        s_earth = bola.getSurface(r);
    }

    public float getEarthVolume() {
        return V_earth;
    }

    public float getEarthSurface() {
        return s_earth;
    }
}
