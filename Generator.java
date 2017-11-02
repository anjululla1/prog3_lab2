package lab2;

import java.util.Random;

public class Generator
{
	public static void main(String[] args) 
		{
			String[] atcg= new String[4];
			atcg[0]="a";
			atcg[1]="t";
			atcg[2]="c";
			atcg[3]="g";
			Random random = new Random(); 
			
			int x = 0;
			
			for(int i=0; i<999; i++) 
			{
				String code= "";
				code= code + atcg[random.nextInt(4)];
				code= code + atcg[random.nextInt(4)];
				code= code + atcg[random.nextInt(4)]; 
			
				System.out.println(code);
				
				if(code.equals("aaa")) 
				{
					x=x+1;
				}	
			}

			System.out.println("The number of times aaa appears in 1000 random trials is:" + x);
			System.out.println("The theoretical probability of getting 'aaa' is: 0.015625" );
		}
}


