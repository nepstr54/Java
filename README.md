# Java
task1
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
Учитывая входную строку s, измените порядок слов на противоположный .

Слово определяется как последовательность не пробельных символов. Слова в будут разделены хотя бы одним пробелом .s

Возвращает строку слов в обратном порядке, объединенных одним пробелом.

Обратите внимание , что sможет содержать начальные или конечные пробелы или несколько пробелов между двумя словами. Возвращаемая строка должна содержать только один пробел, разделяющий слова. Не включайте никаких дополнительных пробелов.

 

Пример 1:

Ввод: s = "небо синее"
 Выход: "голубое небо"
Пример 2:

Ввод: s = "привет, мир"
 Вывод: "привет, мир"
 Объяснение: Ваша перевернутая строка не должна содержать начальных или конечных пробелов.
Пример 3:

Ввод: s = "хороший пример"
 Вывод: "пример хороший a"
 Объяснение: Вам нужно сократить несколько пробелов между двумя словами до одного пробела в перевернутой строке.


task2
2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
Пример ввода:
1 2 1 2 -1 1 3 1 3 -1 0
Логика расчета:
2 -1 переход -> 2 в сумму
3 -1 переход -> 3 в сумму
Пример вывода: 5
