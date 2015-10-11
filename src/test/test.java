package test;

import java.util.ArrayList;
import java.util.function.DoubleUnaryOperator;

public class test {



    public static void main(String[] args) {
        /*String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        test ts = new test();
        System.out.println(ts.StringRoles(roles, textLines));*/
        System.out.println(integrate(x -> 1, 0, 10));


    }

    public String StringRoles(String[] roles, String[] textLines){
        StringBuilder str = new StringBuilder();
        String out;
        for (int i = 0; i < roles.length; i++) {
            str.append(roles[i]+":"+"\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i]+ ":")){
                    str.append((j+1) + ")" + textLines[j].substring(roles[i].length()+1,textLines[j].length())+"\n");
                }
            }
        }
        out = str.toString();
        return out;
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double result = 0, h, n = 1e6;
        h = (b - a) / n;
        for (double x = a + h/2; x < b; x = x + h) {
            result = result + f.applyAsDouble(x)*h;
        }
        return result;
    }

}
