public class banking_system {
    static class Custommer{
        private int bal = 0;
        private float rate;
        private int an;
        String name;
        
        static int anr = 1;
        Custommer (String name){
            this.name = name;
            an = anr ;
            anr = anr + 1;
            bal = 0;
            rate = 0;
        }

        public void set_balance(int balance){
            bal = bal + balance;
            System.out.println(balance +" taka added successfully");
            System.out.println("yout total ballence : " + bal);
        }
        // public void set_rate(float r){
        //     rate = r;
        // }
        public void cash_out (int b){
            if ( b > bal){
                System.out.println("not enough money");
            }
            else{
                bal = bal - b;
                System.out.println(b + " taka cashout successfull");
                System.out.println("current ballence : " + bal);
            }
        }
        public void my_balance(){
            System.out.println(bal);
        }


    }

    public static void main(String[] arg){
        Custommer c1 = new Custommer("abul");
        Custommer c2 = new Custommer("kbul");
        Custommer c3 = new Custommer("hbul");
        Custommer c4 = new Custommer("babul");


        c1.set_balance(1000);
        c1.set_balance(2000);

        c1.cash_out(200);





    }
}
