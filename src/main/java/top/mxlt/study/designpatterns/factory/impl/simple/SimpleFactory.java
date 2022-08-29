package top.mxlt.study.designpatterns.factory.impl.simple;

import top.mxlt.study.designpatterns.factory.impl.simple.eneity.ATargetObject;
import top.mxlt.study.designpatterns.factory.impl.simple.eneity.BTargetObject;
import top.mxlt.study.designpatterns.factory.impl.simple.eneity.TargetObject;

import java.util.Random;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/27
 */
public class SimpleFactory {
    /**
     * 也有人将该函数设为静态的, 两种方式都是可以的, 选合适的
     * @param simpleFactoryEnum
     * @return
     */
    public TargetObject getTargetObject(SimpleFactoryEnum simpleFactoryEnum){
        switch (simpleFactoryEnum){
            case A:
                ATargetObject aTargetObject = new ATargetObject();
                aTargetObject.setName("由工厂创建对象");
                return aTargetObject;
            case B:
                BTargetObject bTargetObject = new BTargetObject();
                bTargetObject.setId(new Random().nextLong());
                bTargetObject.setName("由工厂创建对象");

                return bTargetObject;
            default:
                throw new IllegalArgumentException("SimpleFactoryEnum TargetObject not found exception");
        }
    }
}
