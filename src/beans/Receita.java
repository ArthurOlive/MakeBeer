package beans;

import java.util.ArrayList;
import java.util.List;

import beans.Autor;
import beans.Cerveja;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Receita {
	private List<Ingrediente> ingredientes;
	private List<Etapa> etapas;
	private Cerveja cerveja;
	private Autor autor;
	
	public Receita(Cerveja cerveja, Autor autor) {
		super();
		this.cerveja = cerveja;
		this.autor = autor;
	}
	
	public Receita(List<Ingrediente> ingredientes, List<Etapa> etapas, Cerveja cerveja, Autor autor) {
		super();
		
		if(ingredientes != null) {
			this.ingredientes = ingredientes;
		} else {
			this.ingredientes = new ArrayList<>();
		}
		
		if(etapas != null) {
			this.etapas = etapas;
		} else {
			this.etapas = new ArrayList<>();
		}
		
		this.cerveja = cerveja;
		this.autor = autor;
	}
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public List<Etapa> getEtapas() {
		return etapas;
	}
	public void setEtapas(List<Etapa> etapas) {
		this.etapas = etapas;
	}
	public Cerveja getCerveja() {
		return cerveja;
	}
	public void setCerveja(Cerveja cerveja) {
		this.cerveja = cerveja;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void adicionarIngrediente(Ingrediente ingreditente) {
		this.ingredientes.add(ingreditente);
	}
	
	public void adicionarEtapa(Etapa etapa) {
		this.etapas.add(etapa);
	}
        
        public void make(Autor autor){
            System.out.println("Receita cerveja " + this.cerveja.getNome() + " by " + this.autor.getNome());
            
            System.out.println();
            System.out.println("Lista de ingredientes da receita: ");
            for (int i = 0; i < ingredientes.size(); i++){
                System.out.println((i + 1)  + " - " + ingredientes.get(i).getNome() + " / qtd " + ingredientes.get(i).getQuantidade());
            }
            
            
            Collections.sort(etapas, new Comparator<Etapa>(){
                @Override
                public int compare(Etapa etapa1, Etapa etapa2)
                {
                    if (etapa1.getOrdinal() < etapa2.getOrdinal()){
                        return -1;
                    } else {
                        return 1;
                    }
                }
            });
            
            Scanner leitor = new Scanner(System.in);
            int opcao;
            //
            for (int i = 0; i < etapas.size(); i++){
                System.out.println();
                System.out.println("Etapa " + etapas.get(i).getOrdinal() + " : " + etapas.get(i).getTitulo());
                System.out.println("Descrição: ");
                System.out.println(etapas.get(i).getDescricao());
                
                System.out.println();
                
                do {
                    System.out.println("1 - ver comentarios");
                    System.out.println("2 - comentar");
                    System.out.println("3 - Proxima etapa");
                
                    opcao = leitor.nextInt();
                    
                    if (opcao == 1) {
                        if (etapas.get(i).getAnotacoes().isEmpty()){
                            System.out.println("Esta etapa não possui anotação");
                        } else {
                            for (int j = 0; j < etapas.get(i).getAnotacoes().size(); j++){
                               System.out.println(etapas.get(i).getAnotacoes().get(j).getTitulo() + " - " + etapas.get(i).getAnotacoes().get(j).getAutor().getNome());
                               System.out.println(etapas.get(i).getAnotacoes().get(j).getDescricao());
                            }
                        }
                    } else if (opcao == 2) {
                        String titulo, anotacao;
                        
                        leitor.nextLine();
                        System.out.println("Titulo: ");
                        titulo = leitor.nextLine();
                        System.out.println("Anotacao: ");
                        anotacao = leitor.nextLine();
                        
                        Anotacao novaAnotacao = new Anotacao(titulo, LocalDateTime.MAX, anotacao, autor);
                        etapas.get(i).getAnotacoes().add(novaAnotacao);
                    }
                } while(opcao != 3);
            }
        }
	
	@Override
	public String toString() {
		return "Receita [ingredientes=" + ingredientes + ", etapas=" + etapas + ", cerveja=" + cerveja + ", autor="
				+ autor + "]";
	}
}
