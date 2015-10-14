package stepic;

/*–еализуйте метод, позвол€ющий другим методам узнать, откуда их вызвали.

        ћетод getCallerClassAndMethodName() должен возвращать им€ класса и метода,
        откуда вызван метод, вызвавший данный утилитный метод.
        »ли null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName()
        €вл€етс€ точкой входа в программу, т.е. его никто не вызывал.*/

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
            if (throwable.getStackTrace().length < 1){
                return null;
            }
            else
                for (int i = 0; i < throwable.getStackTrace().length; i++) {
                    res = throwable.getStackTrace()[1].getClassName() + "#" + throwable.getStackTrace()[1].getMethodName();
                }

        }
        return res;
    }

}

