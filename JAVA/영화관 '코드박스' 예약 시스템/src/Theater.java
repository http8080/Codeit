public class Theater {

	// ��ü �¼��� ǥ���ϴ� 2���� Seat �迭�Դϴ�.
	private Seat[][] seats;

	// ��ü �¼��� ��(row)�� ��(col)�� ���� ��� �����Դϴ�.
	private int rowCount, colCount;

	// Theater Ŭ������ �������Դϴ�.
	// �Ķ���ͷ� ���� ���� ���� ���� �ش��ϴ� 2���� �迭�� �����,
	// Seat Ŭ������ �ν��Ͻ���� �迭�� ä���ݴϴ�.
	// ��� Seat �ν��Ͻ��� ���� �޶�� �մϴ�.
	// �� rowCount * colCount���� �ν��Ͻ��� �ʿ��ϰ���?
	// ��, �Ķ���ͷ� ���� �������� ��
	// �� ���� ������ �̸��� ���� �ν��Ͻ� ������ �־��ݴϴ�.
	// ���� �� rowCount�� this.rowCount�� �־���� �ϰ���?
	public Theater(int rowCount, int colCount) {
		this.rowCount = rowCount;
		this.colCount = colCount;

		if (rowCount > 26) {
			rowCount = 26; // number of alphabets
		}

		seats = new Seat[rowCount][colCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++)
				seats[i][j] = new Seat();
		}

	}

	// �¼� ������ ����ϴ� �޼ҵ��Դϴ�.
	// ���ø����� ������ �ϼ��� �޼ҵ��Դϴ�.
	// �׷��� ���� �а� �����Ϸ��� ����غ�����!
	public void printSeatMatrix() {
		System.out.print("  ");
		for (int i = 1; i <= 9; i++) {
			System.out.print("  " + i);
		}
		System.out.println();

		for (int i = 0; i < rowCount; i++) {
			System.out.print((char) ('A' + i) + ": ");
			for (int j = 0; j < colCount; j++) {
				Seat s = seats[i][j];
				if (s.isOccupied()) {
					System.out.print("[O]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
	}

	// ���� ����(�̸�, ��, ��, ���� �¼� ��)�� �Ķ���ͷ� �޾� �����ϴ� �޼ҵ��Դϴ�.
	// �������� �ʴ� �� �Ǵ� ���� �Է��ϸ� false�� �����ϰ� �޼ҵ带 �����մϴ�.
	// ���� 1������ 9�������ۿ� ���µ�,
	// D7���� �� �¼��� �����ϸ� false�� �����ϰ� �޼ҵ带 �����մϴ�.
	// �ƹ� �¼��� ����Ǹ� �� �˴ϴ�!
	// D3���� �� �¼�(D3, D4, D5, D6)�� ���� �Ϸ��� �ϴµ�
	// D6�� �̹� ����� �ڸ����, ������ �¼���(D3, D4, D5)�� ����Ǹ� �� �˴ϴ�.
	// ������ ���� ���, ������ ������ �ϰ� true�� �����մϴ�.
	// �Է¹��� rowChar�� �迭�� index�� ����ϱ� ����
	// getRowIndex �޼ҵ带 �̿��ϼ���!
	// �Է� : System.out.println(getRowIndex("C"));
	// ��� : 2
	public boolean reserve(String name, char rowChar, int col, int numSeat) {
		int row = getRowIndex(rowChar) + 1;
		if (row > rowCount || col > colCount || col + numSeat - 1 > colCount) {
			return false;
		}
		for (int i = 0; i < numSeat; i++) {
			Seat current = seats[row - 1][col - 1 + i];

			// �̹� ����� �ڸ��� �ռ� ������ �ڸ� ��� ���
			if (current.isOccupied()) {
				for (int j = 0; j < i; j++) {
					seats[row - 1][col - 1 + j].cancel();
				}
				return false;
			}

			// �� �ڸ��� ����
			current.reserve(name);
		}

		return true;
	}

	// �̸� name���� ����� �ڸ��� ����ϰ�,
	// ��ҵ� �¼��� ���� �����մϴ�.
	// ���� ��� "�����" �̸����� ����� �¼��� ���� �ڸ��̸�
	// t.cancel("�����")�� 8�� �����ϴ� ������.
	// ���� ����� �ڸ��� ���ٸ� 0�� �����ϰ���?
	public int cancel(String name) {
		int canceledCount = 0;

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				Seat seat = seats[i][j];
				if (seat.isOccupied() && seat.match(name)) {
					seat.cancel();
					canceledCount++;
				}
			}
		}

		return canceledCount;
	}

	// �޼ҵ� �����ε����� ������ �� �ٸ� cancel �޼ҵ��Դϴ�.
	// �̹����� �Ķ���ͷ� �޴� '��', '��', '�¼� ��'�� �ش�Ǵ�
	// ��� �¼��� ������ ����մϴ�.
	// �׸��� ���� cancel �޼ҵ�� ���������� �� ��ҵ� �¼� ���� �����մϴ�.
	// ���� G2���� G4���� �� �ڸ��� ����� ��Ȳ����
	// t.cancel('G', 3, 4)�� G3���� G6���� �� �ڸ���,
	// ����� G3, G4�� ����ϰ� 2�� �����ؾ� �մϴ�.
	public int cancel(char rowChar, int col, int numSeat) {
		int row = getRowIndex(rowChar) + 1;
		if (row > rowCount || col > colCount) {
			return 0;
		}

		if (col + numSeat - 1 > colCount) {
			numSeat = col + numSeat - 1 - colCount;
		}

		int canceledCount = 0;

		// ��� ���� �ڵ�
		for (int i = 0; i < numSeat; i++) {
			if (seats[row - 1][col - 1 + i].isOccupied()) {
				seats[row - 1][col - 1 + i].cancel();
				canceledCount++;
			}
		}

		return canceledCount;
	}

	// ����� ��� �¼� ���� �����ϴ� �޼ҵ��Դϴ�.
	public int getNumberOfReservedSeat() {
		int reservedCount = 0;
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				Seat seat = seats[i][j];
				if (seat.isOccupied()) {
					reservedCount++;
				}
			}
		}

		return reservedCount;
	}

	// ��ȭ�� ���� �׿� �ش��ϴ� ������ ��ȯ�ϴ� �޼ҵ��Դϴ�.
	// ������� 'A'�� 0, 'D'�� 3���� ��ȯ���ݴϴ�. ���ø����� �����˴ϴ�!
	private int getRowIndex(char uppercaseChar) {
		return uppercaseChar - 'A';
	}
}