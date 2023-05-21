public class If {
    public static void main(String [] args){
        int myInt = 14;
        if (myInt<10){
           System.out.println("верно");
       } else if(myInt>20){
           System.out.println("неверное"); // смотреть за скобками
       } else {
            System.out.println("ни один из предыдущих");// если myInt входит в диапозон то это надо писать
        }
    }
}
