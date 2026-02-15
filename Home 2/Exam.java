public class Exam{
    float sum=0;
    void mark(int a){
        sum+=a;
    }
    void mark(float a){
        sum+=a;
    }
    public static void main(String[] args) {
        Exam e=new Exam();
        e.mark(30.9f);
        System.out.println(e.sum);
    }
}