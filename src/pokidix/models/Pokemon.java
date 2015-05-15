
package pokidix.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import java.io.File;
import javax.swing.ImageIcon;

@Generated("org.jsonschema2pojo")
public class Pokemon {

    @Expose
    private String id;
    @Expose
    private String name;
    @Expose
    private String species;
    @Expose
    private List<String> type = new ArrayList<String>();
    @Expose
    private String height;
    @Expose
    private String weight;
    @Expose
    private List<String> abilities = new ArrayList<String>();
    @Expose
    private Stats stats;
    @Expose
    private List<String> evolution = new ArrayList<String>();
    
    private ImageIcon artwork;
    
    public ImageIcon getArtwork() {
        if(artwork == null) {
            artwork = new ImageIcon(new File("resources/pokemons/").getAbsolutePath() + "\\" + normalize(getName()) + ".jpg");
        }
        return artwork;
    }
    
    public String normalize (String string) {
        return string.trim().replace("♀", "f").replace("♂", "m").replace(".", "").replace("'", "").replace(" ", "").toLowerCase();
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Pokemon withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Pokemon withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * 
     * @param species
     *     The species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    public Pokemon withSpecies(String species) {
        this.species = species;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    public List<String> getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(List<String> type) {
        this.type = type;
    }

    public Pokemon withType(List<String> type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The height
     */
    public String getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    public Pokemon withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Pokemon withWeight(String weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 
     * @return
     *     The abilities
     */
    public List<String> getAbilities() {
        return abilities;
    }

    /**
     * 
     * @param abilities
     *     The abilities
     */
    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public Pokemon withAbilities(List<String> abilities) {
        this.abilities = abilities;
        return this;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Pokemon withStats(Stats stats) {
        this.stats = stats;
        return this;
    }

    /**
     * 
     * @return
     *     The evolution
     */
    public List<String> getEvolution() {
        return evolution;
    }

    /**
     * 
     * @param evolution
     *     The evolution
     */
    public void setEvolution(List<String> evolution) {
        this.evolution = evolution;
    }

    public Pokemon withEvolution(List<String> evolution) {
        this.evolution = evolution;
        return this;
    }

    @Override
    public String toString() {
        return getId() + ": " + getName();
    }

   

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pokemon) == false) {
            return false;
        }
        Pokemon rhs = ((Pokemon) other);
        return this.name.equalsIgnoreCase(rhs.getName());
    }

}
