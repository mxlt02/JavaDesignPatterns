package top.mxlt.study.designpatterns.factory.impl.simple.eneity;

import lombok.Data;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/27
 */
@Data
public class BTargetObject implements TargetObject{
    private Long id;
    private String name;
}
