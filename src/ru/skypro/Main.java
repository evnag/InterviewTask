/*
*** 11 билет ***
- Задача
    Дан массив пар названий книг и авторов, необходимо привести каждую пару
    в строку вида: “Название книги” Имя Отчество Фамилия автора
 */

package ru.skypro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Title1", "Author`s full name");
        map.put("Title2", "Author`s full name");
        map.put("Title3", "Author`s full name");

        System.out.println(mapToList(map));
    }

    private static List<String> mapToList(Map<String, String> lib) {
        return lib.keySet().stream()
                .map(key -> "\"" + key + "\" " + lib.get(key))
                .collect(Collectors.toList());
    }
}
