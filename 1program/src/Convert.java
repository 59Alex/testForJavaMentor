
public class Convert {
	// Метод конвертирующий арабское число в римское
	  public static String ConversionRateInRim(int a) {
		  
		  
		// Создаём библиотеку нужных значений
				String [] arab = new String[100];
				String [] rome = new String[] {"0","I","II","III","IV","V","VI","VII","VIII","IX","X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII","XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI","XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII","XLVIII" ,"XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII","LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV","LXVI", "LXVII", "LXVIII", "LXIX","LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII","LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV","LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI","XCVII", "XCVIII", "XCIX", "C"};
		  
				for(int i = 0; i<100; i++) {
					arab[i] = String.valueOf(i);
				}
				
		
		  String Num = String.valueOf(a);
			 
			// Цикл поиска и конвертации арабского числа в римкое
			  for(int i = 0; i < arab.length; i++) {
					if(arab[i].equals(Num)) {
						Num = rome[i];
					}
				}
			
			  return Num;
			  
		  
		  
		  
	  }
		
	  //Метод для конвертирования римского числа в арабское
		public static String[] ConversionRateInArab(String[] StrArr) {
			
			// Создаём библиотеку нужных значений
			String [] arab = new String[] {"1","2","3","4","5","6","7","8","9","10"};
			String [] rome = new String[] {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
			
			// Присваеваем первое и второе число
			String a = StrArr[0];
			String b = StrArr[1];
			
			// Сравниваем и перепресваеваем нужное значение
			for(int i = 0; i < arab.length; i++) {
				if(rome[i].equals(a) && !rome[i].equals(b)) {
					a = arab[i];
				}
				else if(rome[i].equals(b) && !rome[i].equals(a)) {
					b = arab[i];
				}
				else if(rome[i].equals(a) && rome[i].equals(b)) {
					a = arab[i];
					b = arab[i];
					
				}
			}
			
			// Меняем римское на арабское числа
			StrArr[0] = a;
			StrArr[1] = b;
			
			return StrArr;
		}
}
