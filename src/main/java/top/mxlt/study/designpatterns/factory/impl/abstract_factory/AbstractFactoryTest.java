package top.mxlt.study.designpatterns.factory.impl.abstract_factory;

import top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity.Keyboard;
import top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity.Mouse;
import top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity.Screen;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/29
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        // DigitalFactory digitalFactory = new LenovoDigitalFactory();
        DigitalFactory digitalFactory = new RogDigitalFactory();
        Keyboard keyboard = digitalFactory.createKeyboard();
        Mouse mouse = digitalFactory.createMouse();
        Screen screen = digitalFactory.createScreen();

        keyboard.input("Hello");
        mouse.click("左键");
        screen.draw("大海");
    }
}
