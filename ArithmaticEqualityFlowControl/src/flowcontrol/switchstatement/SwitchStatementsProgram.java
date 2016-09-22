package flowcontrol.switchstatement;

public class SwitchStatementsProgram {

	public static void main(String[] args) {
		
		swithCaseBreakExample("thu");
		switchDouble(1.6);;
		
		
	}
	
	static void swithCaseBreakExample(String s){
		switch (s) {
		
			case "MON":
			case "TUE":
			case "WED":
				System.out.println("Wednesday");
				break;
			case "THU": 
				System.out.println("Thursday");				
			case "SAT":			
			case "FRI": 
				System.out.println("Nearing weekend");
				break;
			default: 
				System.out.println("Invalid day?");				
			case "SUN": 
				System.out.println("Sunday");			
		}	
	}
	
	static void swithBox(Integer in){
		switch(in){
			case 1:
			case 2:
			default:
				
		}
	}
	
	private static final short X = 1;
	
	static void swithLong(long x){
		
		switch((short)x){
		case X:
			System.out.println("return 1");
			break;
		case 2:
			System.out.println("return 2");
			break;
		case 3:
			System.out.println("return 3");
			break;
		default:
			System.out.println("return other number");
			break;			
		}
	}

static void switchDouble(double x){
		
		switch((int)x){
		case 1:
			System.out.println("return 1");
			break;
		case 2:
			System.out.println("return 2");
			break;
		case 3:
			System.out.println("return 3");
			break;
		default:
			System.out.println("return other number");
			break;			
		}
	}

static void swithString(String x){
	
	switch(x){
	case "1":
		System.out.println("return 1");
		break;
	case "2":
		System.out.println("return 2");
		break;
	case "3":
		System.out.println("return 3");
		break;
	default:
		System.out.println("return other number");		
		break;			
	}
}

static void switchDefault(int x){
	
	switch(x){
	case 1:
		System.out.println("return 1");
		
	default:
		System.out.println("return other number");
		break;
	case 5:
		System.out.println("return 5");
		
	case 6:
		System.out.println("return 6");
		
	
		
	}
}

}
