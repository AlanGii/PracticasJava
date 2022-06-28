class Fis{
	public void oFis(String Alumnos[],String nFisica[][],double Fisica[][]){
		int a1=0,r1=0;
		int acum1=0;
		System.out.println(" Fisica ");
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
		System.out.println("");
		for(int i=13;i<14;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nFisica[i][j]+"");
				System.out.print("#["+Fisica[i][j]+"] ");
				acum1++;
				if(Fisica[i][j]>=6){
					a1++;
				}else{r1++;}
			}
		}
		
		System.out.println("");
		System.out.println("Los alumnos de Fisica Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de alumnos Aprobados: %"+a1+"  Reprobados: %"+r1);
	}
}