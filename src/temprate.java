import java.util.Scanner;

public class temprate {

    static double doCsangdoF(double doC){
        double doF=(9.0/5)*doC+32;
        return doF;
    }
    static double doFsangdoC(double doF){
        double doC=(5.0/9)*(doF-32);
        return doC;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double doF;
        double doC;
        int choice;
        do {

            System.out.println("menu.");
            System.out.println("1.Do F sang do C");
            System.out.println("2.Do C sang do F");
            System.out.println("0.Out");
            System.out.println("Enter your choice");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("nhap do F:");
                    doF=scanner.nextDouble();
                    System.out.println("do F sang do C"+doFsangdoC(doF));
                    break;
                case 2:
                    System.out.println("nhap do C:");
                    doC=scanner.nextDouble();
                    System.out.println("do C sang do F"+doCsangdoF(doC));
                    break;
                case 0:
                    System.exit(0);


            }
        } while (choice!=0);



    }
}
