public class class_practice {
    static class student{
        public String name;
        public int roll;
        public student (String nam, int r){
            name = nam;
            roll = r;
        }
    }
    public static void main(String[] arg){
        student s1= new student("m",3);
        System.out.println(s1.name);
    }
}
