public class AgeStudentException extends Throwable {
String str;
    public AgeStudentException(int age) throws Exception {
        if (age<0) throw new Exception();
    }

    public AgeStudentException() {}
}
