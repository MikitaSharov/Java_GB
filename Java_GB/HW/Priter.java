package Java_GB.Java_GB.HW;

/* Дана строка sql-запроса:

select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример данных для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.

Пример:

{"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса
String PARAMS - JSON с параметрами 
select * from students where name='Ivanov' and country='Russia' and city='Moscow'
*/

class Answer {
  public static StringBuilder answer(String QUERY, String PARAMS) {
    // Напишите свое решение ниже
    StringBuilder sqlCondition = new StringBuilder();

    // Удаляем скобки и кавычки
    PARAMS = PARAMS.replaceAll("[{}\"]", "");

    // Разделяем строку по запятым и создаем массив
    String[] keyValuePairs = PARAMS.split(", ");

    // Преобразуем в строку условия SQL
    for (String pair : keyValuePairs) {
      String[] entry = pair.split(":");
      String key = entry[0];
      String value = entry[1].trim(); // Обрезаем пробелы вокруг значения

      // Добавляем условие к строке SQL только если значение не равно "null" (как
      // строка без пробела)
      if (!"null".equals(value)) {
        if (sqlCondition.length() > 0) {
          sqlCondition.append(" and ");
        }
        sqlCondition.append(key).append("='").append(value).append("'");
      }
    }

    return new StringBuilder(QUERY).append(sqlCondition);
  }
}

public class Priter {
  public static void main(String[] args) {
    String QUERY = "";
    String PARAMS = "";

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      QUERY = "select * from students where ";
      PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
    } else {
      QUERY = args[0];
      PARAMS = args[1];
    }

    new Answer();
    System.out.println(Answer.answer(QUERY, PARAMS));
  }
}
