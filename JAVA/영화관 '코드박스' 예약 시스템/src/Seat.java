
public class Seat {
	// ������ �̸��� ����ϴ�.
	private String name;

	// ������ �̸��� �����մϴ�.
	public String getName() {
		return name;
	}

	// ������ �̸��� �������ݴϴ�.
	public void reserve(String name) {
		this.name = name;
	}

	// ������ �̸��� �����ݴϴ�. name�� �ٽ� null�� �����ϴ� ������!
	public void cancel() {
		this.name = null;
	}

	// �̹� ����� �ڸ����� �Ҹ����� �������ݴϴ�.
	public boolean isOccupied() {
		return name != null;
	}

	// checkName�̶�� �̸����� ����� �ڸ����� Ȯ���ϰ�, �Ҹ����� �������ݴϴ�.
	public boolean match(String checkName) {
		return name.equals(checkName);
	}

}
