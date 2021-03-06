package com.rjm.util.sort;

public class Member implements Comparable<Member> {

	private String id;
	private int age;

	public Member(String id, int age) {
		this.id = id;
		this.age = age;
		System.out.println("this : " + this);
	}

	@Override
	public int compareTo(Member o) {
		int result = 0;

//		if (this.age > o.getAge()) {
//			result = 1;
//		} else if (this.age < o.getAge()) {
//			result = -1;
//		} else {
//			result = 0;
//		}

		// ID 순으로 a ~z : 오름차순

		result = this.id.compareTo(o.getId());
		if (result > 0) {
			result = -1;
		} else {
			result = 1;
		}
		return result;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
