class GrupoC{
	public void oGrupoC(String Alumnos[],String nCircuitos[][],double Circuitos[][],String nPOO[][],double POO[][],String nCivica[][],double Civica[][]){
		int a1=0,a2=0,a3=0;
		int r1=0,r2=0,r3=0,acum1=0,acum2=0,acum3=0;
		System.out.println(" El Grupo C esta distribuido de la siguiente manera con sus respectivas calificaciones ");
		System.out.println("");
		System.out.println(" Circuitos ");
		for(int i=6;i<7;i++){
			for(int j=0;j<5;j++){
			System.out.print(""+nCircuitos[i][j]+"");
			System.out.print("#["+Circuitos[i][j]+"] ");
			acum1++;
			if(Circuitos[i][j]>=6){
				a1++;
			}else{r1++;}
			}
		}
		System.out.println("Los alumnos de CIRCUITOS Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de Aprobados es: %"+a1+ " Reprobados: %"+r1);
		System.out.println("");
		System.out.println(" POO ");
		for(int i=7;i<8;i++){
			for(int j=0;j<5;j++){
			System.out.print(""+nPOO[i][j]+"");
			System.out.print("#["+POO[i][j]+"] ");
			acum2++;
			if(POO[i][j]>=6){
				a2++;
			}else{r2++;}
			}
		}
		System.out.println("Los alumnos de POO Aprobados: "+a2+"  Reprobados: "+r2);
		a2=(100/acum2)*a2;
		r2=(100/acum2)*r2;
		System.out.println("El promedio de Aprobados es: %"+a2+ " Reprobados: %"+r2);
		System.out.println("");
		System.out.println(" CIVICA ");
		for(int i=8;i<9;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nCivica[i][j]+"");
				System.out.print("#["+Civica[i][j]+"] ");
				acum3++;
				if(Civica[i][j]>=6){
					a3++;
				}else{r3++;}
			}
		}
		System.out.println("Los alumnos de CIVICA Aprobados: "+a3+"  Reprobados: "+r3);
		a3=(100/acum3)*a3;
		r3=(100/acum3)*r3;
		System.out.println("El promedio de Aprobados es: %"+a3+ " Reprobados: %"+r3);
		System.out.println("");
					
}
}