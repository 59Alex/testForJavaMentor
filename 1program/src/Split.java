import java.util.Scanner;

public class Split {
	//Вспомогательный метод поиска знака
		public static String Sign(String str) {
			
			char[] CharArr = str.toCharArray();
			
			// Создаём библиотеку с нужными значениями
			char[] Signs = new char[] {'+','-','*','/'};
			
			String sign = "0";
			
			// Находим соответствие
	  		for(int i = 0; i < CharArr.length; i++) {
				if(CheckValue(CharArr[i],Signs)) {
					sign = String.valueOf(CharArr[i]);
					
				}
				else {
					continue;
				}
			}
	  		
	  		// Перехват ошибки
	  		if(sign == "0") {
	  			PrintStr.print("Ошибка! Не введён арифметический знак!");
				System.exit(0);
				return "0";
			}
	  		else {
	  		return sign;
	  		}
	  		
			}
		
		// Метод разделяющий строку
		public static String[] SplitString() {
			
			// Получение на вход выражения
			System.out.println("Введите выражение: ");
			Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			
			// Деление строки на нужные значения
			
			// Нахождение знака
			String sig = Sign(str);
			
			
			
				// Деление строки по введённому знаку
			    String[] ValueArr = str.split("\\" + sig);
			    
			    // Перехват ошибки если не ввели число
			    if(ValueArr.length < 2) {
			    	PrintStr.print("Ошибка! Введите числа коректно!");
			    	System.exit(0);
			    }
			    // Возвращаемый массив
			    String[] ReturnArr = new String[3];
			    
			    // Реализация конечного массива 1 2 3 значение 1 число 2 число 3 арифметический знак соответственно
			    for(int i = 0; i < ReturnArr.length; i++) {
			    	if(i<ValueArr.length) {
			    		ReturnArr[i] = ValueArr[i];
			    	}
			    	else {
			    		ReturnArr[i] = sig;
			    	}
			    }
				
				return ReturnArr;
			
			
			
			
			
		}

		// Вспомогательный метод проверки ввода символа
		public static boolean CheckValue(char a,char[] charArr) {
			
			boolean check = false;
			// Цикл сравнения
			for(int i = 0; i < charArr.length; i++) {
				if(a == charArr[i]) {
					check = true;
				}
				else {
					continue;
				}
			}
			return check;
		}
}
