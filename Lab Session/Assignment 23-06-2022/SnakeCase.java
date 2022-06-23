package corejava;

class SnakeCase
{

 public String camelToSnake(String str)
 {
String stt="";
stt+=Character.toLowerCase(str.charAt(0));

for(int i=1;i<str.length();i++)
{
 char ch=str.charAt(i);
if (Character.isUnicodeIdentifierPart(ch))
{
stt=stt+'_';
 stt=stt+Character.toLowerCase(ch);
 }
else
{
stt=stt+ch;
 }  
}
return stt;
 }
	public static void main(String args[])throws Exception{
		// creating a object of SnakeCase
		String ss= "Vinayak Suryawanshi";
		SnakeCase sn=new SnakeCase();
		System.out.println("Before Converting SnackCase :- "+ss);
		System.out.println("After converting SnackCase  :- "+sn.camelToSnake(ss));
			}
}