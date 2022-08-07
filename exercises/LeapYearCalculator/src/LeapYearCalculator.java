public class LeapYearCalculator {

    public static void main(String[] args) {
        calculateLeapYear(2024);
    }

    public static void calculateLeapYear(int year)
    {
        if(year % 4 == 0 || year % 100 == 0 || year % 400 == 0)
        {
            System.out.println("tis a leap year!");
        }
        else
        {
            System.out.println("tis not a leap year!");
        }
    }
}
