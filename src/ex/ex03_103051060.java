package ex;
/*
 * Topic: OX 遊戲是大家小時候的童年記憶，甚至在長大後，無聊時還是會玩一下呢 ! 但當你一個人時，是否也能讓電腦跟你玩呢 ?
 * Date: 2016/12/26
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while(true){
		char OX[][]=new char[3][3];
		int A=0;
		int B=0;
		for(int i = 0 ; i <3 ; i++){
			for(int j = 0 ; j<3 ; j++){
				OX[i][j]= scn.next().charAt(0);
				if(OX[i][j]=='0'){
					A++;
				}else if(OX[i][j]=='1'){
					B++;
				}
				if(OX[i][j]==' '){
					j--;
				}
			}
		}
		if(A<4||B<4){
			System.out.println("Input error!");
			break;
		}
		int count =0;
		boolean check = false;
		for(int i = 0 ; i<3 ; i++){
			count=0;
			for(int j = 0 ; j<3 ; j++){
				for(int k = 0 ; k<3 ; k++){
					if(OX[i][j]==OX[i][k]){
						count++;
					}
				}
			}
			if(count==9){
				check=true;
			}
		}
		for(int i = 0 ; i<3 ; i++){
			count=0;
			for(int j = 0 ; j<3 ; j++){
				for(int k = 0 ; k<3 ; k++){
					if(OX[j][i]==OX[k][i]){
						count++;
					}
				}
			}
			if(count==9){
				check=true;
			}
		}
		if(OX[0][0]==OX[1][1]&&OX[1][1]==OX[2][2]){
			check=true;
		}
		if(OX[0][2]==OX[1][1]&&OX[0][2]==OX[2][0]){
			check=true;
		}
		if(check==true){
			System.out.println("True");
			break;
		}else{
			System.out.println("False");
			break;
		}
		}
	}
}
