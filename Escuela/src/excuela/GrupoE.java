
class GrupoE{
	public void oGrupoE(String Alumnos[],String nGeometria[][],double Geometria[][],String nFisica[][],double Fisica[][],String nIngles[][],double Ingles[][]){
		int a1=0,a2=0,a3=0;
		int r1=0,r2=0,r3=0,acum1=0,acum2=0,acum3=0;
		System.out.println(" El Grupo E esta distribuido de la siguiente manera con sus respectivas calificaciones ");
		System.out.println("");
		System.out.println(" Geometria ");
		for(int i=12;i<13;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nGeometria[i][j]+"");
				System.out.print("#["+Geometria[i][j]+"] ");
				acum1++;
				if(Geometria[i][j]>=6){
					a1++;
				}else{r1++;}
			}
		}
		System.out.println("Los alumnos de Geometria Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de Aprobados es: %"+a1+ " Reprobados: %"+r1);
		System.out.println("");
		System.out.println(" Fisica ");
		for(int i=13;i<14;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nFisica[i][j]+"");
				System.out.print("#["+Fisica[i][j]+"] ");
				acum2++;
				if(Fisica[i][j]>=6){
					a2++;
				}else{r2++;}
			}
		}
		System.out.println("Los alumnos de Fisica Aprobados: "+a2+"  Reprobados: "+r2);
		a2=(100/acum2)*a2;
		r2=(100/acum2)*r2;
		System.out.println("El promedio de Aprobados es: %"+a2+ " Reprobados: %"+r2);
		System.out.println("");
		System.out.println(" Ingles ");
		for(int i=14;i<15;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nIngles[i][j]+"");
				System.out.print("#["+Ingles[i][j]+"] ");
				acum3++;
				if(Ingles[i][j]>=6){
					a3++;
				}else{r3++;}
			}
		}
		System.out.println("Los alumnos de Ingles Aprobados: "+a3+"  Reprobados: "+r3);
		a3=(100/acum3)*a3;
		r3=(100/acum3)*r3;
		System.out.println("El promedio de Aprobados es: %"+a3+ " Reprobados: %"+r3);
		System.out.println("");
					
}
}