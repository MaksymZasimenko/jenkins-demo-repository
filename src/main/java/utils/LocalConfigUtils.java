package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class LocalConfigUtils {

    private static Properties localConfig = null;

    public static void localLocalConfig(){
        String filePath = "localConfig.properties";

        try {
        FileInputStream fileInput = new FileInputStream(filePath);
        localConfig = new Properties();
        localConfig.load(fileInput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static String getProperty(String key){
        if(localConfig==null){
            localLocalConfig();
        }
        return localConfig.getProperty(key);
    }

}
