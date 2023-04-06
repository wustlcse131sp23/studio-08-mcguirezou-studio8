package studio8;

import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.time = time;
		this.date = date;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	public static void main(String[] args) {
		Date d1 = new Date(11,19,2002,true);
		Time t1 = new Time(11,20,true);
		Appointment a1 = new Appointment(d1,t1);
		Date d2 = new Date(11,19,2003,true);
		Time t2 = new Time(11,45,true);
		Appointment a2 = new Appointment(d2,t2);
	}
}
