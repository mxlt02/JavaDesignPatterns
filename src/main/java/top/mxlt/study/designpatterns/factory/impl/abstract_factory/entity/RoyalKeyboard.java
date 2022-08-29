package top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/29
 */
public class RoyalKeyboard extends Keyboard {

    @Override
    public String input(String key) {
        String response = "御斧键盘输入了" + key;
        System.out.println(response);
        return response;
    }
}
