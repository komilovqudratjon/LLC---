# Groovy and Java Element Counter

## Описание
Этот репозиторий содержит решение тестового задания, в котором необходимо подсчитать количество всех элементов списка/массива и вернуть ассоциативный массив (или карту), где ключ — это элемент списка, а значение — количество этих элементов в списке. Задание выполнено на двух языках программирования: Java и Groovy.

## Пример
Входной массив: `[1, 3, 4, 5, 1, 5, 4]`

Выходная карта: `{1 : 2, 3 : 1, 4 : 2, 5 : 2}`

## Структура проекта
- **Java**:
  - Файл: `ElementCounter.java`
  - Класс: `ElementCounter`
  - Метод: `countElements`

- **Groovy**:
  - Файл: `ElementCounter.groovy`
  - Функция: `countElements`

## Использование

### Java
1. Скомпилируйте `ElementCounter.java`:
    ```bash
    javac ElementCounter.java
    ```

2. Запустите программу:
    ```bash
    java ElementCounter
    ```

### Groovy
1. Запустите скрипт `ElementCounter.groovy`:
    ```bash
    groovy ElementCounter.groovy
    ```

## Пример кода

### Java
```java
import java.util.HashMap;
import java.util.Map;

public class ElementCounter {

    public static Map<Integer, Integer> countElements(int[] array) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();
        for (int element : array) {
            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }
        return elementCountMap;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> result = countElements(array);
        System.out.println(result);
    }
}
