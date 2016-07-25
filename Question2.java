
public class Question2 {
    public static void main(String[] args) {
		// the logic behind this is to use a replacement patern
     String s = "Hello, Sir, please click on the link www.example.com/confirmation?user1 and visit our website at www.example.com";
	 stringReplacer(s);
	
      
    }
	
	public static void stringReplacer(String s)
	{
	 String html = s.replaceAll("www[.][-A-Za-z0-9+&amp;@#/%?=~_()|!:,.;]*[-A-Za-z0-9+&amp;@#/%=~_()|]", "<a href='$0'>$0</a>");
      System.out.println(html);
	}
}