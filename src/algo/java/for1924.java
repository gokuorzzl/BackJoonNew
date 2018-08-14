package algo.java;
import java.util.Scanner;

public class for1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in_month = sc.nextInt();
		int in_day = sc.nextInt();
		int diff = 0;
		try {
			if ((in_month < 1 || in_month > 12) || (in_day < 1 || in_day > 31))
				System.out.println("월, 일을 맞게 입력해주세요~!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		diff = dayDiff(in_month, in_day);
		diff %= 7;

		// SUN, MON, TUE, WED, THU, FRI, SAT
		String DWeek = "";
		switch (diff) {
		case 0:	DWeek = "MON";	break;
		case 1:	DWeek = "TUE";	break;
		case 2:	DWeek = "WED";	break;
		case 3:	DWeek = "THU";	break;
		case 4:	DWeek = "FRI";	break;
		case 5:	DWeek = "SAT";	break;
		case 6:	DWeek = "SUN";	break;
		}
		System.out.println(DWeek);
	}

	public static int returnDay(int in_month) {
		int day = 0;
		switch (in_month) {
		case 1:	case 3:	case 5:	case 7:	case 8:	case 10:case 12:
			day = 31;	break;
		case 4:	case 6:	case 9:	case 11:
			day = 30;	break;
		case 2:
			day = 28;	break;
		}
		return day;
	}

	public static int dayDiff(int m, int d) {
		int diff = 0;
		for (int i = 1; i < m; i++) {
			diff += returnDay(i);
		}
		return diff + d - 1;
	}
}
