package atividadesdocurso;

public class Onibus extends Veiculo {

     private int assentos;

     public Onibus(String placa, int ano, int assentos) {
          super(placa, ano);
          this.assentos = assentos;
     }

     public int getAssentos() {
          return assentos;
     }

     public void setAssentos(int assentos) {
          this.assentos = assentos;
     }

     @Override
     public void exibirDados() {
          System.out.println("--------Ônibus---------"
                    + "\nPlaca: " + this.getPlaca()
                    + "\nAno: " + this.getAno()
                    + "\nAssentos: " + this.getAssentos());
     }
     
}
