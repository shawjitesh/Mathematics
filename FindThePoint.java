import java.util.Scanner;

public class FindThePoint {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number of sets of points");
        int T=in.nextInt();

        while(T-->0){
            System.out.println("Enter (px,py) and (qx,qy)");
            int x1=in.nextInt();
            int y1=in.nextInt();
            int x3=in.nextInt();
            int y3=in.nextInt();
            int x2=(2*x3)-x1;
            int y2=(2*y3)-y1;
            System.out.println("(rx,ry): " + x2+" "+y2);
        }

        in.close();
    }
}