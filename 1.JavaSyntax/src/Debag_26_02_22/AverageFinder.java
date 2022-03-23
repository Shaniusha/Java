package Debag_26_02_22;

public class AverageFinder {
    public static void main(String[] args) {
        System.out.println("Average finder v0.1");
        double avg = findAverage(args);
        System.out.println("The average is " + avg);
    }

    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result;// после исправления программы должно быть      return result / input.length;
    }
}
//Предполагается, что программа вычисляет среднее значение всех значений, переданных в качестве аргументов командной
// строки.
//Он компилируется и запускается без проблем, однако результат не такой, как можно было бы ожидать.
// Например, когда мы передаем 1 2 3в качестве ввода, результатом будет 6.0.
//Прежде всего, вам нужно подумать о том, откуда может исходить предполагаемая ошибка. Мы можем предположить,
// что проблема не в операторах печати. findAverageСкорее всего, от нашего метода получаются неожиданные результаты .
// Чтобы найти причину, давайте рассмотрим его поведение во время выполнения.
//                      Установить точки останова
// приостановить  выполнение прошраммы перед подозрительным фрагментом кода:  *-это точка останова
//*  double avg = findAverage(args);
//                        Запустите программу в режиме отладки
//Теперь запустим программу в режиме отладки.
//Поскольку мы собираемся передавать аргументы для запуска и отладки программы, убедитесь, что в конфигурации
// запуска/отладки есть эти аргументы.
//1.Нажмите значок « Выполнить» в поле, затем выберите « Изменить конфигурацию запуска» .
//   Слева мой пакет и класс AverageFinder,правая кнопка мыш выбираем Modify Ran Configuration-нажимаем
//2.Введите аргументы в поле Аргументы программы .
//   В строку Program Arguments заносим 1 2 3 и внизу OK
//3.Нажмите кнопку « Выполнить» рядом с main методом. В меню выберите Отладка .
//   Слева мой пакет и класс AverageFinder,правая кнопка мыш выбираем.Нажать на Debug "AverageFinder.main()"
//После того, как вы нажмете кнопку «Выполнить» в поле, появится меню с параметрами запуска/отладки.
                           //Анализ состояния программы
//После запуска сеанса отладчика программа работает нормально, пока не будет достигнута точка останова. Когда это
// происходит, строка, в которой программа была приостановлена, выделяется, и появляется окно инструмента отладки .
//Выделенная строка еще не выполнена. Теперь программа ожидает от вас дальнейших указаний. Приостановленное состояние
// позволяет вам проверять переменные, которые хранят состояние программы.
//
//Поскольку findAverage метод еще не был вызван, все его локальные переменные вроде result еще не находятся в области
// видимости, однако мы можем изучить содержимое argsмассива ( args находится в области видимости для main метода).
// Содержимое argsо тображается в строке, где args используется:(напротив точки останова)
//Вы также можете получить информацию обо всех переменных, которые в данный момент находятся в области видимости,
// на панели « Переменные ».
//Значения переменных отображаются на панели переменных.(внизу в окне отладки)
//Если нажать два раза на args={String[3]@816} ["1","2","3"]
// раскроются переменные 0="1"  1="2"  2="3"
//                Шаг через программу
//Теперь, когда мы освоились с окном инструментов отладки , пришло время перейти к findAverage методу и выяснить,
// что происходит внутри него.
//1.Чтобы перейти к методу, нажмите кнопку Step Into или нажмите F7.(стрелка вниз- вторая,которая не пошаговоя,
//         а которая входит во внуть метода)
//       В редакторе выделяется еще одна строка, потому что мы продвинули точку выполнения на один шаг вперед.
//2.Продолжайте шагать с Step OverF8(1-ая стелка) . Обратите внимание,
//      чем он отличается от Step Into — он также продвигает выполнение на один шаг вперед,
//      но не посещает какие-либо методы, как Integer.parseInt()по пути.
//Давайте продолжим и посмотрим, как result объявляется локальная переменная и как она изменяется при каждой
// итерации цикла.
// Нажимаем до результата s="3"
// Прямо сейчас переменная s содержит значение "3". Он будет преобразован в целое число и добавлен к result,
// который в настоящее время имеет значение 3.0. Ошибок пока нет. Сумма рассчитана правильно.
//3.Еще два шага ведут нас к оператору return, - return result; result:6.0(подсвеченная строка 15)
// и мы видим, где было упущение. Мы забыли разделить сумму на
//          количество значений. Это было причиной некорректного возврата метода.
//4.Давайте исправим ошибку.
//         return result / input.length;  - исправляем в 15 строке так

//                          Остановите и перезапустите сеанс отладчика
//Чтобы убедиться, что программа работает нормально, остановим сеанс отладчика и перезапустим программу.
// 1.Нажмите Stop кнопку или нажмите Ctrl+F2.(красный квадрат слева или в верху)
// 2.Запуск программы
// 3.Убедитесь, что программа теперь работает корректно.