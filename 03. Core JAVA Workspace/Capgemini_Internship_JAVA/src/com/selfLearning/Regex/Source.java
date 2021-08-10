package com.selfLearning.Regex;

import java.util.regex.Pattern;

class Header{
	// Implement Email Class according to the specifiaction.
	String from;
	String to;
	Header(String from, String to){
		this.from = from;
		this.to = to;
	   }
	}
	class Email{
	// Implemet the Header Class according to the specifiaction.
	Header header;
	String body;
	String greetings;
	Email(Header header, String body, String greetings){
		this.header = header;
		this.body = body;
		this.greetings = greetings;
	   }
	}

	class EmailOperations{
	// Implemet the Three methods specified in the specified.	
	public int emailVerify(Email e){
		String echeck = "^[a-zA-Z_][a-zA-Z0-9+_.-]+@[a-zA-Z]+.[a-zA-Z]+$";
		Pattern p = Pattern.compile(echeck);
		//Matcher matcher = pattern.matcher(e.header.from);
		//Matcher matcher2 = pattern.matcher(e.header.to);
		if(p.matcher(e.header.from).matches() && p.matcher(e.header.to).matches())
		   return 2;
		if(p.matcher(e.header.from).matches() || p.matcher(e.header.to).matches())
		   return 1;
		else 
		   return 0;
	  }

	public String bodyEncryption(Email e){
		StringBuffer result= new StringBuffer(); 
	    for (int i=0; i<e.body.length(); i++)
	     {
	        if (Character.isUpperCase(e.body.charAt(i))){
	            char ch = (char)(((int)e.body.charAt(i) + 3 - 65) % 26 + 65);
	            result.append(ch);
	        }
			if(e.body.charAt(i) == ' '){
				result.append(' ');
			}
	        if (Character.isLowerCase(e.body.charAt(i))){
	            char ch = (char)(((int)e.body.charAt(i) + 3 - 97) % 26 + 97);
	            result.append(ch);
	        }
	    }
	    return result.toString();
	  }

	public String greetingMessage(Email e){
		String greetMsg = new String(); 
		StringBuffer sb = new StringBuffer();
	    int i = 0;      
	    while(e.header.from.charAt(i) != '@'){
	          sb.append(e.header.from.charAt(i));
	          i++;
	    }
		greetMsg = e.greetings + " " + sb;
		return greetMsg;
	  }
	}


	public class Source {
		public static void main(String args[] ) throws Exception {
			/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	    // You can Implement your main() to check your Program.
		Header hobj = new Header("amit@doselect.com", "_ami@doselect.in");
	    Email eobj = new Email(hobj, "Hi There Hows you","Thank you");
		EmailOperations eOobj = new EmailOperations();
		System.out.println(eOobj.emailVerify(eobj));
		System.out.println(eOobj.bodyEncryption(eobj));
		System.out.println(eOobj.greetingMessage(eobj));
	}
	}