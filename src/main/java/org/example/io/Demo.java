package org.example.io;

import java.io.*;
import java.nio.file.Files;

public class Demo {

    BufferedReader reader; // Ajoute un tampon pour améliorer les performances lecture -> fichier txt
    BufferedWriter writer;// Ajoute un tampon pour améliorer les performances ecriture -> fichier txt
    FileInputStream fis; // Travail sur des octets -> fichiers binaires
    FileOutputStream fos; // Travail sur des octets -> fichiers binaires
    FileReader fris; // Travail sur des caractères, ideal des fichiers textes simples
    FileWriter fw; // Travail sur des caractères, ideal des fichiers textes simples
    Files files; // Utile pour de la gestion de fichier.



}
