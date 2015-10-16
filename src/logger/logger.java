package logger;

import java.util.logging.*;

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
    private static void configureLogging()
    {
        Logger ClassA = Logger.getLogger("org.stepic.java");
        Logger ClassB = Logger.getLogger("org.stepic.java");
        Formatter format = new XMLFormatter();
        Handler handlerA = new ConsoleHandler();
        Handler handlerB = new ConsoleHandler();
        ClassA.addHandler(handlerA);
        ClassB.addHandler(handlerB);
        ClassA.setLevel(Level.ALL);
        ClassB.setLevel(Level.WARNING);
        ClassA.setUseParentHandlers(false);
        ClassB.setUseParentHandlers(false);
        handlerA.setLevel(Level.ALL);
        handlerB.setLevel(Level.ALL);
        handlerA.setFormatter(format);
        handlerB.setFormatter(format);



    }

}