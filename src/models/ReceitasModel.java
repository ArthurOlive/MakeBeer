/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import beans.Autor;
import beans.Estilo;
import beans.Receita;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import beans.Cerveja;
import beans.EngenheiroDeAlimentos;
import beans.Etapa;
import beans.Ingrediente;

/**
 *
 * @author Arthur
 */
public class ReceitasModel {
    public Receita getReceitaDefault(){
        //Estilo 
        //O estilo large é de uma cerveja de ph 5 e nivel alcolico entre 5% - 7%.
        Estilo lager = new Estilo("Lager", 5.0, 0.05, 0.07);
        //Cerveja
        //A cerveja skol é do estilo Lager
        Cerveja skol = new Cerveja("Skol", "Amarelo claro", lager);

        //Não é uma receita propriamente dita, são apenas demonstrações de etapas com seus respctivos significados
        Etapa malteacao = new Etapa(1, "Malteacao" ,"A primeira etapa consiste no aquecimento, aeração, e umidificação dos grãos até que "
                + "comecem a germinar e gerem o chamado malte verde, que na sequência é secado. ");

        Etapa moagem = new Etapa(2, "Moagem", "O malte então é moído mecanicamente de forma a expor o amido e outras substâncias, "
                + "como enzimas, dentro dos grãos às próximas etapas.");

        Etapa brassagem = new Etapa(3, "Brassagem", "Consiste na conversão do amido em açúcares que as leveduras podem degradar, "
                + "através da adição de água e aquecimento, gerando o chamado mosto.");

        Etapa filtração = new Etapa(4, "Filtração", "Após a formação do mosto, este pode ser filtrado a fim de se retirar impurezas, "
                + "como as cascas dos cereais.");

        Etapa fervura = new Etapa(5, "Fervura", "Ferve-se, então, o mosto, com a adição de lúpulo e eventuais outros ingredientes do "
                + "estilo de cerveja, ocorrendo a liberação de outros açúcares.");

        Etapa resfriamento = new Etapa(6, "Resfriamento", "Resfria-se, então, o mosto, sendo preparado para a fermentação, podendo também "
                + "ocorrer oxigenação da mistura.");

        Etapa fermentação = new Etapa(7, "Fermentação", "É a principal etapa da produção de cervejas, onde adiciona-se as leveduras. O tempo, "
                + "a temperatura e até o tipo de levedura estão intimamente relacionados com o tipo de cerveja a se produzir.");

        Etapa maturação = new Etapa(8, "Maturação", "Após a fermentação, armazena-se a cerveja por um tempo em tanques para que chegue no aroma, "
                + "textura e complexidade desejados.");

        Etapa envase = new Etapa(9, "Envase", "ACom a cerveja pronta, deve ocorrer o correto envasamento da mesma, podendo antes ocorrer mais algumas "
                + "correções, como carbonatar o líquido, principalmente para recipientes de vidro.");

        List<Etapa> etapas = new ArrayList<>();
        
        //Adiciona as etapas
        etapas.add(malteacao);
        etapas.add(moagem);
        etapas.add(brassagem);
        etapas.add(filtração);
        etapas.add(fervura);
        etapas.add(resfriamento);
        etapas.add(fermentação);
        etapas.add(maturação);
        etapas.add(envase);
        
        
        //Ingredientes
        Ingrediente levedura = new Ingrediente("Saccharomyces cerevisiae", LocalDate.of(2021, 1, 8), 150, 10);
        Ingrediente trigo = new Ingrediente("Trigo", LocalDate.of(2025, 1, 8), 10, 150);
        Ingrediente lupulo = new Ingrediente("Lupulo", LocalDate.of(2022, 1, 8), 50, 100);
        
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(levedura);
        ingredientes.add(trigo);
        ingredientes.add(lupulo);
        
        Autor autor = new EngenheiroDeAlimentos("000.000.000-00", "Jorginho");
        Receita receitaSkol = new Receita(skol, autor);
        
        return receitaSkol;
    }
}
