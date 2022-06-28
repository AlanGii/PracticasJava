class GrupoB{
	public void oGrupoB(String Alumnos[],String nFisica[][],double Fisica[][],String nIngles[][],double Ingles[][],String nSociologia[][],double Sociologia[][]){
		int a1=0,a2=0,a3=0;
		int r1=0,r2=0,r3=0,acum1=0,acum2=0,acum3=0;
		System.out.println(" El Grupo B esta distribuido de la siguiente manera con sus respectivas calificaciones ");
		System.out.println("");
		System.out.println(" FISICA ");
		for(int i=3;i<4;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nFisica[i][j]+"");
				System.out.print("#["+Fisica[i][j]+"] ");
				acum1++;
				if(Fisica[i][j]>=6){
						a1++;
				}else{r1++;}
			}
		}
		System.out.println("Los alumnos de FISICA Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de Aprobados es: %"+a1+ " Reprobados: %"+r1);
		
		System.out.println("");
		System.out.println(" Ingles ");
		for(int i=4;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nIngles[i][j]+"");
				System.out.print("#["+Ingles[i][j]+"] ");
				acum2++;
				if(Ingles[i][j]>=6){
						a2++;
				}else{r2++;}
			}
		}
		System.out.println("Los alumnos de INGLES Aprobados: "+a2+"  Reprobados: "+r2);
		a2=(100/acum2)*a2;
		r2=(100/acum2)*r2;
		System.out.println("El promedio de Aprobados es: %"+a2+ " Reprobados: %"+r2);
		
		System.out.println("");
		System.out.println(" SOCIOLOGIA ");
		for(int i=5;i<6;i++){
			for(int j=0;j<5;j++){
			System.out.print(""+nSociologia[i][j]+"");
			System.out.print("#["+Sociologia[i][j]+"] ");
			acum3++;
			if(Sociologia[i][j]>=6){
					a3++;
			}else{r3++;}
			}
		}
		System.out.println("Los alumnos de SOCIOLOGIA Aprobados: "+a3+"  Reprobados: "+r3);
		a3=(100/acum3)*a3;
		r3=(100/acum3)*r3;
		System.out.println("El promedio de Aprobados es: %"+a3+ " Reprobados: %"+r3);
		System.out.println("");
}
}