package test;

import java.util.ArrayList;

public class test {



    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        test ts = new test();
        System.out.println(ts.StringRoles(roles, textLines));

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
    public final static class text{
        public final static int stat =0;
        public final int metod(final int in){

        }
    }

}
