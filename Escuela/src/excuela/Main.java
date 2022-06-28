import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		
		Scanner nl = new Scanner(System.in);
		//Variable
		int opc=0,opc1=0,r=0;
		//Alumnos
		String Alumnos[] = new String[76];
		Alumnos[0]="Saul"; Alumnos[1]="Alan"; Alumnos[2]="Ivan";Alumnos[3]= "Jose"; Alumnos[4]="Noel";Alumnos[5]= "Adan"; Alumnos[6]="Jair";Alumnos[7]= "Enzo"; Alumnos[8]="Luca";Alumnos[9]= "Yoel"; Alumnos[10]="Paco";
		Alumnos[11]="Otto"; Alumnos[12]="Zero";Alumnos[13]= "Mega"; Alumnos[14]="Iris";Alumnos[15]= "Gael"; Alumnos[16]="Luis";Alumnos[17]= "Gizh"; Alumnos[18]="Raul"; Alumnos[19]="Odin";
		Alumnos[20]="Izan"; Alumnos[21]="Suri"; Alumnos[22]="Owen"; Alumnos[23]="Mila"; Alumnos[24]="Zuri"; Alumnos[25]="Yair"; Alumnos[26]="Elif"; Alumnos[27]="Biel"; Alumnos[28]="Leah"; Alumnos[29]="Noel";
		Alumnos[30]="Leia"; Alumnos[31]="Vega"; Alumnos[32]="Yuna"; Alumnos[33]="Sila"; Alumnos[34]="Ezio"; Alumnos[35]="Siul"; Alumnos[36]="Alai"; Alumnos[37]="Gala"; Alumnos[38]="Eimi"; Alumnos[39]="Luka";
		Alumnos[40]="Alba"; Alumnos[41]="Emma"; Alumnos[42]="Mael"; Alumnos[43]="Eire"; Alumnos[44]="Kora"; Alumnos[45]="Lupe"; Alumnos[46]="Saya"; Alumnos[47]="Gara"; Alumnos[48]="Alia"; Alumnos[49]="Esai";
		Alumnos[50]="Luca"; Alumnos[51]="Isis"; Alumnos[52]="Said"; Alumnos[53]="June"; Alumnos[54]="Inna"; Alumnos[55]="Sami"; Alumnos[56]="Isai"; Alumnos[57]="Jara";Alumnos[58]="Sara";Alumnos[59]="Pier";
		Alumnos[60]="Joao"; Alumnos[61]="Ziza"; Alumnos[62]="Yago"; Alumnos[63]="Izel"; Alumnos[64]="Zayd"; Alumnos[65]="Hugo"; Alumnos[66]="Yael"; Alumnos[67]="Iker";Alumnos[68]="Esau";Alumnos[69]="Yolo";
		Alumnos[70]="Nael"; Alumnos[71]="Luna"; Alumnos[72]="Liam"; Alumnos[73]="Ilai"; Alumnos[74]="Giel"; Alumnos[75]="Aide";
		//Materias Nombres
		String nMatematicas[][] = new String[15][5];
		String nHistoria[][] = new String[15][5];
		String nGeometria[][] = new String[15][5];
		String nFisica[][] = new String[15][5];
		String nIngles[][] = new String[15][5];
		String nSociologia[][] = new String[15][5];
		String nCircuitos[][] = new String[15][5];
		String nPOO[][] = new String[15][5];
		String nCivica[][] = new String[15][5];
		String nFurier[][] = new String[15][5];
		//--------------------------------------GA
		//PrimerMateriaGrupoA
		for(int i=0;i<1;i++){
			for(int j=0;j<5;j++){
				nMatematicas[i][j]=Alumnos[j];
			}
		}
		//SegundaMateriaGrupoA
		for(int i=1;i<2;i++){
			for(int j=0;j<5;j++){
				nHistoria[i][j]=Alumnos[j+5];
			}
		}
		//TercerMateriaGrupoA
		for(int i=2;i<3;i++){
			for(int j=0;j<5;j++){
				nGeometria[i][j]=Alumnos[j+10];

			}
		}
		//----------------------------------------GA
		
		//----------------------------------------GB
		//PrimeraMateriaGrupoB
		for(int i=3;i<4;i++){
			for(int j=0;j<5;j++){
				nFisica[i][j]=Alumnos[j+15];
			}
		}
		//SegundaMateriaGrupoA
		for(int i=4;i<5;i++){
			for(int j=0;j<5;j++){
				nIngles[i][j]=Alumnos[j+20];
			}
		}
		//TercerMateriaGrupoA
		for(int i=5;i<6;i++){
			for(int j=0;j<5;j++){
				nSociologia[i][j]=Alumnos[j+25];
			}
		}
		//----------------------------------------GB
		
		//----------------------------------------GC
		//PrimeraMateriaGrupoC
		for(int i=6;i<7;i++){
			for(int j=0;j<5;j++){
				nCircuitos[i][j]=Alumnos[j+30];
			}
		}
		//SegundaMateriaGrupoC
		for(int i=7;i<8;i++){
			for(int j=0;j<5;j++){
				nPOO[i][j]=Alumnos[j+35];
			}
		}
		//TercerMateriaGrupoC
		for(int i=8;i<9;i++){
			for(int j=0;j<5;j++){
				nCivica[i][j]=Alumnos[j+40];
			}
		}
		//----------------------------------------GC
		//----------------------------------------GD
		//PrimeraMateriaGrupoD
		for(int i=9;i<10;i++){
			for(int j=0;j<5;j++){
				nFurier[i][j]=Alumnos[j+45];
			}
		}
		//SegundaMateriaGrupoD
		for(int i=10;i<11;i++){
			for(int j=0;j<5;j++){
				nMatematicas[i][j]=Alumnos[j+50];
			}
		}
		//TercerMateriaGrupoD
		for(int i=11;i<12;i++){
			for(int j=0;j<5;j++){
				nHistoria[i][j]=Alumnos[j+55];
			}
		}
		//----------------------------------------GD
		
		//----------------------------------------GE
		//PrimeraMateriaGrupoE
		for(int i=12;i<13;i++){
			for(int j=0;j<5;j++){
				nGeometria[i][j]=Alumnos[j+60];
			}
		}
		//SegundaMateriaGrupoE
		for(int i=13;i<14;i++){
			for(int j=0;j<5;j++){
				nFisica[i][j]=Alumnos[j+65];
			}
		}
		//TercerMateriaGrupoE
		for(int i=14;i<15;i++){
			for(int j=0;j<5;j++){
				nIngles[i][j]=Alumnos[j+70];
			}
		}
		//----------------------------------------GE
		//Calificaciones/Materia ***********************************
		double Matematicas[][] = new double[15][5];
		double Historia[][] = new double[15][5];
		double Geometria[][] = new double[15][5];
		double Fisica[][] = new double[15][5];
		double Ingles[][] = new double[15][5];
		double Sociologia[][] = new double[15][5];
		double Circuitos[][] = new double[15][5];
		double POO[][] = new double[15][5];
		double Civica[][] = new double[15][5];
		double Furier[][] = new double[15][5];
		for(int i=0;i<15;i++){
			for(int j=0;j<5;j++){
				Matematicas[i][j]=(int)(Math.random()*10+1);
				Historia[i][j]=(int)(Math.random()*10+1);
				Geometria[i][j]=(int)(Math.random()*10+1);
				Fisica[i][j]=(int)(Math.random()*10+1);
				Ingles[i][j]=(int)(Math.random()*10+1);
				Sociologia[i][j]=(int)(Math.random()*10+1);
				Circuitos[i][j]=(int)(Math.random()*10+1);
				POO[i][j]=(int)(Math.random()*10+1);
				Civica[i][j]=(int)(Math.random()*10+1);
				Furier[i][j]=(int)(Math.random()*10+1);
			}
		}
		
//Codigo
		do{
			System.out.println("  .-Bienvenido a Control Escolar ");
			System.out.println("  .-Que deseas hacer? ");
			System.out.println(" 1.-Lista por grupo ");
			System.out.println(" 2.-Lista por Materia ");
			System.out.println(" 3.-Salir ");
			opc = nl.nextInt();
			switch(opc){
				case 1:
				do{
					System.out.println(" -Que Lista Deseas ver? ");
					System.out.println(" 1.-Grupo A ");
					System.out.println(" 2.-Grupo B ");
					System.out.println(" 3.-Grupo C ");
					System.out.println(" 4.-Grupo D ");
					System.out.println(" 5.-Grupo E ");
					System.out.println(" 6.-Salir ");
					opc1 = nl.nextInt();
					switch(opc1){
						case 1:
						GrupoA ga = new GrupoA();
						ga.oGrupoA(Alumnos,nMatematicas,Matematicas,nHistoria,Historia,nGeometria,Geometria);
						break;
						case 2:
						GrupoB gb= new GrupoB();
						gb.oGrupoB(Alumnos,nFisica,Fisica,nIngles,Ingles,nSociologia,Sociologia);
						break;
						case 3:
						GrupoC gc = new GrupoC();
						gc.oGrupoC(Alumnos,nCircuitos,Circuitos,nPOO,POO,nCivica,Civica);		
						break;
						case 4:
						GrupoD gd = new GrupoD();
						gd.oGrupoD(Alumnos,nFurier,Furier,nMatematicas,Matematicas,nHistoria,Historia);
						break;
						
						case 5:
						GrupoE ge = new GrupoE();
						ge.oGrupoE(Alumnos,nGeometria,Geometria,nFisica,Fisica,nIngles,Ingles);
						break;
					}
					
				}while(opc1!=6);
				break;
				
				
				
				case 2:
				do{
					System.out.println(" -Que Lista Deseas ver? ");
					System.out.println(" 1.-Matematicas ");
					System.out.println(" 2.-Historia ");
					System.out.println(" 3.-Geometria ");
					System.out.println(" 4.-Fisica ");
					System.out.println(" 5.-Ingles ");
					System.out.println(" 6.-Sociologia ");
					System.out.println(" 7.-Circuitos ");
					System.out.println(" 8.-POO ");
					System.out.println(" 9.-Civica ");
					System.out.println(" 10.-Furier ");
					System.out.println(" 11.-Salir ");
					opc1 = nl.nextInt();
					switch(opc1){
					case 1:
					Mate c1 = new Mate();
					c1.oMate(Alumnos,nMatematicas,Matematicas);
					break;
					case 2:
					Hist c2= new Hist();
					c2.oHist(Alumnos,nHistoria,Historia);
					break;
					case 3:
					Geom c3 = new Geom();
					c3.oGeom(Alumnos,nGeometria,Geometria);		
					break;
					case 4:
					Fis c4 = new Fis();
					c4.oFis(Alumnos,nFisica,Fisica);
					break;
					case 5:
					Ing c5 = new Ing();
					c5.oIng(Alumnos,nIngles,Ingles);
					break;
					case 6:
					Socio c6 = new Socio();
					c6.oSocio(Alumnos,nSociologia,Sociologia);
					break;
					case 7:
					Cir c7 = new Cir();
					c7.oCir(Alumnos,nCircuitos,Circuitos);
					break;
					case 8:
					PO c8 = new PO();
					c8.oPO(Alumnos,nPOO,POO);
					break;
					case 9:
					Civi c9 = new Civi();
					c9.oCivi(Alumnos,nCivica,Civica);
					break;
					case 10:
					Fur c10 = new Fur();
					c10.oFur(Alumnos,nFurier,Furier);
					break;
					}
					
				}while(opc1!=11);
				break;
				case 3:
				break;

			}
		}while(opc!=3);
		
	}
}
