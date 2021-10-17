package FindcommonPrefix;

import org.testng.annotations.Test;

public class FindPrefix {
	
	public String commonPrefix(String a1,String a2,String a3) {
		StringBuilder s=new StringBuilder();
		for(int i=0,j=0,k=0;i<a1.length() && j<a2.length() && k<a3.length();i++,j++,k++) {
			
			if(a1.charAt(i)==a2.charAt(j) && a1.charAt(i)==a3.charAt(k)) {
				
				s.append(a1.charAt(i));
			}
		}System.out.println(s.toString());
		
		return s.toString();
		
		
	}
	
	@Test
	public void test1() {
		String out=commonPrefix("flower","flown","finder");
		System.out.println("common fprix : " + out );
	}

	@Test
	public void test2() {
		String out=commonPrefix("flower","flown","fly");
		System.out.println("common fprix : " + out );
	}
	@Test
	public void test3() {
		String out=commonPrefix("flower","flown","flow");
		System.out.println("common fprix : " + out );
	}

}
