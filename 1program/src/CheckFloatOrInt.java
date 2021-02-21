
public class CheckFloatOrInt {
	// Вычисляем кол-во знаков после запятой
	public static String Check(String a) {
		
		String[] splitter = a.split("\\.");
		int i = splitter[1].length(); 
		
		if(i == 1 && splitter[1].equals("0")) {
			return splitter[0];
		}
		else {
			return a;
		}
	}
				
}
