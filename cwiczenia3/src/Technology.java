public class Technology {
    String technologyName;
    int bonus;
    public Technology(String technologyName, int bonus){
        this.technologyName=technologyName;
        this.bonus=bonus;

    }
    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
