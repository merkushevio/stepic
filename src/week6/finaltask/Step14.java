package week6.finaltask;

import java.util.*;

/*
*
* // Random variables
String randomFrom = "..."; // Некоторая случайная строка. Можете выбрать ее самостоятельно.
String randomTo = "...";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
int randomSalary = 100;  // Некоторое случайное целое положительное число. Можете выбрать его самостоятельно.

// Создание списка из трех почтовых сообщений.
MailMessage firstMessage = new MailMessage(
        "Robert Howard",
        "H.P. Lovecraft",
        "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
);

assert firstMessage.getFrom().equals("Robert Howard"): "Wrong firstMessage from address";
assert firstMessage.getTo().equals("H.P. Lovecraft"): "Wrong firstMessage to address";
assert firstMessage.getContent().endsWith("Howard!"): "Wrong firstMessage content ending";

MailMessage secondMessage = new MailMessage(
        "Jonathan Nolan",
        "Christopher Nolan",
        "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
);

MailMessage thirdMessage = new MailMessage(
        "Stephen Hawking",
        "Christopher Nolan",
        "Я так и не понял Интерстеллар."
);

List<MailMessage> messages = Arrays.asList(
        firstMessage, secondMessage, thirdMessage
);

// Создание почтового сервиса.
MailService<String> mailService = new MailService<>();

// Обработка списка писем почтовым сервисом
messages.stream().forEachOrdered(mailService);

// Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список сообщений, которые были ему отправлены
Map<String, List<String>> mailBox = mailService.getMailBox();

assert mailBox.get("H.P. Lovecraft").equals(
        Arrays.asList(
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        )
): "wrong mailService mailbox content (1)";

assert mailBox.get("Christopher Nolan").equals(
        Arrays.asList(
                "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                "Я так и не понял Интерстеллар."
        )
): "wrong mailService mailbox content (2)";

assert mailBox.get(randomTo).equals(Collections.<String>emptyList()): "wrong mailService mailbox content (3)";


// Создание списка из трех зарплат.
Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
Salary salary3 = new Salary(randomFrom, randomTo, randomSalary);

// Создание почтового сервиса, обрабатывающего зарплаты.
MailService<Integer> salaryService = new MailService<>();

// Обработка списка зарплат почтовым сервисом
Arrays.asList(salary1, salary2, salary3).forEach(salaryService);

// Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список зарплат, которые были ему отправлены.
Map<String, List<Integer>> salaries = salaryService.getMailBox();
assert salaries.get(salary1.getTo()).equals(Arrays.asList(1)): "wrong salaries mailbox content (1)";
assert salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)): "wrong salaries mailbox content (2)";
assert salaries.get(randomTo).equals(Arrays.asList(randomSalary)): "wrong salaries mailbox content (3)";
В конечном итоге, вам нужно реализовать классы MailService, MailMessage и Salary (и, вероятно, вспомогательные классы и интерфейсы) и отправить их код в форму. Все классы должны быть публичными и статическими (ваши классы подставятся во внешний класс для тестирования).

В идеологически правильном решении не должно фигурировать ни одного оператора instanceof.

В классе для тестирования объявлены следующие импорты:

import java.util.*;
import java.util.function.*;
*
*
*
*
* */
public static class Step14 {
    // Random variables
    String randomFrom = "..."; // Некоторая случайная строка. Можете выбрать ее самостоятельно.
    String randomTo = "...";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
    int randomSalary = 100;  // Некоторое случайное целое положительное число. Можете выбрать его самостоятельно.

    // Создание списка из трех почтовых сообщений.
    MailMessage firstMessage = new MailMessage(
            "Robert Howard",
            "H.P. Lovecraft",
            "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
    );

    assert firstMessage.getFrom().equals("Robert Howard"): "Wrong firstMessage from address";
    assert firstMessage.getTo().equals("H.P. Lovecraft"): "Wrong firstMessage to address";
    assert firstMessage.getContent().endsWith("Howard!"): "Wrong firstMessage content ending";

    MailMessage secondMessage = new MailMessage(
            "Jonathan Nolan",
            "Christopher Nolan",
            "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
    );

    MailMessage thirdMessage = new MailMessage(
            "Stephen Hawking",
            "Christopher Nolan",
            "Я так и не понял Интерстеллар."
    );

    List<MailMessage> messages = Arrays.asList(
            firstMessage, secondMessage, thirdMessage
    );

    // Создание почтового сервиса.
    MailService<String> mailService = new MailService<>();

// Обработка списка писем почтовым сервисом
    messages.stream().forEachOrdered(mailService);

    // Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список сообщений, которые были ему отправлены
    Map<String, List<String>> mailBox = mailService.getMailBox();

    assert mailBox.get("H.P. Lovecraft").equals(
            Arrays.asList(
            "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
    )
    ): "wrong mailService mailbox content (1)";Map<String, List<String>>

    assert mailBox.get("Christopher Nolan").equals(Arrays.asList("Брат, почему все так хвалят только тебя, " + "когда практически все сценарии написал я. Так не честно!", "Я так и не понял Интерстеллар.")): "wrong mailService mailbox content (2)";

    assert mailBox.get(randomTo).equals(Collections.<String>emptyList()): "wrong mailService mailbox contqent (3)";


    // Создание списка из трех зарплат.
    Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
    Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
    Salary salary3 = new Salary(randomFrom, randomTo, randomSalary);

    // Создание почтового сервиса, обрабатывающего зарплаты.
    MailService<Integer> salaryService = new MailService<>();

// Обработка списка зарплат почтовым сервисом
    Arrays.asList(salary1, salary2, salary3).forEach(salaryService);

    // Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список зарплат, которые были ему отправлены.
    Map<String, List<Integer>> salaries = salaryService.getMailBox();
    assert salaries.get(salary1.getTo()).equals(Arrays.asList(1))Map<String, List<String>>: "wrong salaries mailbox content (1)";
    assert salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)): "wrong salaries mailbox content (2)";
    assert salaries.get(randomTo).equals(Arrays.asList(randomSalary)): "wrong salaries mailbox content (3)";

}

public static class MailMessage {
    private String from;
    private String to;
    private String content;

    public MailMessage(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }


    // implement here
}

public static class Salary {
    private String from;
    private String to;
    private int salary;
    private Map<String, Integer> map = new HashMap<>();
    public Salary(String from, String to, int salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
        map.put(to, salary);
    }

    public String getTo() {
        return to;
    }


}

public static class MailService {
    private List<String> list = new ArrayList<>();
    private static Map<String, List<String>> map = new HashMap<>();

    public MailService(MailMessage mailMessage) {
        if (map.containsKey(mailMessage.getTo())) {
            list.add(mailMessage.getContent());
        }
        else {
            list.add(mailMessage.getContent());
            map.put(mailMessage.getTo(), list);
        }
    }

    public MailService() {
    }

    public static Map<String, List<String>> getMailBox(){

        return map;
    }

    public static get(String from) {

    }
}