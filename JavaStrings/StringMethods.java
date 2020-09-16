package JavaStrings;

public class StringMethods {

	public static void main(String[] args) {

		String name= "VigneshKandiah";//String Literal
        // 1.charAt()
		char charAt = name.charAt(0);

		System.out.println(charAt);

        //2.length();
		int length = name.length();

		System.out.println(length);
         //3.equals()
		boolean equals = name.equals("Vicky");

		System.out.println(equals);
        //4.equalsIgnoreCase()
		boolean equalsIgnoreCase = name.equalsIgnoreCase("vigneshkandiah");

		System.out.println(equalsIgnoreCase);
        //5.isEmpty()
		boolean empty = name.isEmpty();

		System.out.println(empty);
        //6.contains()
		boolean contains = name.contains("Vi");

		System.out.println(contains);
         //7.substrin(Begin Index , End Index)
		String substring = name.substring(1, 4);

		System.out.println(substring);
		//8.substring(Index)
		String substring1 = name.substring(1);

		System.out.println(substring1);
		
		//9. concat()
		
		String concat = name.concat("Name");
		
		System.out.println(concat);
		
		//10. replace()
		
		String replace = name.replace("V", "G");
		
		System.out.println(replace);
		
		//11.replaceAll()
		
		String replaceAll = name.replaceAll("Vign", "Kani");
		
		System.out.println(replaceAll);
		
		//12.indexOf()
		
		int indexOf = name.indexOf("V");
		
		System.out.println(indexOf);
		//13.indexOf(string,Index)
		int indexOf2 = name.indexOf("h", 7);
		
		System.out.println(indexOf2);
		//14.indexOf(String)
		int indexOf3 = name.indexOf("Kan");
		
		System.out.println(indexOf3);
		
		int number=5;
		//15.String.valueOf()
		String valueOf = String.valueOf(number);
		
		System.out.println(valueOf);
		//16. toUppercase()
		
		String upperCase = name.toUpperCase();
		
		System.out.println(upperCase);
		//17.toLowerCase()
		
		String lowerCase = name.toLowerCase();
		
		System.out.println(lowerCase);
		
		String name1= "     vignesh";
		
		//18.trim()
		
		String trim = name1.trim();
		
		System.out.println(trim);
		
		//19. String.join()
		
		String join = String.join("-","vignesh", "kandiah");
		System.out.println(join);
		//20. String.join()
		String join2 = String.join("/", "10","10","1991");
		
		System.out.println(join2);
		
		//21. split()
		
		String splitthis="am,i,joke to you";
		
		String[] split = splitthis.split(",");
		
		 for (String each : split) {
			 
			 System.out.println(each);
			
		}

	}

}
