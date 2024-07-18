package OperaçõesBásicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){ // Se a agenda de contatos NÃO estiver vazia...
            agendaContatoMap.remove(nome);
    }
}

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gustavo", 123456);
        agendaContatos.adicionarContato("Gustavo", 5665);
        agendaContatos.adicionarContato("Gustavo Caçador", 11111111);
        agendaContatos.adicionarContato("Gustavo Ronchi", 65897);
        agendaContatos.adicionarContato("José Santos", 11111111);
        agendaContatos.adicionarContato("Gustavo", 444444);

        // O método put para adicionarContato serve para atualizar, logo, vai exibir apenas o último "Gustavo", com telefone de "444444".

        agendaContatos.exibirContato();

        agendaContatos.removerContato("José Santos");
        agendaContatos.exibirContato();

        System.out.println("O número eh: " + agendaContatos.pesquisarPorNome("Gustavo Ronchi"));
    }
}
