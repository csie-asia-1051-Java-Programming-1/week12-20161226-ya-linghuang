package ex;
/*
 * Topic: 給定一字串，請將此字串中，每個字元的 ASCII 編碼數值進行加總，輸出其編碼數 值總和。舉例來說，若輸入之字串為 “abcdefghij” 共 10 個字元，其 ASCII 編碼依序為 “97 98 99 100 101 102 103 104 105 106” ，則編碼總和輸出為 1015 。
 * Date: 2016/12/26
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		scn.nextLine();														//補被吃掉的一行
		int fin [] = new int [x];
		String [] input=new String[x];
		for(int i = 0 ; i < x ; i++){
			input[i]=scn.nextLine();
			char [] data = input[i].toCharArray();
			for(int j = 0 ; j < data.length ; j++){
				fin[i]=fin[i]+(int)data[j];
			}
		}
		for(int i = 0 ; i < x ; i++){
			System.out.println(fin[i]);
		}
	}

}
