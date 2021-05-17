
public class SpaceMen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		spacemanHead(1);
		spacemanBody(1);

		spacemanHead(2);
		spacemanBody(2);

		spacemanHead(3);
		spacemanBody(3);

	}

	public static void spacemanHead(int num) {
		String head = "";

		switch (num) {
		case 1:
			head += "    OOO\r\n   O   O\r\n   O   O\r\n    OOO\r\n";

			break;
		case 2:
			head += "  _/###\\_\r\n    OOO\r\n   O   O\r\n   O   O\r\n    OOO\r\n";

			break;
		case 3:
			head += "    OOO\r\n   O.. O\r\n   O @ O\r\n    OOO\r\n";

			break;

		}

		System.out.print(head);
	}

	public static void spacemanBody(int num) {
		String body = "     I\r\n";

		switch (num) {
		case 1:
			body += "  |  I\r\n  \\--I--\\\r\n     I  |\r\n     I\r\n    / \\\r\n   /   \\\r\n  /     \\\r\n";

			break;
		case 2:
			body += "  |  I\r\n  \\--I--\\\r\n     I  |\r\n     I\r\n    | |\r\n    | |\r\n    | |\r\n";

			break;
		case 3:
			body += "     I  |\r\n  /--I--/\r\n  |  I  \r\n     I\r\n    / \\\r\n   /   \\\r\n  /     \\\r\n";

			break;

		}

		System.out.print(body + "\r\n");

	}

}
