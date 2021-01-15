package com.practive.coding;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {

	public HashMap<Integer, Integer> insert(int x, int y, HashMap<Integer, Integer> m) {
		m.put(x, y);
		return m;
	}

	public Integer getValue(int x, HashMap<Integer, Integer> m1) {
		return m1.get(x);
	}

	public HashMap<Integer, Integer> addValuesToKey(HashMap<Integer, Integer> m2, int x) {
		for (Map.Entry<Integer, Integer> m3 : m2.entrySet()) {
			if (m3.getKey() != null) {
				if (!m2.containsKey(m3.getKey() + x)) {
					m2.put(m3.getKey() + x, m3.getValue());
				}
			}
		}
		return m2;
	}

	public HashMap<Integer, Integer> addValuesToValue(HashMap<Integer, Integer> m4, int y) {
		for (Map.Entry<Integer, Integer> m5 : m4.entrySet()) {
			if (m5.getValue() != null) {
				if (!m4.containsValue(m5.getValue() + y)) {
					m4.put(m5.getKey(), m5.getValue() + y);
				}
			}
		}
		return m4;
	}

	public static void main(String[] args) {

		HashMapImplementation h = new HashMapImplementation();
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		h.insert(1, 2, m);
		System.out.println("Insert Method Result" + m);
		h.getValue(1, m);
		System.out.println("Get Value Method Result" + m);
		h.addValuesToKey(m, 1);
		System.out.println("Add Value to Key Method Result" + m);
		h.addValuesToValue(m, 2);
		System.out.println("Add Value to Value Method Result" + m);
	}

}
