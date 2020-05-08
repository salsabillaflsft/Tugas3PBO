public class Saturn extends Bola {
    float r, p_orbit, V_saturn, s_saturn, v_rotation, v_revolution;
    Bola bola = new Bola();

    void setVolumeAndSurface(float r) {
        bola.Volume(r);
        bola.Surface(r);
        V_saturn = bola.getVolume(r);
        s_saturn = bola.getSurface(r);
    }

    public float getSaturnVolume() {
        return V_saturn;
    }

    public float getSaturnSurface() {
        return s_saturn;
    }
}
