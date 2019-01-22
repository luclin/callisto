package com.luc.callisto.dp.cor;

/**
 * @author : linweizhong
 * @date : 2019-01-22 19:47
 * Description:
 */
public class HeaderTextProcessing extends ProcessingObject<String> {
    @Override
    protected String handleWork(String input) {
        return input.replaceAll("labda", "lambda");
    }
}
