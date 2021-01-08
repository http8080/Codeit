import java.util.ArrayList;

public class Main {
   public static int getSurvivingIndex(int n, int k) {
       // ���� ����
       ArrayList<Integer> soldiers = new ArrayList<>();
       for (int i = 1; i <= n; i++) {
           soldiers.add(i);
       }
       
       int killindex = 0;
       while(soldiers.size() > 1) {
    	   System.out.println(soldiers.remove(killindex = (killindex + k - 1) % soldiers.size()) + "�� ���簡 �׽��ϴ�.");
       }
       return soldiers.get(0);
   }

   public static void main(String[] args) {
       System.out.println("����� " + getSurvivingIndex(20, 5) + "�� �ڸ��� �������� �˴ϴ�.");
   }
}