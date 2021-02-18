package druhy;
import java.util.Calendar;
import java.util.Date;

public class MyDate
{
    private int year;
    private int month;
    private int day;

    private  String[] Month = { "Leden", "Unor", "Brezen", "Duben", "Kveten", "Cerven", "Cervenec", "Srpen", "Zari", "Rijen", "Listopad", "Prosinec" };
    private  String[] Day = { "Pondeli", "Utery", "Streda", "Ctvrtek", "Patek", "Sobota", "Nedele" };
    private  int[] DaysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    public String[] getMonth() {
		return Month;
	}
	public void setMonth(String[] month) {
		Month = month;
	}
	public String[] getDay() {
		return Day;
	}
	public void setDay(String[] day) {
		Day = day;
	}
	public int[] getDaysInMonth() {
		return DaysInMonth;
	}
	public void setDaysInMonth(int[] daysInMonth) {
		DaysInMonth = daysInMonth;
	}


    public  String ToString()
    {
        this.GetDayOfWeek() ;
        return "---"+day+"/"+month+"/"+year+"---";
    }
    public Boolean PrechodnyRok()
    { Boolean odpoved; if ((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 100 == 0) odpoved = true; else odpoved = false; return odpoved;}
    public Boolean IsValidDate()
    {
        Boolean odpoved = false;
        if (this.year>0&&this.year<10000)
        {
            if (this.month > 0 && this.month <= 12)
            {
                if ((this.day > 0 && this.day <= 31) && (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12)) odpoved = true;
                else if ((this.day > 0 && this.day <= 30) && (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)) odpoved = true;
                else if ((this.day > 0 && this.day <= 29) && (this.month == 2 && ((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 100 == 0))) odpoved = true;
                else if ((this.day > 0 && this.day <= 28) && (this.month == 2 && ((this.year % 4 != 0 && this.year % 100 == 0) || this.year % 100 != 0))) odpoved = true;
                else odpoved = false;
            }
        }
        return odpoved;
    }
    public Boolean IsValidDate(int year, int month, int day)
    {

        Boolean odpoved = false;
        if (this.year > 0 && this.year < 10000)
        {
            if (month > 0 && month <= 12)
            {
                if ((day > 0 && day <= 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) odpoved = true;
                else if ((day > 0 && day <= 30) && (month == 4 ||month == 6 || month == 9 || month == 11)) odpoved = true;
                else if ((day > 0 && day <= 29) && (month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 100 == 0))) odpoved = true;
                else if ((day > 0 && day <= 28) && (month == 2 && ((year % 4 != 0 && year % 100 == 0) || year % 100 != 0))) odpoved = true;
                else odpoved = false;
            }
        }
        return odpoved;
    }

    
    public void GetDayOfWeek()
    {
        if (this.IsValidDate())
        {
        	Calendar c = Calendar.getInstance();
        	int rok = this.year; int mesic = this.month; int den = this.day;
        	c.set(21,12,12);
        	Integer dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        }  
    }
    
    public MyDate(int year, int month, int day)
    {
        if (year > 0 && year < 10000)
        {
            if (month > 0 && month <= 12)
            {
                if ((day > 0 && day <= 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) { this.year = year; this.month = month; this.day = day; }
                else if ((day > 0 && day <= 30) && (month == 4 || month == 6 || month == 9 || month == 11)) { this.year = year; this.month = month; this.day = day; }
                else if ((day > 0 && day <= 29) && (month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 100 == 0))) { this.year = year; this.month = month; this.day = day; }
                else if ((day > 0 && day <= 28) && (month == 2 && ((year % 4 != 0 && year % 100 == 0) || year % 100 != 0))) { this.year = year; this.month = month; this.day = day; }
                else { System.out.println("NEPLATNE DATUM,BRO"); }
            }
            else { System.out.println("NEPLATNE DATUM,BRO"); }
        }
        else { System.out.println("NEPLATNE DATUM,BRO"); }

    }
    public void SetDate(int den, int mesic, int rok) { this.day = den; this.month = mesic; this.year = rok; }
    public void SetDay(int den) { this.day = den; }
    public void SetMonth(int mesic) { this.month = mesic; }
    public void SetYear(int rok) { this.year = rok; }
    public String MyDateToString(){ String s ="---"+day+"/"+month+"/+"+year+"---";return s; }
    
    public String NextDay()
    {
        String s;
        if ((this.day == 28 && this.month == 2) && ((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 100 == 0)) { this.day = 1; this.month = 3; }
        else if ((this.day == 29 && this.month == 2) && ((this.year % 4 != 0 && this.year % 100 == 0) || this.year % 100 != 0)) { this.day = 1; this.month = 3; }
        else if ((this.day == 30 && (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11))) { this.day = 1; this.month = this.month + 1; }
        else if ((this.day == 31 && (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10))) { this.day = 1; this.month = this.month + 1; }
        else if (this.day == 31 && this.month == 12) {this.day = 1; month = 1; this.year = this.year + 1; }
        else { this.day = this.day + 1; }

        if (this.IsValidDate()) { this.GetDayOfWeek(); s = "---"+day+"/"+month+"/"+year+"---"; } else {s = "NEPALTNE DATUM"; return s;}
		return s;

    }
    public String NextMonth() { this.month = this.month + 1; String s =  "---"+day+"/"+month+"/"+year+"---"; return s; }
    public String NextYear() { this.month = this.month + 1; String s =  "---"+day+"/"+month+"/"+year+"---"; return s; }
    public String PreviousYear() { this.year = this.year - 1; String s =  "---"+day+"/"+month+"/"+year+"---"; return s; }
    public String PreviousMonth() { this.month = this.month - 1; String s =  "---"+day+"/"+month+"/"+year+"---"; return s; }
    public String PreviousDay() { this.day = this.day - 1; String s =  "---"+day+"/"+month+"/"+year+"---"; return s; }
	
}
