/*package Day14;

import java.util.Scanner;

import Day14.lotto2;

 interface ppp {
	void Registerwinningnumber(Scanner scan);
	void Lottonumberchec(Scanner scan);
	void Checkthewinningnumbers(Scanner scan);
	void Lottoautomaticnumbergeneration(Scanner scan);
	void Lottomanualnumberissuance(Scanner scan);
}

public class lotto {
	public static void main(String[] args) {
		lottoNum sm = new lottoNum();
		char menu = '0';
		Scanner scan = new Scanner(System.in);
		do {
			sm.printMenu();
			menu = scan.next().charAt(0);
			switch(menu){
			case '1' : sm.Registerwinningnumber(scan);; break;
			case '2' : sm.Lottonumbercheck(scan);; break;
			case '3' : sm.Checkthewinningnumbers(scan);; break;
			case '4' : sm.Lottoautomaticnumbergeneration(scan);; break;
			case '5' : sm.Lottomanualnumberissuance(scan);; break;
			case '6' : break;
			default:
				sm.printAlert();
			}
		}while(menu !='6');
			sm.printExit();
			scan.close();
	}

}
*/
