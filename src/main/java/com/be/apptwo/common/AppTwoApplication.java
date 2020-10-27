package com.be.apptwo.common;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients("com.be.apptwo.common.feignapi")
@SpringBootApplication
public class AppTwoApplication {

    private static final String ipPrefix = "192.";

    public static Map<String, Object> getMap() throws Exception {
	Map<String, Object> map = new HashMap<>();
	String ip = getIpAdressBy10();
	map.put("ip", ip);
	return map;

    }

    private static String getIpAdressBy10() throws SocketException {
	Enumeration e = NetworkInterface.getNetworkInterfaces();
	while (e.hasMoreElements()) {
	    NetworkInterface n = (NetworkInterface) e.nextElement();
	    Enumeration ee = n.getInetAddresses();
	    while (ee.hasMoreElements()) {
		InetAddress i = (InetAddress) ee.nextElement();
		if (i.getHostAddress().contains(ipPrefix))
		    return i.getHostAddress();
	    }
	}
	return null;
    }

    public static void main(String[] args) throws Exception {
	SpringApplication application = new SpringApplication(AppTwoApplication.class);
	application.setDefaultProperties(getMap());
	application.run(args);

    }
}
