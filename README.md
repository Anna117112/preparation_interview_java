# preparation_interview_java
Вебинар 1. Пробегаем по ООП.

1.  Что такое ООП и какие его основные принципы?
2.  Принцип Абстракция, как реализовано в Java?
3.  Принцип Наследование, как реализовано в Java?
4.  Принцип Инкапсуляция, за счёт чего реализовано в Java?
5.  Принцип Полиморфизм, что за зверь, как реализовано в Java?
6.  Что такое переопределение и перегрузка методов?
7.* Существует динамическое и статическое связывание кода, что это такое?
8.  Для чего используются ключевые слова this и super?
9.  Для чего используется оператор instanceof?
10. Можно ли создать приватный метод у интерфейса?
11. Можем ли мы в интерфейсе реализовать какой-нибудь метод?
12. У нас есть интерфейс A.class с методом test(), также есть интерфейс B.class с методом test(). 
	Создадим C.class который имплементирует A и B. Какую реализацию возмёт себе класс C?
13. Чем по умолчанию инициализируются локальные переменные?
14. Можно ли объявить метод одновременно абстрактным и статическим?
15. Чем отличается внутренний класс от вложенного?
16. Что такое локальный класс?
17. ЧТо такое анонимный класс?
18. Что такое класс Object? перечислите основные его методы?
19. Может ли абстрактный класс не содержать абстрактных методов?
20. Чем отличается абстрактный класс и интерфейс?
21. Как получить доступ к private полям любого класса?
22. Разница между композицией и наследованием?
23. Принципы SOLID?

Вебинар 2, алгоритмы и структуры данных:

1.  Какие из методов класса Object нам необходимы в первую очередь для работы с коллекциями?
2.  Для чего необходим метод equals(), какая его базовая реализация?
3.  Что за волшебный метод hashCode()?
4.  Что возвращает базовая реализация метода hashCode()?
5.  Какой контракт между методами Equals и HashCode?
6.  Опишите иерархию классов коллекций?
7.  Для чего используется очередь? Какие принципы могут быть реализованы в очереди?
8.  Что из себя представляет ArrayList?
9.  Сложность операций вставки, поиска, удаления элемента в ArrayList?
8.  Что из себя представляет LinkedList?
9.  Сложность операций вставки, поиска, удаления элемента в LinkedList?
10. Когда надо использовать ArrayList, а когда LinkedList?
11. Что такое Set? Какова его основная особенность?
12. В чем разница между HashSet и TreeSet?
13. Можно ли в HashSet и TreeSet положить null?
14. Что такое Iterator и интерфейс Iterable?
15. Что такое fail-fast и fail-safe итераторы?
16. Расскажите что из себя представляет коллекция Map?
17. Почему интерфейс Map находится отдельно от других коллекций?
18. C помощью какого механизма реализовано итерирование по Map?
19. Как реализован механизм вставки в Map?
20. Что такое коллизия и как она решается?
21. Что такое TreeMap на каком механизме он реализован? 


Вебинар 3, Java Core, углубленное изучение:

1.  Что такое JDK, JRE, JVM и как эти вещи между собой связаны?
2.  Как в Java устроена память?
3.  Для чего используется область памяти non-heap (metaspace)?
4.  О чём гласит гипотеза о поколениях?
5.  Как гипотеза о поколениях применяется в Java?
6.  Что такое GC? 
7.  Какие виды GC вы знаете?
8.  Что такое “Stop the world” пауза?
9.  Как понять что объект помечен на удаление?
10. Что такое принцип happens-before?
11. Для чего используется ключевое слово volatile?
12. Что такое пул-потоков и какие его плюсы?
13. Что такое монитор блокировки?
14. Что может использоваться в качестве монитора блокировки?
15. Для чего используется ключевое слово synchronized?
16. Для чего используются методы wait, notify и notifyAll?
17. Что такое поток-демон?
18. Как можно остановить поток?
19. Для чего используется ThreadLocal?
#Вебинар 4, Базы данных:

Что такое Primary Key?
Что такое Foreign Key?
Что такое индексы и для чего они используются в БД?
Какие есть типы индексов?
Для чего используется JOIN, какие виды JOIN-ов вы знаете?
Для чего используется ключевое слово DISTINCT?
Для чего используется GROUP BY?
Для чего используется HAVING?
Что такое JDBC?
Назовите основные интерфейсы в JDBC?
Для чего используется DriverManager?
В чём разница между Statement, PreparedStatement и CallableStatement?
Что такое JPA и как JPA связано с Hibernate?
Что такое транзакция?
Какие требования предъявляются к транзакциям (ACID)?
Какие вы знаете уровни изоляции и какие проблемы они решают?

Вебинар 5, Hibernate:

1.  Что такое JPA и как JPA связано с Hibernate?
2.  Что такое ORM? Как ORM связан с JPA?
3.  Что такое Hibernate и какие его основные интерфейсы?
4.  Что такое сущность (Entity)?
5.  Какие требования JPA к Entity классам-сущностям вы можете перечислить?
6.  Какая аннотация отвечает за первичный ключ и какие типы генерации этого ключа вы знаете?
7.  Какой аннотацией мы определяем, что поле является столбцом и как мы можем определить имя стобца?
8.  Какой аннотацией мы указываем, что свойство не используется в БД?
9.  Какие бывают типы связей между сущностями в Hibernate?
10. Какие существуют способы загрузки связанных сущностей или коллекций в JPA (FetchType)?
11. Что такое каскадные операции и как это реализовано в JPA?
12. В чем разница между CascadeType.REMOVE и orphanRemoval в JPA?
13. Для чего используется Embeddable и Embedded, в чём разница?
14. Наследование в Hibernate? Стратегии и аннотации для этого?
15. Что такое persistence context? 
16. В каком состоянии может находиться сущность?
17. Какие уровни кеширования существуют в Hibernate?

Вебинар 6, Java Web:

1.  Какие HTTP-методы вы знаете и для чего они используются?
2.  В чём разница между GET и POST запросами?
3.  Что такое HTTP протокол?
4.  Какие статус коды ответов вы знаете, что они означают?
5.  В чём разница между авторизацией и аутентификацией?
6.  Что такое сервлет?
7.  Что такое application server и для чего он нужен?
8.  Жизненный цикл сервлета?
9.  В чём разница между war и jar приложениями?
10. Что такое REST?
11. Какие основные принципы предъявляются к RESTful системе?
12. Что такое SOAP? Какие отличия от REST?
13. За что отвечают аннотации @Controller и @RestController? В чём разница?
14. Используются ли в Spring Boot сервлеты?

Вебинар 7, Spring:

1.  Что такое IoC и DI? 
2.  Как DI реализован в Spring?
3.  Что такое Spring Bean?
4.  Какой ЖЦ у spring bean в рамках Spring Context?
5.  Какие scope beans вы знаете? Чем они отличаются?
6.  Какие способы внедрения бинов вы знаете? В чём разница между этими способами?
7.  Как мы можем сказать Spring, что рассматриваемый нами класс должен являться бином?
8.  В чем разница между аннотациями @Component @Service @Repository?
9.  Зачем нужна аннотация @Bean? Где они используется?
10. Какие способы взаимодействия с БД реализованы в Spring?
11. Чем отличается JpaRepository от CrudRepository?
12. Для чего используется аннотация @Transactional?
13. Что такое AOP? Какие основные сущности используются в AOP?
14. Умеет ли Spring работать с final классами?
15. Что такое proxy и какие способы создания прокси объекта вы знаете?
16. Какие основной паттерны использует Spring Security?
17. Что такое Spring Boot? Какую функциональность реализует Spring Boot?
18. За что отвечает Spring Cloud?

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
