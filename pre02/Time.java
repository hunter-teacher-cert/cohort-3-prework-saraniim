 class Time{

    public static void main(String[] args) {
        String firstLine = "Time Warp!";
        System.out.println(firstLine);

      // Exercise 3 part #2
      //    current hour
        int curhour;
        curhour = 12;
        // current minute
        int curminute;
        curminute = 59;
        //current seconds
        int cursecond;
        cursecond = 24;

        //  seconds per hour
        int hoursec;
        hoursec = 360;
        // minutes per hour
        int hourmin;
        hourmin = 60;

        //seconds per minute
        int minsec;
        minsec = 60;
         
        System.out.print("The current time is ");
        System.out.print(curhour);
        System.out.print(":");
        System.out.print(curminute);
        System.out.println(".");
        System.out.print(cursecond);
        System.out.println(".");

        //Exercise 3 Part 3

        System.out.print("Number of seconds since midnight: ");
        System.out.println((curhour * hoursec) + (curminute * minsec) + cursecond);

      //Exercise 3 part 4
        System.out.print("Seconds remaining of the day: ");
        System.out.println((24 * hoursec) -  ((curhour * hoursec) + (curminute * minsec) + cursecond));
      //Exercise 3 Part 5
        System.out.print("Percent of the day that has passed: ");
        System.out.println(((curhour * hoursec) + (curminute * minsec) + cursecond) * 100/ (24 * hoursec));

      //Exercise 3 Part 6 - Elapsed time
      // original time was 12:29:24
        System.out.print("Elapsed time in minutes: ");
        System.out.println((curhour * hourmin + curminute) - (12 * 60 + 29) );  




    }

}