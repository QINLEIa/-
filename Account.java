package ch3;
import java.util.Date;
public class Account {
    private String id,name;//账号编号、账号名称
    private double balance;//账户余额
    private Date datetime;//开户时间
    public String getId(){return id; }
    public void setId(String name){this.id = id;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public double getBalance(){return balance;}
    public void setBalance(double balance){this.balance = balance;}
    public Date getDatetime(){return datetime;}
    public void setDatetime(Date datetime){this.datetime = datetime;}
    public Account(String id,String name,double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.datetime = new Date();//开户时间采用系统时间
    }
    public Account(){
        this.id ="";//id默认为空，需要在main方法中用steId来赋值
        this.name ="";//name默认为空，需要在main方法中用setName来赋值
        this.balance = 0;//balance默认为0，开户时没有存入
        this.datetime = new Date();//datetime默认为当前时间
    }
    //存钱的方法，参数money为要存入的钱数
    public void deposite(double money){this.balance = this.balance + money;}
    //取钱的方法，参数money为要取出的钱数
    public void withdarw(double money){
        if(this.balance < money){
            System.out.println("您的余额不足，不能取钱");
            return;
        }
        this.balance = this.balance - money;//当前的账户余额减去money
    }
    //转账方法，当前账户对象转给other账户对象，money是要转的金额
    public void changeMoney(Account other,double money){
        if(this.balance < money){
            System.out.println("您的余额不足，不能转账");
            return;
        }
        this.balance = this.balance - money;//当前账户余额减去money
        other.balance = other.balance + money;//other账户余额加上money
    }
    //print()方法完成显示账户基本信息的功能
    public void print(){
        System.out.println("账号："+id+" 户名："+name+" 余额："+balance );
    }
}
