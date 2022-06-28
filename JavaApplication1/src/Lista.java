class Lista{
	public void OLista(String Cliente[],int ID[],String Cheques[],String Tarjeta[],String InversionR[],double Inversion[],String Seguro[]){
		
		System.out.println("\t\t Hola Guapo ");
		System.out.println("\t\t Esta es la lista de nuestros Clientes  ");
		System.out.println("");
		System.out.println("Nombre:\t\tID:\t\tCheques:\tTarjeta:\tInversion:\tSeguro");
		for(int i=0; i<19; i++){
			System.out.println(" "+Cliente[i]+"\t\t"+ID[i]+"\t\t"+Cheques[i]+"\t\t"+Tarjeta[i]+"\t\t"+InversionR[i]+"\t\t"+Seguro[i]);	
		}	
	}
}