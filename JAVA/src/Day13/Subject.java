package Day13;

public class Subject {
	 private String subjectTitle;
	 private String subjectCode;
	 private String prodessorName;
	 private int subjectTime;
	 private int subjectPoint;
	 private int subjectYear;
	 private String subjectTerm;	 
	 public String getSubjectTitle() {
		return subjectTitle;
	}
	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getProdessorName() {
		return prodessorName;
	}
	public void setProdessorName(String prodessorName) {
		this.prodessorName = prodessorName;
	}
	public int getSubjectTime() {
		return subjectTime;
	}
	public void setSubjectTime(int subjectTime) {
		this.subjectTime = subjectTime;
	}
	public int getSubjectPoint() {
		return subjectPoint;
	}
	public void setSubjectPoint(int subjectPoint) {
		this.subjectPoint = subjectPoint;
	}
	public int getSubjectYear() {
		return subjectYear;
	}
	public void setSubjectYear(int subjectYear) {
		this.subjectYear = subjectYear;
	}
	public String getSubjectTerm() {
		return subjectTerm;
	}
	public void setSubjectTerm(String subjectTerm) {
		this.subjectTerm = subjectTerm;
	}
	public String getSubjectCatrgory() {
		return subjectCatrgory;
	}
	public void setSubjectCatrgory(String subjectCatrgory) {
		this.subjectCatrgory = subjectCatrgory;
	}
	public String getSubjectSchedule() {
		return subjectSchedule;
	}
	public void setSubjectSchedule(String subjectSchedule) {
		this.subjectSchedule = subjectSchedule;
	}
	private String subjectCatrgory;
	 private String subjectSchedule;
	@Override
	public String toString() {
		return "과목 [과목명=" + subjectTitle + ", subjectCode=" + subjectCode + ", 교수명="
				+ prodessorName + ", 시수=" + subjectTime + ", 학점=" + subjectPoint + ", 년도="
				+ subjectYear + ", 학기" + subjectTerm + ", 분류=" + subjectCatrgory
				+ ", 시간=" + subjectSchedule + "]";		
	}
	public Subject(String subjectTitle, String subjectCode, String prodessorName, int subjectTime, int subjectPoint,
			int subjectYear, String subjectTerm, String subjectCatrgory, String subjectSchedule) {
		super();
		this.subjectTitle = subjectTitle;
		this.subjectCode = subjectCode;
		this.prodessorName = prodessorName;
		this.subjectTime = subjectTime;
		this.subjectPoint = subjectPoint;
		this.subjectYear = subjectYear;
		this.subjectTerm = subjectTerm;
		this.subjectCatrgory = subjectCatrgory;
		this.subjectSchedule = subjectSchedule;
	}
	public Subject(String sTitle) {
		subjectTitle = sTitle;
	}
}