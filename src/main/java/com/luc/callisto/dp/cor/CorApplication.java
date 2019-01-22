package com.luc.callisto.dp.cor;


import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author : linweizhong
 * @date : 2019-01-22 19:22
 * Description:
 */
public class CorApplication {
    public static void main(String[] args) {
        ProcessingObject<String> t1 = new HeaderTextProcessing();
        ProcessingObject<String> t2 = new SpellCheckerProcessing();

        t1.setSucessor(t2);
        String result = t1.handle("Aren't labdas really sexy?!!");
        System.out.println(result);

        // use lamdda
        UnaryOperator<String> headerProcessing = text -> "From Raoul, Mario and Alan: " + text;
        UnaryOperator<String> spellCheckerProcessing = text -> text.replaceAll("labda", "lambda");
        Function<String, String> pipline = headerProcessing.andThen(spellCheckerProcessing);

        result = pipline.apply("Aren't labdas really sexy?!!");
        System.out.println(result);

    }
}
