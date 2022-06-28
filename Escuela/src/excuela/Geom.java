class Geom{
	public void oGeom(String Alumnos[],String nGeometria[][],double Geometria[][]){
		int a1=0,r1=0;
		int acum1=0;
		System.out.println(" Geometria ");
		
		for(int i=2;i<3;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nGeometria[i][j]+"");
				System.out.print("#["+Geometria[i][j]+"] ");
				acum1++;
				if(Geometria[i][j]>=6){
						a1++;
				}else{r1++;}
			}
		}
		System.out.println("");
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
		
		System.out.println("");
		System.out.println("Los alumnos de Geometria Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de alumnos Aprobados: %"+a1+"  Reprobados: %"+r1);
	}
}