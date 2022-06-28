class Cir{
	public void oCir(String Alumnos[],String nCircuitos[][],double Circuitos[][]){
		int a1=0,r1=0;
		int acum1=0;
		System.out.println(" Circuitos ");
		
		for(int i=6;i<7;i++){
			for(int j=0;j<5;j++){
			System.out.print(""+nCircuitos[i][j]+"");
			System.out.print("#["+Circuitos[i][j]+"] ");
			acum1++;
			if(Circuitos[i][j]>=6){
				a1++;
			}else{r1++;}
			}
		}
		System.out.println("");
		System.out.println("Los alumnos de Circuitos Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de alumnos Aprobados: %"+a1+"  Reprobados: %"+r1);
	}
}