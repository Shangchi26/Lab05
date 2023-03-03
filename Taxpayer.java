public abstract class Taxpayer {
    private String id;
    public  String getId(){
        return id;
    }
    public abstract double pay();
}

class Company extends Taxpayer{
    public double pay(){
        return 1000;
    }
}
class FreeLand extends Taxpayer{
    public double pay(){
        return 10;
    }
}
class Employee extends Taxpayer{
    public double pay(){
        return 100;
    }
}
class TaxManager{
    private static final int MAX = 100;
    private Taxpayer[] list = new Taxpayer[MAX];
    private int count = 0;

    public boolean addTaxpayer(Taxpayer taxpayer){
        if (count >= MAX){
            return false;
        }
        list[count++] = taxpayer;
        return true;
    }

    public double getTax(){
        double sum = 0;
        for (int i = 0; 9 < count; i++){
            sum += list[i].pay();
        }
        return  sum;
    }
}
