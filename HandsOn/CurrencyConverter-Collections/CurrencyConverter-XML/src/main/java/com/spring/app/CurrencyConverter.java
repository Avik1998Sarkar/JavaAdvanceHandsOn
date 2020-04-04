package com.spring.app;

import java.util.Map;

public class CurrencyConverter {
	private Map<String, String> mObj;

	public Map<String, String> getmObj() {
		return mObj;
	}

	public void setmObj(Map<String, String> mObj) {
		this.mObj = mObj;
	}

	@Override
	public String toString() {
		return "CurrencyConverter [mObj=" + mObj + "]";
	}

	public int getTotalCurrencyValue(String value) {
		int point = 0;
		for(int i = 0; i<value.length(); i++) {
			if((value.charAt(i) >= 'A' && value.charAt(i) <= 'Z') || (value.charAt(i) >= 'a' && value.charAt(i) <= 'z')) {
				point = i;
				break;
			}
		}
		int currency = Integer.parseInt(value.substring(0, point));
		String currencyName = value.substring(point);
		for(Map.Entry<String, String> entry : getmObj().entrySet()) {
			if(entry.getKey().equalsIgnoreCase(currencyName)) {
				currency = currency * Integer.parseInt(entry.getValue());
			}
		}
		return currency;
	}
}
