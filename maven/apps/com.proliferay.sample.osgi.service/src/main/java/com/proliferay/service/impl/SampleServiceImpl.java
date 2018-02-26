package com.proliferay.service.impl;

import com.proliferay.service.SampleService;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = SampleService.class
)
public class SampleServiceImpl implements SampleService {

	@Override
	public int add(int number1, int number2) {
		System.err.println("###########Calling add() method##################");
		return number1 + number2;
	}
}