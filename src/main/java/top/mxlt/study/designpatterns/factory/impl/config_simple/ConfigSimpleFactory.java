package top.mxlt.study.designpatterns.factory.impl.config_simple;


import top.mxlt.study.designpatterns.factory.impl.simple.SimpleFactoryEnum;
import top.mxlt.study.designpatterns.factory.impl.simple.eneity.ATargetObject;
import top.mxlt.study.designpatterns.factory.impl.simple.eneity.BTargetObject;
import top.mxlt.study.designpatterns.factory.impl.simple.eneity.TargetObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Random;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/27
 */
public class ConfigSimpleFactory {

    private static HashMap<String, TargetObject> map = new HashMap();

    static {
        Properties properties = new Properties();
        InputStream resourceAsStream = ConfigSimpleFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(resourceAsStream);

            properties.forEach((key,value) ->{
                try {
                    Class<?> clazz = Class.forName((String) value);
                    TargetObject targetObject = (TargetObject) clazz.getDeclaredConstructor().newInstance();
                    map.put((String) key,targetObject);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static TargetObject getTargetObject(String key){
        return map.get(key);
    }
}
