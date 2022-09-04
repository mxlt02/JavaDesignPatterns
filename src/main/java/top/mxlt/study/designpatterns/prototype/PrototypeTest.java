package top.mxlt.study.designpatterns.prototype;

import top.mxlt.study.designpatterns.prototype.impl.Prototype;

import java.util.ArrayList;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/3
 */
public class PrototypeTest {
    public static void main(String[] args) {
        System.out.println("浅拷贝模式=====================start");
        Prototype shallowPrototype = new Prototype(false,"name1", "type1",new ArrayList<>());
        shallowPrototype.getArgs().add("0");
        Prototype shallowPrototype1 = shallowPrototype.clone();
        shallowPrototype.getArgs().add("1");
        shallowPrototype1.getArgs().add("shallowPrototype1");
        Prototype shallowPrototype2 = shallowPrototype1.clone();
        shallowPrototype.getArgs().add("2");
        shallowPrototype2.getArgs().add("shallowPrototype2");

        System.out.println(shallowPrototype);
        System.out.println(shallowPrototype1);
        System.out.println(shallowPrototype2);
        System.out.println(shallowPrototype == shallowPrototype1);
        System.out.println(shallowPrototype1 == shallowPrototype2);
        System.out.println(shallowPrototype == shallowPrototype2);

        /**
         * 浅拷贝模式
         * Prototype(enableDeepClone=false, name=name1, type=type1, args=[0, 1, shallowPrototype1, 2, shallowPrototype2])
         * Prototype(enableDeepClone=false, name=name1, type=type1, args=[0, 1, shallowPrototype1, 2, shallowPrototype2])
         * Prototype(enableDeepClone=false, name=name1, type=type1, args=[0, 1, shallowPrototype1, 2, shallowPrototype2])
         * false
         * false
         * false
         *
         * 影响了子属性List 这样不好
         */
        System.out.println("浅拷贝模式=====================end");

        System.out.println("\n\n");

        System.out.println("深拷贝模式=====================start");
        Prototype deepPrototype = new Prototype(true,"name1", "type1",new ArrayList<>());
        deepPrototype.getArgs().add("0");
        Prototype deepPrototype1 = deepPrototype.clone();
        deepPrototype.getArgs().add("1");
        deepPrototype1.getArgs().add("deepPrototype1");
        Prototype deepPrototype2 = deepPrototype1.clone();
        deepPrototype.getArgs().add("2");
        deepPrototype2.getArgs().add("deepPrototype2");

        System.out.println(deepPrototype);
        System.out.println(deepPrototype1);
        System.out.println(deepPrototype2);
        System.out.println(deepPrototype == deepPrototype1);
        System.out.println(deepPrototype1 == deepPrototype2);
        System.out.println(deepPrototype == deepPrototype2);

        /**
         * 深拷贝模式
         * Prototype(enableDeepClone=true, name=name1, type=type1, args=[0, 1, 2])
         * Prototype(enableDeepClone=true, name=name1, type=type1, args=[0, deepPrototype1])
         * Prototype(enableDeepClone=true, name=name1, type=type1, args=[0, deepPrototype1, deepPrototype2])
         * false
         * false
         * false
         *
         * 子属性List是一个全新对象不会互相影响
         */
        System.out.println("深拷贝模式=====================end");

    }
}
