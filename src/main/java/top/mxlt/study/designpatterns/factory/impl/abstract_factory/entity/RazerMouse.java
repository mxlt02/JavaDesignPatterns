package top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/29
 */
public class RazerMouse extends Mouse {
    @Override
    public String click(String key) {
        String response = "雷蛇鼠标点击了" + key;
        System.out.println(response);
        return response;
    }
}
