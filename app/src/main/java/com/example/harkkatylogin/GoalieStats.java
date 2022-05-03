package com.example.harkkatylogin;

public class GoalieStats {
    private final int games_played;
    private final float icetime, xGoals, goals, unblocked_shot_attempts, xRebounds, rebounds, xFreeze, freeze, xOnGoal, ongoal,
            xPlayStopped, playStopped, xPlayContinuedInZone, playContinuedInZone, xPlayContinuedOutsideZone,
            playContinuedOutsideZone, flurryAdjustedxGoals, lowDangerShots, mediumDangerShots, highDangerShots,
            lowDangerxGoals, mediumDangerxGoals, highDangerxGoals, lowDangerGoals, mediumDangerGoals, highDangerGoals,
            blocked_shot_attempts, penalityMinutes, penalties;

    public GoalieStats(int newgames_played, float newicetime, float newxGoals, float newgoals,
                       float newunblocked_shot_attempts, float newxRebounds, float newrebounds,
                       float newxFreeze, float newfreeze, float newxOnGoal, float newongoal,
                       float newxPlayStopped, float newplayStopped, float newxPlayContinuedInZone,
                       float newplayContinuedInZone, float newxPlayContinuedOutsideZone,
                       float newplayContinuedOutsideZone, float newflurryAdjustedxGoals,
                       float newlowDangerShots, float newmediumDangerShots, float newhighDangerShots,
                       float newlowDangerxGoals, float newmediumDangerxGoals, float newhighDangerxGoals,
                       float newlowDangerGoals, float newmediumDangerGoals, float newhighDangerGoals,
                       float newblocked_shot_attempts, float newpenalityMinutes, float newpenalties) {
        games_played = newgames_played;
        icetime = newicetime;
        xGoals = newxGoals;
        goals = newgoals;
        unblocked_shot_attempts = newunblocked_shot_attempts;
        xRebounds = newxRebounds;
        rebounds = newrebounds;
        xFreeze = newxFreeze;
        freeze = newfreeze;
        xOnGoal = newxOnGoal;
        ongoal = newongoal;
        xPlayStopped = newxPlayStopped;
        playStopped = newplayStopped;
        xPlayContinuedInZone = newxPlayContinuedInZone;
        playContinuedInZone = newplayContinuedInZone;
        xPlayContinuedOutsideZone = newxPlayContinuedOutsideZone;
        playContinuedOutsideZone = newplayContinuedOutsideZone;
        flurryAdjustedxGoals = newflurryAdjustedxGoals;
        lowDangerShots = newlowDangerShots;
        mediumDangerShots = newmediumDangerShots;
        highDangerShots = newhighDangerShots;
        lowDangerxGoals = newlowDangerxGoals;
        mediumDangerxGoals = newmediumDangerxGoals;
        highDangerxGoals = newhighDangerxGoals;
        lowDangerGoals = newlowDangerGoals;
        mediumDangerGoals = newmediumDangerGoals;
        highDangerGoals = newhighDangerGoals;
        blocked_shot_attempts = newblocked_shot_attempts;
        penalityMinutes = newpenalityMinutes;
        penalties = newpenalties;
    }

    public int getGames_played() {
        return games_played;
    }

    public float getxGoals(){
        return xGoals;
    }

    public float geticetime(){
        return icetime;
    }

    public float getgoals() {
        return goals;
    }

    public float getunblocked_shot_attempts() {
        return unblocked_shot_attempts;
    }

    public float getxRebounds() {
        return xRebounds;
    }

    public float getrebounds() {
        return rebounds;
    }

    public float getxFreeze() {
        return xFreeze;
    }

    public float getfreeze() {
        return freeze;
    }

    public float getxOnGoal() {
        return xOnGoal;
    }

    public float getongoal() {
        return ongoal;
    }

    public float getxPlayStopped() {
        return xPlayStopped;
    }

    public float getplayStopped() {
        return playStopped;
    }

    public float getxPlayContinuedInZone() {
        return xPlayContinuedInZone;
    }

    public float getplayContinuedInZone() {
        return playContinuedInZone;
    }

    public float getxPlayContinuedOutsideZone() {
        return xPlayContinuedOutsideZone;
    }

    public float getplayContinuedOutsideZone() {
        return playContinuedOutsideZone;
    }

    public float getflurryAdjustedxGoals() {
        return flurryAdjustedxGoals;
    }

    public float getlowDangerShots() {
        return lowDangerShots;
    }

    public float getmediumDangerShots() {
        return mediumDangerShots;
    }

    public float gethighDangerShots() {
        return highDangerShots;
    }

    public float getlowDangerxGoals() {
        return lowDangerxGoals;
    }

    public float getmediumDangerxGoals() {
        return mediumDangerxGoals;
    }

    public float gethighDangerxGoals() {
        return highDangerxGoals;
    }

    public float getlowDangerGoals() {
        return lowDangerGoals;
    }

    public float getmediumDangerGoals() {
        return mediumDangerGoals;
    }

    public float gethighDangerGoals() {
        return highDangerGoals;
    }

    public float getblocked_shot_attempts() {
        return blocked_shot_attempts;
    }

    public float getpenalityMinutes() {
        return penalityMinutes;
    }

    public float getpenalties() {
        return penalties;
    }
}
