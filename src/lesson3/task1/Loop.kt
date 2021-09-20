@file:Suppress("UNUSED_PARAMETER")

package lesson3.task1

import java.lang.Math.pow
import kotlin.math.*


// Урок 3: циклы
// Максимальное количество баллов = 9
// Рекомендуемое количество баллов = 7
// Вместе с предыдущими уроками = 16/21

/**
 * Пример
 *
 * Вычисление факториала
 */
fun factorial(n: Int): Double {
    var result = 1.0
    for (i in 1..n) {
        result = result * i // Please do not fix in master
    }
    return result
}

/**
 * Пример
 *
 * Проверка числа на простоту -- результат true, если число простое
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (m in 3..sqrt(n.toDouble()).toInt() step 2) {
        if (n % m == 0) return false
    }
    return true
}

/**
 * Пример
 *
 * Проверка числа на совершенность -- результат true, если число совершенное
 */
fun isPerfect(n: Int): Boolean {
    var sum = 1
    for (m in 2..n / 2) {
        if (n % m > 0) continue
        sum += m
        if (sum > n) break
    }
    return sum == n
}

/**
 * Пример
 *
 * Найти число вхождений цифры m в число n
 */
fun digitCountInNumber(n: Int, m: Int): Int =
    when {
        n == m -> 1
        n < 10 -> 0
        else -> digitCountInNumber(n / 10, m) + digitCountInNumber(n % 10, m)
    }

/**
 * Простая (2 балла)
 *
 * Найти количество цифр в заданном числе n.
 * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun digitNumber(n: Int): Int
{
    var count = 0;
    var number = n;
    do {
        count++;
        number /= 10;
    } while (number != 0);
    return count;
}


/**
 * Простая (2 балла)
 *
 * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
 * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
 */


fun fib(n: Int): Int {

   if (n == 1 || n == 2)
   {
       return 1;
   }
    var first = 1;
    var second = 1;
    var i = 2;
    var third = 0;
    while(i < n)
    {
        i++;
        third = first + second;
        first = second;
        second = third;
    }
    return second;
}

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти минимальный делитель, превышающий 1
 */
fun minDivisor(n: Int): Int
{
    var i = 2;
    while (i <= n)
    {
        if (n % i == 0)
        {
            break;
        }
        i++;
    }
    return i;
}

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти максимальный делитель, меньший n
 */
fun maxDivisor(n: Int): Int
{
    var i = n - 1;
    while (i >= 1)
    {
        if (n % i == 0)
        {
            break;
        }
        i--;
    }
    return i;
}

/**
 * Простая (2 балла)
 *
 * Гипотеза Коллатца. Рекуррентная последовательность чисел задана следующим образом:
 *
 *   ЕСЛИ (X четное)
 *     Xслед = X /2
 *   ИНАЧЕ
 *     Xслед = 3 * X + 1
 *
 * например
 *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
 * Данная последовательность рано или поздно встречает X == 1.
 * Написать функцию, которая находит, сколько шагов требуется для
 * этого для какого-либо начального X > 0.
 */
fun collatzSteps(x: Int): Int
{
    if (x == 1) return 0;

    var i = 1;
    var x1 = x;
    var x2 = 0;

    while (x2 != 1)
    {
        if(x1 % 2 == 0)
        {
            x2 = x1/2
        }
        else
        {
            x2 = 3 * x1 + 1;
        }
        i++;
    }
    return i;
}


/**
 * Средняя (3 балла)
 *
 * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
 * минимальное число k, которое делится и на m и на n без остатка
 */
fun lcm(m: Int, n: Int): Int
{
    var k = 2;
    var min = minOf(n, m);
    if (m == 1 || n == 1) return 1;
    while (k <= min)
    {
        if (m % k == 0 && n % k == 0) break;
        k++;
    }
    return k;
}

/**
 * Средняя (3 балла)
 *
 * Определить, являются ли два заданных числа m и n взаимно простыми.
 * Взаимно простые числа не имеют общих делителей, кроме 1.
 * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
 */
fun isCoPrime(m: Int, n: Int): Boolean
{
    var k: Boolean = true;
    var i = 2;

    var min = minOf(n, m);

    while (i <= min)
    {
        if (m % i == 0 && n % i == 0) k = false;
        i++;
    }
    return k;
}

/**
 * Средняя (3 балла)
 *
 * Для заданных чисел m и n, m <= n, определить, имеется ли хотя бы один точный квадрат между m и n,
 * то есть, существует ли такое целое k, что m <= k*k <= n.
 * Например, для интервала 21..28 21 <= 5*5 <= 28, а для интервала 51..61 квадрата не существует.
 */
fun squareBetweenExists(m: Int, n: Int): Boolean = TODO()

/**
 * Средняя (3 балла)
 *
 * Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun revert(n: Int): Int
{
    var count = 0;
    var number = n;
    do {
        count++;
        number /= 10;
    } while (number != 0);

    var i = 0;
    number = n;

    var new_number:Int = 0;
    while (i < count)
    {
        new_number += (number % 10) * (pow(10.0, (count - i - 1).toDouble())).toInt();
        number /= 10;
    }
    return new_number;
}



/**
 * Средняя (3 балла)
 *
 * Проверить, является ли заданное число n палиндромом:
 * первая цифра равна последней, вторая -- предпоследней и так далее.
 * 15751 -- палиндром, 3653 -- нет.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun isPalindrome(n: Int): Boolean
{
    var count = 0;
    var number = n;
    do {
        count++;
        number /= 10;
    } while (number != 0);

    var i = 1;
    var palindrome = true;
    number = n;
    while (i < count)
    {
        if((number%10)!=(((number) - (number % (pow(10.0, (count - i).toDouble())).toInt())) /
                    (pow(10.0, (count - i).toDouble())).toInt()))
        {
            palindrome=false;
            break;
        }
        number /= 10;
        number %= (pow(10.0, (count - i - 1).toDouble())).toInt()
        i += 2;
    }
    return palindrome;
}

/**
 * Средняя (3 балла)
 *
 * Для заданного числа n определить, содержит ли оно различающиеся цифры.
 * Например, 54 и 323 состоят из разных цифр, а 111 и 0 из одинаковых.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun hasDifferentDigits(n: Int): Boolean
{
    var count = 0;
    var number = n;
    do {
        count++;
        number /= 10;
    } while (number != 0);

    var i = 2;
    var first = n % 10;
    var second = 0;
    var different = false;

    number = n / 10;
    while (i <= count)
    {
        second = number % 10;

        if (first != second)
        {
            different = true;
            break;
        }
        i++;
        number /= 10;
        first = second;
    }
    return different;
}

/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * sin(x) = x - x^3 / 3! + x^5 / 5! - x^7 / 7! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю.
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.sin и другие стандартные реализации функции синуса в этой задаче запрещается.
 */
fun sin(x: Double, eps: Double): Double = TODO()

/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * cos(x) = 1 - x^2 / 2! + x^4 / 4! - x^6 / 6! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.cos и другие стандартные реализации функции косинуса в этой задаче запрещается.
 */
fun cos(x: Double, eps: Double): Double = TODO()

/**
 * Сложная (4 балла)
 *
 * Найти n-ю цифру последовательности из квадратов целых чисел:
 * 149162536496481100121144...
 * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun squareSequenceDigit(n: Int): Int
{
    var i1 = 1;
    var i2 = 0;
    var count = 0;
    var number = 0;
    var retin = 0;

    while (i2 <= n)
    {
        count = 0;
        number = i1 * i1;

        do {
            count++;
            number /= 10;
        } while (number != 0);

        i2 += count;
        if (i2 == n)
        {
            retin = (i1 * i1) % 10;
        }
        else if (i2 > n)
        {
            count = i2 - n;
            retin = (((i1 * i1) - (i1 * i1 % (pow(10.0, count.toDouble())).toInt())) /
                    (pow(10.0, count.toDouble())).toInt()) % 10;
        }
        i1 ++;
    }
    return retin;
}

/**
 * Сложная (5 баллов)
 *
 * Найти n-ю цифру последовательности из чисел Фибоначчи (см. функцию fib выше):
 * 1123581321345589144...
 * Например, 2-я цифра равна 1, 9-я 2, 14-я 5.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun fibSequenceDigit(n: Int): Int
{
    if (n == 1 || n == 2)
    {
        return 1;
    }
    var first = 1;
    var second = 1;
    var third = 0;
    var i = 2;
    var count = 0;
    var number = 0;
    var retin = 0;
    while (i <= n)
    {
        third = first + second;
        first = second;
        second = third;
        count = 0;
        do {
            count++;
            third /= 10;
        } while (third != 0);
        i += count;
        if (i == n)
        {
            retin = second % 10;
        }
        else if (i > n)
        {
            count = i - n;
            retin = ((second - (second % (pow(10.0, count.toDouble())).toInt())) /
                    (pow(10.0, count.toDouble())).toInt()) % 10;
        }
    }
    return retin;

}
