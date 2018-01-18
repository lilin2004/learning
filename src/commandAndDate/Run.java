package commandAndDate;



import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		System.out.println("请输入日期");
		GetCammand get = new GetCammand();

		if (new Check(get.str).getcoolean()) {
			String $_date = get.str;
			String[] $dates = $_date.split("\\.");
			String[] DatesNew = new String[6];
			for (int i = 0; i < $dates.length; i++) {
				DatesNew[i] = $dates[i];
			}
			if (DatesNew[3] == null)
				DatesNew[3] = "0";
			if (DatesNew[4] == null)
				DatesNew[4] = "0";
			if (DatesNew[5] == null)
				DatesNew[5] = "0";
			final Date date_2 = new Date(Integer.parseInt(DatesNew[0]), Integer.parseInt(DatesNew[1]),
					Integer.parseInt(DatesNew[2]), Integer.parseInt(DatesNew[3]), Integer.parseInt(DatesNew[4]),
					Integer.parseInt(DatesNew[5]));
			// 初始化 Date 对象
			final int $date_year = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
			final int $date_month = Integer.parseInt(new SimpleDateFormat("MM").format(new Date()));
			final int $date_day = Integer.parseInt(new SimpleDateFormat("dd").format(new Date()));
			final int $date_hour = Integer.parseInt(new SimpleDateFormat("H").format(new Date()));
			final int $date_minute = Integer.parseInt(new SimpleDateFormat("m").format(new Date()));
			Date $date = new Date($date_year, $date_month, $date_day, $date_hour, $date_minute);// 用法 年，月，日

			final long $date_between = date_2.getTime/* 用法 Date类后. */() - $date.getTime();

			final int $day_int = (int) Math.floor($date_between / (1000 * 3600 * 24));
			System.out.print($day_int + "天");
			long $hour;
			$hour = $date_between % (1000 * 3600 * 24);
			final int $hour_int = (int) Math.floor($hour / (1000 * 3600));
			System.out.print($hour_int + "小时");
			long $minute = $hour % (1000 * 3600);
			final int $minute_int = (int) Math.floor($minute / (1000 * 60));
			System.out.print($minute_int + "分");
		} else {
			System.out.println("输入不正确，格式:年.月.日.小时.分钟.秒.毫秒");
		}
	}

}
