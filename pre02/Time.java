 class Time{

    public static void main(String[] args) {
        String firstLine = "Time Warp!";
        System.out.println(firstLine);

      // Exercise 3 part #2
        int hour = 12;
        int minute = 59;
        int second = 24;
         
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        //Exercise 3 Part 3

        System.out.print("Number of seconds since midnight: ");
        System.out.println((hour * 60 * 60) + (minute * 60) + second);

      //Exercise 3 part 4
        System.out.print("Seconds remaining of the day: ");
        System.out.println((24 * 60 * 60) -  ((hour * 60 * 60) + (minute * 60) + second));
      //Exercise 3 Part 5
        System.out.print("Percent of the day that has passed: ");
        System.out.println(((hour * 60 * 60) + (minute * 60) + second) * 100/ (24 * 60 * 60));

      //Exercise 3 Part 6 - Elapsed time
      // original time was 12:29:24
        System.out.print("Elapsed time in minutes: ");
        System.out.println((hour * 60 + minute) - (12 * 60 + 29) );  




    }

}