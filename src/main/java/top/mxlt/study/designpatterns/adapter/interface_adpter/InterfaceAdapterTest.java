package top.mxlt.study.designpatterns.adapter.interface_adpter;

import top.mxlt.study.designpatterns.adapter.interface_adpter.impl.SystemAdapter;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/9
 */
public class InterfaceAdapterTest {
    public static void main(String[] args) {
        SystemAdapter systemAdapter = new SystemAdapter() {
            @Override
            public void write() {
                System.out.println("systemAdapter::write");
            }
        };
        systemAdapter.write();
    }
}
