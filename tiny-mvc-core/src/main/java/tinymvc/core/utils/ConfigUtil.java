/**
 * ======================
 *
 * @author : mantou
 * @date : 2018/1/11
 * ======================
 * Description:
 * <p/>
 * ======================
 * Major changes:
 */


package tinymvc.core.utils;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ConfigUtil {

    private static final String propertiesPath = "tiny-mvc.properties";

    private static Properties properties = new Properties();

    static {
        try {
            properties.load(ConfigUtil.class.getClassLoader().getResourceAsStream(propertiesPath));
        } catch (IOException e) {

        }
        Enumeration e = properties.propertyNames();
        while (e.hasMoreElements()) {
            String strKey = (String) e.nextElement();
            String strValue = properties.getProperty(strKey);
            System.out.println(strKey + "=" + strValue);
        }
    }

    public static String getProperty(String key) {
        if (properties != null) {
            return properties.getProperty(key);
        }
        return "";
    }

}
