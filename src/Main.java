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
        int set_r, set_p_orbit, set_t_rotasi, set_t_revolusi;
        int menu;
        char yes_no;
        Formula formula = new Formula();
        Mercury mercury = new Mercury();
        Venus venus = new Venus();
        Earth earth = new Earth();
        Mars mars = new Mars();
        Jupyter jupyter = new Jupyter();
        Saturn saturn = new Saturn();
        Uranus uranus = new Uranus();
        Neptune neptune = new Neptune();

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

                    formula.Volume(set_r);
                    System.out.println("Mercury's Volume : " + formula.getVolume());
                    formula.Surface(set_r);
                    System.out.println("Mercury's Surface : " + formula.getSurface());
                    //System.out.println("Input panjang orbit : ");
                   //set_p_orbit = input.nextInt();
                    //System.out.println("Input kala rotasi : ");
                    //set_t_rotasi = input.nextInt();
                    //System.out.println("Input kala revolusi : ");
                    //set_t_revolusi = input.nextInt();

                    //Output:
                    //panjang_lintasan_rotasi atau keliling
                    //luas_permukaan
                    //volume
                    //kecepatan_rotasi
                    //kecepatan_revolusi
                    //ilustrasi volume
                    //Ilustrasi pergerakan
                    break;

                case 2:
                    System.out.println("======VENUS======");
                    System.out.println("Input jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Input panjang orbit : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();

                    formula.Volume(set_r);
                    System.out.println("Venus's Volume : " + formula.getVolume());
                    formula.Surface(set_r);
                    System.out.println("Venus's Surface : " + formula.getSurface());
                    break;

                case 3:
                    System.out.println("======EARTH======");
                    System.out.println("Input jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Input panjang orbit : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();

                    formula.Volume(set_r);
                    System.out.println("Earth's Volume : " + formula.getVolume());
                    formula.Surface(set_r);
                    System.out.println("Earth's Surface : " + formula.getSurface());
                    break;

                case 4:
                    System.out.println("======MARS======");
                    System.out.println("Input jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Input panjang orbit : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();

                    formula.Volume(set_r);
                    System.out.println("Mars' Volume : " + formula.getVolume());
                    formula.Surface(set_r);
                    System.out.println("Mars' Surface : " + formula.getSurface());
                    break;

                case 5:
                    System.out.println("======JUPYTER======");
                    System.out.println("Input jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Input panjang orbit : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();

                    formula.Volume(set_r);
                    System.out.println("Jupyter's Volume : " + formula.getVolume());
                    formula.Surface(set_r);
                    System.out.println("Jupyter's Surface : " + formula.getSurface());
                    break;

                case 6:
                    System.out.println("======SATURN======");
                    System.out.println("Input jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Input panjang orbit : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();

                    formula.Volume(set_r);
                    System.out.println("Saturn's Volume : " + formula.getVolume());
                    formula.Surface(set_r);
                    System.out.println("Saturn's Surface : " + formula.getSurface());
                    break;

                case 7:
                    System.out.println("======URANUS======");
                    System.out.println("Input jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Input panjang orbit : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();

                    formula.Volume(set_r);
                    System.out.println("Uranus's Volume : " + formula.getVolume());
                    formula.Surface(set_r);
                    System.out.println("Uranus's Surface : " + formula.getSurface());
                    break;

                case 8:
                    System.out.println("======NEPTUNE======");
                    System.out.println("Input jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Input panjang orbit : ");
                    set_p_orbit = input.nextInt();
                    System.out.println("Input kala rotasi : ");
                    set_t_rotasi = input.nextInt();
                    System.out.println("Input kala revolusi : ");
                    set_t_revolusi = input.nextInt();

                    formula.Volume(set_r);
                    System.out.println("Neptune's Volume : " + formula.getVolume());
                    formula.Surface(set_r);
                    System.out.println("Neptune's Surface : " + formula.getSurface());
                    break;

                default:
                    break;
            }
            System.out.println("Pilih menu lagi?");
            yes_no = input.next().charAt(0);
        } while (yes_no == 'y' || yes_no == 'Y');
    }
}
