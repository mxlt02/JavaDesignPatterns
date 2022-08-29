package top.mxlt.study.designpatterns.factory.impl.abstract_factory;

import top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity.Keyboard;
import top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity.Mouse;
import top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity.Screen;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/29
 */
public interface DigitalFactory {

    Keyboard createKeyboard();
    Screen createScreen();
    Mouse createMouse();

}
