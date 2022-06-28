class PO{
	public void oPO(String Alumnos[],String nPOO[][],double POO[][]){
		int a1=0,r1=0;
		int acum1=0;
		System.out.println(" POO ");
		for(int i=7;i<8;i++){
			for(int j=0;j<5;j++){
			System.out.print(""+nPOO[i][j]+"");
			System.out.print("#["+POO[i][j]+"] ");
			acum1++;
			if(POO[i][j]>=6){
				a1++;
			}else{r1++;}
			}
		}
		System.out.println("");
		System.out.println("Los alumnos de POO Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de alumnos Aprobados: %"+a1+"  Reprobados: %"+r1);
	}
}