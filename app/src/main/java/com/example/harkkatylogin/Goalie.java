package com.example.harkkatylogin;

public class Goalie {
    private int ID;
    private String fullName;
    private String team;
    private GoalieOtherStats otherStats;
    private GoalieAllStats allStats;
    private Goalie5on5Stats _5_on_5_Stats;
    private Goalie4on5Stats _4_on_5_Stats;
    private Goalie5on4Stats _5_on_4_Stats;

    public Goalie(String s, int newID, String newFullName, String newTeam, String[] otherDataArr,
                  String[] allDataArr, String[] _5_on_5_DataArr, String[] _4_on_5_DataArr,
                  String[] _5_on_4_DataArr){
        ID=newID;
        fullName=newFullName;
        team=newTeam;
        otherStats= new GoalieOtherStats((Integer.parseInt(otherDataArr[6])),Float.parseFloat(otherDataArr[7]),
                Float.parseFloat(otherDataArr[8]),Float.parseFloat(otherDataArr[9]),
                Float.parseFloat(otherDataArr[10]),Float.parseFloat(otherDataArr[11]),
                Float.parseFloat(otherDataArr[12]),Float.parseFloat(otherDataArr[13]),
                Float.parseFloat(otherDataArr[14]),Float.parseFloat(otherDataArr[15]),
                Float.parseFloat(otherDataArr[16]),Float.parseFloat(otherDataArr[17]),
                Float.parseFloat(otherDataArr[18]),Float.parseFloat(otherDataArr[19]),
                Float.parseFloat(otherDataArr[20]),Float.parseFloat(otherDataArr[21]),
                Float.parseFloat(otherDataArr[22]),Float.parseFloat(otherDataArr[23]),
                Float.parseFloat(otherDataArr[24]),Float.parseFloat(otherDataArr[25]),
                Float.parseFloat(otherDataArr[26]),Float.parseFloat(otherDataArr[27]),
                Float.parseFloat(otherDataArr[28]),Float.parseFloat(otherDataArr[29]),
                Float.parseFloat(otherDataArr[30]),Float.parseFloat(otherDataArr[31]),
                Float.parseFloat(otherDataArr[32]),Float.parseFloat(otherDataArr[33]),
                Float.parseFloat(otherDataArr[34]),Float.parseFloat(otherDataArr[35]));

        allStats=new GoalieAllStats(Integer.parseInt(allDataArr[6]),
                Float.parseFloat(allDataArr[7]),Float.parseFloat(allDataArr[8]),Float.parseFloat(allDataArr[9]),
                Float.parseFloat(allDataArr[10]),Float.parseFloat(allDataArr[11]),Float.parseFloat(allDataArr[12]),
                Float.parseFloat(allDataArr[13]),Float.parseFloat(allDataArr[14]),Float.parseFloat(allDataArr[15]),
                Float.parseFloat(allDataArr[16]),Float.parseFloat(allDataArr[17]),Float.parseFloat(allDataArr[18]),
                Float.parseFloat(allDataArr[19]),Float.parseFloat(allDataArr[20]),Float.parseFloat(allDataArr[21]),
                Float.parseFloat(allDataArr[22]),Float.parseFloat(allDataArr[23]),Float.parseFloat(allDataArr[24]),
                Float.parseFloat(allDataArr[25]),Float.parseFloat(allDataArr[26]),Float.parseFloat(allDataArr[27]),
                Float.parseFloat(allDataArr[28]),Float.parseFloat(allDataArr[29]),Float.parseFloat(allDataArr[30]),
                Float.parseFloat(allDataArr[31]),Float.parseFloat(allDataArr[32]),Float.parseFloat(allDataArr[33]),
                Float.parseFloat(allDataArr[34]),Float.parseFloat(allDataArr[35]));

        _5_on_5_Stats=new Goalie5on5Stats(Integer.parseInt(_5_on_5_DataArr[6]),Float.parseFloat(_5_on_5_DataArr[7]),
                Float.parseFloat(_5_on_5_DataArr[8]),Float.parseFloat(_5_on_5_DataArr[9]),
                Float.parseFloat(_5_on_5_DataArr[10]),Float.parseFloat(_5_on_5_DataArr[11]),
                Float.parseFloat(_5_on_5_DataArr[12]),Float.parseFloat(_5_on_5_DataArr[13]),
                Float.parseFloat(_5_on_5_DataArr[14]),Float.parseFloat(_5_on_5_DataArr[15]),
                Float.parseFloat(_5_on_5_DataArr[16]),Float.parseFloat(_5_on_5_DataArr[17]),
                Float.parseFloat(_5_on_5_DataArr[18]),Float.parseFloat(_5_on_5_DataArr[19]),
                Float.parseFloat(_5_on_5_DataArr[20]),Float.parseFloat(_5_on_5_DataArr[21]),
                Float.parseFloat(_5_on_5_DataArr[22]),Float.parseFloat(_5_on_5_DataArr[23]),
                Float.parseFloat(_5_on_5_DataArr[24]),Float.parseFloat(_5_on_5_DataArr[25]),
                Float.parseFloat(_5_on_5_DataArr[26]),Float.parseFloat(_5_on_5_DataArr[27]),
                Float.parseFloat(_5_on_5_DataArr[28]),Float.parseFloat(_5_on_5_DataArr[29]),
                Float.parseFloat(_5_on_5_DataArr[30]),Float.parseFloat(_5_on_5_DataArr[31]),
                Float.parseFloat(_5_on_5_DataArr[32]),Float.parseFloat(_5_on_5_DataArr[33]),
                Float.parseFloat(_5_on_5_DataArr[34]),Float.parseFloat(_5_on_5_DataArr[35]));

        _4_on_5_Stats=new Goalie4on5Stats(Integer.parseInt(_4_on_5_DataArr[6]),Float.parseFloat(_4_on_5_DataArr[7]),
                Float.parseFloat(_4_on_5_DataArr[8]),Float.parseFloat(_4_on_5_DataArr[9]),
                Float.parseFloat(_4_on_5_DataArr[10]),Float.parseFloat(_4_on_5_DataArr[11]),
                Float.parseFloat(_4_on_5_DataArr[12]),Float.parseFloat(_4_on_5_DataArr[13]),
                Float.parseFloat(_4_on_5_DataArr[14]),Float.parseFloat(_4_on_5_DataArr[15]),
                Float.parseFloat(_4_on_5_DataArr[16]),Float.parseFloat(_4_on_5_DataArr[17]),
                Float.parseFloat(_4_on_5_DataArr[18]),Float.parseFloat(_4_on_5_DataArr[19]),
                Float.parseFloat(_4_on_5_DataArr[20]),Float.parseFloat(_4_on_5_DataArr[21]),
                Float.parseFloat(_4_on_5_DataArr[22]),Float.parseFloat(_4_on_5_DataArr[23]),
                Float.parseFloat(_4_on_5_DataArr[24]),Float.parseFloat(_4_on_5_DataArr[25]),
                Float.parseFloat(_4_on_5_DataArr[26]),Float.parseFloat(_4_on_5_DataArr[27]),
                Float.parseFloat(_4_on_5_DataArr[28]),Float.parseFloat(_4_on_5_DataArr[29]),
                Float.parseFloat(_4_on_5_DataArr[30]),Float.parseFloat(_4_on_5_DataArr[31]),
                Float.parseFloat(_4_on_5_DataArr[32]),Float.parseFloat(_4_on_5_DataArr[33]),
                Float.parseFloat(_4_on_5_DataArr[34]),Float.parseFloat(_4_on_5_DataArr[35]));

        _5_on_4_Stats = new Goalie5on4Stats(Integer.parseInt(_5_on_4_DataArr[6]),Float.parseFloat(_5_on_4_DataArr[7]),
                Float.parseFloat(_5_on_4_DataArr[8]),Float.parseFloat(_5_on_4_DataArr[9]),
                Float.parseFloat(_5_on_4_DataArr[10]),Float.parseFloat(_5_on_4_DataArr[11]),
                Float.parseFloat(_5_on_4_DataArr[12]),Float.parseFloat(_5_on_4_DataArr[13]),
                Float.parseFloat(_5_on_4_DataArr[14]),Float.parseFloat(_5_on_4_DataArr[15]),
                Float.parseFloat(_5_on_4_DataArr[16]),Float.parseFloat(_5_on_4_DataArr[17]),
                Float.parseFloat(_5_on_4_DataArr[18]),Float.parseFloat(_5_on_4_DataArr[19]),
                Float.parseFloat(_5_on_4_DataArr[20]),Float.parseFloat(_5_on_4_DataArr[21]),
                Float.parseFloat(_5_on_4_DataArr[22]),Float.parseFloat(_5_on_4_DataArr[23]),
                Float.parseFloat(_5_on_4_DataArr[24]),Float.parseFloat(_5_on_4_DataArr[25]),
                Float.parseFloat(_5_on_4_DataArr[26]),Float.parseFloat(_5_on_4_DataArr[27]),
                Float.parseFloat(_5_on_4_DataArr[28]),Float.parseFloat(_5_on_4_DataArr[29]),
                Float.parseFloat(_5_on_4_DataArr[30]),Float.parseFloat(_5_on_4_DataArr[31]),
                Float.parseFloat(_5_on_4_DataArr[32]),Float.parseFloat(_5_on_4_DataArr[33]),
                Float.parseFloat(_5_on_4_DataArr[34]),Float.parseFloat(_5_on_4_DataArr[35]));




    }
    public String getFullName(){
        return this.fullName;
    }
    public int getID(){
        return this.ID;
    }

    public String getTeam(){
        return this.team;
    }
    public GoalieOtherStats getOtherStats() {
        return this.otherStats;
    }

    public GoalieAllStats getAllStats() {
        return this.allStats;
    }

    public Goalie5on5Stats get_5_on_5_Stats() {
        return this._5_on_5_Stats;
    }

    public Goalie4on5Stats get_4_on_5_Stats() {
        return this._4_on_5_Stats;
    }

    public Goalie5on4Stats get_5_on_4_Stats() {
        return this._5_on_4_Stats;
    }
}