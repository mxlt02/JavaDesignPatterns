package top.mxlt.study.designpatterns.prototype.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/3
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prototype implements Cloneable, Serializable {
    public Boolean enableDeepClone = false;

    private String name;
    private String type;

    private List<String> args = new ArrayList<>();


    @Override
    public Prototype clone() {
        return enableDeepClone?deepClone():shallowClone();
    }

    private Prototype shallowClone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    private Prototype deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {

            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Prototype prototype = (Prototype)ois.readObject();
            return prototype;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                // TODO: handle exception
                System.out.println(e2.getMessage());
            }
        }
    }
}
