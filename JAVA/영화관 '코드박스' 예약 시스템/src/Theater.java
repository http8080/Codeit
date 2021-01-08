public class Theater {

	// 전체 좌석을 표현하는 2차원 Seat 배열입니다.
	private Seat[][] seats;

	// 전체 좌석의 행(row)과 열(col)의 수를 담는 변수입니다.
	private int rowCount, colCount;

	// Theater 클래스의 생성자입니다.
	// 파라미터로 받은 열과 행의 수에 해당하는 2차원 배열을 만들고,
	// Seat 클래스의 인스턴스들로 배열을 채워줍니다.
	// 모든 Seat 인스턴스는 서로 달라야 합니다.
	// 총 rowCount * colCount개의 인스턴스가 필요하겠죠?
	// 또, 파라미터로 받은 변수들의 값
	// 을 각각 동일한 이름의 내부 인스턴스 변수에 넣어줍니다.
	// 예를 들어서 rowCount는 this.rowCount에 넣어줘야 하겠죠?
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

	// 좌석 정보를 출력하는 메소드입니다.
	// 템플릿으로 제공된 완성된 메소드입니다.
	// 그래도 직접 읽고 이해하려고 노력해보세요!
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

	// 예약 정보(이름, 열, 행, 예약 좌석 수)를 파라미터로 받아 예약하는 메소드입니다.
	// 존재하지 않는 행 또는 열을 입력하면 false를 리턴하고 메소드를 종료합니다.
	// 만약 1열부터 9열까지밖에 없는데,
	// D7부터 네 좌석을 예약하면 false를 리턴하고 메소드를 종료합니다.
	// 아무 좌석도 예약되면 안 됩니다!
	// D3부터 네 좌석(D3, D4, D5, D6)을 예약 하려고 하는데
	// D6가 이미 예약된 자리라면, 나머지 좌석들(D3, D4, D5)도 예약되면 안 됩니다.
	// 문제가 없는 경우, 실제로 예약을 하고 true를 리턴합니다.
	// 입력받은 rowChar를 배열의 index로 사용하기 위해
	// getRowIndex 메소드를 이용하세요!
	// 입력 : System.out.println(getRowIndex("C"));
	// 출력 : 2
	public boolean reserve(String name, char rowChar, int col, int numSeat) {
		int row = getRowIndex(rowChar) + 1;
		if (row > rowCount || col > colCount || col + numSeat - 1 > colCount) {
			return false;
		}
		for (int i = 0; i < numSeat; i++) {
			Seat current = seats[row - 1][col - 1 + i];

			// 이미 예약된 자리면 앞서 예약한 자리 모두 취소
			if (current.isOccupied()) {
				for (int j = 0; j < i; j++) {
					seats[row - 1][col - 1 + j].cancel();
				}
				return false;
			}

			// 빈 자리면 예약
			current.reserve(name);
		}

		return true;
	}

	// 이름 name으로 예약된 자리를 취소하고,
	// 취소된 좌석의 수를 리턴합니다.
	// 예를 들어 "김신의" 이름으로 예약된 좌석이 여덟 자리이면
	// t.cancel("김신의")는 8을 리턴하는 것이죠.
	// 만약 예약된 자리가 없다면 0을 리턴하겠죠?
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

	// 메소드 오버로딩으로 구현한 또 다른 cancel 메소드입니다.
	// 이번에는 파라미터로 받는 '열', '행', '좌석 수'에 해당되는
	// 모든 좌석의 예약을 취소합니다.
	// 그리고 위의 cancel 메소드와 마찬가지로 총 취소된 좌석 수를 리턴합니다.
	// 만약 G2부터 G4까지 세 자리가 예약된 상황에서
	// t.cancel('G', 3, 4)는 G3부터 G6까지 네 자리중,
	// 예약된 G3, G4를 취소하고 2를 리턴해야 합니다.
	public int cancel(char rowChar, int col, int numSeat) {
		int row = getRowIndex(rowChar) + 1;
		if (row > rowCount || col > colCount) {
			return 0;
		}

		if (col + numSeat - 1 > colCount) {
			numSeat = col + numSeat - 1 - colCount;
		}

		int canceledCount = 0;

		// 취소 관련 코드
		for (int i = 0; i < numSeat; i++) {
			if (seats[row - 1][col - 1 + i].isOccupied()) {
				seats[row - 1][col - 1 + i].cancel();
				canceledCount++;
			}
		}

		return canceledCount;
	}

	// 예약된 모든 좌석 수를 리턴하는 메소드입니다.
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

	// 영화관 행을 그에 해당하는 정수로 변환하는 메소드입니다.
	// 예를들어 'A'는 0, 'D'는 3으로 변환해줍니다. 템플릿으로 제공됩니다!
	private int getRowIndex(char uppercaseChar) {
		return uppercaseChar - 'A';
	}
}