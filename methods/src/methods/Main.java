package methods;

public class Main {

	public static void main(String[] args) {
	sayiBulmaca();	
	}
    
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,3,4,5,6,7,0};
		int aranacak = 5;
		
		boolean mevcut= false;
				
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				mevcut = true;
				break;
		   	}
		}
		
		if(mevcut) {
			mesaj = "Sayı mevcuttur:"+ aranacak;
			mesajVer(mesaj);
			
		}else {
			mesaj = "Sayı mevcut değil:"+ aranacak;
		}
		
	
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
}
