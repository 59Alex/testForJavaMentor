
public class Calc {
	// Метод для вычисления арабских чисел
		public static String ArabicNum(String[] StrArr) {
			
			//Преобразование элементов в нужный формат
			float a = Integer.parseInt(StrArr[0]);
			float b = Integer.parseInt(StrArr[1]);
			char sign = StrArr[2].charAt(0);
			
			float result = 0;
			
			// Проверка арифметического знака и вычисление соответственно ему
			if(sign == '+') {
				result = a + b;
			}
			else if(sign == '-') {
				result = a - b;
			}
			else if(sign == '*') {
				result = a * b;
			}
			else if(sign == '/') {
				result = a / b;
			}
			
			else {
				PrintStr.print("Ошибка! Введена не коректная информация!");
				System.exit(0);
			}
		
			String RetResult = String.valueOf(result);
			return RetResult;
			
		}
}
