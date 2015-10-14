package stepic;

/*���������� �����, ����������� ������ ������� ������, ������ �� �������.

        ����� getCallerClassAndMethodName() ������ ���������� ��� ������ � ������,
        ������ ������ �����, ��������� ������ ��������� �����.
        ��� null (������� ������, � �� ������ "null"), ���� �����, ��������� getCallerClassAndMethodName()
        �������� ������ ����� � ���������, �.�. ��� ����� �� �������.*/

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

