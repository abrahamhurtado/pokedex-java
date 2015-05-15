/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokidix.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TOSHIBA
 */
public class PokemonParser {
    public static List<Pokemon> getAllPokemons() {
     
        FileReader file;
        try {
            file = new FileReader(new File("resources/pokemon.json").getAbsolutePath());
        } catch (IOException ex){
            return new ArrayList<>();
        }
        
        Type listType = new TypeToken<ArrayList<Pokemon>>() {
                    }.getType();
        
        Gson gson =  new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        List<Pokemon> pokemonList = gson.fromJson(file, listType);
        
        return pokemonList;
    }
}
