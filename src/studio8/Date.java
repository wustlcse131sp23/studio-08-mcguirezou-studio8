package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	/**
	 * Method for setting date object variables
	 * @param month int
	 * @param day int
	 * @param year int
	 * @param holiday bool
	 */
	public Date(int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	public String toString() {
		return month + "/" + day + "/" + year;
	}

    @Override
	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && isHoliday == other.isHoliday && month == other.month && year == other.year;
	}
	public static void main(String[] args) {
    	Date d1 = new Date(11,19,2002,true);
    	Date d2 = new Date(11,18,2002,true);
    	Date d3 = new Date(11,17,2002,true);
    	Date d4 = new Date(11,16,2002,true);
    	Date d5 = new Date(11,15,2002,true);
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(d1);
    	list.add(d2);
    	list.add(d3);
    	list.add(d4);
    	list.add(d5);
    	System.out.println(list);
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(d1);
    	set.add(d2);
    	set.add(d1);
    	System.out.println(set);
    }

}
