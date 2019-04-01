package sia.knights;

public class BraveKnight implements Knight{

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
//定义了一个勇敢的骑士，实现了骑士的接口
//定义了一个探险的任务
