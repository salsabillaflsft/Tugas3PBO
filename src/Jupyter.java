public class Jupyter extends Bola {
    float r, p_orbit, V_jupyter, s_jupyter, v_rotation, v_revolution;
    Bola bola = new Bola();

    void setVolumeAndSurface(float r) {
        bola.Volume(r);
        bola.Surface(r);
        V_jupyter = bola.getVolume(r);
        s_jupyter = bola.getSurface(r);
    }

    public float getJupyterVolume() {
        return V_jupyter;
    }

    public float getJupyterSurface() {
        return s_jupyter;
    }
}
