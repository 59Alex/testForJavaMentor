
public class Calc {
	// Метод для вычисления арабских чисел
		public static int ArabicNum(String[] StrArr) {
			
			//Преобразование элементов в нужный формат
			int a = Integer.parseInt(StrArr[0]);
			int b = Integer.parseInt(StrArr[1]);
			char sign = StrArr[2].charAt(0);
			
			int result = 0;
			
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
		
			return result;
			
		}
}
