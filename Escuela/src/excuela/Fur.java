class Fur{
	public void oFur(String Alumnos[],String nFurier[][],double Furier[][]){
		int a1=0,r1=0;
		int acum1=0;
		System.out.println(" Furier ");
		
		for(int i=9;i<10;i++){
			for(int j=0;j<5;j++){
				System.out.print(""+nFurier[i][j]+"");
				System.out.print("#["+Furier[i][j]+"] ");
				acum1++;
				if(Furier[i][j]>=6){
					a1++;
				}else{r1++;}
			}
		}
		System.out.println("");
		System.out.println("Los alumnos de Furier Aprobados: "+a1+"  Reprobados: "+r1);
		a1=(100/acum1)*a1;
		r1=(100/acum1)*r1;
		System.out.println("El promedio de alumnos Aprobados: %"+a1+"  Reprobados: %"+r1);
	}
}