class fruit{
    int a = 12;
    boolean isgood;
    
    void Tasty(){
        isgood= true;
        System.out.println("the mango is good" + isgood);
    }
        
    void isgood(){
        isgood= false;
        System.out.println(" the mango is good" + isgood);
        
    }
}
class main{
    public static void main(String[]args){
        fruit seed = new fruit();
        fruit apple = new fruit();
        seed.isgood();
        apple.Tasty();
    }
}