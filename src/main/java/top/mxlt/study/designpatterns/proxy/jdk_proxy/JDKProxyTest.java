package top.mxlt.study.designpatterns.proxy.jdk_proxy;

import top.mxlt.study.designpatterns.proxy.SellTickets;
import top.mxlt.study.designpatterns.proxy.jdk_proxy.impl.JDKProxyFactory;

import java.util.Scanner;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/6
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        JDKProxyFactory jdkProxyFactory = new JDKProxyFactory();
        SellTickets sellTicketsObject = jdkProxyFactory.getSellTicketsObject();
        sellTicketsObject.sell();

        //配合arthas查看代理情况
        System.out.println(sellTicketsObject.getClass());
        System.out.println("任意输入后退出程序");
        new Scanner(System.in).nextLine();
    }
}
