class Socio{
	public void oSocio(String Alumnos[],String nSociologia[][],double Sociologia[][]){
		int a1=0,r1=0;
		int acum1=0;
		System.out.println(" Sociologia ");
		
		for(int i=5;i<6;i++){
			for(int j=0;j<5;j++){
			System.out.print(""+nSociologia[i][j]+"");
			System.out.print("#["+Sociologia[i][j]+"] ");
			acum1++;
			if(Sociologia[i][j]>=6){
					a1++;
			}else{r1++;}
			}
		}
		System.out.println("");
		System.out.println("Los alumnos de Sociologia Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de alumnos Aprobados: %"+a1+"  Reprobados: %"+r1);
	}
}