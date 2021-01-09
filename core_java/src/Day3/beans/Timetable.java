package Day3.beans;

public class Timetable 
{
	private String day;
	private String subject;
	private int code;
	
	public Timetable()
	{
		
	}

	public Timetable(String day, String subject, int code) {
		super();
		this.day = day;
		this.subject = subject;
		this.code = code;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Timetable [day=" + day + ", subject=" + subject + ", code=" + code + "]";
	}
	
	
}
