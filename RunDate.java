package druhy;

public class RunDate {

	public static void main(String[] args) {
        MyDate d1 = new MyDate(2021, 2, 4);
        System.out.println(d1.ToString());
        System.out.println(d1.NextDay());
        System.out.println(d1.NextDay());
        MyDate d2 = new MyDate(2012, 4, 30);
        System.out.println(d2.ToString());
        System.out.println(d2.NextDay());
        System.out.println(d2.NextDay());
        MyDate d3 = new MyDate(2012, 13, 31);
        MyDate d4 = new MyDate(20122, 12, 31);
        System.out.println(d3.NextDay());
        System.out.println(d3.NextDay());
	}

}
