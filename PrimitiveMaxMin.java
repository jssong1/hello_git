package bitcamp.java142.ch2;

public class PrimitiveMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*byte Ÿ���� MAX, MIN Value ���ϱ�
		 * byte Ű����, Data Type���� ���
		 * 1. Byte Wrapper Ŭ����, ��� ��
		 * 2. java.lang.Byte : import ���ص� �ȴ�
		 * 3. byte ��� ���� �����;��ϴµ�
		 * 	  Byte Wrapper Ŭ���� byte ����� ������, �������� Ȯ�� �ؾ���
		 * 4. �ʵ忡 static Ű���尡 �ִ��� Ȯ�� 
		 *    ������ : Ŭ�����̸�.�ʵ��
		 *    ������ : ����������.�ʵ�� <- ����� ������ static�̱� ������ �� ������ �������� ����
		 * 
		 * 
		 * -> Byte Wrapper Ŭ����, �����;
		 * static, ������
		 * ����� ����Ÿ���� �޾Ƽ� �ֿܼ� ����Ͻÿ�
		 * 
		 * */
		
		//public static final byte MAX_VALUE;
		//api���ϱ� ����Ÿ���� ����Ʈ��, MAX_VALUE�� Modifier and Type�� static byte��
		//static�� �پ����ϱ� return���� Ŭ������ �ʵ��
		byte bMax = Byte.MAX_VALUE;
		//Ÿ���� ����Ʈ�ϱ� ���� , ������ bMax���� // wrapper class�� Byte. ������� �� �빮�� 
		//java.lang.Byte.MAX_VALUE�� java.lang.����
		System.out.println("bMax >>> : " + bMax);
		//���ϰ����� bMax�� ����
		byte bMin = Byte.MIN_VALUE;
		System.out.println("bMin >>> : " + bMin);
		
		
		// shortŸ���� MAX, MIN Value ���ϱ�
		// MAX_VALUE��  Modifier and Type�� static short��
		// static�� �پ������ϱ� return���� �������� �̿��ʿ����
		short sMax = Short.MAX_VALUE;
		//������Ÿ��short���� ������sMax���� = Wrapper class�� Short.�ʵ� ������� �� �빮��
		short sMin = Short.MIN_VALUE;
		System.out.println("sMax : sMin >>> : " + sMax + " : " + sMin);
		
		
		// int Ÿ����  MAX, MIN Value ���ϱ�
		int iMax = Integer.MAX_VALUE;
		int iMin = Integer.MIN_VALUE;
		System.out.println("iMax : iMin >>> : " + iMax + " : " + iMin);
		// long Ÿ���� MAX, MIN Value ���ϱ�
		float lMax = Long.MAX_VALUE;
		float lMin = Long.MIN_VALUE;
		System.out.println("lMax : lMin >>> : " + lMax + " : " + lMin);
		
		
		// float Ÿ����  MAX, MIN Value ���ϱ�
		float fMax = Float.MAX_VALUE;
		float fMin = Float.MIN_VALUE;
		System.out.println("fMax : fMin >>> : " + fMax + " : " + fMin);
		// double Ÿ���� MAX, MIN Value ���ϱ�
		double dMax = Double.MAX_VALUE;
		double dMin = Double.MIN_VALUE;
		System.out.println("dMax : dMin >>> : " + dMax + " : " + dMin);
	} //end of main �Լ�

}// end of class

/*
 bMax >>> : 127
bMin >>> : -128
sMax : sMin >>> : 32767 : -32768
iMax : iMin >>> : 2147483647 : -2147483648
lMax : lMin >>> : 9.223372E18 : -9.223372E18
fMax : fMin >>> : 3.4028235E38 : 1.4E-45
dMax : dMin >>> : 1.7976931348623157E308 : 4.9E-324

TestTT
*/
