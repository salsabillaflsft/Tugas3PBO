import java.awt.*;
import java.util.Scanner;

class NumberOfMenu{
    synchronized void printNumber(int num, String menuName){
        //for (int i=1;i<=9;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(num + ". " + menuName);
        //}
    }
}

class MenuThread extends Thread{
    NumberOfMenu nRef;

    MenuThread(NumberOfMenu n){
        nRef = n;
    }

    @Override
    public void run(){
        synchronized (nRef) {
            for (int i = 1; i<=9; i++){
                if (i == 1) {
                    nRef.printNumber(1,"Mercury");
                }
                else if (i == 2) {
                    nRef.printNumber(2,"Venus");
                }
                else if (i == 3) {
                    nRef.printNumber(3,"Earth");
                }
                else if (i == 4) {
                    nRef.printNumber(4,"Mars");
                }
                else if (i == 5) {
                    nRef.printNumber(5,"Jupyter");
                }
                else if (i == 6) {
                    nRef.printNumber(6,"Saturn");
                }
                else if (i == 7) {
                    nRef.printNumber(7,"Uranus");
                }
                else if (i == 8) {
                    nRef.printNumber(8,"Neptune");
                }
                else {
                    nRef.printNumber(9,"Exit");
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float  set_p_orbit, set_t_rotasi, set_t_revolusi;
        int set_r, menu;
        char yes_no;

        Bola bola = new Bola();
        Mercury mercury = new Mercury();
        Venus venus = new Venus();
        Earth earth = new Earth();
        Mars mars = new Mars();
        Jupyter jupyter = new Jupyter();
        Saturn saturn = new Saturn();
        Uranus uranus = new Uranus();
        Neptune neptune = new Neptune();
        MercuryIllustration mercuryIllustration = new MercuryIllustration();
        VenusIllustration venusIllustration = new VenusIllustration();
        EarthIllustration earthIllustration = new EarthIllustration();
        MarsIllustration marsIllustration = new MarsIllustration();
        JupyterIllustration jupyterIllustration = new JupyterIllustration();
        SaturnIllustration saturnIllustration = new SaturnIllustration();
        UranusIllustration uranusIllustration = new UranusIllustration();
        NeptuneIllustration neptuneIllustration = new NeptuneIllustration();
        SolarSystemGeneral solarSystemGeneral = new SolarSystemGeneral();
        //CelestialBody celestialBody = new CelestialBody();
        do{
            System.out.println("This is Planets System's Data");
            System.out.println("What do you want to know?");
            System.out.println("=======MENU=======");

            NumberOfMenu numberOfMenu = new NumberOfMenu();
            MenuThread nRef = new MenuThread(numberOfMenu);
            nRef.start();
            try {
                nRef.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Choose : ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("======MERCURY======");
                    System.out.println("Input radius : ");
                    set_r = input.nextInt();
                    bola.setR(set_r);
                    //mercuryIllustration.passingR(set_r);
                    mercury.setVolumeAndSurface(set_r);
                    mercury.setPanjangLintasanRotasi(set_r);
                    mercury.setDiameter(set_r);
                    System.out.println("Panjang lintasan rotasi atau keliling planet : " + mercury.getPanjangLintasanRotasi());
                    System.out.println("Mercury's Volume : " + mercury.getMercuryVolume());
                    System.out.println("Mercury's Surface : " + mercury.getMercurySurface());

                    System.out.println("Input panjang lintasan revolusi : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    mercury.setRotationVelocity(set_t_rotasi);
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();
                    mercury.setRevolutionVelocity(set_p_orbit, set_t_revolusi);

                    System.out.println("Kecepatan rotasi : " + mercury.getRotationVelocity());
                    System.out.println("Kecepatan revolusi : " + mercury.getRevolutionVelocity());

                    //Ilustrasi volume
                    mercuryIllustration.main(null);

                    //Ilustrasi pergerakan
                    System.out.println("Lihat ilustrasi pergerakan?  ");
                    yes_no = input.next().charAt(0);
                    if(yes_no == 'y' || yes_no == 'Y') {
                        System.out.println("Diameter Mercury: "+mercury.getDiameter());
                        solarSystemGeneral.diameter=mercury.getDiameter();
                        solarSystemGeneral.main(null);
                    }
                    break;

                case 2:
                    System.out.println("======VENUS======");
                    System.out.println("Input radius : ");
                    set_r = input.nextInt();
                    venus.setVolumeAndSurface(set_r);
                    venus.setPanjangLintasanRotasi(set_r);
                    System.out.println("Panjang lintasan rotasi atau keliling planet : " + venus.getPanjangLintasanRotasi());
                    System.out.println("Volume : " + venus.getVenusVolume());
                    System.out.println("Luas Permukaan : " + venus.getVenusSurface());

                    System.out.println("Input panjang lintasan revolusi : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    venus.setRotationVelocity(set_t_rotasi);
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();
                    venus.setRevolutionVelocity(set_p_orbit, set_t_revolusi);

                    System.out.println("Kecepatan rotasi : " + venus.getRotationVelocity());
                    System.out.println("Kecepatan revolusi : " + venus.getRevolutionVelocity());

                    //Ilustrasi volume
                    venusIllustration.main(null);

                    //Ilustrasi pergerakan
                    System.out.println("Lihat ilustrasi pergerakan?  ");
                    yes_no = input.next().charAt(0);
                    if(yes_no == 'y' || yes_no == 'Y') {
                        System.out.println("Diameter Venus: " + venus.getDiameter());
                        solarSystemGeneral.diameter = venus.getDiameter();
                        solarSystemGeneral.main(null);
                    }
                    break;

                case 3:
                    System.out.println("======EARTH======");
                    System.out.println("Input radius : ");
                    set_r = input.nextInt();
                    earth.setVolumeAndSurface(set_r);
                    earth.setPanjangLintasanRotasi(set_r);
                    System.out.println("Panjang lintasan rotasi atau keliling planet : " + earth.getPanjangLintasanRotasi());
                    System.out.println("Volume : " + earth.getEarthVolume());
                    System.out.println("Surface : " + earth.getEarthSurface());

                    System.out.println("Input panjang lintasan revolusi : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    earth.setRotationVelocity(set_t_rotasi);
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();
                    earth.setRevolutionVelocity(set_p_orbit, set_t_revolusi);

                    System.out.println("Kecepatan rotasi : " + earth.getRotationVelocity());
                    System.out.println("Kecepatan revolusi : " + earth.getRevolutionVelocity());
                    //Ilustrasi volume
                    earthIllustration.main(null);

                    //Ilustrasi pergerakan
                    System.out.println("Lihat ilustrasi pergerakan?  ");
                    yes_no = input.next().charAt(0);
                    if(yes_no == 'y' || yes_no == 'Y') {
                        System.out.println("Diameter Earth: " + earth.getDiameter());
                        solarSystemGeneral.diameter = earth.getDiameter();
                        solarSystemGeneral.main(null);
                    }
                    break;

                case 4:
                    System.out.println("======MARS======");
                    System.out.println("Input radius : ");
                    set_r = input.nextInt();
                    mars.setVolumeAndSurface(set_r);
                    mars.setPanjangLintasanRotasi(set_r);
                    System.out.println("Panjang lintasan rotasi atau keliling planet : " + mars.getPanjangLintasanRotasi());
                    System.out.println("Volume : " + mars.getMarsVolume());
                    System.out.println("Surface : " + mars.getMarsSurface());

                    System.out.println("Input panjang lintasan revolusi : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    mars.setRotationVelocity(set_t_rotasi);
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();
                    mars.setRevolutionVelocity(set_p_orbit, set_t_revolusi);

                    System.out.println("Kecepatan rotasi : " + mars.getRotationVelocity());
                    System.out.println("Kecepatan revolusi : " + mars.getRevolutionVelocity());
                    //Ilustrasi volume
                    marsIllustration.main(null);

                    //Ilustrasi pergerakan
                    System.out.println("Lihat ilustrasi pergerakan?  ");
                    yes_no = input.next().charAt(0);
                    if(yes_no == 'y' || yes_no == 'Y') {
                        System.out.println("Diameter Mars: " + mars.getDiameter());
                        solarSystemGeneral.diameter = mars.getDiameter();
                        solarSystemGeneral.main(null);
                    }
                    break;

                case 5:
                    System.out.println("======JUPYTER======");
                    System.out.println("Input radius : ");
                    set_r = input.nextInt();
                    jupyter.setVolumeAndSurface(set_r);
                    jupyter.setPanjangLintasanRotasi(set_r);
                    System.out.println("Panjang lintasan rotasi atau keliling planet : " + jupyter.getPanjangLintasanRotasi());
                    System.out.println("Volume : " + jupyter.getJupyterVolume());
                    System.out.println("Surface : " + jupyter.getJupyterSurface());

                    System.out.println("Input panjang lintasan revolusi : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    jupyter.setRotationVelocity(set_t_rotasi);
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();
                    jupyter.setRevolutionVelocity(set_p_orbit, set_t_revolusi);

                    System.out.println("Kecepatan rotasi : " + jupyter.getRotationVelocity());
                    System.out.println("Kecepatan revolusi : " + jupyter.getRevolutionVelocity());
                    //Ilustrasi volume
                    jupyterIllustration.main(null);

                    //Ilustrasi pergerakan
                    System.out.println("Lihat ilustrasi pergerakan?  ");
                    yes_no = input.next().charAt(0);
                    if(yes_no == 'y' || yes_no == 'Y') {
                        System.out.println("Diameter Jupyter: " + jupyter.getDiameter());
                        solarSystemGeneral.diameter = jupyter.getDiameter();
                        solarSystemGeneral.main(null);
                    }
                    break;

                case 6:
                    System.out.println("======SATURN======");
                    System.out.println("Input radius : ");
                    set_r = input.nextInt();
                    saturn.setVolumeAndSurface(set_r);
                    saturn.setPanjangLintasanRotasi(set_r);
                    System.out.println("Panjang lintasan rotasi atau keliling planet : " + saturn.getPanjangLintasanRotasi());
                    System.out.println("Volume : " + saturn.getSaturnVolume());
                    System.out.println("Surface : " + saturn.getSaturnSurface());

                    System.out.println("Input panjang lintasan revolusi : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    saturn.setRotationVelocity(set_t_rotasi);
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();
                    saturn.setRevolutionVelocity(set_p_orbit, set_t_revolusi);

                    System.out.println("Kecepatan rotasi : " + saturn.getRotationVelocity());
                    System.out.println("Kecepatan revolusi : " + saturn.getRevolutionVelocity());
                    //Ilustrasi volume
                    saturnIllustration.main(null);

                    //Ilustrasi pergerakan
                    System.out.println("Lihat ilustrasi pergerakan?  ");
                    yes_no = input.next().charAt(0);
                    if(yes_no == 'y' || yes_no == 'Y') {
                        System.out.println("Diameter Saturn: " + saturn.getDiameter());
                        solarSystemGeneral.diameter = saturn.getDiameter();
                        solarSystemGeneral.main(null);
                    }
                    break;

                case 7:
                    System.out.println("======URANUS======");
                    System.out.println("Input radius : ");
                    set_r = input.nextInt();
                    uranus.setVolumeAndSurface(set_r);
                    uranus.setPanjangLintasanRotasi(set_r);
                    System.out.println("Panjang lintasan rotasi atau keliling planet : " + uranus.getPanjangLintasanRotasi());
                    System.out.println("Volume : " + uranus.getUranusVolume());
                    System.out.println("Surface : " + uranus.getUranusSurface());

                    System.out.println("Input panjang lintasan revolusi : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    uranus.setRotationVelocity(set_t_rotasi);
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();
                    uranus.setRevolutionVelocity(set_p_orbit, set_t_revolusi);

                    System.out.println("Kecepatan rotasi : " + uranus.getRotationVelocity());
                    System.out.println("Kecepatan revolusi : " + uranus.getRevolutionVelocity());
                    //Ilustrasi volume
                    uranusIllustration.main(null);

                    //Ilustrasi pergerakan
                    System.out.println("Lihat ilustrasi pergerakan?  ");
                    yes_no = input.next().charAt(0);
                    if(yes_no == 'y' || yes_no == 'Y') {
                        System.out.println("Diameter Uranus: " + uranus.getDiameter());
                        solarSystemGeneral.diameter = uranus.getDiameter();
                        solarSystemGeneral.main(null);
                    }
                    break;

                case 8:
                    System.out.println("======NEPTUNE======");
                    System.out.println("Input radius : ");
                    set_r = input.nextInt();
                    neptune.setVolumeAndSurface(set_r);
                    neptune.setPanjangLintasanRotasi(set_r);
                    System.out.println("Panjang lintasan rotasi atau keliling planet : " + neptune.getPanjangLintasanRotasi());
                    System.out.println("Volume : " + neptune.getNeptuneVolume());
                    System.out.println("Surface : " + neptune.getNeptuneSurface());

                    System.out.println("Input panjang lintasan revolusi : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    neptune.setRotationVelocity(set_t_rotasi);
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();
                    neptune.setRevolutionVelocity(set_p_orbit, set_t_revolusi);

                    System.out.println("Kecepatan rotasi : " + neptune.getRotationVelocity());
                    System.out.println("Kecepatan revolusi : " + neptune.getRevolutionVelocity());
                    //Ilustrasi volume
                    neptuneIllustration.main(null);

                    //Ilustrasi pergerakan
                    System.out.println("Lihat ilustrasi pergerakan?  ");
                    yes_no = input.next().charAt(0);
                    if(yes_no == 'y' || yes_no == 'Y') {
                        System.out.println("Diameter Neptune: " + neptune.getDiameter());
                        solarSystemGeneral.diameter = neptune.getDiameter();
                        solarSystemGeneral.main(null);
                    }
                    break;

                default:
                    break;
            }
            System.out.println("Pilih menu lagi?");
            yes_no = input.next().charAt(0);
        } while (yes_no == 'y' || yes_no == 'Y');
    }
}
