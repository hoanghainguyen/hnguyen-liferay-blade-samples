package com.proliferay.activator;

import com.proliferay.service.SampleService;
import com.proliferay.service.impl.SampleServiceImpl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	private ServiceRegistration registration;
	
	@Override
	public void start(BundleContext context) throws Exception {

		registration = context.registerService(SampleService.class.getName(), new SampleServiceImpl(), null);
		System.out.println("###########Service Registered Successfully##############");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		registration.unregister();
		System.out.println("###########Service Unregistered##############");
		
	}

}
