package PrototypeDesignPattern.Version3;

import java.util.HashMap;

public class StudentRegistry {
	static HashMap<String, StudentProto> hashMap = new HashMap<>();
	
	public static void setProto(String key, StudentProto proto) {
		hashMap.put(key, proto);
	}
	
	public static StudentProto getProto(String key) {
		return hashMap.get(key);
	}
}
