import java.util.Scanner;
public class prueba{
	public static void main(String args[]){
		
		Scanner nl = new Scanner(System.in);
		String Alumnos[] = new String[76];
		Alumnos[0]="Saul"; Alumnos[1]="Alan"; Alumnos[2]="Ivan";Alumnos[3]= "Jose"; Alumnos[4]="Noel";Alumnos[5]= "Adan"; Alumnos[6]="Jair";Alumnos[7]= "Enzo"; Alumnos[8]="Luca";Alumnos[9]= "Yoel"; Alumnos[10]="Paco";
		Alumnos[11]="Otto"; Alumnos[12]="Zero";Alumnos[13]= "Mega"; Alumnos[14]="Iris";Alumnos[15]= "Gael"; Alumnos[16]="Luis";Alumnos[17]= "Gizh"; Alumnos[18]="Raul"; Alumnos[19]="Odin";
		Alumnos[20]="Izan"; Alumnos[21]="Suri"; Alumnos[22]="Owen"; Alumnos[23]="Mila"; Alumnos[24]="Zuri"; Alumnos[25]="Yair"; Alumnos[26]="Elif"; Alumnos[27]="Biel"; Alumnos[28]="Leah"; Alumnos[29]="Noel";
		Alumnos[30]="Leia"; Alumnos[31]="Vega"; Alumnos[32]="Yuna"; Alumnos[33]="Sila"; Alumnos[34]="Ezio"; Alumnos[35]="Siul"; Alumnos[36]="Alai"; Alumnos[37]="Gala"; Alumnos[38]="Eimi"; Alumnos[39]="Luka";
		Alumnos[40]="Alba"; Alumnos[41]="Emma"; Alumnos[42]="Mael"; Alumnos[43]="Eire"; Alumnos[44]="Kora"; Alumnos[45]="Lupe"; Alumnos[46]="Saya"; Alumnos[47]="Gara"; Alumnos[48]="Alia"; Alumnos[49]="Esai";
		Alumnos[50]="Luca"; Alumnos[51]="Isis"; Alumnos[52]="Said"; Alumnos[53]="June"; Alumnos[54]="Inna"; Alumnos[55]="Sami"; Alumnos[56]="Isai"; Alumnos[57]="Jara";Alumnos[58]="Sara";Alumnos[59]="Pier";
		Alumnos[60]="Joao"; Alumnos[61]="Ziza"; Alumnos[62]="Yago"; Alumnos[63]="Izel"; Alumnos[64]="Zayd"; Alumnos[65]="Hugo"; Alumnos[66]="Yael"; Alumnos[67]="Iker";Alumnos[68]="Esau";Alumnos[69]="Yolo";
		Alumnos[70]="Nael"; Alumnos[71]="Luna"; Alumnos[72]="Liam"; Alumnos[73]="Ilai"; Alumnos[74]="Giel"; Alumnos[75]="Aide";
		String nom[][] = new String [15][5];
		int x=0,cont=0;
		for(int i=0;i<15;i++){
			for(int j=0;j<5;j++){
			nom[i][j]=Alumnos[x];
			x++;
			}
		}
	
		for(int i=0;i<15;i++){
			for(int j=0;j<5;j++){
				System.out.print("["+nom[i][j]+"] ");
				}
				System.out.println("");
			}
	}
}