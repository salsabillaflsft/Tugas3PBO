public class Uranus extends Bola {
    float r, p_orbit, V_uranus, s_uranus, v_rotation, v_revolution;
    Bola bola = new Bola();

    void setVolumeAndSurface(float r) {
        bola.Volume(r);
        bola.Surface(r);
        V_uranus = bola.getVolume(r);
        s_uranus = bola.getSurface(r);
    }

    public float getUranusVolume() {
        return V_uranus;
    }

    public float getUranusSurface() {
        return s_uranus;
    }
}
