
class PostfixTest {
	
	public static void main(String[] args) {
		OptExp2 opt = new OptExp2();
		int result;
		String exp = "35*62/-"; //(3*5)-(6/2)
		System.out.printf("\n����ǥ��� : %s", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n������ = %d\n", result);
	}
}