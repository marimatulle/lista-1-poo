public class Aviao {
    public String modelo, fabricante;
    public int qteA;

    public void ligar(){
        System.out.println("Ligando o avião "+fabricante+""+modelo);
    }

    public void decolar(){
        System.out.println("Decolando o avião "+fabricante+""+modelo+", com "+qteA+" passageiros");
    }

    public void pousar(){
        System.out.println("Pousando o avião "+fabricante+""+modelo);
    }
}
