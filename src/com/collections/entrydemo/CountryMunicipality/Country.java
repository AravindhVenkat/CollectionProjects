package com.collections.entrydemo.CountryMunicipality;

import java.util.HashMap;

public class Country {
	private HashMap<String,Integer> hm;
	public Country() {
		hm = new HashMap<>();
		hm.put("Tamil Nadu", 45638);
		hm.put("Madhya Pradesh", 55638);
		hm.put("Andhra Pradesh", 47538);
		hm.put("West Bengal", 49838);
		hm.put("Delhi", 45698);
	}

	public HashMap<String, Integer> getHm() {
		return hm;
	}

	public void setHm(HashMap<String,Integer> hm) {
		this.hm = hm;
	}

}
