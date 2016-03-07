package arrayPresident;

public class President {

	public static void main(String[] args) {
	
		
		String [] president = new String [11];
		
		president [1] = "Kennedy" ;
		president [2] = "Johnson" ;
		president [3] = "Nixon" ;
		president [4] = "Ford" ;
		president [5] = "Carter" ;
		president [6] = "Reagan" ;
		president [7] = "Bush" ;
		president [8] = "Clinton" ;	
		president [9] = "Bush" ;
		president [10] = "Obama" ;
		
		
		for (int i = 10; i > 0 ; i--)
		{
			System.out.println(president[i]);
		}
		
		
	}

}
