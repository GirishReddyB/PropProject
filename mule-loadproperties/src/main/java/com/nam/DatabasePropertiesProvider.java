package com.nam;

import java.util.Properties;

public class DatabasePropertiesProvider {
    
    private static final long serialVersionUID = 1L;
    
    static Properties properties = new Properties();
    
    public void setProperties(Properties props) {
        DatabasePropertiesProvider.properties = props;
    }
    
    public Properties getProperties () {
        DatabasePropertiesProvider.properties.setProperty("db.host.local", "localhost");
        
        System.out.println("Initialize bean DatabasePropertiesProvider: " + properties);
        return DatabasePropertiesProvider.properties;
    }

}
