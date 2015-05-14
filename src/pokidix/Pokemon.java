/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokidix;

import javax.swing.ImageIcon;

/**
 *
 * @author TOSHIBA
 */
public class Pokemon {

    private final String name;
    private final String[] types;
    private final String id;
    private final ImageIcon artwork;
    private final String height;
    private final String weight;
    private final String[] abilities;
    private final String species;
    private final int[] stats;
    private final String[] evolutions;

    public Pokemon(String name, String[] types, String id, ImageIcon artwork, String height, String weight, String[] abilities, String species, int[] stats, String[] evolutions) {
        this.name = name;
        this.types = types;
        this.id = id;
        this.artwork = artwork;
        this.height = height;
        this.weight = weight;
        this.abilities = abilities;
        this.species = species;
        this.stats = stats;
        this.evolutions = evolutions;
    }

    public String[] getEvolutions() {
        return evolutions;
    }

    public int[] getStats() {
        return stats;
    }

    
    
    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public String[] getTypes() {
        return types;
    }

    public String getId() {
        return id;
    }

    public ImageIcon getArtwork() {
        return artwork;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String[] getAbilities() {
        return abilities;
    }

}
