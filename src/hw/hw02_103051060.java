package hw;
/*
 * 輸入一段文字 ( 限制為 ASCII 表中，編號 32 至 125 之字元 ) ，將它們每個字元 依照鍵盤的位置，印出它們右邊的字元，若右邊按鍵有兩層字元 ( 如 : 和 ; 位於同 一按鍵上 ) ，則輸出下層字元，即 ”;” ，若該按鍵為上層字元 ( 如 !) 則輸出其右 邊按鍵之上層字元 ( 如 @) ，若輸入的字元右邊的鍵為不可視按鍵，如 shift, enter,backspace 或右邊已無按鍵，如不做更動，照樣輸出。
* Date: 2016/12/26
* Author: 103051060 黃雅鈴
*/
import java.util.Scanner;
public class hw02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while(true){
			String input = scn.next();
			char [] data = input.toCharArray();
			for(int i =0; i<data.length ; i++){
				if (data[i]<32||data[i]>125){
					System.out.println("Input error!");
					continue;
				}
				if(data[i]>='A'&&data[i]<='Z'){
					data[i]+=32;
				}
			}
			break;
		}
		char [] kb = new char [93];
		KB={" ","@","\"","$","%","&","'",")","_","(","+",".","=","/","/","-","2","3","4","6","7","8","9","0","\"","'",">","=","?","?","#","s","n","v","f","e","g","H","h","o","k","l",";",",","m","p","[","w","t","d","t","i","b","e","c","z","x","]","\\"},"\\","&","+","1","b","n","v","f","r","g","h","j","o","k","l",";",",","m","p","[","w","t","d","y","i","b","e","c","u","x"};
//		kb={" ","@","\"","$","%","&","'",")","_","(","+",".","=","/","/","-","2","3","4","5","6","7","8","9","0","\"","'",">","=","?"}
		
	}

}
