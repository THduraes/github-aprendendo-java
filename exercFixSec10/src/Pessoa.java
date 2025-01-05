

public class Pessoa {
    private Integer id;
    private String name;
    private Float balance;

    public Pessoa(String name, Integer id, Float balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    public String toString(){
        return "Name: "+this.name+"  Id: "+this.id+"  Balance: "+this.balance;
    }
    public Integer getId(){
        return this.id;
    }
    public void setNewBalance(int porcen){
        balance += balance * (porcen/100);
    }
}
