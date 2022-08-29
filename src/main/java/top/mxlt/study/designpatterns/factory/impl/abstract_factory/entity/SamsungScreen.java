package top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/29
 */
public class SamsungScreen extends Screen{
    @Override
    public String draw(String image) {
        String response = "三星屏幕绘制了" + image;
        System.out.println(response);
        return response;
    }
}
