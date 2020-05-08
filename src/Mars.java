public class Mars extends Bola {
    float r, p_orbit, V_mars, s_mars, v_rotation, v_revolution;
    Bola bola = new Bola();

    void setVolumeAndSurface(float r) {
        bola.Volume(r);
        bola.Surface(r);
        V_mars = bola.getVolume(r);
        s_mars = bola.getSurface(r);
    }

    public float getMarsVolume() {
        return V_mars;
    }

    public float getMarsSurface() {
        return s_mars;
    }
}
