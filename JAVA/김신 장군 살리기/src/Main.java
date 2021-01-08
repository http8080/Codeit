import java.util.ArrayList;

public class Main {
   public static int getSurvivingIndex(int n, int k) {
       // 솔저 생성
       ArrayList<Integer> soldiers = new ArrayList<>();
       for (int i = 1; i <= n; i++) {
           soldiers.add(i);
       }
       
       int killindex = 0;
       while(soldiers.size() > 1) {
    	   System.out.println(soldiers.remove(killindex = (killindex + k - 1) % soldiers.size()) + "번 군사가 죽습니다.");
       }
       return soldiers.get(0);
   }

   public static void main(String[] args) {
       System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
   }
}