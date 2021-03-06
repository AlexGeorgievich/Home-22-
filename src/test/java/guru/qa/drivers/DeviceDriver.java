package guru.qa.drivers;

public class DeviceDriver {
    public static String getDeviceDriver(String deviceHost) {

        switch (deviceHost) {
            case "browserstack":
                return BrowserstackMobileDriver.class.getName();

            case "real":
            case "emulation":
                return EmulatorMobileDriver.class.getName();

            default:
                throw new RuntimeException("Select device: browserstack / emulation / real");
        }
    }
}