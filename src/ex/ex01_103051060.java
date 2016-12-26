package ex;
/*
 * Topic: 輸入一整數 N 及 N 個整數，請依照十進位中各位數字和由小到大排序輸出。如果各位數字和相等則比較數值由小到大排列。
 例如: 9122 的各位數字和為 9+1+2+2=14、3128 的各位數字和為 3+1+2+8=14 而 5112 的各位數字和為 5+1+1+2=9。
 所以輸入 9122 3128 5112 需輸出 5112 3128 9122 ，這是因為 5112(9) < 3128(14) < 9122(14)，其中又因為 3128 與 9122 兩者的各位數字和都是 14，所以將 數值小的 3128 放前面。則經由計算可得其識別碼為 165 ，乃是 11 之倍數，故此為一合法之 ISBN 碼。輸入一串 ISBN 碼，以空格隔開。
 * Date: 2016/12/26
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();											//原數
		int num [] = new int[x];
		for(int i = 0 ; i <num.length ; i++){
			num[i]=scn.nextInt();
		}
		int fin [] = new int[x];											//加後的數
		for(int i = 0 ; i<fin.length ; i++){
			int tmp = num[i];
			fin[i]=tmp%10;
			tmp=tmp/10;
			fin[i]=fin[i]+tmp%10;
			tmp=tmp/10;
			fin[i]=fin[i]+tmp%10;
			tmp=tmp/10;
		}
		for(int i = 0 ; i<x ;i++){
			for(int j = 0 ; j<x ;j++){
				if(fin[i]<fin[j]){
					int tmp = num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
				else if(fin[i]==fin[j]){
					if(num[i]>num[j]){
						int tmp = num[i];
						num[i]=num[j];
						num[j]=tmp;
					}
				}
			}
		}
		for(int i = 0 ; i < x ; i++){
			System.out.print(num[i]+" ");
		}
	}

}
