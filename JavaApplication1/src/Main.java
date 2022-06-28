import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		
		Scanner nl = new Scanner(System.in);
		//clientes
		String Cliente[] = new String[20];
		Cliente[0]= "Saul"; Cliente[1]= "Alan"; Cliente[2]="Ivan";Cliente[3]= "Jose"; Cliente[4]="Noel";Cliente[5]= "Adan"; Cliente[6]="Jair";Cliente[7]= "Enzo"; Cliente[8]="Luca";Cliente[9]= "Yoel"; Cliente[10]="Paco";
		Cliente[11]= "Otto"; Cliente[12]="Zero";Cliente[13]= "Mega"; Cliente[14]="Iris";Cliente[15]= "Gael"; Cliente[16]="Luis";Cliente[17]= "Gizh"; Cliente[18]="Raul"; Cliente[19]="Odin";
		//ID
		int ID[] = new int[20];
		for(int i=0; i<20; i++){
			ID[i] = i;
		}
		
		//Cheques
		int ChequesCantidad[] = new int[20];
		double ChequesDinero[] = new double [20];
		String Cheques[] = new String[20];
		for(int i=0; i<20; i++){
			Cheques[i] = "NO";
			ChequesCantidad[i] = 5;
			ChequesDinero[i] = 0;
		}
		
		//Tarjeta
		String Tarjeta[] = new String[20];
		for(int i=0; i<20; i++){
			Tarjeta[i] = "NO";
		}
		
		//Inversiones
		String InversionR[] = new String[20];
		for(int i=0; i<20; i++){
			InversionR[i] = "NO";
		}
		double Inversion[] = new double[20];
		for(int i=0; i<20; i++){
			Inversion[i] = 0;
		}
		
		//Seguro
		String Seguro[] = new String[20];
		for(int i=0; i<20; i++){
			Seguro[i] = "No";
		}
		
		//Variables 
		int opc=0,a=0;
		int opc1=0;
		//Bandera
		int bandera1=0;
		//Variables de Respuesta
		int r=0,r2=0;
		
		do{
			Menumain mm = new Menumain();
			mm.oMenumain();
			opc = nl.nextInt();
			
			switch(opc){
				case 1:
				
				System.out.println("\t\t Bienvenido al menu de atencion al cliente por seguridad dame el N# de cuenta del cliente  ");
				a = nl.nextInt();
				for(int i=0; i<19;i++){
					if(a==ID[i]){
						bandera1=1;
					}
				}
				if(bandera1==0){
					System.out.println("El id no Existe -F en el chat-");
				}else{
				System.out.println("\t\t El id es Correcto Este es la cuenta de : "+Cliente[a]);
				System.out.println("\t\t Esta es su lista de acuerdos con nosotros:  ");
				ListaIndividual li = new ListaIndividual();
				li.OListaIndividual(Cliente,ID,Cheques,Tarjeta,InversionR,Inversion,Seguro,a);
				do{
					
					Submenu sm = new Submenu();
					sm.oSubmenu();
					opc1 = nl.nextInt();
					
					switch(opc1){
					//-----------------------------------------------------------------------------------------------------------------------------------------
					case 1:
					System.out.println("\t\t En este Apartado se hace la contratacion o cancelacion de una chequera");
					System.out.println("\t\t Si el cliente desea hacer la contratacion porfavor teclea 1-Si,  Si desea hacer una Cancelacion teclea  2.-No ");
					r = nl.nextInt();
					if(r==1){
						System.out.println("\t\tLa contratacion fue exitosa ");
						Cheques[a]="Si";
						System.out.println("\t\tTienes un total de 5 Cheques ");
						System.out.println("\t\tCuanto dinero deseas disponer en tu cuenta? ");
						 
					}
					if(r==2){
						System.out.println("\t\tLa cancelacion fue exitosa ");
						Cheques[a]="No";
					}
					break;
					//-----------------------------------------------------------------------------------------------------------------------------------------
					case 2:
					System.out.println("\t\t En este Apartado se hace la contratacion o cancelacion de la Tarjeta");
					System.out.println("\t\t Si el cliente desea hacer la contratacion porfavor teclea 1-Si,  Si desea hacer una Cancelacion teclea  2.-No ");
					r = nl.nextInt();
					if(r==1){
						System.out.println("\t\tLa Contratacion fue exitosa ");
						Tarjeta[a]="Si";
					}
					if(r==2){
						System.out.println("\t\tLa Cancelacion fue exitosa ");
						Tarjeta[a]="No";
					}
					break;
					//-----------------------------------------------------------------------------------------------------------------------------------------
					case 3:
					
					Menuinversion mi = new Menuinversion();
					mi.oMenuinversion();
					r2 = nl.nextInt();
					
					switch(r2){
						case 1:
						System.out.println("\t\tLa Inversion fue exitosa ");
						Inversion[a] = 0.07;
						InversionR[a] = "Si";
						break;
						case 2:
						System.out.println("\t\tLa Inversion fue exitosa ");
						Inversion[a] = 0.10;
						InversionR[a] = "Si";
						break;
						case 3:
						System.out.println("\t\tLa Inversion fue exitosa ");
						Inversion[a] = 0.25;
						InversionR[a] = "Si";
						break;
						case 4:
						System.out.println("\t\tLa Cancelacion fue exitosa ");
						Inversion[a] = 0;
						InversionR[a] = "NO";
						break;
						
					}
					break;
					//-----------------------------------------------------------------------------------------------------------------------------------------
					case 4:
					System.out.println("\t\t En este Apartado se hace la contratacion o cancelacion del Seguro");
					System.out.println("\t\t Si el cliente desea hacer la contratacion porfavor teclea 1-Si,  Si desea hacer una Cancelacion teclea  2.-No ");
					r = nl.nextInt();
					if(r==1){
						System.out.println("\t\tLa Contratacion fue exitosa ");
						Seguro[a]="Si";
					}
					if(r==2){
						System.out.println("\t\tLa Cancelacion fue exitosa ");
						Seguro[a]="No";
					}
					break;
					//-----------------------------------------------------------------------------------------------------------------------------------------
				}
				}while(opc1!=5);
				}
				break;
				case 2:
				
				break;
				case 3:
				Lista lc = new Lista();
				lc.OLista(Cliente,ID,Cheques,Tarjeta,InversionR,Inversion,Seguro);
				break;
			}
		}while(opc!=4);
		
	}
}
