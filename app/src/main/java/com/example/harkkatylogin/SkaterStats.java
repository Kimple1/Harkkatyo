package com.example.harkkatylogin;

public class SkaterStats {
    private final int games_played;
    private final float icetime, shifts, gameScore, onIce_xGoalsPercentage, offIce_xGoalsPercentage, onIce_corsiPercentage,
            offIce_corsiPercentage, onIce_fenwickPercentage, offIce_fenwickPercentage, iceTimeRank,
            I_F_xOnGoal, I_F_xGoals, I_F_xRebounds, I_F_xFreeze, I_F_xPlayStopped, I_F_xPlayContinuedInZone,
            I_F_xPlayContinuedOutsideZone, I_F_flurryAdjustedxGoals, I_F_scoreVenueAdjustedxGoals,
            I_F_flurryScoreVenueAdjustedxGoals, I_F_primaryAssists, I_F_secondaryAssists, I_F_shotsOnGoal,
            I_F_missedShots, I_F_blockedShotAttempts, I_F_shotAttempts, I_F_points, I_F_goals, I_F_rebounds,
            I_F_reboundGoals, I_F_freeze, I_F_playStopped, I_F_playContinuedInZone, I_F_playContinuedOutsideZone,
            I_F_savedShotsOnGoal, I_F_savedUnblockedShotAttempts, penalties, I_F_penalityMinutes, I_F_faceOffsWon,
            I_F_hits, I_F_takeaways, I_F_giveaways, I_F_lowDangerShots, I_F_mediumDangerShots, I_F_highDangerShots,
            I_F_lowDangerxGoals, I_F_mediumDangerxGoals, I_F_highDangerxGoals, I_F_lowDangerGoals,
            I_F_mediumDangerGoals, I_F_highDangerGoals, I_F_scoreAdjustedShotsAttempts, I_F_unblockedShotAttempts,
            I_F_scoreAdjustedUnblockedShotAttempts, I_F_dZoneGiveaways, I_F_xGoalsFromxReboundsOfShots,
            I_F_xGoalsFromActualReboundsOfShots, I_F_reboundxGoals, I_F_xGoals_with_earned_rebounds,
            I_F_xGoals_with_earned_rebounds_scoreAdjusted, I_F_xGoals_with_earned_rebounds_scoreFlurryAdjusted,
            I_F_shifts, I_F_oZoneShiftStarts, I_F_dZoneShiftStarts, I_F_neutralZoneShiftStarts, I_F_flyShiftStarts,
            I_F_oZoneShiftEnds, I_F_dZoneShiftEnds, I_F_neutralZoneShiftEnds, I_F_flyShiftEnds, faceoffsWon,
            faceoffsLost, timeOnBench, penalityMinutes, penalityMinutesDrawn, penaltiesDrawn, shotsBlockedByPlayer,
            OnIce_F_xOnGoal, OnIce_F_xGoals, OnIce_F_flurryAdjustedxGoals, OnIce_F_scoreVenueAdjustedxGoals,
            OnIce_F_flurryScoreVenueAdjustedxGoals, OnIce_F_shotsOnGoal, OnIce_F_missedShots,
            OnIce_F_blockedShotAttempts, OnIce_F_shotAttempts, OnIce_F_goals, OnIce_F_rebounds,
            OnIce_F_reboundGoals, OnIce_F_lowDangerShots, OnIce_F_mediumDangerShots,
            OnIce_F_highDangerShots, OnIce_F_lowDangerxGoals, OnIce_F_mediumDangerxGoals,
            OnIce_F_highDangerxGoals, OnIce_F_lowDangerGoals, OnIce_F_mediumDangerGoals,
            OnIce_F_highDangerGoals, OnIce_F_scoreAdjustedShotsAttempts,
            OnIce_F_unblockedShotAttempts, OnIce_F_scoreAdjustedUnblockedShotAttempts,
            OnIce_F_xGoalsFromxReboundsOfShots, OnIce_F_xGoalsFromActualReboundsOfShots,
            OnIce_F_reboundxGoals, OnIce_F_xGoals_with_earned_rebounds,
            OnIce_F_xGoals_with_earned_rebounds_scoreAdjusted, OnIce_F_xGoals_with_earned_rebounds_scoreFlurryAdjusted,
            OnIce_A_xOnGoal, OnIce_A_xGoals, OnIce_A_flurryAdjustedxGoals,
            OnIce_A_scoreVenueAdjustedxGoals, OnIce_A_flurryScoreVenueAdjustedxGoals,
            OnIce_A_shotsOnGoal, OnIce_A_missedShots, OnIce_A_blockedShotAttempts,
            OnIce_A_shotAttempts, OnIce_A_goals, OnIce_A_rebounds, OnIce_A_reboundGoals, OnIce_A_lowDangerShots,
            OnIce_A_mediumDangerShots, OnIce_A_highDangerShots, OnIce_A_lowDangerxGoals,
            OnIce_A_mediumDangerxGoals, OnIce_A_highDangerxGoals, OnIce_A_lowDangerGoals,
            OnIce_A_mediumDangerGoals, OnIce_A_highDangerGoals, OnIce_A_scoreAdjustedShotsAttempts,
            OnIce_A_unblockedShotAttempts, OnIce_A_scoreAdjustedUnblockedShotAttempts,
            OnIce_A_xGoalsFromxReboundsOfShots, OnIce_A_xGoalsFromActualReboundsOfShots,
            OnIce_A_reboundxGoals, OnIce_A_xGoals_with_earned_rebounds, OnIce_A_xGoals_with_earned_rebounds_scoreAdjusted,
            OnIce_A_xGoals_with_earned_rebounds_scoreFlurryAdjusted, OffIce_F_xGoals,
            OffIce_A_xGoals, OffIce_F_shotAttempts, OffIce_A_shotAttempts, xGoalsForAfterShifts,
            xGoalsAgainstAfterShifts, corsiForAfterShifts, corsiAgainstAfterShifts, fenwickForAfterShifts,
            fenwickAgainstAfterShifts;

    //Constructor for stats :D
    public SkaterStats(int newgames_played, float newicetime, float newshifts, float newgameScore,
                       float newonIce_xGoalsPercentage, float newoffIce_xGoalsPercentage,
                       float newonIce_corsiPercentage, float newoffIce_corsiPercentage,
                       float newonIce_fenwickPercentage, float newoffIce_fenwickPercentage,
                       float newiceTimeRank, float newI_F_xOnGoal, float newI_F_xGoals,
                       float newI_F_xRebounds, float newI_F_xFreeze, float newI_F_xPlayStopped,
                       float newI_F_xPlayContinuedInZone, float newI_F_xPlayContinuedOutsideZone,
                       float newI_F_flurryAdjustedxGoals, float newI_F_scoreVenueAdjustedxGoals,
                       float newI_F_flurryScoreVenueAdjustedxGoals, float newI_F_primaryAssists,
                       float newI_F_secondaryAssists, float newI_F_shotsOnGoal, float newI_F_missedShots,
                       float newI_F_blockedShotAttempts, float newI_F_shotAttempts, float newI_F_points,
                       float newI_F_goals, float newI_F_rebounds, float newI_F_reboundGoals,
                       float newI_F_freeze, float newI_F_playStopped, float newI_F_playContinuedInZone,
                       float newI_F_playContinuedOutsideZone, float newI_F_savedShotsOnGoal,
                       float newI_F_savedUnblockedShotAttempts, float newpenalties,
                       float newI_F_penalityMinutes, float newI_F_faceOffsWon, float newI_F_hits,
                       float newI_F_takeaways, float newI_F_giveaways, float newI_F_lowDangerShots,
                       float newI_F_mediumDangerShots, float newI_F_highDangerShots, float newI_F_lowDangerxGoals,
                       float newI_F_mediumDangerxGoals, float newI_F_highDangerxGoals, float newI_F_lowDangerGoals,
                       float newI_F_mediumDangerGoals, float newI_F_highDangerGoals, float newI_F_scoreAdjustedShotsAttempts,
                       float newI_F_unblockedShotAttempts, float newI_F_scoreAdjustedUnblockedShotAttempts,
                       float newI_F_dZoneGiveaways, float newI_F_xGoalsFromxReboundsOfShots,
                       float newI_F_xGoalsFromActualReboundsOfShots, float newI_F_reboundxGoals,
                       float newI_F_xGoals_with_earned_rebounds, float newI_F_xGoals_with_earned_rebounds_scoreAdjusted,
                       float newI_F_xGoals_with_earned_rebounds_scoreFlurryAdjusted, float newI_F_shifts,
                       float newI_F_oZoneShiftStarts, float newI_F_dZoneShiftStarts, float newI_F_neutralZoneShiftStarts,
                       float newI_F_flyShiftStarts, float newI_F_oZoneShiftEnds, float newI_F_dZoneShiftEnds,
                       float newI_F_neutralZoneShiftEnds, float newI_F_flyShiftEnds, float newfaceoffsWon,
                       float newfaceoffsLost, float newtimeOnBench, float newpenalityMinutes, float newpenalityMinutesDrawn,
                       float newpenaltiesDrawn, float newshotsBlockedByPlayer, float newOnIce_F_xOnGoal,
                       float newOnIce_F_xGoals, float newOnIce_F_flurryAdjustedxGoals, float newOnIce_F_scoreVenueAdjustedxGoals,
                       float newOnIce_F_flurryScoreVenueAdjustedxGoals, float newOnIce_F_shotsOnGoal, float newOnIce_F_missedShots,
                       float newOnIce_F_blockedShotAttempts, float newOnIce_F_shotAttempts, float newOnIce_F_goals,
                       float newOnIce_F_rebounds, float newOnIce_F_reboundGoals, float newOnIce_F_lowDangerShots,
                       float newOnIce_F_mediumDangerShots, float newOnIce_F_highDangerShots, float newOnIce_F_lowDangerxGoals,
                       float newOnIce_F_mediumDangerxGoals, float newOnIce_F_highDangerxGoals, float newOnIce_F_lowDangerGoals,
                       float newOnIce_F_mediumDangerGoals, float newOnIce_F_highDangerGoals, float newOnIce_F_scoreAdjustedShotsAttempts,
                       float newOnIce_F_unblockedShotAttempts, float newOnIce_F_scoreAdjustedUnblockedShotAttempts,
                       float newOnIce_F_xGoalsFromxReboundsOfShots, float newOnIce_F_xGoalsFromActualReboundsOfShots,
                       float newOnIce_F_reboundxGoals, float newOnIce_F_xGoals_with_earned_rebounds,
                       float newOnIce_F_xGoals_with_earned_rebounds_scoreAdjusted, float newOnIce_F_xGoals_with_earned_rebounds_scoreFlurryAdjusted,
                       float newOnIce_A_xOnGoal, float newOnIce_A_xGoals, float newOnIce_A_flurryAdjustedxGoals,
                       float newOnIce_A_scoreVenueAdjustedxGoals, float newOnIce_A_flurryScoreVenueAdjustedxGoals,
                       float newOnIce_A_shotsOnGoal, float newOnIce_A_missedShots, float newOnIce_A_blockedShotAttempts,
                       float newOnIce_A_shotAttempts, float newOnIce_A_goals, float newOnIce_A_rebounds,
                       float newOnIce_A_reboundGoals, float newOnIce_A_lowDangerShots, float newOnIce_A_mediumDangerShots,
                       float newOnIce_A_highDangerShots, float newOnIce_A_lowDangerxGoals, float newOnIce_A_mediumDangerxGoals,
                       float newOnIce_A_highDangerxGoals, float newOnIce_A_lowDangerGoals, float newOnIce_A_mediumDangerGoals,
                       float newOnIce_A_highDangerGoals, float newOnIce_A_scoreAdjustedShotsAttempts,
                       float newOnIce_A_unblockedShotAttempts, float newOnIce_A_scoreAdjustedUnblockedShotAttempts,
                       float newOnIce_A_xGoalsFromxReboundsOfShots, float newOnIce_A_xGoalsFromActualReboundsOfShots,
                       float newOnIce_A_reboundxGoals, float newOnIce_A_xGoals_with_earned_rebounds,
                       float newOnIce_A_xGoals_with_earned_rebounds_scoreAdjusted, float newOnIce_A_xGoals_with_earned_rebounds_scoreFlurryAdjusted,
                       float newOffIce_F_xGoals, float newOffIce_A_xGoals, float newOffIce_F_shotAttempts,
                       float newOffIce_A_shotAttempts, float newxGoalsForAfterShifts, float newxGoalsAgainstAfterShifts,
                       float newcorsiForAfterShifts, float newcorsiAgainstAfterShifts, float newfenwickForAfterShifts,
                       float newfenwickAgainstAfterShifts) {
        games_played = newgames_played;
        icetime = newicetime;
        shifts = newshifts;
        gameScore = newgameScore;
        onIce_xGoalsPercentage = newonIce_xGoalsPercentage;
        offIce_xGoalsPercentage = newoffIce_xGoalsPercentage;
        onIce_corsiPercentage = newonIce_corsiPercentage;
        offIce_corsiPercentage = newoffIce_corsiPercentage;
        onIce_fenwickPercentage = newonIce_fenwickPercentage;
        offIce_fenwickPercentage = newoffIce_fenwickPercentage;
        iceTimeRank = newiceTimeRank;
        I_F_xOnGoal = newI_F_xOnGoal;
        I_F_xGoals = newI_F_xGoals;
        I_F_xRebounds = newI_F_xRebounds;
        I_F_xFreeze = newI_F_xFreeze;
        I_F_xPlayStopped = newI_F_xPlayStopped;
        I_F_xPlayContinuedInZone = newI_F_xPlayContinuedInZone;
        I_F_xPlayContinuedOutsideZone = newI_F_xPlayContinuedOutsideZone;
        I_F_flurryAdjustedxGoals = newI_F_flurryAdjustedxGoals;
        I_F_scoreVenueAdjustedxGoals = newI_F_scoreVenueAdjustedxGoals;
        I_F_flurryScoreVenueAdjustedxGoals = newI_F_flurryScoreVenueAdjustedxGoals;
        I_F_primaryAssists = newI_F_primaryAssists;
        I_F_secondaryAssists = newI_F_secondaryAssists;
        I_F_shotsOnGoal = newI_F_shotsOnGoal;
        I_F_missedShots = newI_F_missedShots;
        I_F_blockedShotAttempts = newI_F_blockedShotAttempts;
        I_F_shotAttempts = newI_F_shotAttempts;
        I_F_points = newI_F_points;
        I_F_goals = newI_F_goals;
        I_F_rebounds = newI_F_rebounds;
        I_F_reboundGoals = newI_F_reboundGoals;
        I_F_freeze = newI_F_freeze;
        I_F_playStopped = newI_F_playStopped;
        I_F_playContinuedInZone = newI_F_playContinuedInZone;
        I_F_playContinuedOutsideZone = newI_F_playContinuedOutsideZone;
        I_F_savedShotsOnGoal = newI_F_savedShotsOnGoal;
        I_F_savedUnblockedShotAttempts = newI_F_savedUnblockedShotAttempts;
        penalties = newpenalties;
        I_F_penalityMinutes = newI_F_penalityMinutes;
        I_F_faceOffsWon = newI_F_faceOffsWon;
        I_F_hits = newI_F_hits;
        I_F_takeaways = newI_F_takeaways;
        I_F_giveaways = newI_F_giveaways;
        I_F_lowDangerShots = newI_F_lowDangerShots;
        I_F_mediumDangerShots = newI_F_mediumDangerShots;
        I_F_highDangerShots = newI_F_highDangerShots;
        I_F_lowDangerxGoals = newI_F_lowDangerxGoals;
        I_F_mediumDangerxGoals = newI_F_mediumDangerxGoals;
        I_F_highDangerxGoals = newI_F_highDangerxGoals;
        I_F_lowDangerGoals = newI_F_lowDangerGoals;
        I_F_mediumDangerGoals = newI_F_mediumDangerGoals;
        I_F_highDangerGoals = newI_F_highDangerGoals;
        I_F_scoreAdjustedShotsAttempts = newI_F_scoreAdjustedShotsAttempts;
        I_F_unblockedShotAttempts = newI_F_unblockedShotAttempts;
        I_F_scoreAdjustedUnblockedShotAttempts = newI_F_scoreAdjustedUnblockedShotAttempts;
        I_F_dZoneGiveaways = newI_F_dZoneGiveaways;
        I_F_xGoalsFromxReboundsOfShots = newI_F_xGoalsFromxReboundsOfShots;
        I_F_xGoalsFromActualReboundsOfShots = newI_F_xGoalsFromActualReboundsOfShots;
        I_F_reboundxGoals = newI_F_reboundxGoals;
        I_F_xGoals_with_earned_rebounds = newI_F_xGoals_with_earned_rebounds;
        I_F_xGoals_with_earned_rebounds_scoreAdjusted = newI_F_xGoals_with_earned_rebounds_scoreAdjusted;
        I_F_xGoals_with_earned_rebounds_scoreFlurryAdjusted = newI_F_xGoals_with_earned_rebounds_scoreFlurryAdjusted;
        I_F_shifts = newI_F_shifts;
        I_F_oZoneShiftStarts = newI_F_oZoneShiftStarts;
        I_F_dZoneShiftStarts = newI_F_dZoneShiftStarts;
        I_F_neutralZoneShiftStarts = newI_F_neutralZoneShiftStarts;
        I_F_flyShiftStarts = newI_F_flyShiftStarts;
        I_F_oZoneShiftEnds = newI_F_oZoneShiftEnds;
        I_F_dZoneShiftEnds = newI_F_dZoneShiftEnds;
        I_F_neutralZoneShiftEnds = newI_F_neutralZoneShiftEnds;
        I_F_flyShiftEnds = newI_F_flyShiftEnds;
        faceoffsWon = newfaceoffsWon;
        faceoffsLost = newfaceoffsLost;
        timeOnBench = newtimeOnBench;
        penalityMinutes = newpenalityMinutes;
        penalityMinutesDrawn = newpenalityMinutesDrawn;
        penaltiesDrawn = newpenaltiesDrawn;
        shotsBlockedByPlayer = newshotsBlockedByPlayer;
        OnIce_F_xOnGoal = newOnIce_F_xOnGoal;
        OnIce_F_xGoals = newOnIce_F_xGoals;
        OnIce_F_flurryAdjustedxGoals = newOnIce_F_flurryAdjustedxGoals;
        OnIce_F_scoreVenueAdjustedxGoals = newOnIce_F_scoreVenueAdjustedxGoals;
        OnIce_F_flurryScoreVenueAdjustedxGoals = newOnIce_F_flurryScoreVenueAdjustedxGoals;
        OnIce_F_shotsOnGoal = newOnIce_F_shotsOnGoal;
        OnIce_F_missedShots = newOnIce_F_missedShots;
        OnIce_F_blockedShotAttempts = newOnIce_F_blockedShotAttempts;
        OnIce_F_shotAttempts = newOnIce_F_shotAttempts;
        OnIce_F_goals = newOnIce_F_goals;
        OnIce_F_rebounds = newOnIce_F_rebounds;
        OnIce_F_reboundGoals = newOnIce_F_reboundGoals;
        OnIce_F_lowDangerShots = newOnIce_F_lowDangerShots;
        OnIce_F_mediumDangerShots = newOnIce_F_mediumDangerShots;
        OnIce_F_highDangerShots = newOnIce_F_highDangerShots;
        OnIce_F_lowDangerxGoals = newOnIce_F_lowDangerxGoals;
        OnIce_F_mediumDangerxGoals = newOnIce_F_mediumDangerxGoals;
        OnIce_F_highDangerxGoals = newOnIce_F_highDangerxGoals;
        OnIce_F_lowDangerGoals = newOnIce_F_lowDangerGoals;
        OnIce_F_mediumDangerGoals = newOnIce_F_mediumDangerGoals;
        OnIce_F_highDangerGoals = newOnIce_F_highDangerGoals;
        OnIce_F_scoreAdjustedShotsAttempts = newOnIce_F_scoreAdjustedShotsAttempts;
        OnIce_F_unblockedShotAttempts = newOnIce_F_unblockedShotAttempts;
        OnIce_F_scoreAdjustedUnblockedShotAttempts = newOnIce_F_scoreAdjustedUnblockedShotAttempts;
        OnIce_F_xGoalsFromxReboundsOfShots = newOnIce_F_xGoalsFromxReboundsOfShots;
        OnIce_F_xGoalsFromActualReboundsOfShots = newOnIce_F_xGoalsFromActualReboundsOfShots;
        OnIce_F_reboundxGoals = newOnIce_F_reboundxGoals;
        OnIce_F_xGoals_with_earned_rebounds = newOnIce_F_xGoals_with_earned_rebounds;
        OnIce_F_xGoals_with_earned_rebounds_scoreAdjusted = newOnIce_F_xGoals_with_earned_rebounds_scoreAdjusted;
        OnIce_F_xGoals_with_earned_rebounds_scoreFlurryAdjusted = newOnIce_F_xGoals_with_earned_rebounds_scoreFlurryAdjusted;
        OnIce_A_xOnGoal = newOnIce_A_xOnGoal;
        OnIce_A_xGoals = newOnIce_A_xGoals;
        OnIce_A_flurryAdjustedxGoals = newOnIce_A_flurryAdjustedxGoals;
        OnIce_A_scoreVenueAdjustedxGoals = newOnIce_A_scoreVenueAdjustedxGoals;
        OnIce_A_flurryScoreVenueAdjustedxGoals = newOnIce_A_flurryScoreVenueAdjustedxGoals;
        OnIce_A_shotsOnGoal = newOnIce_A_shotsOnGoal;
        OnIce_A_missedShots = newOnIce_A_missedShots;
        OnIce_A_blockedShotAttempts = newOnIce_A_blockedShotAttempts;
        OnIce_A_shotAttempts = newOnIce_A_shotAttempts;
        OnIce_A_goals = newOnIce_A_goals;
        OnIce_A_rebounds = newOnIce_A_rebounds;
        OnIce_A_reboundGoals = newOnIce_A_reboundGoals;
        OnIce_A_lowDangerShots = newOnIce_A_lowDangerShots;
        OnIce_A_mediumDangerShots = newOnIce_A_mediumDangerShots;
        OnIce_A_highDangerShots = newOnIce_A_highDangerShots;
        OnIce_A_lowDangerxGoals = newOnIce_A_lowDangerxGoals;
        OnIce_A_mediumDangerxGoals = newOnIce_A_mediumDangerxGoals;
        OnIce_A_highDangerxGoals = newOnIce_A_highDangerxGoals;
        OnIce_A_lowDangerGoals = newOnIce_A_lowDangerGoals;
        OnIce_A_mediumDangerGoals = newOnIce_A_mediumDangerGoals;
        OnIce_A_highDangerGoals = newOnIce_A_highDangerGoals;
        OnIce_A_scoreAdjustedShotsAttempts = newOnIce_A_scoreAdjustedShotsAttempts;
        OnIce_A_unblockedShotAttempts = newOnIce_A_unblockedShotAttempts;
        OnIce_A_scoreAdjustedUnblockedShotAttempts = newOnIce_A_scoreAdjustedUnblockedShotAttempts;
        OnIce_A_xGoalsFromxReboundsOfShots = newOnIce_A_xGoalsFromxReboundsOfShots;
        OnIce_A_xGoalsFromActualReboundsOfShots = newOnIce_A_xGoalsFromActualReboundsOfShots;
        OnIce_A_reboundxGoals = newOnIce_A_reboundxGoals;
        OnIce_A_xGoals_with_earned_rebounds = newOnIce_A_xGoals_with_earned_rebounds;
        OnIce_A_xGoals_with_earned_rebounds_scoreAdjusted = newOnIce_A_xGoals_with_earned_rebounds_scoreAdjusted;
        OnIce_A_xGoals_with_earned_rebounds_scoreFlurryAdjusted = newOnIce_A_xGoals_with_earned_rebounds_scoreFlurryAdjusted;
        OffIce_F_xGoals = newOffIce_F_xGoals;
        OffIce_A_xGoals = newOffIce_A_xGoals;
        OffIce_F_shotAttempts = newOffIce_F_shotAttempts;
        OffIce_A_shotAttempts = newOffIce_A_shotAttempts;
        xGoalsForAfterShifts = newxGoalsForAfterShifts;
        xGoalsAgainstAfterShifts = newxGoalsAgainstAfterShifts;
        corsiForAfterShifts = newcorsiForAfterShifts;
        corsiAgainstAfterShifts = newcorsiAgainstAfterShifts;
        fenwickForAfterShifts = newfenwickForAfterShifts;
        fenwickAgainstAfterShifts = newfenwickAgainstAfterShifts;


    }
    // GetMethods:
    public int getGames_played() {
        return games_played;
    }

    public float geticetime() {
        return icetime;
    }

    public float getshifts() {
        return shifts;
    }

    public float getgameScore() {
        return gameScore;
    }

    public float getonIce_xGoalsPercentage() {
        return onIce_xGoalsPercentage;
    }

    public float getoffIce_xGoalsPercentage() {
        return offIce_xGoalsPercentage;
    }

    public float getonIce_corsiPercentage() {
        return onIce_corsiPercentage;
    }

    public float getoffIce_corsiPercentage() {
        return offIce_corsiPercentage;
    }

    public float getonIce_fenwickPercentage() {
        return onIce_fenwickPercentage;
    }

    public float getoffIce_fenwickPercentage() {
        return offIce_fenwickPercentage;
    }

    public float geticeTimeRank() {
        return iceTimeRank;
    }

    public float getI_F_xOnGoal() {
        return I_F_xOnGoal;
    }

    public float getI_F_xGoals() {
        return I_F_xGoals;
    }

    public float getI_F_xRebounds() {
        return I_F_xRebounds;
    }

    public float getI_F_xFreeze() {
        return I_F_xFreeze;
    }

    public float getI_F_xPlayStopped() {
        return I_F_xPlayStopped;
    }

    public float getI_F_xPlayContinuedInZone() {
        return I_F_xPlayContinuedInZone;
    }

    public float getI_F_xPlayContinuedOutsideZone() {
        return I_F_xPlayContinuedOutsideZone;
    }

    public float getI_F_flurryAdjustedxGoals() {
        return I_F_flurryAdjustedxGoals;
    }

    public float getI_F_scoreVenueAdjustedxGoals() {
        return I_F_scoreVenueAdjustedxGoals;
    }

    public float getI_F_flurryScoreVenueAdjustedxGoals() {
        return I_F_flurryScoreVenueAdjustedxGoals;
    }

    public float getI_F_primaryAssists() {
        return I_F_primaryAssists;
    }

    public float getI_F_secondaryAssists() {
        return I_F_secondaryAssists;
    }

    public float getI_F_shotsOnGoal() {
        return I_F_shotsOnGoal;
    }

    public float getI_F_missedShots() {
        return I_F_missedShots;
    }

    public float getI_F_blockedShotAttempts() {
        return I_F_blockedShotAttempts;
    }

    public float getI_F_shotAttempts() {
        return I_F_shotAttempts;
    }

    public float getI_F_points() {
        return I_F_points;
    }

    public float getI_F_goals() {
        return I_F_goals;
    }

    public float getI_F_rebounds() {
        return I_F_rebounds;
    }

    public float getI_F_reboundGoals() {
        return I_F_reboundGoals;
    }

    public float getI_F_freeze() {
        return I_F_freeze;
    }

    public float getI_F_playStopped() {
        return I_F_playStopped;
    }

    public float getI_F_playContinuedInZone() {
        return I_F_playContinuedInZone;
    }

    public float getI_F_playContinuedOutsideZone() {
        return I_F_playContinuedOutsideZone;
    }

    public float getI_F_savedShotsOnGoal() {
        return I_F_savedShotsOnGoal;
    }

    public float getI_F_savedUnblockedShotAttempts() {
        return I_F_savedUnblockedShotAttempts;
    }

    public float getpenalties() {
        return penalties;
    }

    public float getI_F_penalityMinutes() {
        return I_F_penalityMinutes;
    }

    public float getI_F_faceOffsWon() {
        return I_F_faceOffsWon;
    }

    public float getI_F_hits() {
        return I_F_hits;
    }

    public float getI_F_takeaways() {
        return I_F_takeaways;
    }

    public float getI_F_giveaways() {
        return I_F_giveaways;
    }

    public float getI_F_lowDangerShots() {
        return I_F_lowDangerShots;
    }

    public float getI_F_mediumDangerShots() {
        return I_F_mediumDangerShots;
    }

    public float getI_F_highDangerShots() {
        return I_F_highDangerShots;
    }

    public float getI_F_lowDangerxGoals() {
        return I_F_lowDangerxGoals;
    }

    public float getI_F_mediumDangerxGoals() {
        return I_F_mediumDangerxGoals;
    }

    public float getI_F_highDangerxGoals() {
        return I_F_highDangerxGoals;
    }

    public float getI_F_lowDangerGoals() {
        return I_F_lowDangerGoals;
    }

    public float getI_F_mediumDangerGoals() {
        return I_F_mediumDangerGoals;
    }

    public float getI_F_highDangerGoals() {
        return I_F_highDangerGoals;
    }

    public float getI_F_scoreAdjustedShotsAttempts() {
        return I_F_scoreAdjustedShotsAttempts;
    }

    public float getI_F_unblockedShotAttempts() {
        return I_F_unblockedShotAttempts;
    }

    public float getI_F_scoreAdjustedUnblockedShotAttempts() {
        return I_F_scoreAdjustedUnblockedShotAttempts;
    }

    public float getI_F_dZoneGiveaways() {
        return I_F_dZoneGiveaways;
    }

    public float getI_F_xGoalsFromxReboundsOfShots() {
        return I_F_xGoalsFromxReboundsOfShots;
    }

    public float getI_F_xGoalsFromActualReboundsOfShots() {
        return I_F_xGoalsFromActualReboundsOfShots;
    }

    public float getI_F_reboundxGoals() {
        return I_F_reboundxGoals;
    }

    public float getI_F_xGoals_with_earned_rebounds() {
        return I_F_xGoals_with_earned_rebounds;
    }

    public float getI_F_xGoals_with_earned_rebounds_scoreAdjusted() {
        return I_F_xGoals_with_earned_rebounds_scoreAdjusted;
    }

    public float getI_F_xGoals_with_earned_rebounds_scoreFlurryAdjusted() {
        return I_F_xGoals_with_earned_rebounds_scoreFlurryAdjusted;
    }

    public float getI_F_shifts() {
        return I_F_shifts;
    }

    public float getI_F_oZoneShiftStarts() {
        return I_F_oZoneShiftStarts;
    }

    public float getI_F_dZoneShiftStarts() {
        return I_F_dZoneShiftStarts;
    }

    public float getI_F_neutralZoneShiftStarts() {
        return I_F_neutralZoneShiftStarts;
    }

    public float getI_F_flyShiftStarts() {
        return I_F_flyShiftStarts;
    }

    public float getI_F_oZoneShiftEnds() {
        return I_F_oZoneShiftEnds;
    }

    public float getI_F_dZoneShiftEnds() {
        return I_F_dZoneShiftEnds;
    }

    public float getI_F_neutralZoneShiftEnds() {
        return I_F_neutralZoneShiftEnds;
    }

    public float getI_F_flyShiftEnds() {
        return I_F_flyShiftEnds;
    }

    public float getfaceoffsWon() {
        return faceoffsWon;
    }

    public float getfaceoffsLost() {
        return faceoffsLost;
    }

    public float gettimeOnBench() {
        return timeOnBench;
    }

    public float getpenalityMinutes() {
        return penalityMinutes;
    }

    public float getpenalityMinutesDrawn() {
        return penalityMinutesDrawn;
    }

    public float getpenaltiesDrawn() {
        return penaltiesDrawn;
    }

    public float getshotsBlockedByPlayer() {
        return shotsBlockedByPlayer;
    }

    public float getOnIce_F_xOnGoal() {
        return OnIce_F_xOnGoal;
    }

    public float getOnIce_F_xGoals() {
        return OnIce_F_xGoals;
    }

    public float getOnIce_F_flurryAdjustedxGoals() {
        return OnIce_F_flurryAdjustedxGoals;
    }

    public float getOnIce_F_scoreVenueAdjustedxGoals() {
        return OnIce_F_scoreVenueAdjustedxGoals;
    }

    public float getOnIce_F_flurryScoreVenueAdjustedxGoals() {
        return OnIce_F_flurryScoreVenueAdjustedxGoals;
    }

    public float getOnIce_F_shotsOnGoal() {
        return OnIce_F_shotsOnGoal;
    }

    public float getOnIce_F_missedShots() {
        return OnIce_F_missedShots;
    }

    public float getOnIce_F_blockedShotAttempts() {
        return OnIce_F_blockedShotAttempts;
    }

    public float getOnIce_F_shotAttempts() {
        return OnIce_F_shotAttempts;
    }

    public float getOnIce_F_goals() {
        return OnIce_F_goals;
    }

    public float getOnIce_F_rebounds() {
        return OnIce_F_rebounds;
    }

    public float getOnIce_F_reboundGoals() {
        return OnIce_F_reboundGoals;
    }

    public float getOnIce_F_lowDangerShots() {
        return OnIce_F_lowDangerShots;
    }

    public float getOnIce_F_mediumDangerShots() {
        return OnIce_F_mediumDangerShots;
    }

    public float getOnIce_F_highDangerShots() {
        return OnIce_F_highDangerShots;
    }

    public float getOnIce_F_lowDangerxGoals() {
        return OnIce_F_lowDangerxGoals;
    }

    public float getOnIce_F_mediumDangerxGoals() {
        return OnIce_F_mediumDangerxGoals;
    }

    public float getOnIce_F_highDangerxGoals() {
        return OnIce_F_highDangerxGoals;
    }

    public float getOnIce_F_lowDangerGoals() {
        return OnIce_F_lowDangerGoals;
    }

    public float getOnIce_F_mediumDangerGoals() {
        return OnIce_F_mediumDangerGoals;
    }

    public float getOnIce_F_highDangerGoals() {
        return OnIce_F_highDangerGoals;
    }

    public float getOnIce_F_scoreAdjustedShotsAttempts() {
        return OnIce_F_scoreAdjustedShotsAttempts;
    }

    public float getOnIce_F_unblockedShotAttempts() {
        return OnIce_F_unblockedShotAttempts;
    }

    public float getOnIce_F_scoreAdjustedUnblockedShotAttempts() {
        return OnIce_F_scoreAdjustedUnblockedShotAttempts;
    }

    public float getOnIce_F_xGoalsFromxReboundsOfShots() {
        return OnIce_F_xGoalsFromxReboundsOfShots;
    }

    public float getOnIce_F_xGoalsFromActualReboundsOfShots() {
        return OnIce_F_xGoalsFromActualReboundsOfShots;
    }

    public float getOnIce_F_reboundxGoals() {
        return OnIce_F_reboundxGoals;
    }

    public float getOnIce_F_xGoals_with_earned_rebounds() {
        return OnIce_F_xGoals_with_earned_rebounds;
    }

    public float getOnIce_F_xGoals_with_earned_rebounds_scoreAdjusted() {
        return OnIce_F_xGoals_with_earned_rebounds_scoreAdjusted;
    }

    public float getOnIce_F_xGoals_with_earned_rebounds_scoreFlurryAdjusted() {
        return OnIce_F_xGoals_with_earned_rebounds_scoreFlurryAdjusted;
    }

    public float getOnIce_A_xOnGoal() {
        return OnIce_A_xOnGoal;
    }

    public float getOnIce_A_xGoals() {
        return OnIce_A_xGoals;
    }

    public float getOnIce_A_flurryAdjustedxGoals() {
        return OnIce_A_flurryAdjustedxGoals;
    }

    public float getOnIce_A_scoreVenueAdjustedxGoals() {
        return OnIce_A_scoreVenueAdjustedxGoals;
    }

    public float getOnIce_A_flurryScoreVenueAdjustedxGoals() {
        return OnIce_A_flurryScoreVenueAdjustedxGoals;
    }

    public float getOnIce_A_shotsOnGoal() {
        return OnIce_A_shotsOnGoal;
    }

    public float getOnIce_A_missedShots() {
        return OnIce_A_missedShots;
    }

    public float getOnIce_A_blockedShotAttempts() {
        return OnIce_A_blockedShotAttempts;
    }

    public float getOnIce_A_shotAttempts() {
        return OnIce_A_shotAttempts;
    }

    public float getOnIce_A_goals() {
        return OnIce_A_goals;
    }

    public float getOnIce_A_rebounds() {
        return OnIce_A_rebounds;
    }

    public float getOnIce_A_reboundGoals() {
        return OnIce_A_reboundGoals;
    }

    public float getOnIce_A_lowDangerShots() {
        return OnIce_A_lowDangerShots;
    }

    public float getOnIce_A_mediumDangerShots() {
        return OnIce_A_mediumDangerShots;
    }

    public float getOnIce_A_highDangerShots() {
        return OnIce_A_highDangerShots;
    }

    public float getOnIce_A_lowDangerxGoals() {
        return OnIce_A_lowDangerxGoals;
    }

    public float getOnIce_A_mediumDangerxGoals() {
        return OnIce_A_mediumDangerxGoals;
    }

    public float getOnIce_A_highDangerxGoals() {
        return OnIce_A_highDangerxGoals;
    }

    public float getOnIce_A_lowDangerGoals() {
        return OnIce_A_lowDangerGoals;
    }

    public float getOnIce_A_mediumDangerGoals() {
        return OnIce_A_mediumDangerGoals;
    }

    public float getOnIce_A_highDangerGoals() {
        return OnIce_A_highDangerGoals;
    }

    public float getOnIce_A_scoreAdjustedShotsAttempts() {
        return OnIce_A_scoreAdjustedShotsAttempts;
    }

    public float getOnIce_A_unblockedShotAttempts() {
        return OnIce_A_unblockedShotAttempts;
    }

    public float getOnIce_A_scoreAdjustedUnblockedShotAttempts() {
        return OnIce_A_scoreAdjustedUnblockedShotAttempts;
    }

    public float getOnIce_A_xGoalsFromxReboundsOfShots() {
        return OnIce_A_xGoalsFromxReboundsOfShots;
    }

    public float getOnIce_A_xGoalsFromActualReboundsOfShots() {
        return OnIce_A_xGoalsFromActualReboundsOfShots;
    }

    public float getOnIce_A_reboundxGoals() {
        return OnIce_A_reboundxGoals;
    }

    public float getOnIce_A_xGoals_with_earned_rebounds() {
        return OnIce_A_xGoals_with_earned_rebounds;
    }

    public float getOnIce_A_xGoals_with_earned_rebounds_scoreAdjusted() {
        return OnIce_A_xGoals_with_earned_rebounds_scoreAdjusted;
    }

    public float getOnIce_A_xGoals_with_earned_rebounds_scoreFlurryAdjusted() {
        return OnIce_A_xGoals_with_earned_rebounds_scoreFlurryAdjusted;
    }

    public float getOffIce_F_xGoals() {
        return OffIce_F_xGoals;
    }

    public float getOffIce_A_xGoals() {
        return OffIce_A_xGoals;
    }

    public float getOffIce_F_shotAttempts() {
        return OffIce_F_shotAttempts;
    }

    public float getOffIce_A_shotAttempts() {
        return OffIce_A_shotAttempts;
    }

    public float getxGoalsForAfterShifts() {
        return xGoalsForAfterShifts;
    }

    public float getxGoalsAgainstAfterShifts() {
        return xGoalsAgainstAfterShifts;
    }

    public float getcorsiForAfterShifts() {
        return corsiForAfterShifts;
    }

    public float getcorsiAgainstAfterShifts() {
        return corsiAgainstAfterShifts;
    }

    public float getfenwickForAfterShifts() {
        return fenwickForAfterShifts;
    }

    public float getfenwickAgainstAfterShifts() {
        return fenwickAgainstAfterShifts;
    }


}
