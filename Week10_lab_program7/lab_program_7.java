class Temp<Type>{
    Type value;
    
    Temp(){

    }
    Temp(Type value){
        this.value=value;
    }
    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }
}
public class lab_program_7 {
    public static void main(String[] args) {
        Temp<Float> test=new Temp<Float>(0.24f);
        System.out.println(test.getValue());
        test.setValue(0.36f);
        System.out.println(test.getValue());
        Temp<String> stest=new Temp<String>("Hello"); 
        System.out.println(stest.getValue());
    }
}
