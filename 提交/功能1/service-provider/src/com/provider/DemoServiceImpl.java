package com.provider;

import java.util.Random;

public class DemoServiceImpl implements DemoService {

	@Override
	public String getRandom() {
		Random rand = new Random();
		int i1 = rand.nextInt(100);
		return "Ëæ»úÊý:" + i1;
	}

}
