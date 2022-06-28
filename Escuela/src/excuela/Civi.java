class Civi{
	public void oCivi(String Alumnos[],String nCivica[][],double Civica[][]){
		int a1=0,r1=0;
		int acum1=0;
		System.out.println(" Civica ");
		
		for(int i=8;i<9;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nCivica[i][j]+"");
				System.out.print("#["+Civica[i][j]+"] ");
				acum1++;
				if(Civica[i][j]>=6){
					a1++;
				}else{r1++;}
			}
		}
		System.out.println("");
		System.out.println("Los alumnos de Civica Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de alumnos Aprobados: %"+a1+"  Reprobados: %"+r1);
	}
}