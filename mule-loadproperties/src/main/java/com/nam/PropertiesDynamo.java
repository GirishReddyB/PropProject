package com.nam;



import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;



public class PropertiesDynamo extends PreferencesPlaceholderConfigurer{
   Properties dbProps = null;
  private Logger log = LoggerFactory.getLogger(getClass().getName());
   
   //factory method
   public void init (){
       
       dbProps = new Properties();
       System.out.println("Loading properties now ");
   log.info("PRINT PAYLOAD USING LOGGER: ");

       dbProps.put("http.port", "My Value");
       
      log.info("After PAYLOAD USING LOGGER: "+dbProps);
   }

    @Override
       protected String resolvePlaceholder(String key, Properties p) {
           String value = dbProps.getProperty(key);

           if (value != null) {
               return value;
           }
           
           //resolve properties in traditional way
           return super.resolvePlaceholder(key, p);
       }
}