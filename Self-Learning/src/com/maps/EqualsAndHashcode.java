package com.maps;

import java.util.Objects;

class Codes implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	public Codes(String sectionNo, String lectureNo) {
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	@Override
	public int compareTo(Code o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = (o.getSectionNo()).concat(o.getLectureNo());
		return code1.compareTo(code2);
	}
	@Override
	public int hashCode() {
		return Objects.hash(lectureNo, sectionNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Codes other = (Codes) obj;
		return Objects.equals(lectureNo, other.lectureNo) && Objects.equals(sectionNo, other.sectionNo);
	}
	
	
	

}

public class EqualsAndHashcode {
	public static void main(String[] args) {
		
		System.out.println("COMPARING STRING\n");
		String x1 = "Hello";
		x1+="World";
		String x2 = "HelloWorld";
		
		System.out.println(x1.hashCode());
		System.out.println(x2.hashCode());
		System.out.println(x1 == x2);// == is not capable of handling equality check properly
		System.out.println(x1.equals(x2));
		
		System.out.println("\nCOMPARING OBJECTS\n");
		Codes code1 = new Codes("01", "01");
		Codes code2 = new Codes("01", "01");
		
		System.out.println(code1.hashCode());
		System.out.println(code2.hashCode());
		System.out.println(code1 == code2);// == is not capable of handling equality check properly
		System.out.println(code1.equals(code2));
		
	}
}
