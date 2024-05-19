package javapreparation;

public class VowellsAndConsonants {

	public static void main(String[] args) {
    char ch='e';
    switch (ch) {
	case 'a':
		System.out.println(ch+" is a vowwel");
		break;
	case 'e':
		System.out.println(ch+" is a vowwel");
		break;
	case 'i':
		System.out.println(ch+" is a vowwel");
		break;
	case 'o':
		System.out.println(ch+" is a vowwel");
		break;
	case 'u':
		System.out.println(ch+" is a vowwel");
		break;
	default:
		System.out.println(ch+" is a consonant");
		break;
		
	}
    char cha='z';
    if(cha=='a' && cha=='e' && cha=='i' && cha=='o' && cha=='u') {
    	System.out.println(cha+" is a vowell");
    }
    else
    {
    	System.out.println(cha+" is a consonant");

    }
	}

}
