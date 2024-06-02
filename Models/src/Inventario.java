import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Item> listaDeItens;

    // Construtor
    public Inventario() {
        this.listaDeItens = new ArrayList<>();
    }

    // Método para adicionar um item ao inventário
    public void adicionarItem(Item item) {
        listaDeItens.add(item);
    }

    // Método para remover um item do inventário
    public void removerItem(Item item) {
        listaDeItens.remove(item);
    }

    // Método para atualizar um item no inventário
    public void atualizarItem(Item itemAntigo, Item itemNovo) {
        int index = listaDeItens.indexOf(itemAntigo);
        if (index != -1) {
            listaDeItens.set(index, itemNovo);
        } else {
            System.out.println("Item não encontrado no inventário.");
        }
    }

    // Método para listar todos os itens no inventário
    public void listarItens() {
        System.out.println("Lista de Itens no Inventário:");
        for (Item item : listaDeItens) {
            System.out.println(item);
        }
    }
}