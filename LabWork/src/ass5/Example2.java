package ass5;

public class Example2 {

	static void getName(String f_name,String l_name)throws NameShouldNotBeBlankException {
		if(f_name.isEmpty() || l_name.isEmpty())
		throw new NameShouldNotBeBlankException("first name and last name should not be left blank!!!");
		}
	public static void main(String[] args) {
		String f_name=new String();
		System.out.println();
		String l_name=new String("nepak");
		
		try {
			getName(f_name,l_name);
		}
		catch(NameShouldNotBeBlankException e) {
			e.printStackTrace();
		}

	}

}
