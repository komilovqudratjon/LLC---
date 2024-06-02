# Java Element Counter

## Описание
Этот репозиторий содержит решение тестового задания, в котором необходимо подсчитать количество всех элементов списка/массива и вернуть ассоциативный массив (или карту), где ключ — это элемент списка, а значение — количество этих элементов в списке. Задание выполнено на языке программирования Java.

## Пример
Входной массив: `[1, 3, 4, 5, 1, 5, 4]`

Выходная карта: `{1 : 2, 3 : 1, 4 : 2, 5 : 2}`

## Структура проекта
- **Java**:
    - Файл: `Main.java`
    - Класс: `Main`

## Использование

### Java
1. Скомпилируйте `Main.java`:
    ```bash
    javac Main.java
    ```

2. Запустите программу:
    ```bash
    java Main
    ```

## Пример кода

### Java
```java
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> result = Arrays.stream(array)
                .boxed()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
        System.out.println(result);
    }

}
