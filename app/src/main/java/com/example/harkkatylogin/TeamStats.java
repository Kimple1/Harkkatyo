package com.example.harkkatylogin;

public class TeamStats {
    private final int games_played;
    private final float xGoalsPercentage,
            corsiPercentage, fenwickPercentage, iceTime, xOnGoalFor, xGoalsFor, xReboundsFor,
            xFreezeFor, xPlayStoppedFor, xPlayContinuedInZoneFor, xPlayContinuedOutsideZoneFor,
            flurryAdjustedxGoalsFor, scoreVenueAdjustedxGoalsFor, flurryScoreVenueAdjustedxGoalsFor,
            shotsOnGoalFor, missedShotsFor, blockedShotAttemptsFor, shotAttemptsFor, goalsFor,
            reboundsFor, reboundGoalsFor, freezeFor, playStoppedFor, playContinuedInZoneFor,
            playContinuedOutsideZoneFor, savedShotsOnGoalFor, savedUnblockedShotAttemptsFor,
            penaltiesFor, penalityMinutesFor, faceOffsWonFor, hitsFor, takeawaysFor, giveawaysFor,
            lowDangerShotsFor, mediumDangerShotsFor, highDangerShotsFor, lowDangerxGoalsFor,
            mediumDangerxGoalsFor, highDangerxGoalsFor, lowDangerGoalsFor, mediumDangerGoalsFor,
            highDangerGoalsFor, scoreAdjustedShotsAttemptsFor, unblockedShotAttemptsFor,
            scoreAdjustedUnblockedShotAttemptsFor, dZoneGiveawaysFor, xGoalsFromxReboundsOfShotsFor,
            xGoalsFromActualReboundsOfShotsFor, reboundxGoalsFor, totalShotCreditFor,
            scoreAdjustedTotalShotCreditFor, scoreFlurryAdjustedTotalShotCreditFor, xOnGoalAgainst,
            xGoalsAgainst, xReboundsAgainst, xFreezeAgainst, xPlayStoppedAgainst, xPlayContinuedInZoneAgainst,
            xPlayContinuedOutsideZoneAgainst, flurryAdjustedxGoalsAgainst, scoreVenueAdjustedxGoalsAgainst,
            flurryScoreVenueAdjustedxGoalsAgainst, shotsOnGoalAgainst, missedShotsAgainst,
            blockedShotAttemptsAgainst, shotAttemptsAgainst, goalsAgainst, reboundsAgainst,
            reboundGoalsAgainst, freezeAgainst, playStoppedAgainst, playContinuedInZoneAgainst,
            playContinuedOutsideZoneAgainst, savedShotsOnGoalAgainst, savedUnblockedShotAttemptsAgainst,
            penaltiesAgainst, penalityMinutesAgainst, faceOffsWonAgainst, hitsAgainst, takeawaysAgainst,
            giveawaysAgainst, lowDangerShotsAgainst, mediumDangerShotsAgainst, highDangerShotsAgainst,
            lowDangerxGoalsAgainst, mediumDangerxGoalsAgainst, highDangerxGoalsAgainst, lowDangerGoalsAgainst,
            mediumDangerGoalsAgainst, highDangerGoalsAgainst, scoreAdjustedShotsAttemptsAgainst,
            unblockedShotAttemptsAgainst, scoreAdjustedUnblockedShotAttemptsAgainst, dZoneGiveawaysAgainst,
            xGoalsFromxReboundsOfShotsAgainst, xGoalsFromActualReboundsOfShotsAgainst, reboundxGoalsAgainst,
            totalShotCreditAgainst, scoreAdjustedTotalShotCreditAgainst, scoreFlurryAdjustedTotalShotCreditAgainst;

    //Constructor
    public TeamStats(int newgames_played, float newxGoalsPercentage, float newcorsiPercentage,
                     float newfenwickPercentage, float newiceTime, float newxOnGoalFor,
                     float newxGoalsFor, float newxReboundsFor, float newxFreezeFor, float newxPlayStoppedFor,
                     float newxPlayContinuedInZoneFor, float newxPlayContinuedOutsideZoneFor,
                     float newflurryAdjustedxGoalsFor, float newscoreVenueAdjustedxGoalsFor,
                     float newflurryScoreVenueAdjustedxGoalsFor, float newshotsOnGoalFor,
                     float newmissedShotsFor, float newblockedShotAttemptsFor,
                     float newshotAttemptsFor, float newgoalsFor, float newreboundsFor,
                     float newreboundGoalsFor, float newfreezeFor, float newplayStoppedFor,
                     float newplayContinuedInZoneFor, float newplayContinuedOutsideZoneFor,
                     float newsavedShotsOnGoalFor, float newsavedUnblockedShotAttemptsFor,
                     float newpenaltiesFor, float newpenalityMinutesFor, float newfaceOffsWonFor,
                     float newhitsFor, float newtakeawaysFor, float newgiveawaysFor,
                     float newlowDangerShotsFor, float newmediumDangerShotsFor,
                     float newhighDangerShotsFor, float newlowDangerxGoalsFor,
                     float newmediumDangerxGoalsFor, float newhighDangerxGoalsFor,
                     float newlowDangerGoalsFor, float newmediumDangerGoalsFor,
                     float newhighDangerGoalsFor, float newscoreAdjustedShotsAttemptsFor,
                     float newunblockedShotAttemptsFor, float newscoreAdjustedUnblockedShotAttemptsFor,
                     float newdZoneGiveawaysFor, float newxGoalsFromxReboundsOfShotsFor,
                     float newxGoalsFromActualReboundsOfShotsFor, float newreboundxGoalsFor,
                     float newtotalShotCreditFor, float newscoreAdjustedTotalShotCreditFor,
                     float newscoreFlurryAdjustedTotalShotCreditFor, float newxOnGoalAgainst,
                     float newxGoalsAgainst, float newxReboundsAgainst, float newxFreezeAgainst,
                     float newxPlayStoppedAgainst, float newxPlayContinuedInZoneAgainst,
                     float newxPlayContinuedOutsideZoneAgainst, float newflurryAdjustedxGoalsAgainst,
                     float newscoreVenueAdjustedxGoalsAgainst, float newflurryScoreVenueAdjustedxGoalsAgainst,
                     float newshotsOnGoalAgainst, float newmissedShotsAgainst, float newblockedShotAttemptsAgainst,
                     float newshotAttemptsAgainst, float newgoalsAgainst, float newreboundsAgainst,
                     float newreboundGoalsAgainst, float newfreezeAgainst, float newplayStoppedAgainst,
                     float newplayContinuedInZoneAgainst, float newplayContinuedOutsideZoneAgainst,
                     float newsavedShotsOnGoalAgainst, float newsavedUnblockedShotAttemptsAgainst,
                     float newpenaltiesAgainst, float newpenalityMinutesAgainst, float newfaceOffsWonAgainst,
                     float newhitsAgainst, float newtakeawaysAgainst, float newgiveawaysAgainst,
                     float newlowDangerShotsAgainst, float newmediumDangerShotsAgainst,
                     float newhighDangerShotsAgainst, float newlowDangerxGoalsAgainst,
                     float newmediumDangerxGoalsAgainst, float newhighDangerxGoalsAgainst,
                     float newlowDangerGoalsAgainst, float newmediumDangerGoalsAgainst,
                     float newhighDangerGoalsAgainst, float newscoreAdjustedShotsAttemptsAgainst,
                     float newunblockedShotAttemptsAgainst, float newscoreAdjustedUnblockedShotAttemptsAgainst,
                     float newdZoneGiveawaysAgainst, float newxGoalsFromxReboundsOfShotsAgainst,
                     float newxGoalsFromActualReboundsOfShotsAgainst, float newreboundxGoalsAgainst,
                     float newtotalShotCreditAgainst, float newscoreAdjustedTotalShotCreditAgainst,
                     float newscoreFlurryAdjustedTotalShotCreditAgainst) {

        games_played = newgames_played;
        xGoalsPercentage = newxGoalsPercentage;
        corsiPercentage = newcorsiPercentage;
        fenwickPercentage = newfenwickPercentage;
        iceTime = newiceTime;
        xOnGoalFor = newxOnGoalFor;
        xGoalsFor = newxGoalsFor;
        xReboundsFor = newxReboundsFor;
        xFreezeFor = newxFreezeFor;
        xPlayStoppedFor = newxPlayStoppedFor;
        xPlayContinuedInZoneFor = newxPlayContinuedInZoneFor;
        xPlayContinuedOutsideZoneFor = newxPlayContinuedOutsideZoneFor;
        flurryAdjustedxGoalsFor = newflurryAdjustedxGoalsFor;
        scoreVenueAdjustedxGoalsFor = newscoreVenueAdjustedxGoalsFor;
        flurryScoreVenueAdjustedxGoalsFor = newflurryScoreVenueAdjustedxGoalsFor;
        shotsOnGoalFor = newshotsOnGoalFor;
        missedShotsFor = newmissedShotsFor;
        blockedShotAttemptsFor = newblockedShotAttemptsFor;
        shotAttemptsFor = newshotAttemptsFor;
        goalsFor = newgoalsFor;
        reboundsFor = newreboundsFor;
        reboundGoalsFor = newreboundGoalsFor;
        freezeFor = newfreezeFor;
        playStoppedFor = newplayStoppedFor;
        playContinuedInZoneFor = newplayContinuedInZoneFor;
        playContinuedOutsideZoneFor = newplayContinuedOutsideZoneFor;
        savedShotsOnGoalFor = newsavedShotsOnGoalFor;
        savedUnblockedShotAttemptsFor = newsavedUnblockedShotAttemptsFor;
        penaltiesFor = newpenaltiesFor;
        penalityMinutesFor = newpenalityMinutesFor;
        faceOffsWonFor = newfaceOffsWonFor;
        hitsFor = newhitsFor;
        takeawaysFor = newtakeawaysFor;
        giveawaysFor = newgiveawaysFor;
        lowDangerShotsFor = newlowDangerShotsFor;
        mediumDangerShotsFor = newmediumDangerShotsFor;
        highDangerShotsFor = newhighDangerShotsFor;
        lowDangerxGoalsFor = newlowDangerxGoalsFor;
        mediumDangerxGoalsFor = newmediumDangerxGoalsFor;
        highDangerxGoalsFor = newhighDangerxGoalsFor;
        lowDangerGoalsFor = newlowDangerGoalsFor;
        mediumDangerGoalsFor = newmediumDangerGoalsFor;
        highDangerGoalsFor = newhighDangerGoalsFor;
        scoreAdjustedShotsAttemptsFor = newscoreAdjustedShotsAttemptsFor;
        unblockedShotAttemptsFor = newunblockedShotAttemptsFor;
        scoreAdjustedUnblockedShotAttemptsFor = newscoreAdjustedUnblockedShotAttemptsFor;
        dZoneGiveawaysFor = newdZoneGiveawaysFor;
        xGoalsFromxReboundsOfShotsFor = newxGoalsFromxReboundsOfShotsFor;
        xGoalsFromActualReboundsOfShotsFor = newxGoalsFromActualReboundsOfShotsFor;
        reboundxGoalsFor = newreboundxGoalsFor;
        totalShotCreditFor = newtotalShotCreditFor;
        scoreAdjustedTotalShotCreditFor = newscoreAdjustedTotalShotCreditFor;
        scoreFlurryAdjustedTotalShotCreditFor = newscoreFlurryAdjustedTotalShotCreditFor;
        xOnGoalAgainst = newxOnGoalAgainst;
        xGoalsAgainst = newxGoalsAgainst;
        xReboundsAgainst = newxReboundsAgainst;
        xFreezeAgainst = newxFreezeAgainst;
        xPlayStoppedAgainst = newxPlayStoppedAgainst;
        xPlayContinuedInZoneAgainst = newxPlayContinuedInZoneAgainst;
        xPlayContinuedOutsideZoneAgainst = newxPlayContinuedOutsideZoneAgainst;
        flurryAdjustedxGoalsAgainst = newflurryAdjustedxGoalsAgainst;
        scoreVenueAdjustedxGoalsAgainst = newscoreVenueAdjustedxGoalsAgainst;
        flurryScoreVenueAdjustedxGoalsAgainst = newflurryScoreVenueAdjustedxGoalsAgainst;
        shotsOnGoalAgainst = newshotsOnGoalAgainst;
        missedShotsAgainst = newmissedShotsAgainst;
        blockedShotAttemptsAgainst = newblockedShotAttemptsAgainst;
        shotAttemptsAgainst = newshotAttemptsAgainst;
        goalsAgainst = newgoalsAgainst;
        reboundsAgainst = newreboundsAgainst;
        reboundGoalsAgainst = newreboundGoalsAgainst;
        freezeAgainst = newfreezeAgainst;
        playStoppedAgainst = newplayStoppedAgainst;
        playContinuedInZoneAgainst = newplayContinuedInZoneAgainst;
        playContinuedOutsideZoneAgainst = newplayContinuedOutsideZoneAgainst;
        savedShotsOnGoalAgainst = newsavedShotsOnGoalAgainst;
        savedUnblockedShotAttemptsAgainst = newsavedUnblockedShotAttemptsAgainst;
        penaltiesAgainst = newpenaltiesAgainst;
        penalityMinutesAgainst = newpenalityMinutesAgainst;
        faceOffsWonAgainst = newfaceOffsWonAgainst;
        hitsAgainst = newhitsAgainst;
        takeawaysAgainst = newtakeawaysAgainst;
        giveawaysAgainst = newgiveawaysAgainst;
        lowDangerShotsAgainst = newlowDangerShotsAgainst;
        mediumDangerShotsAgainst = newmediumDangerShotsAgainst;
        highDangerShotsAgainst = newhighDangerShotsAgainst;
        lowDangerxGoalsAgainst = newlowDangerxGoalsAgainst;
        mediumDangerxGoalsAgainst = newmediumDangerxGoalsAgainst;
        highDangerxGoalsAgainst = newhighDangerxGoalsAgainst;
        lowDangerGoalsAgainst = newlowDangerGoalsAgainst;
        mediumDangerGoalsAgainst = newmediumDangerGoalsAgainst;
        highDangerGoalsAgainst = newhighDangerGoalsAgainst;
        scoreAdjustedShotsAttemptsAgainst = newscoreAdjustedShotsAttemptsAgainst;
        unblockedShotAttemptsAgainst = newunblockedShotAttemptsAgainst;
        scoreAdjustedUnblockedShotAttemptsAgainst = newscoreAdjustedUnblockedShotAttemptsAgainst;
        dZoneGiveawaysAgainst = newdZoneGiveawaysAgainst;
        xGoalsFromxReboundsOfShotsAgainst = newxGoalsFromxReboundsOfShotsAgainst;
        xGoalsFromActualReboundsOfShotsAgainst = newxGoalsFromActualReboundsOfShotsAgainst;
        reboundxGoalsAgainst = newreboundxGoalsAgainst;
        totalShotCreditAgainst = newtotalShotCreditAgainst;
        scoreAdjustedTotalShotCreditAgainst = newscoreAdjustedTotalShotCreditAgainst;
        scoreFlurryAdjustedTotalShotCreditAgainst = newscoreFlurryAdjustedTotalShotCreditAgainst;


    }

    public int getgames_played() {
        return games_played;
    }

    public float getxGoalsPercentage() {
        return xGoalsPercentage;
    }

    public float getcorsiPercentage() {
        return corsiPercentage;
    }

    public float getfenwickPercentage() {
        return fenwickPercentage;
    }

    public float geticeTime() {
        return iceTime;
    }

    public float getxOnGoalFor() {
        return xOnGoalFor;
    }

    public float getxGoalsFor() {
        return xGoalsFor;
    }

    public float getxReboundsFor() {
        return xReboundsFor;
    }

    public float getxFreezeFor() {
        return xFreezeFor;
    }

    public float getxPlayStoppedFor() {
        return xPlayStoppedFor;
    }

    public float getxPlayContinuedInZoneFor() {
        return xPlayContinuedInZoneFor;
    }

    public float getxPlayContinuedOutsideZoneFor() {
        return xPlayContinuedOutsideZoneFor;
    }

    public float getflurryAdjustedxGoalsFor() {
        return flurryAdjustedxGoalsFor;
    }

    public float getscoreVenueAdjustedxGoalsFor() {
        return scoreVenueAdjustedxGoalsFor;
    }

    public float getflurryScoreVenueAdjustedxGoalsFor() {
        return flurryScoreVenueAdjustedxGoalsFor;
    }

    public float getshotsOnGoalFor() {
        return shotsOnGoalFor;
    }

    public float getmissedShotsFor() {
        return missedShotsFor;
    }

    public float getblockedShotAttemptsFor() {
        return blockedShotAttemptsFor;
    }

    public float getshotAttemptsFor() {
        return shotAttemptsFor;
    }

    public float getgoalsFor() {
        return goalsFor;
    }

    public float getreboundsFor() {
        return reboundsFor;
    }

    public float getreboundGoalsFor() {
        return reboundGoalsFor;
    }

    public float getfreezeFor() {
        return freezeFor;
    }

    public float getplayStoppedFor() {
        return playStoppedFor;
    }

    public float getplayContinuedInZoneFor() {
        return playContinuedInZoneFor;
    }

    public float getplayContinuedOutsideZoneFor() {
        return playContinuedOutsideZoneFor;
    }

    public float getsavedShotsOnGoalFor() {
        return savedShotsOnGoalFor;
    }

    public float getsavedUnblockedShotAttemptsFor() {
        return savedUnblockedShotAttemptsFor;
    }

    public float getpenaltiesFor() {
        return penaltiesFor;
    }

    public float getpenalityMinutesFor() {
        return penalityMinutesFor;
    }

    public float getfaceOffsWonFor() {
        return faceOffsWonFor;
    }

    public float gethitsFor() {
        return hitsFor;
    }

    public float gettakeawaysFor() {
        return takeawaysFor;
    }

    public float getgiveawaysFor() {
        return giveawaysFor;
    }

    public float getlowDangerShotsFor() {
        return lowDangerShotsFor;
    }

    public float getmediumDangerShotsFor() {
        return mediumDangerShotsFor;
    }

    public float gethighDangerShotsFor() {
        return highDangerShotsFor;
    }

    public float getlowDangerxGoalsFor() {
        return lowDangerxGoalsFor;
    }

    public float getmediumDangerxGoalsFor() {
        return mediumDangerxGoalsFor;
    }

    public float gethighDangerxGoalsFor() {
        return highDangerxGoalsFor;
    }

    public float getlowDangerGoalsFor() {
        return lowDangerGoalsFor;
    }

    public float getmediumDangerGoalsFor() {
        return mediumDangerGoalsFor;
    }

    public float gethighDangerGoalsFor() {
        return highDangerGoalsFor;
    }

    public float getscoreAdjustedShotsAttemptsFor() {
        return scoreAdjustedShotsAttemptsFor;
    }

    public float getunblockedShotAttemptsFor() {
        return unblockedShotAttemptsFor;
    }

    public float getscoreAdjustedUnblockedShotAttemptsFor() {
        return scoreAdjustedUnblockedShotAttemptsFor;
    }

    public float getdZoneGiveawaysFor() {
        return dZoneGiveawaysFor;
    }

    public float getxGoalsFromxReboundsOfShotsFor() {
        return xGoalsFromxReboundsOfShotsFor;
    }

    public float getxGoalsFromActualReboundsOfShotsFor() {
        return xGoalsFromActualReboundsOfShotsFor;
    }

    public float getreboundxGoalsFor() {
        return reboundxGoalsFor;
    }

    public float gettotalShotCreditFor() {
        return totalShotCreditFor;
    }

    public float getscoreAdjustedTotalShotCreditFor() {
        return scoreAdjustedTotalShotCreditFor;
    }

    public float getscoreFlurryAdjustedTotalShotCreditFor() {
        return scoreFlurryAdjustedTotalShotCreditFor;
    }

    public float getxOnGoalAgainst() {
        return xOnGoalAgainst;
    }

    public float getxGoalsAgainst() {
        return xGoalsAgainst;
    }

    public float getxReboundsAgainst() {
        return xReboundsAgainst;
    }

    public float getxFreezeAgainst() {
        return xFreezeAgainst;
    }

    public float getxPlayStoppedAgainst() {
        return xPlayStoppedAgainst;
    }

    public float getxPlayContinuedInZoneAgainst() {
        return xPlayContinuedInZoneAgainst;
    }

    public float getxPlayContinuedOutsideZoneAgainst() {
        return xPlayContinuedOutsideZoneAgainst;
    }

    public float getflurryAdjustedxGoalsAgainst() {
        return flurryAdjustedxGoalsAgainst;
    }

    public float getscoreVenueAdjustedxGoalsAgainst() {
        return scoreVenueAdjustedxGoalsAgainst;

    }

    public float getlowDangerxGoalsAgainst() {
        return lowDangerxGoalsAgainst;
    }

    public float getmediumDangerxGoalsAgainst() {
        return mediumDangerxGoalsAgainst;
    }

    public float gethighDangerxGoalsAgainst() {
        return highDangerxGoalsAgainst;
    }

    public float getlowDangerGoalsAgainst() {
        return lowDangerGoalsAgainst;
    }

    public float getmediumDangerGoalsAgainst() {
        return mediumDangerGoalsAgainst;
    }

    public float gethighDangerGoalsAgainst() {
        return highDangerGoalsAgainst;
    }

    public float getscoreAdjustedShotsAttemptsAgainst() {
        return scoreAdjustedShotsAttemptsAgainst;
    }

    public float getunblockedShotAttemptsAgainst() {
        return unblockedShotAttemptsAgainst;
    }

    public float getscoreAdjustedUnblockedShotAttemptsAgainst() {
        return scoreAdjustedUnblockedShotAttemptsAgainst;
    }

    public float getdZoneGiveawaysAgainst() {
        return dZoneGiveawaysAgainst;
    }

    public float getxGoalsFromxReboundsOfShotsAgainst() {
        return xGoalsFromxReboundsOfShotsAgainst;
    }

    public float getxGoalsFromActualReboundsOfShotsAgainst() {
        return xGoalsFromActualReboundsOfShotsAgainst;
    }

    public float getreboundxGoalsAgainst() {
        return reboundxGoalsAgainst;
    }

    public float gettotalShotCreditAgainst() {
        return totalShotCreditAgainst;
    }

    public float getscoreAdjustedTotalShotCreditAgainst() {
        return scoreAdjustedTotalShotCreditAgainst;
    }

    public float getscoreFlurryAdjustedTotalShotCreditAgainst() {
        return scoreFlurryAdjustedTotalShotCreditAgainst;
    }

    public float getflurryScoreVenueAdjustedxGoalsAgainst() {
        return flurryScoreVenueAdjustedxGoalsAgainst;
    }

    public float getshotsOnGoalAgainst() {
        return shotsOnGoalAgainst;
    }

    public float getmissedShotsAgainst() {
        return missedShotsAgainst;
    }

    public float getblockedShotAttemptsAgainst() {
        return blockedShotAttemptsAgainst;
    }

    public float getshotAttemptsAgainst() {
        return shotAttemptsAgainst;
    }

    public float getgoalsAgainst() {
        return goalsAgainst;
    }

    public float getreboundsAgainst() {
        return reboundsAgainst;
    }

    public float getreboundGoalsAgainst() {
        return reboundGoalsAgainst;
    }

    public float getfreezeAgainst() {
        return freezeAgainst;
    }

    public float getplayStoppedAgainst() {
        return playStoppedAgainst;
    }

    public float getplayContinuedInZoneAgainst() {
        return playContinuedInZoneAgainst;
    }

    public float getplayContinuedOutsideZoneAgainst() {
        return playContinuedOutsideZoneAgainst;
    }

    public float getsavedShotsOnGoalAgainst() {
        return savedShotsOnGoalAgainst;
    }

    public float getsavedUnblockedShotAttemptsAgainst() {
        return savedUnblockedShotAttemptsAgainst;
    }

    public float getpenaltiesAgainst() {
        return penaltiesAgainst;
    }

    public float getpenalityMinutesAgainst() {
        return penalityMinutesAgainst;
    }

    public float getfaceOffsWonAgainst() {
        return faceOffsWonAgainst;
    }

    public float gethitsAgainst() {
        return hitsAgainst;
    }

    public float gettakeawaysAgainst() {
        return takeawaysAgainst;
    }

    public float getgiveawaysAgainst() {
        return giveawaysAgainst;
    }

    public float getlowDangerShotsAgainst() {
        return lowDangerShotsAgainst;
    }

    public float getmediumDangerShotsAgainst() {
        return mediumDangerShotsAgainst;
    }

    public float gethighDangerShotsAgainst() {
        return highDangerShotsAgainst;
    }


}
