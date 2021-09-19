package project.team.domain;

public class PC implements Equipment{

    private String model;// 机器型号
    private String display;// 显示器名称

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
