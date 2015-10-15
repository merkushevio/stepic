package exception;

/*Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.

        Метод getCallerClassAndMethodName() должен возвращать имя класса и метода,
        откуда вызван метод, вызвавший данный утилитный метод.
        Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName()
        является точкой входа в программу, т.е. его никто не вызывал.*/

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        String res = null;
        try {
            throw new Throwable();
        }
        catch (Throwable throwable) {
            if (throwable.getStackTrace().length < 3){
                return null;
            }
            else
                 res = throwable.getStackTrace()[2].getClassName() + "#" + throwable.getStackTrace()[2].getMethodName();
           }
        return res;
    }

}

