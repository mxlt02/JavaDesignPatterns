package top.mxlt.study.designpatterns.builder;

import top.mxlt.study.designpatterns.builder.impl.Computer;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/6
 */
public class BuilderTest {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("I9 12900K")
                .memory("Samsung 64G DDR5 6400Hz")
                .mainboard("MXLT")
                .screen("LG 24")
                .build();
        System.out.println(computer);
    }
}
