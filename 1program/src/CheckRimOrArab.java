
public class CheckRimOrArab {
	// Метод для распознования римского или арабского числа
		public static String CheckNum(String[] StrArr) {
			
			// Создаём библиотеку нужных значений
			String [] arab = new String[] {"0","1","2","3","4","5","6","7","8","9","10"};
			String [] rome = new String[] {"X","I","II","III","IV","V","VI","VII","VIII","IX"};
			
			//Присваеваем первое и второе число
			String a = StrArr[0];
			String b = StrArr[1];
			
			// Вычисляем тип чисел арабское или римское
			if(CheckString(a,arab) && CheckString(b,arab)) {
				return "арабские";
			}
			else if(CheckString(a,rome) && CheckString(b,rome)) {
				return "римские";
			}
			else {
				PrintStr.print("Ошибка! Числа введены неверно!");
				System.exit(0);
				return "0";
			}
			
			
		}
		
		// Метод для сравнения строки с множеством строк
		public static boolean CheckString(String a, String[] StrArr) {
			
			boolean check = false;
			
			
			// Цикл сравнения
			for(int i = 0; i < StrArr.length; i++) {
				
				if(a.equals(StrArr[i])) {
					check = true;
					
				}
				else {
					continue;
				}
			}
			return check;
		}
}
