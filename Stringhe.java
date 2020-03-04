package stringhe;

public class Stringhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String daReverse ="CapovolgoLaStringa"; //stringa voglio capovolgere 
		String S1="Questa is a stringa che uso per esempio";
		
		System.out.println(reverseIt(daReverse)); //reverseIt, funzione capovolge

		System.out.println("---------------------------------------------");
		
		//SOTTOSTRINGA
		String c= S1.substring(2,4); // stringa da posizione 2 a 34
		System.out.println(c);
		
		//carattere posizione i
		char c1= S1.charAt(5); // stringa da posizione 2 a 34
		System.out.println(c1);
		
		System.out.println("---------------------------------------------");
		
		StringBuffer sb= new StringBuffer("Drink coffe"); //definisco StringBuffer
		
		sb.insert(6, "Hot "); //inserisco Hot in posizione 6,carattere
		
		System.out.println(sb.toString());

	}

	
	public static String reverseIt(String source) //capovolge stringa
	{
		int i,len;
		
		len=source.length(); //lunghezza stringa
		
		StringBuffer dest = new StringBuffer(len); //creo StringBuffer, modificabile
		
		for(i=(len -1); i>=0;i--) 
		{
			dest.append(source.charAt(i)); //metto in coda(append), il carattere i (charAt)
		}
		
		return dest.toString(); //converto stringBuffer in Stringa
	}
}
