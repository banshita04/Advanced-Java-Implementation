package com.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
class Name implements Comparable<Name>{
	private String name;

	public Name(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Name o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}
	
}
public class Hashset {
	public static void main(String[] args) {
		Set<Name> set = new HashSet<>();
		set.add(new Name("Bob"));
		set.add(new Name("Tom"));
		set.add(new Name("Zam"));
		set.add(new Name("Paul"));
		set.add(new Name("Gary"));
		set.add(new Name("Pam"));
		
		List<Name> list = new ArrayList<>();
		list.addAll(set);
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After sorting:\n"+list);
		System.out.println(Collections.binarySearch(list, new Name("Pam")));

	}
}
