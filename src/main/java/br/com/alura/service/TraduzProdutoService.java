package br.com.alura.service;

import br.com.alura.model.Produto;
import space.dynomake.libretranslate.Language;
import space.dynomake.libretranslate.Translator;

public class TraduzProdutoService {
    public void traduzir(Produto produto){
        produto.setName(Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getName()));
        produto.setCategory(Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getCategory()));
        produto.setDescription(Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getDescription()));
    }
}
