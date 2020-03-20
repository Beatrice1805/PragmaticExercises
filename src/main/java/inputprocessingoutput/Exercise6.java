package inputprocessingoutput;


import java.util.Calendar;


public class Exercise6 {
    private static Object Date;

    public static void main(String[] args) {
        int currentAge= 25;
        System.out.println(" What is your current age?" +  currentAge);
        int retirementAge =65;
        System.out.println(" At what age would you like to retire?" +  retirementAge);
        int leftAge = retirementAge - currentAge;
        System.out.println("You have"  + leftAge + " years left until you can retire");
        Calendar rq = Calendar.getInstance();
        int currentYear = rq.get(rq.YEAR);
        int retirementYear = leftAge + currentYear;
        System.out.println("It's"  + currentYear + " so you can retire in " +  retirementYear);


    }
}
