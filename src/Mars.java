public class Mars extends Bola {
    float r, p_orbit, v_mars, s_mars, v_rotation, v_revolution;
    Bola bola = new Bola();

    void setVolumeAndSurface(float r) {
        bola.Volume(r);
        bola.Surface(r);
        v_mars = bola.getVolume(r);
        s_mars = bola.getSurface(r);
    }

    void setPanjangLintasanRotasi(float r) {
        bola.KelilingPlanet(r);
        p_orbit = bola.getKeliling(r);
    }

    void setRotationVelocity(float t_rotation) {
        keliling = getPanjangLintasanRotasi();
        bola.RotationVelocity(keliling, t_rotation);
        v_rotation = bola.getRotationVelocity(keliling, t_rotation);
    }

    void setRevolutionVelocity(float p_orbit, float t_revolution) {
        bola.RevolutionVelocity(p_orbit, t_revolution);
        v_revolution = bola.getRevolutionVelocity(p_orbit, t_revolution);
    }

    public float getMarsVolume() {
        return v_mars;
    }

    public float getMarsSurface() {
        return s_mars;
    }

    public float getPanjangLintasanRotasi() {
        return p_orbit;
    }

    public float getRotationVelocity() {
        return v_rotation;
    }

    public float getRevolutionVelocity() {
        return v_revolution;
    }
}
