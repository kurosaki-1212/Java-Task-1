class Student {
    private String name;
    private String num;
    private double kokugo;
    private double suugaku;
    private double eigo;

    public Student(String name, String num, double kokugo, double suugaku, double eigo) {
        this.name = name;
        this.num = num;
        this.kokugo = kokugo;
        this.suugaku = suugaku;
        this.eigo = eigo;
    }
    public String getName() {
        return name;
    }
    public String getNum() {
        return num;
    }
    public double getKokugo() {
        return kokugo;
    }
    public double getSuugaku() {
        return suugaku;
    }
    public double getEigo() {
        return eigo;
    }
    
    public double getAve() {
        return (this.kokugo + this.suugaku + this.eigo) /  3;
    }    
}

public class M11_7 {
    public static void main(String[] args) {
        Student A = new Student("Aさん", "001", 89, 65, 88);
        Student B = new Student("Bさん", "002", 80, 95, 64);
        Student C = new Student("Cさん", "003", 70, 80, 98);

        System.out.println(A.getNum() + " 番 "  + A.getName() + " 平均点 " + A.getAve());
        System.out.println(B.getNum() + " 番 "  + B.getName() + " 平均点 " + B.getAve());
        System.out.println(C.getNum() + " 番 "  + C.getName() + " 平均点 " + C.getAve());
    }
}
