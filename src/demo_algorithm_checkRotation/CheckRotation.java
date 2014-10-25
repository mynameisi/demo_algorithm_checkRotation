package demo_algorithm_checkRotation;

public class CheckRotation {
	public static void main(String[] args) {
		String str1="abc";
		String str2="cab";
		if(isRotation(str1, str2)){
			System.out.println(str1+" and "+str2+" are rotations with eachother");
		}else{
			System.out.println(str1+" and "+str2+" are NOT rotations with eachother");
		}
	}

	public static boolean isRotation(String str1, String str2) {
		String str3 = str1 + str1;
		if (str3.indexOf(str2) == -1) {
			return false;
		}
		return true;
	}
}
