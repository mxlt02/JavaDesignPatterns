package top.mxlt.study.designpatterns.adapter.object_adapter.impl;

import lombok.Data;

import java.util.Random;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/8
 */
@Data
public class PNGAdaptee {
    private String[] colors = new String[]{"透明","红色","绿色","蓝色","黄色","白色","黑色"};
    private String[][] data = new String[10][10];

    public String[][] draw(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = randomColor();
            }
        }
        System.out.println("PMG:draw\n"+data);
        return data;
    }

    public String randomColor(){
        return colors[new Random().nextInt(colors.length)];
    }
}
