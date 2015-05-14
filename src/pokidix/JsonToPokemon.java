/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokidix;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.ImageIcon;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TOSHIBA
 */
public class JsonToPokemon {

    public String[] convertStringToArray(String stringToArray) {

        stringToArray = stringToArray.replace("[", "");
        stringToArray = stringToArray.replace("]", "");
        stringToArray = stringToArray.replace("\"", "");

        String[] types = stringToArray.split(",");

        return types;
    }

    public String convertArrayToString(String[] arrayToString) {
        String types = "";
        for (String element : arrayToString) {
            types = types + element + "/";
        }

        return types;
    }

    public int[] convertStringToArray(JsonElement arrayToInt) {
        int[] stats = new int[7];
        JsonObject statsP = arrayToInt.getAsJsonObject();
        stats[0] = Integer.parseInt(statsP.get("hp").toString());
        stats[1] = Integer.parseInt(statsP.get("attack").toString());
        stats[2] = Integer.parseInt(statsP.get("defense").toString());
        stats[3] = Integer.parseInt(statsP.get("sp.atk").toString());
        stats[4] = Integer.parseInt(statsP.get("sp.def").toString());
        stats[5] = Integer.parseInt(statsP.get("speed").toString());
        stats[6] = Integer.parseInt(statsP.get("total").toString());
        return stats;

    }

    public String normalizarNombre(String name) {
        String normalizado = name;
        normalizado = normalizado.trim().replace("♀", "f").replace("♂", "m").replace(".", "").replace("'", "").replace(" ", "").toLowerCase();
        return normalizado;
    }

    public JsonArray parseJson() {
        JsonParser parser = new JsonParser();

        JsonArray array = null;
        try {
            array = (JsonArray) parser.parse(new FileReader(new File("resources/pokemon.json").getAbsolutePath()));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonToPokemon.class.getName()).log(Level.SEVERE, null, ex);
        }

        return array;
    }

    public ArrayList<Pokemon> crearPokemon() throws FileNotFoundException {

        JsonParser parser = new JsonParser();
        JsonArray a = (JsonArray) parser.parse(new FileReader(new File("resources/pokemon.json").getAbsolutePath()));
        ArrayList<Pokemon> Pokemans = new ArrayList();
        for (Object o : a) {
            JsonObject poke = (JsonObject) o;
            String nombre = poke.get("name").toString().replace("\"", "");
            String[] tipos = convertStringToArray(poke.get("type").toString());
            String id = (poke.get("id").toString().replace("\"", ""));
            ImageIcon icono = new ImageIcon(new File("resources/pokemons/").getAbsolutePath() + "\\" + normalizarNombre(nombre) + ".jpg");
            String altura = poke.get("height").toString().replace("\"", "");
            String peso = poke.get("weight").toString().replace("\"", "");
            String[] habilidades = convertStringToArray(poke.get("abilities").toString());
            String especie = poke.get("species").toString().replace("\"", "");
            int[] stats = convertStringToArray(poke.get("stats"));
            String[] evolutions = convertStringToArray(poke.get("evolution").toString());
            Pokemans.add(new Pokemon(nombre, tipos, id, icono, altura, peso, habilidades, especie, stats, evolutions));
        }
        return Pokemans;
    }

    public ArrayList<Pokemon> crearPokemon(JsonArray array, int posicion) {
        ArrayList<Pokemon> Pokemans = new ArrayList();
        JsonObject poke = (JsonObject) array.get(posicion);
        String nombre = poke.get("name").toString().replace("\"", "");
        String[] tipos = convertStringToArray(poke.get("type").toString());
        String id = (poke.get("id").toString().replace("\"", ""));
        ImageIcon icono = new ImageIcon(new File("resources/pokemons/").getAbsolutePath() + "\\" + normalizarNombre(nombre) + ".jpg");
        String altura = poke.get("height").toString().replace("\"", "");
        String peso = poke.get("weight").toString().replace("\"", "");
        String[] habilidades = convertStringToArray(poke.get("abilities").toString());
        String especie = poke.get("species").toString().replace("\"", "");
        int[] stats = convertStringToArray(poke.get("stats"));
        String[] evolutions = convertStringToArray(poke.get("evolution").toString());
        Pokemans.add(new Pokemon(nombre, tipos, id, icono, altura, peso, habilidades, especie, stats, evolutions));
        return Pokemans;
    }
}
