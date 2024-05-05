public class Task2 {

    public static void compareStr(String string1, String string2) {
        int str1 = string1.length();
        int str2 = string2.length();
        if (str1 > str2) {
            System.out.println("Строка string1 длиннее");
            System.out.println("Есть ли string2 в string1? " + string1.contains(string2));
        } else if (str1 < str2) {
            System.out.println("Строка str2 длиннее");
            System.out.println("Есть ли string1 в string2? " + string2.contains(string1));
        } else {
            System.out.println("Строки равны");
            System.out.println("Содержатся ли строки друг в друге? " + (string1.contains(string2) || string2.contains(string1)));
        }
    }

    public static void main(String[] args) {
        String string1 = "столешница";
        String string2 = "стол";
        compareStr(string1, string2);
    }
}
//Пользователем передаются 2 строки. s1 и s2.
// Задача - определить, какая строка длиннее и проверить, есть ли короткая строка внутри длинной строки.
// Пример: s1 = 'столешница', s2 = 'стол'. Длиннее s1, s2 есть внутри s1