import packages.academics;
import packages.sports;
public class Task37 extends academics implements sports{
    private int sportsScore;
    public Task37(int rollNo,int paper1,int paper2,int sportsScore) {
        super(rollNo, paper1, paper2);
        this.sportsScore = sportsScore;
    }
    public int getSportsScore(){
        return sportsScore;
    }
    public int getTotalScore(){
        return getTotal() + getSportsScore();
    }
    public void display(){
        super.display();
        System.out.println("Sports score: "+ getSportsScore());
        System.out.println("Total Score: "+ getTotalScore());
    }
    public static void main(String[] ags){
        Task37  student1 = new Task37(101,85,90,15);
        student1.display();
    }

}
