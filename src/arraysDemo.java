
public class arraysDemo {

	public static void main(String[] args) {
		String ogrenci1 = "Mehmet";
		String ogrenci2 = "Eda";
		String ogrenci3 = "Ayşe";
		String ogrenci4 = "Cafer";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("--------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Mehmet";
		ogrenciler[1]="Eda";
		ogrenciler[2]="Ayşe";
		ogrenciler[3]="Cafer";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
			
		System.out.println("--------------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
			
			
	}

}
