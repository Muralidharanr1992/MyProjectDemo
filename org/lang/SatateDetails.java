package org.lang;

public class SatateDetails {
	
	public void south() {
		System.out.println("In South India Tamilnadu, Kerala, Karnataka, Andra Pradesh, Telugana states are located.");
	}
	
	public void north() {
		System.out.println("In North India Delhi, J&K, Goa, Uthra Pradesh, Mathya Pradesh states are located.");
	}
	
	public static void main(String[] args) {
		LanguageInfo li= new LanguageInfo();
		
		li.tamil();
		li.english();
		li.hindi();
		
		SatateDetails sd=new SatateDetails();
		
		sd.south();
		sd.north();
		
	}
}
