Функционал программы:
1. Создание случайного количества котиков, НО не более 10ти.
   1.1 Всего будет три породы кошек. Создаваться породы кошек будут тоже случайно.
   1.2 Отличаться каждая порода будет только цветом. Остальные конфигурации каждого кота идентичны: 4 лапы, 1 хвост.
   1.3 Каждый котик при создании должен сказать в консоль "мяу".

2. Создание случайного количества собак, НО не более 10ти.
   2.1 Всего будет три породы собак. Создаваться породы собак будут тоже случайно.
   2.2 Отличаться каждая порода будет только цветом. Остальные конфигурации каждой собаки идентичны: 4 лапы, 1 хвост.
   2.3 Каждая собака при создании должна сказать в консоль "гав".

3. Определение победителя по логике: кого создалось больше, тот и победил.

4. Вывод победителя в консоль. Например: "Победили коты".

При каждом запуске программа каждый раз выдает разный результат. Примеры:

Пример результата работы программы №1:
Создалось 6 кошек (зеленая, красная, красная, синяя, синяя, синяя)
Создалось 7 собак (серая, черная, черная, серая, рыжая, серая, рыжая)
Итог: выиграли собаки.

Пример результата работы программы №2:
Создалось 5 кошек (красная, красная, красная, зеленая, красная)
Создалось 3 собаки (рыжая, серая, серая)
Итог: выиграли коты.

Пример результата работы программы №3:
Создалось 10 кошек (синяя, красная, зеленая, синяя, синяя, зеленая, красная, красная, красная, зеленая)
Создалось 5 собак (черная, черная, серая, рыжая, серая)
Итог: выиграли коты.

-----------------------------------------------------------------------------------------------------------------------

Суперкласс Animal :
   4 поля лап типа Object(судя по todo, должны быть)
   1 поле хвоста типа Object(судя по todo, должны быть)
   1 поле породы типа String(+ поле с перечнем пород или enum?)
    
   метод voice

Классы кот/пёс:
   переопределить голос
   добавить конструктор, рандомящий породу, использующий голос

Выполнение:
   создать поток/массив/список?, сравнить длинну, вывести
   
   
почему создаются кошки а побеждают коты?..