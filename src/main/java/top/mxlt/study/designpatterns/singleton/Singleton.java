package top.mxlt.study.designpatterns.singleton;

import lombok.Data;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/26
 */
@Data
public class Singleton {

    Singleton instance = new Singleton();

    /**
     * 1.私有构造函数使其无法被其他类创建实例
     */
    private Singleton() {
    }
}
