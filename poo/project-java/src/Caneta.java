// public class Caneta{
//     public String modelo;
//     public String cor;
//     private float ponta;
//     protected int carga;
//     private boolean tampada;

//     public void status(){
//         System.out.println("Modelo: " + this.modelo);
//         System.out.println("Uma caneta " + this.cor);
//         System.out.println("Ponta:" + this.ponta);
//         System.out.println("Carga: " + this.carga);
        
//         if (tampada == false) {
//             System.out.println("Destampada");
//         } else {
//             System.out.println("Tampada");
//         }
//     }

//     public void rabiscar(){
//         if(this.tampada == true){
//             System.out.println("ERRO! Nao posso rabiscar");
//         } else {
//             System.out.println("Rabiscando");
//         }
//     }

//     public void tampar(){
//         this.tampada = true;
//     }

//     public void destampar(){
//         this.tampada = false;
//     }

//     public String getModelo(){
//         return this.modelo;
//     }

//     public void setModelo(String m){
//         this.modelo = m;
//     }

//     public Float getPonta(){
//         return this.ponta;
//     }

//     public void setPonta(Float p){
//         this.ponta = p;
//     }

// }

public class Caneta{
    public String modelo;
    private Float ponta;
    private Boolean tampada;
    private String cor;

    //Este é o metodo construtor
    public Caneta(String m, String c, Float p){
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        // this.setPonta(p);
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public Float getPonta(){
        return this.ponta;
    }

    public void setPonta(Float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}