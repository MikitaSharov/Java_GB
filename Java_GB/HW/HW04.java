package Java_GB.Java_GB.HW;

/*Дана строка sql-запроса:
        select * from students where "
        Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример данных для фильтрации приведены ниже в виде json-строки.
        Если значение null, то параметр не должен попадать в запрос.
        Пример:
        {"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
        Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
        String QUERY - начало SQL-запроса
        String PARAMS - JSON с параметрами
        select * from students where name='Ivanov' and country='Russia' and city='Moscow'*/

import java.util.Arrays;

public class HW04 {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = " {\"name\": \"Ivanov\", \"country\": \"Russia\", \"city\": \"Moscow\", \"age\": \"null\"}";

        System.out.println(sqlFormat(QUERY, PARAMS).toString());
    }

    static StringBuilder sqlFormat(String start, String finish) {
        finish = finish.trim().replaceAll("[{}\"]", "");
        String[] pairs = finish.split(", ");
        StringBuilder sqlFinish = new StringBuilder();
        for (String pair: pairs) {
            String[] pairArr = pair.split(":");
            String key = pairArr[0];
            String value = pairArr[1].trim();
            if (!value.equals("null")) {
                if (sqlFinish.length() > 0) {
                    sqlFinish.append(" and ");
                }
                sqlFinish.append(key + "='" + value + "'");
            }
        }

        return new StringBuilder(start + sqlFinish);
    }
}
