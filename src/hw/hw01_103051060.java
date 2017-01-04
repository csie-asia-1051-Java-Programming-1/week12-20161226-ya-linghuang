package hw;
/*某遊覽車派遣公司共收到 n 筆任務訂單，訂單中詳細記載發車時間 s 和返回時間 d。 每一輛遊覽車只要任務時間不衝突，可立即更換司機繼續上路執行任務。請問該公司 至少需要調遣多少車輛才足以應付需求?
* Date: 2016/12/26
* Author: 103051060 黃雅鈴
*/
import java.util.Scanner;
public class hw01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn = new Scanner(System.in);
		while(true){
		int a =scn.nextInt();
		int go [] =new int [a];
		int back[] =new int[a];
		for(int i =0 ; i<a ; i++){
			go[i]=scn.nextInt();
			back[i]=scn.nextInt();
		}
		for(int i =0 ; i<a ;i++){
			if(go[i]>24||go[i]<=0){
				System.out.print("Input Error!");
				break;
				}
			if(back[i]>24||back[i]<=0){
				System.out.print("Input Error!");
				break;
				}
			for(int j = 0 ; j<a ; j++){
				if(i==j){continue;}
				if(back[i]==go[j]){
					a-=1;
				}
			}
		}
		System.out.println(a);
		break;
		}
	}

}
