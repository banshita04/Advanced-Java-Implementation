package com.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	public Code(String sectionNo, String lectureNo) {
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
	

}

public class Treemap {
	public static void main(String[] args) {
		Map<Code, String> map = new TreeMap<>();
		map.put(new Code("S11", "10"), "Bob");
		map.put(new Code("S12", "10"), "Raul");
		map.put(new Code("S12", "11"), "Benjie");//in case of duplicate key entry, latest entry is taken into consideration
		map.put(new Code("S14", "10"), "John");
		map.put(new Code("S11", "10"), "Lopus");
		map.put(new Code("S16", "10"), "Carol");
		map.put(new Code("S17", "17"), "Santa");
		map.put(new Code("S10", "10"), "Elf");

		System.out.println(map);
		
		//SEARCHING
		Code code = null;
		for (Code key : map.keySet()) {
			if(map.get(key).equals("Benjie")) {
				code = key;
				break;
			}
		}
		System.out.println("Found key: "+code);
	}
}
