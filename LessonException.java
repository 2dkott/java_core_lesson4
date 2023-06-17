public class LessonException extends Exception{
    public LessonException(String message){
        super("Исключение урока: \n" + message);
    }
}
