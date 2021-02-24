
/* АРИФМЕТИЧЕСКОЕ ВЫРАЖЕНИЕ НУЖНО ВВОДИТЬ В СТРОЧКУ 1+2, 5*3.
 * Реализация задачи:
 * 1. Метод SplitString получает строку (арифметическое выражение).
 * 2. метод Sign получает эту строку и с помощью метода CheckVale находит введённый арифметический знак и 
 * возвращает его.
 * 3. Далее метод SplitString делит строку на массив по этому знаку и создаёт новый массив, значения которого 
 * 1 число, 2 число, арифметический знак соответственно.
 * 4. Далее метод CheckNum проверяет какие введены числа римские или арабские и возвращает соответствующее значение
 * 5. Если введены арабские числа, то метод ArabicNum находит результат.
 * 6. Если введены римские, то метод ConversionRate конвертирует римские числа в арабские и метод ArabicNum ычисляет
 * результат.
 *
 * Программу написал Кашеваров Александр
 */
/* Импортируем класс сканер */



public class calculator {
	
	// Главный метод 
	public static void main(String[] args) {
		
		// Переменная результата
		int result;
		
		// Получаем введёный массив значений
		String[] strArr = Split.SplitString();
		
		// Получаем тип чисел арабские / римские
		String TypeNum = CheckRimOrArab.CheckNum(strArr);
		
		 // Проверяем соответствие типа и переменной и вычисляем результат
		 if("арабские" == TypeNum) {
			 result = Calc.ArabicNum(strArr);
			 PrintStr.print("=" + result);
		 }
		 else if("римские" == TypeNum) {
			 // Преобразовываем римское число в арабское и вычисляем результат
			 result = Calc.ArabicNum(Convert.ConversionRateInArab(strArr));
			 
			  String resultRim = Convert.ConversionRateInRim(result);
			  PrintStr.print("=" + resultRim);
		 }
		 else {
			 PrintStr.print("Ошибка!");
			 System.exit(0);
		 }
	    
		 
	    
		
		
	}
	
  
  
 
	
	
	
	
	

}
