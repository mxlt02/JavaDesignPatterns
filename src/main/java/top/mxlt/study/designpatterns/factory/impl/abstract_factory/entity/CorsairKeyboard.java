package top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/29
 */
public class CorsairKeyboard extends Keyboard {

    @Override
    public String input(String key) {
        String response = "美商海盗船键盘输入了" + key;
        System.out.println(response);
        return response;
    }
}
