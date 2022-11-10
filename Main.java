public class Main {
    public static void main(String[] args) {
        
                System.out.println("身長");
                double x=new java.util.Scanner(System.in).nextDouble();
                System.out.println("体重");
                double a=new java.util.Scanner(System.in).nextDouble();
                System.out.printf("%.2f", a/(POW(x)));
            }
                public static double POW(double n){
                    double ans;
                    ans=n*n;
                    return ans;


        }
    }

