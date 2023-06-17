public class MyArrayDataException extends LessonException{
    public MyArrayDataException(int i, int j, String value){
        super(String.format("Массив имеет некорректное значение '%s' в ячейке [%s][%s]!", value, i, j));
    }
}
