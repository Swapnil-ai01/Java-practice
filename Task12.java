class Task12{
    int instanceVar = 10;

    static int staticVar = 20;

    void localScopeMethod(){ 
        int localVar = 30;
        System.out.println("Inside Method: Local Variable = " + localVar);
    }
    public static void main(String[] args) {
        Task12 obj = new Task12();
        System.out.println("Instance Variable = " + obj.instanceVar);
        System.out.println("Static Variable = " + staticVar);
        obj.localScopeMethod();
            int blockVar = 50;
            System.out.println("Inside Block: Block Variable = " + blockVar);
            }

}