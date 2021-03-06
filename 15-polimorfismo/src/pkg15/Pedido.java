package pkg15;

public class Pedido {

    private final IList<Venda> lista;

    public Pedido(IList<Venda> lista) {
        this.lista = lista;
    }
    
    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < lista.count(); i++) {
            // Produto p = (Produto) lista.get(i);
            // com parâmetro de tipo
            // a coerção não é mais necessária
            total += lista.get(i).getPreco();                        
        }
        return total;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < lista.count(); i++) {
            s += lista.get(i) + "\n";
        }
        s += "--------------------\n";
        s += "total: " + this.getTotal();                
        return s;
    }
    
}
