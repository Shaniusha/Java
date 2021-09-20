package TheFeastOfManyBeasts_19_9;

public class TheFeast {
    public static boolean feast(String beast, String dish) {
        if (beast.charAt(0) == dish.charAt(0))
        {
            if (beast.charAt(beast.length()-1) == dish.charAt(dish
                    .length()-1))
            {
                return true;
            }
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        String great = "great-blue heron";//g -1ая   n- (length()-1)) -последняя буква
        String great1 = "garlic naan"; // g -1ая   n- (length()-1)) -последняя буква
        String chickadee = "chickadee";// c -1ая   e- (length()-1)) -последняя буква
        String chickadee1 = "chocolate cake";//c -1ая   e- (length()-1)) -последняя буква
        String brown = "brown bear";//b-1ая   r- (length()-1)) -последняя буква
        String brown1 = "bear claw";//b-1ая   w- (length()-1)) -последняя буква
        System.out.println(feast(great,great1));
        System.out.println(feast(chickadee,chickadee1));
        System.out.println(feast(brown,brown1));
        System.out.println(feast(great,brown1));
        }
    }
//У всех зверей пир! Каждое животное приносит одно блюдо. Есть только одно правило: блюдо должно
// начинаться и заканчиваться теми же буквами, что и название животного.
// Например, большая голубая цапля приносит наан с чесноком,а синица приносит шоколадный торт.
//Напишите функцию feast, которая принимает имя животного и блюдо в качестве аргументов и возвращает
// истину или ложь, чтобы указать, разрешено ли зверю принести блюдо на пир.

//Предположим, что зверь и блюдо - это всегда строчные буквы, каждая из которых состоит как минимум
// из двух букв.зверь и блюдо могут содержать дефисы и пробелы, но они не появятся
// в начале или конце строки. Они не будут содержать цифр.

