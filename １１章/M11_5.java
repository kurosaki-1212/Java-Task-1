class Person {
    private String name;
    private int age;
    private String gender;
    private double height;
    private double weight;

    Person(String name,int age,String gender,double height,double weight){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.height=height;
        this.weight=weight;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }


    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }

    public void getProfile(){
        System.out.print("名前："+getName()+" 年齢："+getAge()+" 性別："+getGender()+" 身長(cm)："+getHeight()+" 体重(kg)："+getWeight());
        System.out.println();
    }

    public double bmi(double h,double w){
        double result = w/((h/100)*(h/100));
        return result;
    }
    public double proper(double h,double w){
        double result = ((h/100)*(h/100)*22);
        return result;
    }
    public void decision(double bmi){
        if(bmi<18.5){
            System.out.print("肥満度判定= 低体重(やせ型)");
            System.out.println("");
        }else if(18.5<=bmi && bmi<25.0){
            System.out.print("肥満度判定= 普通体重");
            System.out.println("");
        }else if(25.0<=bmi && bmi<30.0){
            System.out.print("肥満度判定= 肥満(1度)");
            System.out.println("");
        }else if(30.0<=bmi && bmi<35.0){
            System.out.print("肥満度判定= 肥満(2度)");
            System.out.println("");
        }else if(35.0<=bmi && bmi<40.0){
            System.out.print("肥満度判定= 肥満(3度)");
            System.out.println("");
        }else{
            System.out.print("肥満度判定= 肥満(4度)");
            System.out.println("");
        }
    } 


}
public class M11_5 {
    public static void main(String[] args) {
        Person aaa=new Person("鈴木太郎", 42, "男性", 179.3, 72.7);
        aaa.getProfile();
        System.out.println("BMI値="+aaa.bmi(aaa.getHeight(), aaa.getWeight()));
        aaa.decision(aaa.bmi(aaa.getHeight(), aaa.getWeight()));
        System.out.println("適正体重="+aaa.proper(aaa.getHeight(), aaa.getWeight())+" kg");
    }
}