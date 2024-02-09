package SimpleInterestCalculator;


import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Details : ");
            String b = sc.next();
            double a= Double.parseDouble(sc.next());
            int m = Integer.parseInt(sc.next());

            bank b1 = getInstance(b);
            System.out.println(b1.calculateInterest(a,m));


        }

        public static bank getInstance(String b){

            if("SBI".equals(b)){
                return new SBI();
            }
            else {
                return new HDFC();
            }

        }
    }


