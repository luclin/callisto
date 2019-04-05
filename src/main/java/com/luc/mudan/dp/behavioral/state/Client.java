package com.luc.mudan.dp.behavioral.state;

/**
 * @author : luc
 * @date : 2019-04-05 11:06
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        State state = context.getState();
        System.out.println("------- boy ------- ");
        state.doing();
        state.thinking();
        System.out.println("------- man ------- ");

        ManState man = new ManState();
        context.setState(man);
        state = context.getState();
        state.doing();
        state.thinking();

        System.out.println("------- father ------- ");
        FatherState father = new FatherState();
        context.setState(father);
        state = context.getState();
        state.doing();
        state.thinking();

    }
}
