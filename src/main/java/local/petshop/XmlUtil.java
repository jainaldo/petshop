/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.petshop;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;

/**
 *
 * @author Jainaldo Silva
 */
public class XmlUtil {

    public static void gerarXml(Animais animais, File file) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Animais.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(animais, file);
    }

    public static Animais lerXml(File file) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Animais.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Animais) unmarshaller.unmarshal(file);
    }
}