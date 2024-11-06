//Dev. artem.kasapov (@Nebulart-dev) - Java//

//Задание 1
/*
public class Main {
    public static void main(String[] args) {
        boolean isMan = true;
        int age = 17;
        if (isMan == true && age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы несовершеннолетний");
        }
    }
}

 */

//Задание 2
/*
public class Main {
    public static void main(String [] args) {
        int temperature = -5;
        System.out.print("Температура: " + temperature);
        if (temperature >= 30) {
            System.out.print(" (Жарко)");
        } else if (temperature > 0) {
            System.out.print(" (Тепло)");
        } else if (temperature < 0) {
            System.out.print(" (Холодно)");
        }

    }
}

 */

//Задание 3
/*
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        if (a > b) {
            System.out.println("Первое число (a) больше");
        } else if (a < b) {
            System.out.println("Второе число (b) больше");
        } else if (a == b) {
            System.out.println("Числа равны");
        }
    }
}

 */

//Задание 4
/*
public class Main {
    public static void main(String[] args) {
        int month = 11;
        System.out.print("Месяц: " + month);
        if (month == 12 || month == 1 || month == 2) {
            System.out.print(" (Зима)");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.print(" (Весна)");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.print(" (Лето)");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.print(" (Осень)");
        } else {
            System.out.println(" (Некорректный месяц!)");
        }
    }
}
*/

//Задание 5
/*
public class Main {
    public static void main(String[] args) {
        int hour = 14;
        if (hour >= 9 && hour <= 18) {
            System.out.println("Рабочее время");
        } else {
            System.out.println("Вне рабочего времени");
        }
    }
}
 */

//Задание 6
/*
public class Main {
    public static void main(String[] args) {
        int score = 49;
        System.out.print("Ваш балл: " + score);
        if (score >= 90) {
            System.out.print(" (Высокий балл)");
        } else if (score >= 50 && score <= 89) {
            System.out.println(" (Средний балл)");
        } else if (score <= 50) {
            System.out.println(" (Низкий балл)");
        }
    }
}

 */

//Задание 7
/*
public class Main {
    public static void main(String[] args) {
        int x = -3;
        int y = 5;
        if (x > 0 && y > 0) {
            System.out.println("Точка в I квадранте");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка в II квадранте");
        } else if (x < 0 && y < 0) {
            System.out.println("Точна в III квадранте");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка в IV квадранте");
        } else if (x == 0 || y == 0) {
            System.out.println("Точка на оси координат");
        }
    }
}

 */

//Задание 8
/*
public class Main {
    public static void main(String[] args) {
        int speed = 120;
        System.out.print("Скорость: " + speed);
        if (speed >= 100) {
            System.out.print(" (Превышение скорости!)");
        } else if (speed >= 60 && speed <= 100) {
            System.out.println(" (Нормальная скорость)");
        } else if (speed < 60) {
            System.out.println(" (Слишком медленно)");
        }
    }
}

 */

//Задание 9
/*
public class Main {
    public static void main(String[] args) {
        int age = 22;
        boolean hasTicket = true;
        if (age >= 18 && hasTicket == true) {
            System.out.println("Добро пожаловать!");
        } else if (age >= 18 && hasTicket == false) {
            System.out.println("Необходимо предъявить билет!");
        } else {
            System.out.println("Вход только для совершеннолетних!");
        }
    }
}
*/

//Задание 10
public class Main {
    public static void main(String[] args) {
        int humidity = 80;
        System.out.print("Уровень влажности: " + humidity);
        if (humidity >= 70) {
            System.out.print(" (Высокая влажность!)");
        } else if (humidity >= 30 && humidity <= 70) {
            System.out.println(" (Средняя влажность)");
        } else if (humidity < 30) {
            System.out.println(" (Низкая влажность)");
        }
    }
}
