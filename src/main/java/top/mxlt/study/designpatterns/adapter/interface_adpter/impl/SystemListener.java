package top.mxlt.study.designpatterns.adapter.interface_adpter.impl;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/9
 */
public interface SystemListener {
    void write();
    void read();
    void close();
    void start();
}
