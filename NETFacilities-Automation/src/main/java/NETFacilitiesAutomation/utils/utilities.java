package NETFacilitiesAutomation.utils;

import java.io.File;

public class utilities {
    public static void createDirectory(String path, String dir) throws Exception {
        File theDir = new File("D:\\NETFacilities-Automation");
        if (!theDir.exists()){
            theDir.mkdirs();
        }
    }
}