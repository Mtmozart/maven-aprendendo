package br.com.alura.service;

import br.com.alura.modelo.Product;
import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;

public class TranslatorService {

    public void translate(Product product){
       String name = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, product.getName());
       String  category = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, product.getCategory());
       String description = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, product.getDescription());

       product.setName(name);
       product.setCategory(category);
       product.setDescription(category);
    }
}
