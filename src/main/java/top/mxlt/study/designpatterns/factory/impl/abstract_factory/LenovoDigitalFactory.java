package top.mxlt.study.designpatterns.factory.impl.abstract_factory;

import top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity.*;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/29
 */
public class LenovoDigitalFactory implements DigitalFactory{
    @Override
    public Keyboard createKeyboard() {
        return new RoyalKeyboard();
    }

    @Override
    public Screen createScreen() {
        return new HuaxingScreen();
    }

    @Override
    public Mouse createMouse() {
        return new LogitechMouse();
    }
}
