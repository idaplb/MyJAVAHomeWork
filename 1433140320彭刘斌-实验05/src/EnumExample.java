enum GRADE {
	//����EXCELLENT,QUALIFIED,FAILED������ö�ٳ���
	EXCELLENT,QUALIFIED,FAILED
};

public class EnumExample {
	public static void main(String[] args) {
		GRADE [] gd = GRADE.values();
		for (int i=0; i<gd.length; i++) {
			switch(gd[i]) {
			//case "EXCELLENT" :	//�ᱨ�� cannot convert from String to GRADE
			case EXCELLENT :	//�ж�EXCELLENT�����
				System.out.println("���㣬����ֵúܰ���");
				break;
			case QUALIFIED :	//�ж�QUALIFIED�����
				System.out.println("�����������ĸ��ã�");
				break;
			case FAILED :	//�ж�FAILED�����
				System.out.println("��������Ҫ����Ŷ��");
				break;
			}
		}
	}
}
