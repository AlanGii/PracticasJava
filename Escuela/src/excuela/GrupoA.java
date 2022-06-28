class GrupoA{
	public void oGrupoA(String Alumnos[],String nMatematicas[][],double Matematicas[][],String nHistoria[][],double Historia[][],String nGeometria[][],double Geometria[][]){
	System.out.println(" El Grupo A esta distribuido de la siguiente manera con sus respectivas calificaciones ");
		int a1=0,a2=0,a3=0;
		int r1=0,r2=0,r3=0,acum1=0,acum2=0,acum3=0;
		System.out.println("");
		System.out.println(" MATEMATICAS ");
		for(int i=0;i<1;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nMatematicas[i][j]+"");
				System.out.print("#["+Matematicas[i][j]+"] ");
				acum1++;
				if(Matematicas[i][j]>=6){
						a1++;
				}else{r1++;}
			}
		}
		System.out.println("Los alumnos de MATEMATICAS Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de Aprobados es: %"+a1+ " Reprobados: %"+r1);
		
		System.out.println("");
		System.out.println(" HISTORIA ");
		for(int i=1;i<2;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nHistoria[i][j]+"");
				System.out.print("#["+Historia[i][j]+"] ");
				acum2++;
				if(Historia[i][j]>=6){
						a2++;
				}else{r2++;}
			}
		}
		System.out.println("Los alumnos de Hisoria Aprobados: "+a2+"  Reprobados: "+r2);
		a2=(100/acum2)*a2;
		r2=(100/acum2)*r2;
		System.out.println("El promedio de Aprobados es: %"+a2+ " Reprobados: %"+r2);
		
		System.out.println("");
		System.out.println(" GEOMETRIA ");
		for(int i=2;i<3;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nGeometria[i][j]+"");
				System.out.print("#["+Geometria[i][j]+"] ");
				acum3++;
				if(Geometria[i][j]>=6){
						a3++;
				}else{r3++;}
			}
		}
		System.out.println("Los alumnos de Geometria Aprobados: "+a3+"  Reprobados: "+r3);
		a3=(100/acum3)*a3;
		r3=(100/acum3)*r3;
		System.out.println("El promedio Aprobados es: %"+a3+ " Reprobados: %"+r3);
		System.out.println("");
	}
}