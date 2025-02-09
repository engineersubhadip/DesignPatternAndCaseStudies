package PrototypeDesignPattern.FinalVersion;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private static Map<String, Student> hashMap = new HashMap<>();

	public static void setProto(String key, Student student) {
		hashMap.put(key, student);
	}

	public static Student getProto(String key) {
		return hashMap.get(key);
	}
}
