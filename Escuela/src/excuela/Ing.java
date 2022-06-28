class Ing{
	public void oIng(String Alumnos[],String nIngles[][],double Ingles[][]){
		int a1=0,r1=0;
		int acum1=0;
		System.out.println(" Ingles ");
		
		for(int i=4;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nIngles[i][j]+"");
				System.out.print("#["+Ingles[i][j]+"] ");
				acum1++;
				if(Ingles[i][j]>=6){
						a1++;
				}else{r1++;}
			}
		}
		System.out.println("");
		for(int i=14;i<15;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nIngles[i][j]+"");
				System.out.print("#["+Ingles[i][j]+"] ");
				acum1++;
				if(Ingles[i][j]>=6){
					a1++;
				}else{r1++;}
			}
		}
		
		System.out.println("");
		System.out.println("Los alumnos de Ingles Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de alumnos Aprobados: %"+a1+"  Reprobados: %"+r1);
	}
}