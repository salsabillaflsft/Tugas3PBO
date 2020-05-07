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
        int r, p_orbit, t_rotasi, t_revolusi;
        int menu;
        char yes_no;

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

                    //break;

                case 2:

                    //break;

                case 3:

                    //break;

                case 4:

                    //break;

                case 5:

                    break;

                case 6:

                    //break;

                case 7:

                    //break;

                case 8:

                    //break;

                default:
                    break;
            }
            System.out.println("Pilih menu lagi?");
            yes_no = input.next().charAt(0);
        } while (yes_no == 'y' || yes_no == 'Y');
    }
}
