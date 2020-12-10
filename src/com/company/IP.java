package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IP {
    public static void main(String[] args) {
        System.out.println(list("Задача 1.\n" +
                "\n" +
                "Поработать приложение контакты\n" +
                "\n" +
                "1) добавить проверку номера при добавлении контакта\n" +
                "\n" +
                "2) добавить пункты меню \"поиск по части номера\" и поиск по началу имени (применить методы строк)\n" +
                "\n" +
                "\n" +
                "\n" +
                "Задача 2.\n" +
                "\n" +
                "выбрать из фрагмента текста все ip адреса\n" +
                "\n" +
                "примеры ip адресов:\n" +
                "\n" +
                "127.0.0.1\n" +
                "\n" +
                "10.128.17.14\n" +
                "\n" +
                "10.130.24.1"));
    }


    static List<String> list(String txt) {
        List<String> list = new ArrayList<>();

        Pattern p = Pattern.compile("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.\\d{1,3}");
        Matcher matcher = p.matcher(txt);

        while (matcher.find()) {

            list.add(matcher.group());
        }
        return list;
    }

}
