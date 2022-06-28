class Mate{
	public void oMate(String Alumnos[],String nMatematicas[][],double Matematicas[][]){
		int a1=0,r1=0;
		int acum1=0;
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
		System.out.println("");
		for(int i=10;i<11;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nMatematicas[i][j]+"");
				System.out.print("#["+Matematicas[i][j]+"] ");
				acum1++;
				if(Matematicas[i][j]>=6){
					a1++;
				}else{r1++;}
			}
		}
		
		System.out.println("");
		System.out.println("Los alumnos de MATEMATICAS Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de alumnos Aprobados: %"+a1+"  Reprobados: %"+r1);
	}
}