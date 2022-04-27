package com.liuj.opencrm.util;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @Title:资源工具
 * @author: Liu jiang
 * @Date: 2022-01-18 16:18
 * @FilePath: Quartz  ==> ResourceUtil
 */
public class ResourceUtil {
    private static final Log logger = LogFactory.getLog(ResourceUtil.class);

    /**
     * 如果文件存放在classpath目录下 比如:config/com/ai/Test.bo 那么只需录入com/ai/Test.bo
     * 可以从jar中装载文件的
     *
     * @param filePath String
     * @return String
     * @throws Exception
     */
    public static String loadFileFromClassPath(String filePath) {
        InputStream is = null;
        BufferedReader br = null;
        try {
            is = Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream(filePath);
            br = new BufferedReader(new InputStreamReader(is));
            String tmp = null;
            StringBuffer sb = new StringBuffer();
            while (true) {
                tmp = br.readLine();
                if (tmp != null) {
                    sb.append(tmp);
                    sb.append("\n");
                } else {
                    break;
                }
            }
            return sb.toString();
        } catch (Exception ex) {
            logger.error(ex, ex);
            return "";
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                logger.error(ex, ex);
            }
            try {
                br.close();
            } catch (IOException ex) {
                logger.error(ex, ex);
            }
        }
    }

    /**
     * 从classpath或者jar中获得文件的URL
     *
     * @param filePath String
     * @return URL
     * @throws Exception
     */
    public static URL loadURLFromClassPath(String filePath) throws Exception {
        return Thread.currentThread().getContextClassLoader()
                .getResource(filePath);
    }

    /**
     * 从classpath或者jar中获得文件的输入流
     *
     * @param filePath String
     * @return InputStream
     * @throws Exception
     */
    public static InputStream loadInputStreamFromClassPath(String filePath)
            throws Exception {
        return Thread.currentThread().getContextClassLoader()
                .getResourceAsStream(filePath);
    }

    /**
     * 根据配置文件转载配置属性
     *
     * @param filePath
     *            String
     * @throws Exception
     * @return PropertiesConfiguration
     */
   /* public static PropertiesConfiguration loadPropertiesConfigurationFromClassPath(
            String filePath) throws Exception {
        PropertiesConfiguration pc = new PropertiesConfiguration();
        pc.load(ResourceUtil.loadInputStreamFromClassPath(filePath));
        return pc;
    }
*/

    /**
     * 根据配置文件转载配置属性
     *
     * @param filePath String
     * @return Properties
     * @throws Exception
     */
    public static Properties loadPropertiesFromClassPath(String filePath)
            throws Exception {
        Properties pc = new Properties();
        pc.load(ResourceUtil.loadInputStreamFromClassPath(filePath));
        return pc;
    }


    public static Properties loadPropertiesFromClassPath(String filePath,
                                                         String prefix, boolean isDiscardPrefix) throws Exception {
        Properties rtn = new Properties();
        Properties pc = loadPropertiesFromClassPath(filePath);
        Set key = pc.keySet();
        for (Iterator iter = key.iterator(); iter.hasNext(); ) {
            String element = (String) iter.next();
            if (StringUtils.indexOf(element, prefix) != -1) {
                if (isDiscardPrefix == true) {
                    rtn.put(org.springframework.util.StringUtils.replace(element, prefix + ".", "")
                            .trim(), pc.get(element));
                } else {
                    rtn.put(element, pc.get(element));
                }
            }
        }
        return rtn;
    }

    public static void main(String[] args) throws Exception {
        /*InputStream is = ResourceUtil
                .loadInputStreamFromClassPath("config.properties");
        PropertiesConfiguration pc = new PropertiesConfiguration();
        pc.load(is);*/

    }

}
