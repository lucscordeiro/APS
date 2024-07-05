public class Account {
    public Float numAccount;
    protected String type;
    private String owner;
    private Float balance;
    private Boolean status;

    public Account(){
        this.setBalance(0.f);
        this.setStatus(false);
    }

    public void show(){
        System.out.println("---------------------------------------");
        System.out.println("Conta: " + this.getNumAccount());
        System.out.println("Tipo: " + this.getType());
        System.out.println("Dono: " + this.owner);
        System.out.println("Saldo: " + this.getBalance());
        System.out.println("Status: " + this.getStatus());
    }

    public void openAccount(String t){
        this.setType(t);
        this.setStatus(true);

        if(t == "CC"){
            this.setBalance(50.f);
        } else if (t == "CP") {
            this.setBalance(150.f);
        }
    }

    public void closeAccount(){
        
        if(this.getBalance() > 0){

            System.out.println("Conta com dinheiro");
        } else if (this.getBalance() < 0) {

            System.out.println("Conta em débito");
        } else {

            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!!");
        }
    }

    public void deposit(Float v){
        if(this.getStatus()){
            this.setBalance(this.getBalance() + v);
            System.out.println("Depósito realizado na conta de " + this.getOwner());
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }

    public void withdraw(Float v){
        if(this.getStatus()){

            if(this.getBalance() >= v){
                setBalance(this.getBalance() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }

        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void payMonth(){
        Float valueMonthly = 0.f;
        
        if(this.getType() == "CC"){
            valueMonthly = 12.f;
        } else if(this.getType() == "CP"){
            valueMonthly = 20.f;
        }

        if(getStatus()){
            if(getBalance() > valueMonthly){
                setBalance(getBalance() - valueMonthly);
            } else {
                System.out.println("Saldo insuficiente");
            }

        } else {
            System.out.println("Impossível pagar");
        }
    }

    public Float getNumAccount(){
        return this.numAccount;
    }

    public void setNumAccount(Float setAccount){
        this.numAccount = setAccount;
    }

    public Float getBalance(){
        return this.balance;
    }

    public void setBalance(Float b){
        this.balance = b;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String t){
        this.type = t;
    }

    public String getOwner(){
        return this.owner;
    }

    public void setOwner(String o){
        this.owner = o;
    }

    public Boolean getStatus(){
        return this.status;
    }

    public void setStatus(Boolean s){
        this.status = s;
    }
}
