package com.michaelrice.demo;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class DemoActivator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("STARTING DEMO: hello, world");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("STOPPING DEMO");
    }

}
