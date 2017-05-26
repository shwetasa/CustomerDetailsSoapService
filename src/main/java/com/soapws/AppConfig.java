package com.soapws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
@ComponentScan("com.soapws") 
public class AppConfig extends WsConfigurerAdapter {

	@Bean(name = "customer")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema customerSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("CustomerPort");
		wsdl11Definition.setLocationUri("/soapws");
		wsdl11Definition.setTargetNamespace("http://soapwebservice.com/customer");
		wsdl11Definition.setSchema(customerSchema);
		return wsdl11Definition;
	}
	@Bean
	public XsdSchema customerSchema() {
		return new SimpleXsdSchema(new ClassPathResource("customer.xsd"));
	}
}
