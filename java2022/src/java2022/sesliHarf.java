package java2022;

public class sesliHarf {
	
	public static void main(String[] args) {
		
		char letter = 'İ';
		
		switch (letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli harf");
			break;
			default:
			System.out.println("İnce Sesli");
		}
	}

}
