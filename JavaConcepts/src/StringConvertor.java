
public class StringConvertor {
	public static void main(String[] args) {
		
		String str="11324134hgh34r3h";
		str=convert(str);
		System.out.println(str);
	}

	private static String convert(String str) {

		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)>'a' || sb.charAt(i)>'z')
			{
				sb.deleteCharAt(i);
				i--;
			}
		}

		return sb.toString();
	}

}
