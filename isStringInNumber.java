//find out a string is totally in number?
//C1:
		String string = "2321325a2";
		char[] number = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char element = string.charAt(i);
			if (string.charAt(i) == number[0] || string.charAt(i) == number[1] || string.charAt(i) == number[2]
					|| string.charAt(i) == number[3] || string.charAt(i) == number[4] || string.charAt(i) == number[5]
					|| string.charAt(i) == number[6] || string.charAt(i) == number[7] || string.charAt(i) == number[8]
					|| string.charAt(i) == number[9]) {
				count++;
			}
		}
	    if(count==string.length()){
	        System.out.println("This String is totally in number!"); 
	    }else{
	    	System.out.println("This String is not totally in number!"); 
	    }	
//C2: 
		static int count = 0;
		public static void main(String[] args) {
			String string = "23zxsdadvasvasdv213252";
			for (int i = 0; i < string.length(); i++) {
				if(count==(-1)) {
					break;
				}
				char indexChar = string.charAt(i);
				switch (indexChar) {
					case '0':
						count++;
						break;
					case '1':
						count++;
						break;
					case '2':
						count++;
						break;
					case '3':
						count++;
						break;
					case '4':
						count++;
						break;
					case '5':
						count++;
						break;
					case '6':
						count++;
						break;
					case '7':
						count++;
						break;
					case '8':
						count++;
						break;
					case '9':
						count++;
						break;
					default:
						System.out.println("This String is not totally in number!");
						count = -1;
						break;
				}
			}
		 if(count==string.length()){
			  System.out.println("This String is totally in number!"); 
		 }
		}

