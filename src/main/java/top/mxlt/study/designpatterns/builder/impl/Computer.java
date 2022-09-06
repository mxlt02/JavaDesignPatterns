package top.mxlt.study.designpatterns.builder.impl;

import lombok.Data;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/6
 */
@Data
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen){
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }

        public Builder mainboard(String mainboard){
            this.mainboard = mainboard;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
