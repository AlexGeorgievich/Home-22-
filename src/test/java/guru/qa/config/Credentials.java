package guru.qa.config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {
    public static CredentialsConfig config = ConfigFactory.create( CredentialsConfig.class);

    public static boolean isBrowserStack() {
        return System.getProperty("deviceHost").equals("browserstack");
    }
    public static String deviceTest() {
        if(System.getProperty("deviceHost").equals("real")){
            return config.deviceNameReal();
        }
        return config.deviceName();
    }
}
