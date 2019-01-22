package com.luc.callisto.dp.cor;

/**
 * @author : linweizhong
 * @date : 2019-01-22 19:47
 * Description:
 */
public class SpellCheckerProcessing extends ProcessingObject<String> {
    @Override
    protected String handleWork(String input) {
        return "From Raoul, Mario and Alan: " + input;
    }
}
