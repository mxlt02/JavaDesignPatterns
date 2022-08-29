package top.mxlt.study.designpatterns.factory.impl.config_simple;

import top.mxlt.study.designpatterns.factory.impl.simple.SimpleFactoryEnum;
import top.mxlt.study.designpatterns.factory.impl.simple.eneity.TargetObject;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/27
 */
public class ConfigSimpleFactoryTest {
    public static void main(String[] args) {
        ConfigSimpleFactory simpleFactory = new ConfigSimpleFactory();
        TargetObject aTargetObject = simpleFactory.getTargetObject("aTarget");
        System.out.println(aTargetObject);

        TargetObject bTargetObject = simpleFactory.getTargetObject("bTarget");
        System.out.println(bTargetObject);
        TargetObject bTargetObject1 = simpleFactory.getTargetObject("bTarget");
        System.out.println(bTargetObject1);
        System.out.println(bTargetObject==bTargetObject1);
    }
}
