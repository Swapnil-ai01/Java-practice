package packages;//This is a package for Task 37

public class academics {
    protected int rollNo;
    protected int paper1;
    protected int paper2;
    public academics(int rollNo,int paper1,int paper2){
        this.rollNo = rollNo;
        this.paper1 = paper1;
        this.paper2 = paper2;
    }
    public int getTotal(){
        return paper1 + paper2;
    }
    public void display(){
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Paper 1 Marks: "+ paper2);
        System.out.println("Paper 2 Marks: "+ paper2);
    }
}
