
package pokidix.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Stats {

    @Expose
    private int hp;
    @Expose
    private int attack;
    @Expose
    private int defense;
    @SerializedName("sp.atk")
    @Expose
    private int spAtk;
    @SerializedName("sp.def")
    @Expose
    private int spDef;
    @Expose
    private int speed;
    @Expose
    private int total;

    /**
     * 
     * @return
     *     The hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * 
     * @param hp
     *     The hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    public Stats withHp(int hp) {
        this.hp = hp;
        return this;
    }

    /**
     * 
     * @return
     *     The attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     * 
     * @param attack
     *     The attack
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Stats withAttack(int attack) {
        this.attack = attack;
        return this;
    }

    /**
     * 
     * @return
     *     The defense
     */
    public int getDefense() {
        return defense;
    }

    /**
     * 
     * @param defense
     *     The defense
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Stats withDefense(int defense) {
        this.defense = defense;
        return this;
    }

    /**
     * 
     * @return
     *     The spAtk
     */
    public int getSpAtk() {
        return spAtk;
    }

    /**
     * 
     * @param spAtk
     *     The sp.atk
     */
    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public Stats withSpAtk(int spAtk) {
        this.spAtk = spAtk;
        return this;
    }

    /**
     * 
     * @return
     *     The spDef
     */
    public int getSpDef() {
        return spDef;
    }

    /**
     * 
     * @param spDef
     *     The sp.def
     */
    public void setSpDef(int spDef) {
        this.spDef = spDef;
    }

    public Stats withSpDef(int spDef) {
        this.spDef = spDef;
        return this;
    }

    /**
     * 
     * @return
     *     The speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed
     *     The speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Stats withSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 
     * @return
     *     The total
     */
    public int getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    public Stats withTotal(int total) {
        this.total = total;
        return this;
    }

}
