package top.mxlt.study.designpatterns.factory.impl.simple;

import top.mxlt.study.designpatterns.factory.impl.simple.eneity.TargetObject;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/27
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        TargetObject aTargetObject = simpleFactory.getTargetObject(SimpleFactoryEnum.A);
        System.out.println(aTargetObject);

        TargetObject bTargetObject = simpleFactory.getTargetObject(SimpleFactoryEnum.B);
        System.out.println(bTargetObject);
        TargetObject bTargetObject1 = simpleFactory.getTargetObject(SimpleFactoryEnum.B);
        System.out.println(bTargetObject1);
        System.out.println(bTargetObject==bTargetObject1);
    }
}
