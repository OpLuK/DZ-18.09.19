import java.util.Scanner;
public class raspisanie {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите день недели: ");
		String day = in.next();
		in.close();
		switch(day) {
		case "Понедельник":
		case "понедельник":
			System.out.println("МДК01 02 Прикладное"+ '\n' + "Иностранный язык" + '\n' + "МДК01 01 Системное" + '\n' + "Теория алгоритмов" );
			break;
		case "Вторник":
		case "вторник":
			System.out.println("ТВиМС" + '\n' + "МДК01 01 Системное" + '\n' + "БЖ" + '\n' + "МДК01 02 Прикладное");
			break;
		case "Среда":
		case "среда":
			System.out.println("Теория алгоритмов" + '\n' + "МДК01 02 Прикладное" + '\n' + "ОСТ");
			break;
		case "Четверг":
		case "четверг":
			System.out.println("ОСТ" + '\n' + "БЖ" + '\n' + "Физ-ра" + '\n' + "МДК01 02 Прикладное");
			break;
		case "Пятница":
		case "пятница":
			System.out.println("МДК01 01 Системное" + '\n' + "МДК01 02 Прикладное" + '\n' + "ТВиМС");
			break;
		case "Суббота":
		case "суббота":
			System.out.println("Выходной");
			break;
		case "Воскресенье":
		case "воскресенье":
			System.out.println("Выходной");
			break;
		default :
			System.out.println("Такого дня недели нет");
		}
	}
}
