package EXCEPTION;

public class TryCatch2 {

        public static void main(String[] args) {
            /*Напишите метод с именем restartElement(), который принимает в качестве параметров массив
             логических значений и индекс. Этот метод пытается получить элемент по указанному индексу из массива
              и возвращает его. Однако существует вероятность возникновения исключения ArrayIndexOutOfBoundsException,
              если предоставленный индекс выходит за пределы массива. В таких случаях обработайте исключение
              корректно и выведите соответствующее сообщение об ошибке: «Ошибка: индекс выходит за пределы».
               Возвращайте false, когда это исключение перехвачено.
               Параметры:
boolean[] array: Массив логических значений.
int index: индекс, из которого извлекается элемент.
Возврат: элемент по указанному индексу или false, если индекс выходит за пределы.

             */


            boolean[] array = {true, false, true, false, true};
            int index = 7;

            boolean element = retrieveElement(array, index);

            if (element) {
                System.out.println("Element at index " + index + ": true");
            } else {
                System.out.println("Element at index " + index + ": false");
            }
        }

        public static boolean retrieveElement(boolean[] array, int index) {
            try {
                return array[index];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error: Index out of bounds.");
                return false;
            }
        }
    }


