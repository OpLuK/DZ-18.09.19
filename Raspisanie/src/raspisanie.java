import java.util.Scanner;
public class raspisanie {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������� ���� ������: ");
		String day = in.next();
		in.close();
		switch(day) {
		case "�����������":
		case "�����������":
			System.out.println("���01 02 ����������"+ '\n' + "����������� ����" + '\n' + "���01 01 ���������" + '\n' + "������ ����������" );
			break;
		case "�������":
		case "�������":
			System.out.println("�����" + '\n' + "���01 01 ���������" + '\n' + "��" + '\n' + "���01 02 ����������");
			break;
		case "�����":
		case "�����":
			System.out.println("������ ����������" + '\n' + "���01 02 ����������" + '\n' + "���");
			break;
		case "�������":
		case "�������":
			System.out.println("���" + '\n' + "��" + '\n' + "���-��" + '\n' + "���01 02 ����������");
			break;
		case "�������":
		case "�������":
			System.out.println("���01 01 ���������" + '\n' + "���01 02 ����������" + '\n' + "�����");
			break;
		case "�������":
		case "�������":
			System.out.println("��������");
			break;
		case "�����������":
		case "�����������":
			System.out.println("��������");
			break;
		default :
			System.out.println("������ ��� ������ ���");
		}
	}
}