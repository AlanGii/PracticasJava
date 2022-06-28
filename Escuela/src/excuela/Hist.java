class Hist{
	public void oHist(String Alumnos[],String nHistoria[][],double Historia[][]){
		int a1=0,r1=0;
		int acum1=0;
		System.out.println(" Historia ");
		for(int i=1;i<2;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nHistoria[i][j]+"");
				System.out.print("#["+Historia[i][j]+"] ");
				acum1++;
				if(Historia[i][j]>=6){
						a1++;
				}else{r1++;}
			}
		}
		System.out.println("");
		for(int i=11;i<12;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nHistoria[i][j]+"");
				System.out.print("#["+Historia[i][j]+"] ");
				acum1++;
				if(Historia[i][j]>=6){
					a1++;
				}else{r1++;}
			}
		}
		
		System.out.println("");
		System.out.println("Los alumnos de Historia Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de alumnos Aprobados: %"+a1+"  Reprobados: %"+r1);
	}
}