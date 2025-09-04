//dayOfWeek = (d + monthCode + yearCode) % 7

//y → The year itself.
//
//Every year shifts the calendar by about 1 day (365 % 7 = 1).
//
//y / 4 → Adds one extra day for every leap year.
//
//Leap years have an extra day (Feb 29), so they shift the day-of-week.
//
//- y / 100 → Subtract one day for every century year (like 1700, 1800, 1900).
//
//Century years are not leap years, unless divisible by 400.
//
//+ y / 400 → Add back a day for century years divisible by 400 (like 1600, 2000).
//
//Because those are leap years.
//
//+ t[m - 1] → Month offset adjustment (from the lookup table).
//
//+ d → The actual day of the month.
//
//Finally, % 7 → Gives result in the range [0–6], mapping to day of week.

package Foundation;

import java.util.Scanner;

public class FindDay_of_the_Week {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		
		int day = dayOfweek(d,m,y);
		
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("The day is: " + days[day]);

	}
	
	public static int dayOfweek(int d,int m, int y) {
		int t[] = {0,3,2,5,0,3,5,1,4,6,2,4};
		if(m<3) {
			y--;
		}
		return (y+y/4-y/100+y/400+t[m-1]+d) % 7;
		
	}

}
