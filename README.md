Вебинар 8, Spring:

1. Что такое сериализация, как она устроена в Java?
2. Отличие Serializable и Externalizable
3. Функциональные интерфейсы в Java?
4. Лямбда выражения, что такое и для чего нужны?
5. Что такое stream api?
6. Что такое микросервисная архитектура? Разница между монолитом и микросервисной средой?

Задача:
У нас есть отсортированный список, который может состоять из положительных и отрицательных значений. 
Необходимо из этого списка составить отсортированный список квадратов каждого числа.

Код:
public static void main(String[] args) {
        int[] array = {-5, -3, 0, 1, 2, 4,5,6};

        int[] result = new int[array.length];

        int left = 0;
        int inxResult = array.length - 1;
        int right = array.length -1 ;

        while (left <= right) {

            if (left == right) {
                result[inxResult] = array[left] * array[left];
                break;
            }

            int a = array[left];
            int b = array[right];

            if (a * a < b * b) {
                result[inxResult] = b*b;
                right--;
            } else if (a * a > b * b) {
                result[inxResult] = a*a;
                left++;
            } else if (a * a == b * b) {
                result[inxResult] = b*b;
                inxResult--;
                result[inxResult] = a*a;
                right--;
                left++;
            }
            inxResult--;
        }

        for (int i : result) {
            System.out.println(i);
        }
}
