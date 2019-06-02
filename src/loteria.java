import javax.swing.JOptionPane;
import java.util.*;
import java.text.DecimalFormat;
public class loteria {
	public static void main(String[] args) {

	Object [] menu = {"Lotomania","Lotofácil","Sena","Sair"};
	int op;
    Random nums = new Random();
    String mega="", mania="",facil=""; 
    int []  sena = new int [6];
    int [] [] lotomania = new int [4][5];
    int [] [] lotofacil = new int  [3][5];
    DecimalFormat deci = new DecimalFormat("00");
    int linha;

do{		
op =  JOptionPane.showOptionDialog(null,"Escolha uma opção:","Loterias - 1.0 BETA",0,3,null,menu,"");
 
 switch(op){
 case 0:
	 
	 // ---------------------------- LOTO MANIA  ------------------------
mania="";

for(int l=0; l<4; l++){
	for(int c=0; c<5; c++){
	
		lotomania[l][c] = nums.nextInt(100);
		
		
		
			for(int li=0; li<=l; li++){
				if(li==l){
					linha = c; //comparar todos os valores < que a linha atual
				}else{
					linha = 5; //comparar todos os valores < que as outras linhas
				}
				for(int co=0; co<linha; co++){
					
			if (lotomania[l][c] == lotomania[li][co]){c--; li=l+1; co=linha;}// caso numero repetido, gera novamento o valor da coluna
			
			}/// fim do loop comparação (coluna)
			}// fim do loop comparação (linha)
			
	
		}//fim do loop geral de random 
	
		   } //fim do loop geral de random 



for(int l=0; l<4; l++){
	for(int c=0; c<5; c++){
mania = mania + deci.format(lotomania[l][c]) + "|";	
	}
	mania = mania + "\n";	
	}
	 
	JOptionPane.showMessageDialog(null,"LOTOMANIA\n" + mania); 
	 break;
case 1:
	
	 // ---------------------------- LOTO FACIL ------------------------
	 facil="";
	 
	 for(int l=0; l<3; l++){
			for(int c=0; c<5; c++){
			
				lotofacil[l][c] = nums.nextInt(100);
				
	
				
				for(int li=0; li<=l; li++){
					if(li==l){
						linha = c;
					}else{
						linha = 5;
					}
					for(int co=0; co<linha; co++){
							
					if (lotofacil[l][c] == lotofacil[li][co]){c--; li=l+1; co=linha; }// caso numero repetido, gera novamento o valor da coluna
					}//comparar todos os valores < que a coluna atual
					}//comparar todos os valores < que a linha atual
								  
	 
				}
			 }
	 for(int l=0; l<3; l++){
			for(int c=0; c<5; c++){
		facil = facil + deci.format(lotofacil[l][c]) + "|";	
			}
			facil = facil + "\n";	
			}
			 
			JOptionPane.showMessageDialog(null,"LOTOFÁCIL\n" + facil); 
	 
	 
	 
	 break;	 
 case 2:
	 // ---------------------------- MEGA SENA ------------------------
	 mega="";
	 
	 for(int i=0; i<6;i++){
			sena[i] = nums.nextInt(100);
			
				for(int j=0; j<i; j++){
				
					if(sena[i] == sena[j]){
						i--; j=i;
					} 
				}
					 
	 }
	 
	 
	 Arrays.sort(sena);
	 
	 for(int i1=0; i1<6;i1++){
			if(i1==5){
			     mega = mega + deci.format(sena[i1]);
			}else{
	     mega = mega + deci.format(sena[i1]) + " - ";
			}    
	      }
	
	 
		 JOptionPane.showMessageDialog(null,"MEGA-SENA\n"+mega);
		 
	 break;
 }
}while(op!=3);	








		
	}
}
