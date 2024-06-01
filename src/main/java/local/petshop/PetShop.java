/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package local.petshop;

import jakarta.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jainaldo Silva
 */
public class PetShop {

    public static void main(String[] args) {
        try {
            Animal animal1 = new Animal();
            animal1.setNome("Buddy");
            animal1.setEspecie("Cachorro");
            animal1.setRaca("Golden Retriever");
            animal1.setGenero("Masculino");
            animal1.setDataNascimento(new Date());

            Animal animal2 = new Animal();
            animal2.setNome("Mittens");
            animal2.setEspecie("Gato");
            animal2.setRaca("Siamês");
            animal2.setGenero("Feminino");
            animal2.setDataNascimento(new Date());

            Animais animais = new Animais();
            animais.setListaAnimais(List.of(animal1, animal2));

            File file = new File("animais.xml");
            XmlUtil.gerarXml(animais, file);
            
            // Imprimir o conteúdo do arquivo XML gerado
            String xmlContent = new String(Files.readAllBytes(Paths.get(file.getPath())));
            System.out.println("Conteúdo do arquivo XML gerado:\n");
            System.out.println(xmlContent);

            // Ler o arquivo XML gerado
            Animais animaisLidos = XmlUtil.lerXml(file);
            System.out.println("Leitura do arquivo XML gerado:\n");
            animaisLidos.getListaAnimais().forEach(animal -> {
                System.out.println("Nome: " + animal.getNome());
                System.out.println("Espécie: " + animal.getEspecie());
                System.out.println("Raça: " + animal.getRaca());
                System.out.println("Gênero: " + animal.getGenero());
                System.out.println("Data de Nascimento: " + animal.getDataNascimento());
                System.out.println("-------------------------------------------\n");
            });
        } catch (JAXBException | IOException ex) {
            Logger.getLogger(PetShop.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
}
