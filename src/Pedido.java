import java.util.ArrayList;

public class Pedido {
    Cliente cliente;
    Float totalPedido;
    ArrayList <Tapete> item = new ArrayList <Tapete>();
           
    public void preencherPedido(Cliente c){
        this.cliente = c;
    }
    
    public void insereTapete(Tapete t){
        item.add(t);
    }
        
    public float calculaTotalPedido(){
        float soma = 0;
        for (int i = 0; i < item.size(); i++) {
            soma += item.get(i).precoTapete;
        }
        return soma;
    }
    
    public Pedido pedidoVazio(){
        if (!(this.item.isEmpty() && this.totalPedido == null)) {
            return this;
        }else {
            return new Pedido();
        }
    }
    
}
