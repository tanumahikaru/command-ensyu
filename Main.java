public class Main {
    public static void main(String[] args) {
        
                System.out.println("一人目身長ｍ入力:");
                double x=new java.util.Scanner(System.in).nextDouble();
                System.out.println("体重");
                double a=new java.util.Scanner(System.in).nextDouble();
                System.out.printf("%.2f", a/(POW(x)));

                System.out.println("二人目身長ｍ入力:");
                double y=new java.util.Scanner(System.in).nextDouble();
                System.out.println("体重");
                double b=new java.util.Scanner(System.in).nextDouble();

                System.out.printf("一人目"+"%.2f", a/(POW(x)));
                System.out.printf("二人目"+"%.2f", b/(POW(y)));
            }
                public static double POW(double n){
                    double ans;
                    ans=n*n;
                    return ans;


        }
    }
