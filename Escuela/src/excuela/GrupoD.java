class GrupoD{
	public void oGrupoD(String Alumnos[],String nFurier[][],double Furier[][],String nMatematicas[][],double Matematicas[][],String nHistoria[][],double Historia[][]){
		int a1=0,a2=0,a3=0;
		int r1=0,r2=0,r3=0,acum1=0,acum2=0,acum3=0;
		System.out.println(" El Grupo D esta distribuido de la siguiente manera con sus respectivas calificaciones ");
		System.out.println("");
		System.out.println(" Furier ");
		for(int i=9;i<10;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nFurier[i][j]+"");
				System.out.print("#["+Furier[i][j]+"] ");
				acum1++;
				if(Furier[i][j]>=6){
					a1++;
				}else{r1++;}
			}
		}
		System.out.println("Los alumnos de Furier Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de Aprobados es: %"+a1+ " Reprobados: %"+r1);
		System.out.println("");
		
		System.out.println(" Matematicas ");
		for(int i=10;i<11;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nMatematicas[i][j]+"");
				System.out.print("#["+Matematicas[i][j]+"] ");
				acum2++;
				if(Matematicas[i][j]>=6){
					a2++;
				}else{r2++;}
			}
		}
		System.out.println("Los alumnos de Matematicas Aprobados: "+a2+"  Reprobados: "+r2);
		a2=(100/acum2)*a2;
		r2=(100/acum2)*r2;
		System.out.println("El promedio de Aprobados es: %"+a2+ " Reprobados: %"+r2);
		System.out.println("");
		System.out.println(" Historia ");
		for(int i=11;i<12;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nHistoria[i][j]+"");
				System.out.print("#["+Historia[i][j]+"] ");
				acum3++;
				if(Historia[i][j]>=6){
					a3++;
				}else{r3++;}
			}
		}
		System.out.println("Los alumnos de Historia Aprobados: "+a3+"  Reprobados: "+r3);
		a3=(100/acum3)*a3;
		r3=(100/acum3)*r3;
		System.out.println("El promedio de Aprobados es: %"+a3+ " Reprobados: %"+r3);
		System.out.println("");
					
}
}