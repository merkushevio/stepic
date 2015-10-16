package logger;

/*
* В этой задаче вам нужно реализовать метод, настраивающий параметры логирования. Конфигурирование в коде позволяет выполнить более тонкую и хитрую настройку, чем при помощи properties-файла.

Требуется выставить такие настройки, чтобы:

Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
Сообщения от всех логгеров с именами, начинающимися на "org.stepic.java", независимо от уровня печатались в консоль в формате XML (*).
Сообщения от всех логгеров с именами, начинающимися на "org.stepic.java", не передавались вышестоящим обработчикам ("org.stepic", "org" и "").
Не упомянутые здесь настройки изменяться не должны.

(*) В реальных программах мы бы конечно печатали XML не в консоль, а в файл. Но проверяющая система не разрешает создавать файлы на диске, поэтому придется так.
* */
public class logger {


}
