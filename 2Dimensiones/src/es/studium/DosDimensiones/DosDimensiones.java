package es.studium.DosDimensiones;

import java.util.Scanner;

public class DosDimensiones
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);

		char [][] tabla = new char [3][4];
		for(int i=0; i<=3; i++)
		{
			for(int j=0; j<=4; j++)
			{
			
			System.out.println("India un car�cter"+i+","+j);
				tabla[i][j]=teclado.nextLine().charAt(0);
			}

		}
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=3; j++)
			System.out.println(" "+tabla[i][j]);
		}
		System.out.println("");
		teclado.close();
	}
}
