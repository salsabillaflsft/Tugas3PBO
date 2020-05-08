public class Venus extends Bola{
    float r, p_orbit, V_venus, s_venus, v_rotation, v_revolution;
    Bola bola = new Bola();

    void setVolumeAndSurface(float r) {
        bola.Volume(r);
        bola.Surface(r);
        V_venus = bola.getVolume(r);
        s_venus = bola.getSurface(r);
    }

    public float getVenusVolume() {
        return V_venus;
    }

    public float getVenusSurface() {
        return s_venus;
    }
}
