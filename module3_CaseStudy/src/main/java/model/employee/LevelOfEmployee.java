package model.employee;

public class LevelOfEmployee {
    private int idLevel;
    private int levelName;

    public LevelOfEmployee(){

    }

    public LevelOfEmployee(int idLevel, int levelName) {
        this.idLevel = idLevel;
        this.levelName = levelName;
    }

    public int getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(int idLevel) {
        this.idLevel = idLevel;
    }

    public int getLevelName() {
        return levelName;
    }

    public void setLevelName(int levelName) {
        this.levelName = levelName;
    }
}
