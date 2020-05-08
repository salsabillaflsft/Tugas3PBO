public class Neptune extends Bola {
    float r, p_orbit, V_neptune, s_neptune, v_rotation, v_revolution;
    Bola bola = new Bola();

    void setVolumeAndSurface(float r) {
        bola.Volume(r);
        bola.Surface(r);
        V_neptune = bola.getVolume(r);
        s_neptune = bola.getSurface(r);
    }

    public float getNeptuneVolume() {
        return V_neptune;
    }

    public float getNeptuneSurface() {
        return s_neptune;
    }
}
