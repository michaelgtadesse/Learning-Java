import java.util.Scanner;
public class Trip_Planner {
    public static void main(String[] args) {
        greeting();
        travel_time();
        time_diff();
        area();
        distance();
    }
    public static void greeting() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ahoy! What is your name? ");
        String name = input.nextLine();
        System.out.println("Very nice to meet you " + name);
        Scanner place = new Scanner(System.in);
        System.out.print("Where would you like to go? ");
        String dest = place.nextLine();
        System.out.println("Awesome! " + dest+ " sounds great!");
        System.out.println("*********************");
    }
    public static void travel_time() {
        Scanner x = new Scanner(System.in);
        System.out.print("How many days are you planning to spend in your destination? ");
        int days = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.print("What is your total budget for the trip in USD? ");
        double bb = y.nextDouble();
        double budget = ((double) ((int) (bb*100)))/100.00;
        Scanner z = new Scanner(System.in);
        System.out.print("What is the currency symbol for your destination " +
                "For example, the US dollar's is USD nad the Euro's is EU etc ... ");
        String symbol = z.next();
        Scanner w = new Scanner(System.in);
        System.out.print("How many "+ symbol+ " are in 1 USD? ");

        //take only two decimal digits

        double cur = w.nextDouble();
        double currency = (double) ((int) (cur*100))/100;

        System.out.println("You will be spending a total of "+days+ " days in your destination. " +
                "That is equivalent to "+ days*24+ " hours, which is " + days*24*60+ " minutes or " +
                days*24*60*60 +" seconds");
        System.out.println("Your allocated budget is "+budget+ " in USD and this means you can spend " +
                (int) ((budget/days)*100)/100.00+ " USD per day.");
        System.out.println("Your daily allocated amount is "+ (int) ((budget/days)*currency*100)/100.00+
                " in "+ symbol +" and your total budget is "+ (int) (budget*currency*100)/100.00+ " "+symbol+".");
        System.out.println("*********************");
    }
    public static void time_diff() {
        Scanner x = new Scanner(System.in);
        System.out.print("What is the time difference in hour between your home and your destination. " +
                "*If time zone of your destination is behind your home's time zone, the difference is negative. ");
        int dif = x.nextInt();
        System.out.println("That means when it's 00:00 hr. at your home it will be "+ (24+dif)%24  +":00 hr. at " +
                "your travel destination and when it is 12:00 hr at your home is will be "+ (12+dif)%24 +
                ":00 hr. at your travel destination");
        System.out.println("*********************");
    }
    public static void area() {
        Scanner x = new Scanner(System.in);
        System.out.print("What is the area (km^2) of your travel destination? ");
        double size = x.nextDouble();
        System.out.println("In square miles that is "+ (int) (size*0.3861*100)/100.00);
        System.out.println("*********************");
    }
    public static void distance () {
        Scanner x = new Scanner(System.in);
        System.out.print("Latitude of your home ");
        double lat1 = x.nextDouble();
        Scanner y = new Scanner(System.in);
        System.out.print("Longitude of your home ");
        double lon1 = y.nextDouble();
        Scanner w = new Scanner(System.in);
        System.out.print("Latitude of your destination ");
        double lat2 = w.nextDouble();
        Scanner z = new Scanner(System.in);
        System.out.print("Longitude of your destination ");
        double lon2 = z.nextDouble();

        // convert lat/lon to radians
        double xrad = lat1*(Math.PI)/180;
        double yrad = lon1*(Math.PI)/180;
        double wrad = lat2*(Math.PI)/180;
        double zrad = lon2*(Math.PI)/180;
        System.out.println(zrad);

        // Haversin formula
        double d1 = Math.pow(Math.sin(0.5*(wrad - xrad)), 2);
        double d2 = Math.cos(xrad)*Math.cos(wrad);
        double d3 = Math.pow(Math.sin(0.5*(zrad - yrad)), 2);
        double dist = 2*6371.000*Math.asin(Math.pow((d1 + d2*d3), 0.5));
        System.out.println("The direct distance between your home and your destination is "+
                (int) (dist*100)/100.00 + " kms or "+  (int) (dist*0.62137*100)/100.00+ " miles.");
    }

}
