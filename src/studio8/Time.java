package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int sec;
	private boolean isMilitary;
	
	
	public Time(int hour, int sec, boolean isMilitary) {
		this.hour = hour;
		this.sec = sec;
		this.isMilitary = isMilitary;
	}
	public String toString() {
		if (isMilitary) {
			return hour + ":" + sec;
		}
		else {
			if(hour>12) {
				return hour%12 + ":" + sec + " p.m.";
			}
			else {
			return hour%12 + ":" + sec + " a.m.";
			}
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, isMilitary, sec);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && isMilitary == other.isMilitary && sec == other.sec;
	}
	public static void main(String[] args) {
		Time t1 = new Time(1,22,false);
		System.out.println(t1);
    }

}