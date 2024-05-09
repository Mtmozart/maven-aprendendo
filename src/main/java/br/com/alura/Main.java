package br.com.alura;


import br.com.alura.modelo.Product;
import br.com.alura.service.TranslatorService;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) throws FileNotFoundException {

    List<Product> products = new CsvToBeanBuilder(new FileReader("src/main/resources/products.csv"))
            .withType(Product.class).build().parse();


        TranslatorService translate = new TranslatorService();
        products.stream()
                .peek( p -> translate.translate(p))
                .forEach( p -> System.out.println(p));


       }


}